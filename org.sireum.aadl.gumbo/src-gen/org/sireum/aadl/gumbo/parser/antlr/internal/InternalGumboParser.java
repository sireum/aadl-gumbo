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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_VALUE", "RULE_DEFOP", "RULE_INTEGER_LIT", "RULE_HEX", "RULE_BIN", "RULE_F32_LIT", "RULE_F64_LIT", "RULE_REAL_LIT", "RULE_MSTRING", "RULE_MSP", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OP", "RULE_IMPLIES", "RULE_SIMPLIES", "RULE_STRING", "RULE_ESC_SEQ", "RULE_IDF", "RULE_MSPI", "RULE_OPSYM", "RULE_EXTENDED_DIGIT", "RULE_INT_IDF", "RULE_LETTER", "RULE_DIGIT", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_WS", "'library'", "'state'", "':'", "';'", "'invariants'", "'inv'", "'integration'", "'initialize'", "'compute'", "'cases'", "'infoflow'", "'from'", "'('", "','", "')'", "'to'", "'handle'", "'case'", "'assume'", "'guarantee'", "'functions'", "'def'", "':='", "'@strictpure'", "'@pure'", "'=>'", "'*'", "'['", "']'", "'mut'", "'.'", "'invariant'", "'reads'", "'modifies'", "'if'", "'while'", "'match'", "'{'", "'}'", "'spec'", "'assert'", "'halt'", "'do'", "'else'", "'_'", "'val'", "'var'", "'\\\\all'", "'\\\\some'", "'\\u2200'", "'\\u2203'", "'..'", "'..<'", "'In'", "'MaySend'", "'MustSend'", "'NoSend'", "'HasEvent'", "'='", "'for'", "'yield'", "'by'", "'return'", "'T'", "'F'", "'true'", "'false'", "'res'", "'F32'", "'F64'", "'+=>'", "'constant'", "'reference'", "'classifier'", "'+'", "'-'", "'delta'", "'applies'", "'in'", "'binding'", "'modes'", "'::'"
    };
    public static final int RULE_HEX=8;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int RULE_MSTRING=13;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_BIN=9;
    public static final int RULE_OP=19;
    public static final int T__54=54;
    public static final int RULE_ESC_SEQ=23;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=30;
    public static final int RULE_F64_LIT=11;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_REAL_LIT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MSPE=18;
    public static final int RULE_MSPB=16;
    public static final int RULE_SIMPLIES=21;
    public static final int RULE_IMPLIES=20;
    public static final int RULE_UNICODE_ESC=31;
    public static final int RULE_LETTER=29;
    public static final int RULE_EXPONENT=33;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SLI=15;
    public static final int T__44=44;
    public static final int RULE_EXTENDED_DIGIT=27;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=5;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_INT_EXPONENT=34;
    public static final int RULE_F32_LIT=10;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int RULE_MSP=14;
    public static final int T__96=96;
    public static final int RULE_BASED_INTEGER=35;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_MSPM=17;
    public static final int RULE_DEFOP=6;
    public static final int RULE_MSPI=25;
    public static final int RULE_INTEGER_LIT=7;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=22;
    public static final int RULE_SL_COMMENT=32;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_OPSYM=26;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=36;
    public static final int RULE_INT_IDF=28;
    public static final int RULE_IDF=24;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalGumboParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGumboParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGumboParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGumbo.g"; }



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
    // InternalGumbo.g:80:1: entryRuleAnnexLibrary returns [EObject current=null] : iv_ruleAnnexLibrary= ruleAnnexLibrary EOF ;
    public final EObject entryRuleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexLibrary = null;


        try {
            // InternalGumbo.g:80:53: (iv_ruleAnnexLibrary= ruleAnnexLibrary EOF )
            // InternalGumbo.g:81:2: iv_ruleAnnexLibrary= ruleAnnexLibrary EOF
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
    // InternalGumbo.g:87:1: ruleAnnexLibrary returns [EObject current=null] : this_GumboLibrary_0= ruleGumboLibrary ;
    public final EObject ruleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject this_GumboLibrary_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:93:2: (this_GumboLibrary_0= ruleGumboLibrary )
            // InternalGumbo.g:94:2: this_GumboLibrary_0= ruleGumboLibrary
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
    // InternalGumbo.g:108:1: entryRuleGumboLibrary returns [EObject current=null] : iv_ruleGumboLibrary= ruleGumboLibrary EOF ;
    public final EObject entryRuleGumboLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboLibrary = null;


        try {
            // InternalGumbo.g:108:53: (iv_ruleGumboLibrary= ruleGumboLibrary EOF )
            // InternalGumbo.g:109:2: iv_ruleGumboLibrary= ruleGumboLibrary EOF
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
    // InternalGumbo.g:115:1: ruleGumboLibrary returns [EObject current=null] : ( () (otherlv_1= 'library' )? ( (lv_functions_2_0= ruleFunctions ) )? ) ;
    public final EObject ruleGumboLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functions_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:121:2: ( ( () (otherlv_1= 'library' )? ( (lv_functions_2_0= ruleFunctions ) )? ) )
            // InternalGumbo.g:122:2: ( () (otherlv_1= 'library' )? ( (lv_functions_2_0= ruleFunctions ) )? )
            {
            // InternalGumbo.g:122:2: ( () (otherlv_1= 'library' )? ( (lv_functions_2_0= ruleFunctions ) )? )
            // InternalGumbo.g:123:3: () (otherlv_1= 'library' )? ( (lv_functions_2_0= ruleFunctions ) )?
            {
            // InternalGumbo.g:123:3: ()
            // InternalGumbo.g:124:4: 
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

            // InternalGumbo.g:133:3: (otherlv_1= 'library' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGumbo.g:134:4: otherlv_1= 'library'
                    {
                    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getGumboLibraryAccess().getLibraryKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:139:3: ( (lv_functions_2_0= ruleFunctions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==57) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumbo.g:140:4: (lv_functions_2_0= ruleFunctions )
                    {
                    // InternalGumbo.g:140:4: (lv_functions_2_0= ruleFunctions )
                    // InternalGumbo.g:141:5: lv_functions_2_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGumboLibraryAccess().getFunctionsFunctionsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_functions_2_0=ruleFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGumboLibraryRule());
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGumbo.g:162:1: entryRuleGumboSubclause returns [EObject current=null] : iv_ruleGumboSubclause= ruleGumboSubclause EOF ;
    public final EObject entryRuleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboSubclause = null;


        try {
            // InternalGumbo.g:162:55: (iv_ruleGumboSubclause= ruleGumboSubclause EOF )
            // InternalGumbo.g:163:2: iv_ruleGumboSubclause= ruleGumboSubclause EOF
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
    // InternalGumbo.g:169:1: ruleGumboSubclause returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) ;
    public final EObject ruleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:175:2: ( ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) )
            // InternalGumbo.g:176:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            {
            // InternalGumbo.g:176:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            // InternalGumbo.g:177:3: () ( (lv_specs_1_0= ruleSpecSection ) )
            {
            // InternalGumbo.g:177:3: ()
            // InternalGumbo.g:178:4: 
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

            // InternalGumbo.g:187:3: ( (lv_specs_1_0= ruleSpecSection ) )
            // InternalGumbo.g:188:4: (lv_specs_1_0= ruleSpecSection )
            {
            // InternalGumbo.g:188:4: (lv_specs_1_0= ruleSpecSection )
            // InternalGumbo.g:189:5: lv_specs_1_0= ruleSpecSection
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
    // InternalGumbo.g:210:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalGumbo.g:210:52: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalGumbo.g:211:2: iv_ruleSpecSection= ruleSpecSection EOF
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
    // InternalGumbo.g:217:1: ruleSpecSection returns [EObject current=null] : ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) ;
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
            // InternalGumbo.g:223:2: ( ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) )
            // InternalGumbo.g:224:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            {
            // InternalGumbo.g:224:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            // InternalGumbo.g:225:3: () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )?
            {
            // InternalGumbo.g:225:3: ()
            // InternalGumbo.g:226:4: 
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

            // InternalGumbo.g:235:3: ( (lv_state_1_0= ruleState ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumbo.g:236:4: (lv_state_1_0= ruleState )
                    {
                    // InternalGumbo.g:236:4: (lv_state_1_0= ruleState )
                    // InternalGumbo.g:237:5: lv_state_1_0= ruleState
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalGumbo.g:254:3: ( (lv_functions_2_0= ruleFunctions ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumbo.g:255:4: (lv_functions_2_0= ruleFunctions )
                    {
                    // InternalGumbo.g:255:4: (lv_functions_2_0= ruleFunctions )
                    // InternalGumbo.g:256:5: lv_functions_2_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalGumbo.g:273:3: ( (lv_invariants_3_0= ruleInvariants ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumbo.g:274:4: (lv_invariants_3_0= ruleInvariants )
                    {
                    // InternalGumbo.g:274:4: (lv_invariants_3_0= ruleInvariants )
                    // InternalGumbo.g:275:5: lv_invariants_3_0= ruleInvariants
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
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

            // InternalGumbo.g:292:3: ( (lv_integration_4_0= ruleIntegration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumbo.g:293:4: (lv_integration_4_0= ruleIntegration )
                    {
                    // InternalGumbo.g:293:4: (lv_integration_4_0= ruleIntegration )
                    // InternalGumbo.g:294:5: lv_integration_4_0= ruleIntegration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalGumbo.g:311:3: ( (lv_initialize_5_0= ruleInitialize ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGumbo.g:312:4: (lv_initialize_5_0= ruleInitialize )
                    {
                    // InternalGumbo.g:312:4: (lv_initialize_5_0= ruleInitialize )
                    // InternalGumbo.g:313:5: lv_initialize_5_0= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

            // InternalGumbo.g:330:3: ( (lv_compute_6_0= ruleCompute ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGumbo.g:331:4: (lv_compute_6_0= ruleCompute )
                    {
                    // InternalGumbo.g:331:4: (lv_compute_6_0= ruleCompute )
                    // InternalGumbo.g:332:5: lv_compute_6_0= ruleCompute
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
    // InternalGumbo.g:353:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumbo.g:353:46: (iv_ruleState= ruleState EOF )
            // InternalGumbo.g:354:2: iv_ruleState= ruleState EOF
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
    // InternalGumbo.g:360:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:366:2: ( (otherlv_0= 'state' ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumbo.g:367:2: (otherlv_0= 'state' ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumbo.g:367:2: (otherlv_0= 'state' ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumbo.g:368:3: otherlv_0= 'state' ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumbo.g:372:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumbo.g:373:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumbo.g:373:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumbo.g:374:5: lv_decls_1_0= ruleStateVarDecl
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateVarDecl"
    // InternalGumbo.g:395:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumbo.g:395:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumbo.g:396:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
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
    // InternalGumbo.g:402:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumbo.g:408:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalGumbo.g:409:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalGumbo.g:409:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalGumbo.g:410:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalGumbo.g:410:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalGumbo.g:411:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalGumbo.g:411:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumbo.g:412:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumbo.g:412:5: (lv_name_0_0= RULE_ID )
            // InternalGumbo.g:413:6: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1());
              			
            }

            }

            // InternalGumbo.g:434:3: ( ( ruleQualifiedName ) )
            // InternalGumbo.g:435:4: ( ruleQualifiedName )
            {
            // InternalGumbo.g:435:4: ( ruleQualifiedName )
            // InternalGumbo.g:436:5: ruleQualifiedName
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
            pushFollow(FollowSets000.FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:461:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumbo.g:461:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumbo.g:462:2: iv_ruleInvariants= ruleInvariants EOF
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
    // InternalGumbo.g:468:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:474:2: ( (otherlv_0= 'invariants' ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumbo.g:475:2: (otherlv_0= 'invariants' ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumbo.g:475:2: (otherlv_0= 'invariants' ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumbo.g:476:3: otherlv_0= 'invariants' ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumbo.g:480:3: ( (lv_specs_1_0= ruleInvSpec ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumbo.g:481:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumbo.g:481:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumbo.g:482:5: lv_specs_1_0= ruleInvSpec
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
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleInvSpec"
    // InternalGumbo.g:503:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumbo.g:503:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumbo.g:504:2: iv_ruleInvSpec= ruleInvSpec EOF
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
    // InternalGumbo.g:510:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) ;
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
            // InternalGumbo.g:516:2: ( (otherlv_0= 'inv' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) )
            // InternalGumbo.g:517:2: (otherlv_0= 'inv' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            {
            // InternalGumbo.g:517:2: (otherlv_0= 'inv' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            // InternalGumbo.g:518:3: otherlv_0= 'inv' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumbo.g:522:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumbo.g:523:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumbo.g:523:4: (lv_id_1_0= RULE_ID )
            // InternalGumbo.g:524:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalGumbo.g:540:3: ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING_VALUE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGumbo.g:541:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:541:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:542:5: lv_descriptor_2_0= RULE_STRING_VALUE
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getInvSpecAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvSpecRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvSpecAccess().getColonKeyword_3());
              		
            }
            // InternalGumbo.g:562:3: ( (lv_expr_4_0= ruleOwnedExpression ) )
            // InternalGumbo.g:563:4: (lv_expr_4_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:563:4: (lv_expr_4_0= ruleOwnedExpression )
            // InternalGumbo.g:564:5: lv_expr_4_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvSpecAccess().getExprOwnedExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_4_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:589:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumbo.g:589:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumbo.g:590:2: iv_ruleIntegration= ruleIntegration EOF
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
    // InternalGumbo.g:596:1: ruleIntegration returns [EObject current=null] : (otherlv_0= 'integration' ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:602:2: ( (otherlv_0= 'integration' ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumbo.g:603:2: (otherlv_0= 'integration' ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumbo.g:603:2: (otherlv_0= 'integration' ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumbo.g:604:3: otherlv_0= 'integration' ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumbo.g:608:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=55 && LA12_0<=56)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGumbo.g:609:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumbo.g:609:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumbo.g:610:5: lv_specs_1_0= ruleSpecStatement
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
    // $ANTLR end "ruleIntegration"


    // $ANTLR start "entryRuleInitialize"
    // InternalGumbo.g:631:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumbo.g:631:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumbo.g:632:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalGumbo.g:638:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'initialize' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_modifies_2_0 = null;

        EObject lv_specs_4_0 = null;

        EObject lv_flows_5_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:644:2: ( ( () otherlv_1= 'initialize' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* ) )
            // InternalGumbo.g:645:2: ( () otherlv_1= 'initialize' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* )
            {
            // InternalGumbo.g:645:2: ( () otherlv_1= 'initialize' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* )
            // InternalGumbo.g:646:3: () otherlv_1= 'initialize' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )*
            {
            // InternalGumbo.g:646:3: ()
            // InternalGumbo.g:647:4: 
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

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getInitializeKeyword_1());
              		
            }
            // InternalGumbo.g:660:3: ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==70) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumbo.g:661:4: ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';'
                    {
                    // InternalGumbo.g:661:4: ( (lv_modifies_2_0= ruleSlangModifies ) )
                    // InternalGumbo.g:662:5: (lv_modifies_2_0= ruleSlangModifies )
                    {
                    // InternalGumbo.g:662:5: (lv_modifies_2_0= ruleSlangModifies )
                    // InternalGumbo.g:663:6: lv_modifies_2_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInitializeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:685:3: ( (lv_specs_4_0= ruleInitializeSpecStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==56) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGumbo.g:686:4: (lv_specs_4_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumbo.g:686:4: (lv_specs_4_0= ruleInitializeSpecStatement )
            	    // InternalGumbo.g:687:5: lv_specs_4_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    break loop14;
                }
            } while (true);

            // InternalGumbo.g:704:3: ( (lv_flows_5_0= ruleInfoFlowClause ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumbo.g:705:4: (lv_flows_5_0= ruleInfoFlowClause )
            	    {
            	    // InternalGumbo.g:705:4: (lv_flows_5_0= ruleInfoFlowClause )
            	    // InternalGumbo.g:706:5: lv_flows_5_0= ruleInfoFlowClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getFlowsInfoFlowClauseParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop15;
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
    // InternalGumbo.g:727:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumbo.g:727:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumbo.g:728:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumbo.g:734:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:740:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumbo.g:741:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumbo.g:741:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumbo.g:742:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumbo.g:742:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumbo.g:743:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
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
    // InternalGumbo.g:763:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumbo.g:763:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumbo.g:764:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumbo.g:770:1: ruleCompute returns [EObject current=null] : ( () otherlv_1= 'compute' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* ) ;
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
            // InternalGumbo.g:776:2: ( ( () otherlv_1= 'compute' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* ) )
            // InternalGumbo.g:777:2: ( () otherlv_1= 'compute' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* )
            {
            // InternalGumbo.g:777:2: ( () otherlv_1= 'compute' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* )
            // InternalGumbo.g:778:3: () otherlv_1= 'compute' ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )*
            {
            // InternalGumbo.g:778:3: ()
            // InternalGumbo.g:779:4: 
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

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getComputeKeyword_1());
              		
            }
            // InternalGumbo.g:792:3: ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==70) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGumbo.g:793:4: ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= ';'
                    {
                    // InternalGumbo.g:793:4: ( (lv_modifies_2_0= ruleSlangModifies ) )
                    // InternalGumbo.g:794:5: (lv_modifies_2_0= ruleSlangModifies )
                    {
                    // InternalGumbo.g:794:5: (lv_modifies_2_0= ruleSlangModifies )
                    // InternalGumbo.g:795:6: lv_modifies_2_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:817:3: ( (lv_specs_4_0= ruleSpecStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=55 && LA17_0<=56)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumbo.g:818:4: (lv_specs_4_0= ruleSpecStatement )
            	    {
            	    // InternalGumbo.g:818:4: (lv_specs_4_0= ruleSpecStatement )
            	    // InternalGumbo.g:819:5: lv_specs_4_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getSpecsSpecStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	    break loop17;
                }
            } while (true);

            // InternalGumbo.g:836:3: (otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGumbo.g:837:4: otherlv_5= 'cases' ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    {
            	    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getCasesKeyword_4_0());
            	      			
            	    }
            	    // InternalGumbo.g:841:4: ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==54) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalGumbo.g:842:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    {
            	    	    // InternalGumbo.g:842:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    // InternalGumbo.g:843:6: lv_cases_6_0= ruleCaseStatementClause
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_4_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
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
            	    	    if ( cnt18 >= 1 ) break loop18;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalGumbo.g:861:3: ( (lv_handlers_7_0= ruleHandlerClause ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==53) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGumbo.g:862:4: (lv_handlers_7_0= ruleHandlerClause )
            	    {
            	    // InternalGumbo.g:862:4: (lv_handlers_7_0= ruleHandlerClause )
            	    // InternalGumbo.g:863:5: lv_handlers_7_0= ruleHandlerClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    break loop20;
                }
            } while (true);

            // InternalGumbo.g:880:3: ( (lv_flows_8_0= ruleInfoFlowClause ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGumbo.g:881:4: (lv_flows_8_0= ruleInfoFlowClause )
            	    {
            	    // InternalGumbo.g:881:4: (lv_flows_8_0= ruleInfoFlowClause )
            	    // InternalGumbo.g:882:5: lv_flows_8_0= ruleInfoFlowClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getFlowsInfoFlowClauseParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop21;
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
    // InternalGumbo.g:903:1: entryRuleInfoFlowClause returns [EObject current=null] : iv_ruleInfoFlowClause= ruleInfoFlowClause EOF ;
    public final EObject entryRuleInfoFlowClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoFlowClause = null;


        try {
            // InternalGumbo.g:903:55: (iv_ruleInfoFlowClause= ruleInfoFlowClause EOF )
            // InternalGumbo.g:904:2: iv_ruleInfoFlowClause= ruleInfoFlowClause EOF
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
    // InternalGumbo.g:910:1: ruleInfoFlowClause returns [EObject current=null] : (otherlv_0= 'infoflow' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' otherlv_4= 'from' otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ',' otherlv_11= 'to' otherlv_12= '(' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= ')' otherlv_17= ';' ) ;
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
            // InternalGumbo.g:916:2: ( (otherlv_0= 'infoflow' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' otherlv_4= 'from' otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ',' otherlv_11= 'to' otherlv_12= '(' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= ')' otherlv_17= ';' ) )
            // InternalGumbo.g:917:2: (otherlv_0= 'infoflow' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' otherlv_4= 'from' otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ',' otherlv_11= 'to' otherlv_12= '(' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= ')' otherlv_17= ';' )
            {
            // InternalGumbo.g:917:2: (otherlv_0= 'infoflow' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' otherlv_4= 'from' otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ',' otherlv_11= 'to' otherlv_12= '(' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= ')' otherlv_17= ';' )
            // InternalGumbo.g:918:3: otherlv_0= 'infoflow' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' otherlv_4= 'from' otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ',' otherlv_11= 'to' otherlv_12= '(' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= ')' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInfoFlowClauseAccess().getInfoflowKeyword_0());
              		
            }
            // InternalGumbo.g:922:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumbo.g:923:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumbo.g:923:4: (lv_id_1_0= RULE_ID )
            // InternalGumbo.g:924:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalGumbo.g:940:3: ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING_VALUE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumbo.g:941:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:941:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:942:5: lv_descriptor_2_0= RULE_STRING_VALUE
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getInfoFlowClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInfoFlowClauseAccess().getColonKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInfoFlowClauseAccess().getFromKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalGumbo.g:970:3: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumbo.g:971:4: ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // InternalGumbo.g:971:4: ( (otherlv_6= RULE_ID ) )
                    // InternalGumbo.g:972:5: (otherlv_6= RULE_ID )
                    {
                    // InternalGumbo.g:972:5: (otherlv_6= RULE_ID )
                    // InternalGumbo.g:973:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_0_0());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:987:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==50) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGumbo.g:988:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:992:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalGumbo.g:993:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGumbo.g:993:6: (otherlv_8= RULE_ID )
                    	    // InternalGumbo.g:994:7: otherlv_8= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_8, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_1_1_0());
                    	      						
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
                    break;

            }

            otherlv_9=(Token)match(input,51,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_7());
              		
            }
            otherlv_10=(Token)match(input,50,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_8());
              		
            }
            otherlv_11=(Token)match(input,52,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getInfoFlowClauseAccess().getToKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,49,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_10());
              		
            }
            // InternalGumbo.g:1026:3: ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumbo.g:1027:4: ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    {
                    // InternalGumbo.g:1027:4: ( (otherlv_13= RULE_ID ) )
                    // InternalGumbo.g:1028:5: (otherlv_13= RULE_ID )
                    {
                    // InternalGumbo.g:1028:5: (otherlv_13= RULE_ID )
                    // InternalGumbo.g:1029:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_0_0());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:1043:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==50) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGumbo.g:1044:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_11_1_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:1048:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalGumbo.g:1049:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalGumbo.g:1049:6: (otherlv_15= RULE_ID )
                    	    // InternalGumbo.g:1050:7: otherlv_15= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_15=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_15, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_1_1_0());
                    	      						
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
                    break;

            }

            otherlv_16=(Token)match(input,51,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_12());
              		
            }
            otherlv_17=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:1078:1: entryRuleHandlerClause returns [EObject current=null] : iv_ruleHandlerClause= ruleHandlerClause EOF ;
    public final EObject entryRuleHandlerClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerClause = null;


        try {
            // InternalGumbo.g:1078:54: (iv_ruleHandlerClause= ruleHandlerClause EOF )
            // InternalGumbo.g:1079:2: iv_ruleHandlerClause= ruleHandlerClause EOF
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
    // InternalGumbo.g:1085:1: ruleHandlerClause returns [EObject current=null] : (otherlv_0= 'handle' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) ;
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
            // InternalGumbo.g:1091:2: ( (otherlv_0= 'handle' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) )
            // InternalGumbo.g:1092:2: (otherlv_0= 'handle' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            {
            // InternalGumbo.g:1092:2: (otherlv_0= 'handle' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            // InternalGumbo.g:1093:3: otherlv_0= 'handle' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHandlerClauseAccess().getHandleKeyword_0());
              		
            }
            // InternalGumbo.g:1097:3: ( (otherlv_1= RULE_ID ) )
            // InternalGumbo.g:1098:4: (otherlv_1= RULE_ID )
            {
            // InternalGumbo.g:1098:4: (otherlv_1= RULE_ID )
            // InternalGumbo.g:1099:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHandlerClauseRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHandlerClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumbo.g:1117:3: ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGumbo.g:1118:4: ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= ';'
                    {
                    // InternalGumbo.g:1118:4: ( (lv_modifies_3_0= ruleSlangModifies ) )
                    // InternalGumbo.g:1119:5: (lv_modifies_3_0= ruleSlangModifies )
                    {
                    // InternalGumbo.g:1119:5: (lv_modifies_3_0= ruleSlangModifies )
                    // InternalGumbo.g:1120:6: lv_modifies_3_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:1142:3: ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGumbo.g:1143:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    {
            	    // InternalGumbo.g:1143:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    // InternalGumbo.g:1144:5: lv_guarantees_5_0= ruleGuaranteeStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalGumbo.g:1165:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumbo.g:1165:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumbo.g:1166:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumbo.g:1172:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= 'case' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) ;
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
            // InternalGumbo.g:1178:2: ( (otherlv_0= 'case' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumbo.g:1179:2: (otherlv_0= 'case' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumbo.g:1179:2: (otherlv_0= 'case' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumbo.g:1180:3: otherlv_0= 'case' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumbo.g:1184:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumbo.g:1185:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumbo.g:1185:4: (lv_id_1_0= RULE_ID )
            // InternalGumbo.g:1186:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalGumbo.g:1202:3: ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING_VALUE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGumbo.g:1203:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:1203:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:1204:5: lv_descriptor_2_0= RULE_STRING_VALUE
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getCaseStatementClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCaseStatementClauseRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3());
              		
            }
            // InternalGumbo.g:1224:3: ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) )
            // InternalGumbo.g:1225:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            {
            // InternalGumbo.g:1225:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            // InternalGumbo.g:1226:5: lv_assumeStatement_4_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalGumbo.g:1243:3: ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            // InternalGumbo.g:1244:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumbo.g:1244:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            // InternalGumbo.g:1245:5: lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement
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
    // InternalGumbo.g:1266:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumbo.g:1266:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumbo.g:1267:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumbo.g:1273:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumbo.g:1279:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumbo.g:1280:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumbo.g:1280:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            else if ( (LA30_0==56) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumbo.g:1281:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumbo.g:1293:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumbo.g:1308:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumbo.g:1308:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumbo.g:1309:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumbo.g:1315:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= 'assume' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) ;
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
            // InternalGumbo.g:1321:2: ( (otherlv_0= 'assume' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) )
            // InternalGumbo.g:1322:2: (otherlv_0= 'assume' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            {
            // InternalGumbo.g:1322:2: (otherlv_0= 'assume' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            // InternalGumbo.g:1323:3: otherlv_0= 'assume' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumbo.g:1327:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumbo.g:1328:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumbo.g:1328:4: (lv_id_1_0= RULE_ID )
            // InternalGumbo.g:1329:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalGumbo.g:1345:3: ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING_VALUE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumbo.g:1346:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:1346:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:1347:5: lv_descriptor_2_0= RULE_STRING_VALUE
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getAssumeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAssumeStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssumeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumbo.g:1367:3: ( (lv_expr_4_0= ruleOwnedExpression ) )
            // InternalGumbo.g:1368:4: (lv_expr_4_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:1368:4: (lv_expr_4_0= ruleOwnedExpression )
            // InternalGumbo.g:1369:5: lv_expr_4_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_4_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:1394:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumbo.g:1394:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumbo.g:1395:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumbo.g:1401:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= 'assume' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:1407:2: ( (otherlv_0= 'assume' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' ) )
            // InternalGumbo.g:1408:2: (otherlv_0= 'assume' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' )
            {
            // InternalGumbo.g:1408:2: (otherlv_0= 'assume' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' )
            // InternalGumbo.g:1409:3: otherlv_0= 'assume' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumbo.g:1413:3: ( (lv_expr_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:1414:4: (lv_expr_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:1414:4: (lv_expr_1_0= ruleOwnedExpression )
            // InternalGumbo.g:1415:5: lv_expr_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:1440:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumbo.g:1440:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumbo.g:1441:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumbo.g:1447:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= 'guarantee' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) ;
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
            // InternalGumbo.g:1453:2: ( (otherlv_0= 'guarantee' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' ) )
            // InternalGumbo.g:1454:2: (otherlv_0= 'guarantee' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            {
            // InternalGumbo.g:1454:2: (otherlv_0= 'guarantee' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';' )
            // InternalGumbo.g:1455:3: otherlv_0= 'guarantee' ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )? otherlv_3= ':' ( (lv_expr_4_0= ruleOwnedExpression ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumbo.g:1459:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumbo.g:1460:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumbo.g:1460:4: (lv_id_1_0= RULE_ID )
            // InternalGumbo.g:1461:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalGumbo.g:1477:3: ( (lv_descriptor_2_0= RULE_STRING_VALUE ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING_VALUE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGumbo.g:1478:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:1478:4: (lv_descriptor_2_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:1479:5: lv_descriptor_2_0= RULE_STRING_VALUE
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getGuaranteeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGuaranteeStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumbo.g:1499:3: ( (lv_expr_4_0= ruleOwnedExpression ) )
            // InternalGumbo.g:1500:4: (lv_expr_4_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:1500:4: (lv_expr_4_0= ruleOwnedExpression )
            // InternalGumbo.g:1501:5: lv_expr_4_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_4_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:1526:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumbo.g:1526:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumbo.g:1527:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumbo.g:1533:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= 'guarantee' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:1539:2: ( (otherlv_0= 'guarantee' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' ) )
            // InternalGumbo.g:1540:2: (otherlv_0= 'guarantee' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' )
            {
            // InternalGumbo.g:1540:2: (otherlv_0= 'guarantee' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';' )
            // InternalGumbo.g:1541:3: otherlv_0= 'guarantee' ( (lv_expr_1_0= ruleOwnedExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumbo.g:1545:3: ( (lv_expr_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:1546:4: (lv_expr_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:1546:4: (lv_expr_1_0= ruleOwnedExpression )
            // InternalGumbo.g:1547:5: lv_expr_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDataElement"
    // InternalGumbo.g:1572:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumbo.g:1572:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumbo.g:1573:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumbo.g:1579:1: ruleDataElement returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumbo.g:1585:2: ( ( ( ruleQualifiedName ) ) )
            // InternalGumbo.g:1586:2: ( ( ruleQualifiedName ) )
            {
            // InternalGumbo.g:1586:2: ( ( ruleQualifiedName ) )
            // InternalGumbo.g:1587:3: ( ruleQualifiedName )
            {
            // InternalGumbo.g:1587:3: ( ruleQualifiedName )
            // InternalGumbo.g:1588:4: ruleQualifiedName
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
            ruleQualifiedName();

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
    // InternalGumbo.g:1608:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumbo.g:1608:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumbo.g:1609:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumbo.g:1615:1: ruleFunctions returns [EObject current=null] : (otherlv_0= 'functions' ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:1621:2: ( (otherlv_0= 'functions' ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumbo.g:1622:2: (otherlv_0= 'functions' ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumbo.g:1622:2: (otherlv_0= 'functions' ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumbo.g:1623:3: otherlv_0= 'functions' ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumbo.g:1627:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==58) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGumbo.g:1628:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumbo.g:1628:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumbo.g:1629:5: lv_specs_1_0= ruleFuncSpec
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
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // InternalGumbo.g:1650:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumbo.g:1650:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumbo.g:1651:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumbo.g:1657:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= ';' ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:1663:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= ';' ) )
            // InternalGumbo.g:1664:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= ';' )
            {
            // InternalGumbo.g:1664:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= ';' )
            // InternalGumbo.g:1665:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_12);
            this_SlangDefDef_0=ruleSlangDefDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangDefDef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:1684:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumbo.g:1684:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumbo.g:1685:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
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
    // InternalGumbo.g:1691:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= 'def' ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= ':' ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
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
            // InternalGumbo.g:1697:2: ( (otherlv_0= 'def' ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= ':' ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumbo.g:1698:2: (otherlv_0= 'def' ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= ':' ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumbo.g:1698:2: (otherlv_0= 'def' ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= ':' ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumbo.g:1699:3: otherlv_0= 'def' ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= ':' ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumbo.g:1703:3: ( ruleSlangDefMods )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=60 && LA34_0<=61)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumbo.g:1704:4: ruleSlangDefMods
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

            // InternalGumbo.g:1715:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGumbo.g:1716:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumbo.g:1716:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumbo.g:1717:5: lv_sde_2_0= ruleSlangDefExt
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

            // InternalGumbo.g:1734:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumbo.g:1735:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumbo.g:1735:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumbo.g:1736:5: lv_name_3_0= ruleSlangDefID
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

            // InternalGumbo.g:1753:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumbo.g:1754:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumbo.g:1754:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumbo.g:1755:5: lv_typeParams_4_0= ruleSlangTypeParams
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

            // InternalGumbo.g:1772:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGumbo.g:1773:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumbo.g:1773:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumbo.g:1774:5: lv_params_5_0= ruleSlangDefParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
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

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSlangDefDeclAccess().getColonKeyword_6());
              		
            }
            // InternalGumbo.g:1795:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumbo.g:1796:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumbo.g:1796:4: (lv_type_7_0= ruleSlangType )
            // InternalGumbo.g:1797:5: lv_type_7_0= ruleSlangType
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

            // InternalGumbo.g:1814:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=55 && LA38_0<=56)||(LA38_0>=69 && LA38_0<=70)) ) {
                alt38=1;
            }
            else if ( (LA38_0==EOF) ) {
                int LA38_2 = input.LA(2);

                if ( (synpred38_InternalGumbo()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalGumbo.g:1815:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumbo.g:1815:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumbo.g:1816:5: lv_c_8_0= ruleSlangDefContract
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
    // InternalGumbo.g:1837:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumbo.g:1837:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumbo.g:1838:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
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
    // InternalGumbo.g:1844:1: ruleSlangDefDef returns [EObject current=null] : (otherlv_0= 'def' ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= ':' ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ':=' ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleOwnedExpression ) ) ) ;
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
            // InternalGumbo.g:1850:2: ( (otherlv_0= 'def' ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= ':' ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ':=' ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleOwnedExpression ) ) ) )
            // InternalGumbo.g:1851:2: (otherlv_0= 'def' ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= ':' ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ':=' ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleOwnedExpression ) ) )
            {
            // InternalGumbo.g:1851:2: (otherlv_0= 'def' ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= ':' ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ':=' ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleOwnedExpression ) ) )
            // InternalGumbo.g:1852:3: otherlv_0= 'def' ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= ':' ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ':=' ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleOwnedExpression ) )
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
              		
            }
            // InternalGumbo.g:1856:3: ( (lv_sde_1_0= ruleSlangDefExt ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGumbo.g:1857:4: (lv_sde_1_0= ruleSlangDefExt )
                    {
                    // InternalGumbo.g:1857:4: (lv_sde_1_0= ruleSlangDefExt )
                    // InternalGumbo.g:1858:5: lv_sde_1_0= ruleSlangDefExt
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

            // InternalGumbo.g:1875:3: ( (lv_name_2_0= ruleSlangDefID ) )
            // InternalGumbo.g:1876:4: (lv_name_2_0= ruleSlangDefID )
            {
            // InternalGumbo.g:1876:4: (lv_name_2_0= ruleSlangDefID )
            // InternalGumbo.g:1877:5: lv_name_2_0= ruleSlangDefID
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

            // InternalGumbo.g:1894:3: ( (lv_typeParams_3_0= ruleSlangTypeParams ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumbo.g:1895:4: (lv_typeParams_3_0= ruleSlangTypeParams )
                    {
                    // InternalGumbo.g:1895:4: (lv_typeParams_3_0= ruleSlangTypeParams )
                    // InternalGumbo.g:1896:5: lv_typeParams_3_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalGumbo.g:1913:3: ( (lv_params_4_0= ruleSlangDefParams ) )
            // InternalGumbo.g:1914:4: (lv_params_4_0= ruleSlangDefParams )
            {
            // InternalGumbo.g:1914:4: (lv_params_4_0= ruleSlangDefParams )
            // InternalGumbo.g:1915:5: lv_params_4_0= ruleSlangDefParams
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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

            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSlangDefDefAccess().getColonKeyword_5());
              		
            }
            // InternalGumbo.g:1936:3: ( (lv_type_6_0= ruleSlangType ) )
            // InternalGumbo.g:1937:4: (lv_type_6_0= ruleSlangType )
            {
            // InternalGumbo.g:1937:4: (lv_type_6_0= ruleSlangType )
            // InternalGumbo.g:1938:5: lv_type_6_0= ruleSlangType
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

            otherlv_7=(Token)match(input,59,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalGumbo.g:1959:3: ( (lv_methodContract_8_0= ruleSlangDefContract ) )
            // InternalGumbo.g:1960:4: (lv_methodContract_8_0= ruleSlangDefContract )
            {
            // InternalGumbo.g:1960:4: (lv_methodContract_8_0= ruleSlangDefContract )
            // InternalGumbo.g:1961:5: lv_methodContract_8_0= ruleSlangDefContract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
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

            // InternalGumbo.g:1978:3: ( (lv_body_9_0= ruleOwnedExpression ) )
            // InternalGumbo.g:1979:4: (lv_body_9_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:1979:4: (lv_body_9_0= ruleOwnedExpression )
            // InternalGumbo.g:1980:5: lv_body_9_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getBodyOwnedExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_9_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:2001:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumbo.g:2001:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumbo.g:2002:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
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
    // InternalGumbo.g:2008:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@strictpure' | kw= '@pure' ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:2014:2: ( (kw= '@strictpure' | kw= '@pure' ) )
            // InternalGumbo.g:2015:2: (kw= '@strictpure' | kw= '@pure' )
            {
            // InternalGumbo.g:2015:2: (kw= '@strictpure' | kw= '@pure' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==60) ) {
                alt41=1;
            }
            else if ( (LA41_0==61) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumbo.g:2016:3: kw= '@strictpure'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictpureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:2022:3: kw= '@pure'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2031:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumbo.g:2031:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumbo.g:2032:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
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
    // InternalGumbo.g:2038:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= ')' ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2044:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= ')' ) )
            // InternalGumbo.g:2045:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= ')' )
            {
            // InternalGumbo.g:2045:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= ')' )
            // InternalGumbo.g:2046:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumbo.g:2050:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumbo.g:2051:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumbo.g:2051:4: (lv_name_1_0= RULE_ID )
            // InternalGumbo.g:2052:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangDefExtAccess().getColonKeyword_2());
              		
            }
            // InternalGumbo.g:2072:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumbo.g:2073:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumbo.g:2073:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumbo.g:2074:5: lv_typeName_3_0= ruleSlangType
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

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2099:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumbo.g:2099:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumbo.g:2100:2: iv_ruleSlangDefID= ruleSlangDefID EOF
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
    // InternalGumbo.g:2106:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalGumbo.g:2112:2: (this_ID_0= RULE_ID )
            // InternalGumbo.g:2113:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGumbo.g:2123:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumbo.g:2123:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumbo.g:2124:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
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
    // InternalGumbo.g:2130:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2136:2: ( (otherlv_0= '(' ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= ')' ) )
            // InternalGumbo.g:2137:2: (otherlv_0= '(' ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= ')' )
            {
            // InternalGumbo.g:2137:2: (otherlv_0= '(' ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= ')' )
            // InternalGumbo.g:2138:3: otherlv_0= '(' ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumbo.g:2142:3: ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumbo.g:2143:4: ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    {
                    // InternalGumbo.g:2143:4: ( (lv_params_1_0= ruleSlangDefParam ) )
                    // InternalGumbo.g:2144:5: (lv_params_1_0= ruleSlangDefParam )
                    {
                    // InternalGumbo.g:2144:5: (lv_params_1_0= ruleSlangDefParam )
                    // InternalGumbo.g:2145:6: lv_params_1_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalGumbo.g:2162:4: (otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==50) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalGumbo.g:2163:5: otherlv_2= ',' ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    {
                    	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:2167:5: ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    // InternalGumbo.g:2168:6: (lv_params_3_0= ruleSlangDefParam )
                    	    {
                    	    // InternalGumbo.g:2168:6: (lv_params_3_0= ruleSlangDefParam )
                    	    // InternalGumbo.g:2169:7: lv_params_3_0= ruleSlangDefParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2196:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumbo.g:2196:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumbo.g:2197:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
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
    // InternalGumbo.g:2203:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_isMethodDef_2_0= '=>' ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= '*' ) )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isMethodDef_2_0=null;
        Token lv_isVarArg_4_0=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2209:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_isMethodDef_2_0= '=>' ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= '*' ) )? ) )
            // InternalGumbo.g:2210:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_isMethodDef_2_0= '=>' ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= '*' ) )? )
            {
            // InternalGumbo.g:2210:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_isMethodDef_2_0= '=>' ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= '*' ) )? )
            // InternalGumbo.g:2211:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_isMethodDef_2_0= '=>' ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= '*' ) )?
            {
            // InternalGumbo.g:2211:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumbo.g:2212:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumbo.g:2212:4: (lv_name_0_0= RULE_ID )
            // InternalGumbo.g:2213:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumbo.g:2233:3: ( (lv_isMethodDef_2_0= '=>' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGumbo.g:2234:4: (lv_isMethodDef_2_0= '=>' )
                    {
                    // InternalGumbo.g:2234:4: (lv_isMethodDef_2_0= '=>' )
                    // InternalGumbo.g:2235:5: lv_isMethodDef_2_0= '=>'
                    {
                    lv_isMethodDef_2_0=(Token)match(input,62,FollowSets000.FOLLOW_9); if (state.failed) return current;
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

            // InternalGumbo.g:2247:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumbo.g:2248:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumbo.g:2248:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumbo.g:2249:5: lv_typeName_3_0= ruleSlangType
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

            // InternalGumbo.g:2266:3: ( (lv_isVarArg_4_0= '*' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGumbo.g:2267:4: (lv_isVarArg_4_0= '*' )
                    {
                    // InternalGumbo.g:2267:4: (lv_isVarArg_4_0= '*' )
                    // InternalGumbo.g:2268:5: lv_isVarArg_4_0= '*'
                    {
                    lv_isVarArg_4_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2284:1: entryRuleSlangTypeParams returns [EObject current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final EObject entryRuleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParams = null;


        try {
            // InternalGumbo.g:2284:56: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumbo.g:2285:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
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
    // InternalGumbo.g:2291:1: ruleSlangTypeParams returns [EObject current=null] : (otherlv_0= '[' ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeParam_1_0 = null;

        EObject lv_typeParam_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2297:2: ( (otherlv_0= '[' ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= ']' ) )
            // InternalGumbo.g:2298:2: (otherlv_0= '[' ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= ']' )
            {
            // InternalGumbo.g:2298:2: (otherlv_0= '[' ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= ']' )
            // InternalGumbo.g:2299:3: otherlv_0= '[' ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumbo.g:2303:3: ( (lv_typeParam_1_0= ruleSlangTypeParam ) )
            // InternalGumbo.g:2304:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            {
            // InternalGumbo.g:2304:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            // InternalGumbo.g:2305:5: lv_typeParam_1_0= ruleSlangTypeParam
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

            // InternalGumbo.g:2322:3: (otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==50) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGumbo.g:2323:4: otherlv_2= ',' ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2327:4: ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    // InternalGumbo.g:2328:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    {
            	    // InternalGumbo.g:2328:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    // InternalGumbo.g:2329:6: lv_typeParam_3_0= ruleSlangTypeParam
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
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2355:1: entryRuleSlangTypeParam returns [EObject current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final EObject entryRuleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParam = null;


        try {
            // InternalGumbo.g:2355:55: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumbo.g:2356:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
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
    // InternalGumbo.g:2362:1: ruleSlangTypeParam returns [EObject current=null] : ( ( (lv_isMut_0_0= 'mut' ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        Token lv_isMut_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGumbo.g:2368:2: ( ( ( (lv_isMut_0_0= 'mut' ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGumbo.g:2369:2: ( ( (lv_isMut_0_0= 'mut' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGumbo.g:2369:2: ( ( (lv_isMut_0_0= 'mut' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGumbo.g:2370:3: ( (lv_isMut_0_0= 'mut' ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGumbo.g:2370:3: ( (lv_isMut_0_0= 'mut' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGumbo.g:2371:4: (lv_isMut_0_0= 'mut' )
                    {
                    // InternalGumbo.g:2371:4: (lv_isMut_0_0= 'mut' )
                    // InternalGumbo.g:2372:5: lv_isMut_0_0= 'mut'
                    {
                    lv_isMut_0_0=(Token)match(input,66,FollowSets000.FOLLOW_9); if (state.failed) return current;
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

            // InternalGumbo.g:2384:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumbo.g:2385:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumbo.g:2385:4: (lv_name_1_0= RULE_ID )
            // InternalGumbo.g:2386:5: lv_name_1_0= RULE_ID
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
    // InternalGumbo.g:2406:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumbo.g:2406:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumbo.g:2407:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
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
    // InternalGumbo.g:2413:1: ruleSlangDefContract returns [EObject current=null] : ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? ) ) ;
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
            // InternalGumbo.g:2419:2: ( ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? ) ) )
            // InternalGumbo.g:2420:2: ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? ) )
            {
            // InternalGumbo.g:2420:2: ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? ) )
            // InternalGumbo.g:2421:3: () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? )
            {
            // InternalGumbo.g:2421:3: ()
            // InternalGumbo.g:2422:4: 
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

            // InternalGumbo.g:2431:3: ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )? )
            // InternalGumbo.g:2432:4: ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )?
            {
            // InternalGumbo.g:2432:4: ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGumbo.g:2433:5: ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= ';'
                    {
                    // InternalGumbo.g:2433:5: ( (lv_reads_1_0= ruleSlangReads ) )
                    // InternalGumbo.g:2434:6: (lv_reads_1_0= ruleSlangReads )
                    {
                    // InternalGumbo.g:2434:6: (lv_reads_1_0= ruleSlangReads )
                    // InternalGumbo.g:2435:7: lv_reads_1_0= ruleSlangReads
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReadsSlangReadsParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_0_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumbo.g:2457:4: ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGumbo.g:2458:5: ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= ';'
                    {
                    // InternalGumbo.g:2458:5: ( (lv_requires_3_0= ruleSlangRequires ) )
                    // InternalGumbo.g:2459:6: (lv_requires_3_0= ruleSlangRequires )
                    {
                    // InternalGumbo.g:2459:6: (lv_requires_3_0= ruleSlangRequires )
                    // InternalGumbo.g:2460:7: lv_requires_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getRequiresSlangRequiresParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_1_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumbo.g:2482:4: ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGumbo.g:2483:5: ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= ';'
                    {
                    // InternalGumbo.g:2483:5: ( (lv_modifies_5_0= ruleSlangModifies ) )
                    // InternalGumbo.g:2484:6: (lv_modifies_5_0= ruleSlangModifies )
                    {
                    // InternalGumbo.g:2484:6: (lv_modifies_5_0= ruleSlangModifies )
                    // InternalGumbo.g:2485:7: lv_modifies_5_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModifiesSlangModifiesParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_2_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumbo.g:2507:4: ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==56) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGumbo.g:2508:5: ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= ';'
                    {
                    // InternalGumbo.g:2508:5: ( (lv_ensures_7_0= ruleSlangEnsures ) )
                    // InternalGumbo.g:2509:6: (lv_ensures_7_0= ruleSlangEnsures )
                    {
                    // InternalGumbo.g:2509:6: (lv_ensures_7_0= ruleSlangEnsures )
                    // InternalGumbo.g:2510:7: lv_ensures_7_0= ruleSlangEnsures
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getEnsuresSlangEnsuresParserRuleCall_1_3_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:2537:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumbo.g:2537:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumbo.g:2538:2: iv_ruleSlangSupr= ruleSlangSupr EOF
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
    // InternalGumbo.g:2544:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2550:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumbo.g:2551:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumbo.g:2551:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumbo.g:2552:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumbo.g:2552:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumbo.g:2553:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumbo.g:2553:4: (lv_name_0_0= ruleSlangName )
            // InternalGumbo.g:2554:5: lv_name_0_0= ruleSlangName
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

            // InternalGumbo.g:2571:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==64) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGumbo.g:2572:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumbo.g:2572:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumbo.g:2573:5: lv_args_1_0= ruleSlangTypeArgs
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
    // InternalGumbo.g:2594:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumbo.g:2594:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumbo.g:2595:2: iv_ruleSlangName= ruleSlangName EOF
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
    // InternalGumbo.g:2601:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:2607:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGumbo.g:2608:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGumbo.g:2608:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGumbo.g:2609:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumbo.g:2616:3: (kw= '.' this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==67) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalGumbo.g:2617:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
            	    break loop53;
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
    // InternalGumbo.g:2634:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumbo.g:2634:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumbo.g:2635:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
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
    // InternalGumbo.g:2641:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= 'invariant' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2647:2: ( (otherlv_0= 'invariant' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) )
            // InternalGumbo.g:2648:2: (otherlv_0= 'invariant' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            {
            // InternalGumbo.g:2648:2: (otherlv_0= 'invariant' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            // InternalGumbo.g:2649:3: otherlv_0= 'invariant' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumbo.g:2653:3: ( (lv_exprs_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:2654:4: (lv_exprs_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:2654:4: (lv_exprs_1_0= ruleOwnedExpression )
            // InternalGumbo.g:2655:5: lv_exprs_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:2672:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==50) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalGumbo.g:2673:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2677:4: ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    // InternalGumbo.g:2678:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    {
            	    // InternalGumbo.g:2678:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    // InternalGumbo.g:2679:6: lv_exprs_3_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleOwnedExpression();

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
            	      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalGumbo.g:2701:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumbo.g:2701:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumbo.g:2702:2: iv_ruleSlangRequires= ruleSlangRequires EOF
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
    // InternalGumbo.g:2708:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= 'assume' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2714:2: ( (otherlv_0= 'assume' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) )
            // InternalGumbo.g:2715:2: (otherlv_0= 'assume' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            {
            // InternalGumbo.g:2715:2: (otherlv_0= 'assume' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            // InternalGumbo.g:2716:3: otherlv_0= 'assume' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumbo.g:2720:3: ( (lv_exprs_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:2721:4: (lv_exprs_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:2721:4: (lv_exprs_1_0= ruleOwnedExpression )
            // InternalGumbo.g:2722:5: lv_exprs_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:2739:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==50) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGumbo.g:2740:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2744:4: ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    // InternalGumbo.g:2745:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    {
            	    // InternalGumbo.g:2745:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    // InternalGumbo.g:2746:6: lv_exprs_3_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleOwnedExpression();

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
            	      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // $ANTLR end "ruleSlangRequires"


    // $ANTLR start "entryRuleSlangReads"
    // InternalGumbo.g:2768:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumbo.g:2768:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumbo.g:2769:2: iv_ruleSlangReads= ruleSlangReads EOF
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
    // InternalGumbo.g:2775:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= 'reads' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2781:2: ( (otherlv_0= 'reads' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) )
            // InternalGumbo.g:2782:2: (otherlv_0= 'reads' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            {
            // InternalGumbo.g:2782:2: (otherlv_0= 'reads' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            // InternalGumbo.g:2783:3: otherlv_0= 'reads' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumbo.g:2787:3: ( (lv_exprs_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:2788:4: (lv_exprs_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:2788:4: (lv_exprs_1_0= ruleOwnedExpression )
            // InternalGumbo.g:2789:5: lv_exprs_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:2806:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==50) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGumbo.g:2807:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2811:4: ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    // InternalGumbo.g:2812:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    {
            	    // InternalGumbo.g:2812:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    // InternalGumbo.g:2813:6: lv_exprs_3_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleOwnedExpression();

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
            	      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // $ANTLR end "ruleSlangReads"


    // $ANTLR start "entryRuleSlangModifies"
    // InternalGumbo.g:2835:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumbo.g:2835:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumbo.g:2836:2: iv_ruleSlangModifies= ruleSlangModifies EOF
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
    // InternalGumbo.g:2842:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= 'modifies' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2848:2: ( (otherlv_0= 'modifies' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) )
            // InternalGumbo.g:2849:2: (otherlv_0= 'modifies' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            {
            // InternalGumbo.g:2849:2: (otherlv_0= 'modifies' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            // InternalGumbo.g:2850:3: otherlv_0= 'modifies' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumbo.g:2854:3: ( (lv_exprs_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:2855:4: (lv_exprs_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:2855:4: (lv_exprs_1_0= ruleOwnedExpression )
            // InternalGumbo.g:2856:5: lv_exprs_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:2873:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==50) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGumbo.g:2874:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2878:4: ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    // InternalGumbo.g:2879:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    {
            	    // InternalGumbo.g:2879:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    // InternalGumbo.g:2880:6: lv_exprs_3_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleOwnedExpression();

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
            	      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // $ANTLR end "ruleSlangModifies"


    // $ANTLR start "entryRuleSlangEnsures"
    // InternalGumbo.g:2902:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumbo.g:2902:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumbo.g:2903:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
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
    // InternalGumbo.g:2909:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= 'guarantee' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2915:2: ( (otherlv_0= 'guarantee' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* ) )
            // InternalGumbo.g:2916:2: (otherlv_0= 'guarantee' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            {
            // InternalGumbo.g:2916:2: (otherlv_0= 'guarantee' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )* )
            // InternalGumbo.g:2917:3: otherlv_0= 'guarantee' ( (lv_exprs_1_0= ruleOwnedExpression ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumbo.g:2921:3: ( (lv_exprs_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:2922:4: (lv_exprs_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:2922:4: (lv_exprs_1_0= ruleOwnedExpression )
            // InternalGumbo.g:2923:5: lv_exprs_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:2940:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==50) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGumbo.g:2941:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:2945:4: ( (lv_exprs_3_0= ruleOwnedExpression ) )
            	    // InternalGumbo.g:2946:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    {
            	    // InternalGumbo.g:2946:5: (lv_exprs_3_0= ruleOwnedExpression )
            	    // InternalGumbo.g:2947:6: lv_exprs_3_0= ruleOwnedExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleOwnedExpression();

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
            	      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // $ANTLR end "ruleSlangEnsures"


    // $ANTLR start "entryRuleSlangType"
    // InternalGumbo.g:2969:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumbo.g:2969:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumbo.g:2970:2: iv_ruleSlangType= ruleSlangType EOF
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
    // InternalGumbo.g:2976:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:2982:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumbo.g:2983:2: this_SlangBaseType_0= ruleSlangBaseType
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
    // InternalGumbo.g:2997:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumbo.g:2997:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumbo.g:2998:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
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
    // InternalGumbo.g:3004:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumbo.g:3010:2: ( ( ( ruleQualifiedName ) ) )
            // InternalGumbo.g:3011:2: ( ( ruleQualifiedName ) )
            {
            // InternalGumbo.g:3011:2: ( ( ruleQualifiedName ) )
            // InternalGumbo.g:3012:3: ( ruleQualifiedName )
            {
            // InternalGumbo.g:3012:3: ( ruleQualifiedName )
            // InternalGumbo.g:3013:4: ruleQualifiedName
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
            ruleQualifiedName();

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
    // InternalGumbo.g:3033:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumbo.g:3033:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumbo.g:3034:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
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
    // InternalGumbo.g:3040:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= '[' ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:3046:2: ( (otherlv_0= '[' ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= ']' ) )
            // InternalGumbo.g:3047:2: (otherlv_0= '[' ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= ']' )
            {
            // InternalGumbo.g:3047:2: (otherlv_0= '[' ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= ']' )
            // InternalGumbo.g:3048:3: otherlv_0= '[' ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumbo.g:3052:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumbo.g:3053:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumbo.g:3053:4: (lv_types_1_0= ruleSlangType )
            // InternalGumbo.g:3054:5: lv_types_1_0= ruleSlangType
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

            // InternalGumbo.g:3071:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==50) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGumbo.g:3072:4: otherlv_2= ',' ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumbo.g:3076:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumbo.g:3077:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumbo.g:3077:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumbo.g:3078:6: lv_types_3_0= ruleSlangType
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
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSlangStmt"
    // InternalGumbo.g:3104:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumbo.g:3104:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumbo.g:3105:2: iv_ruleSlangStmt= ruleSlangStmt EOF
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
    // InternalGumbo.g:3111:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' ) | ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? ) | ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? ) | ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? ) | ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) ) ) ;
    public final EObject ruleSlangStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token this_STRING_VALUE_24=null;
        Token otherlv_26=null;
        Token this_STRING_VALUE_28=null;
        Token otherlv_30=null;
        Token this_STRING_VALUE_31=null;
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
            // InternalGumbo.g:3117:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' ) | ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? ) | ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? ) | ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? ) | ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) ) ) )
            // InternalGumbo.g:3118:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' ) | ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? ) | ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? ) | ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? ) | ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) ) )
            {
            // InternalGumbo.g:3118:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' ) | ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? ) | ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? ) | ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? ) | ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) ) )
            int alt69=10;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
                {
                alt69=1;
                }
                break;
            case 71:
                {
                alt69=2;
                }
                break;
            case 72:
                {
                alt69=3;
                }
                break;
            case 73:
                {
                alt69=4;
                }
                break;
            case 76:
                {
                alt69=5;
                }
                break;
            case 55:
                {
                alt69=6;
                }
                break;
            case 77:
                {
                alt69=7;
                }
                break;
            case 78:
                {
                alt69=8;
                }
                break;
            case 79:
                {
                alt69=9;
                }
                break;
            case RULE_ID:
                {
                alt69=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalGumbo.g:3119:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumbo.g:3119:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumbo.g:3120:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumbo.g:3120:4: ()
                    // InternalGumbo.g:3121:5: 
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

                    // InternalGumbo.g:3130:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumbo.g:3131:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumbo.g:3131:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumbo.g:3132:6: lv_d_1_0= ruleSlangVarDef
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
                    // InternalGumbo.g:3151:3: ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumbo.g:3151:3: ( () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumbo.g:3152:4: () otherlv_3= 'if' ( (lv_cond_4_0= ruleOwnedExpression ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumbo.g:3152:4: ()
                    // InternalGumbo.g:3153:5: 
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

                    otherlv_3=(Token)match(input,71,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangStmtAccess().getIfKeyword_1_1());
                      			
                    }
                    // InternalGumbo.g:3166:4: ( (lv_cond_4_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3167:5: (lv_cond_4_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3167:5: (lv_cond_4_0= ruleOwnedExpression )
                    // InternalGumbo.g:3168:6: lv_cond_4_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_cond_4_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:3185:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumbo.g:3186:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumbo.g:3186:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumbo.g:3187:6: lv_b_5_0= ruleSlangBlock
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

                    // InternalGumbo.g:3204:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==80) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalGumbo.g:3205:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumbo.g:3205:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumbo.g:3206:6: lv_e_6_0= ruleSlangElse
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
                    // InternalGumbo.g:3225:3: ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumbo.g:3225:3: ( () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumbo.g:3226:4: () otherlv_8= 'while' ( (lv_cond_9_0= ruleOwnedExpression ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumbo.g:3226:4: ()
                    // InternalGumbo.g:3227:5: 
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

                    otherlv_8=(Token)match(input,72,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1());
                      			
                    }
                    // InternalGumbo.g:3240:4: ( (lv_cond_9_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3241:5: (lv_cond_9_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3241:5: (lv_cond_9_0= ruleOwnedExpression )
                    // InternalGumbo.g:3242:6: lv_cond_9_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_cond_9_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:3259:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumbo.g:3260:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumbo.g:3260:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumbo.g:3261:6: lv_l_10_0= ruleSlangLoopContract
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

                    // InternalGumbo.g:3278:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumbo.g:3279:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumbo.g:3279:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumbo.g:3280:6: lv_b_11_0= ruleSlangBlock
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
                    // InternalGumbo.g:3299:3: ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' )
                    {
                    // InternalGumbo.g:3299:3: ( () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}' )
                    // InternalGumbo.g:3300:4: () otherlv_13= 'match' ( (lv_testExpr_14_0= ruleOwnedExpression ) ) otherlv_15= '{' ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= '}'
                    {
                    // InternalGumbo.g:3300:4: ()
                    // InternalGumbo.g:3301:5: 
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

                    otherlv_13=(Token)match(input,73,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1());
                      			
                    }
                    // InternalGumbo.g:3314:4: ( (lv_testExpr_14_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3315:5: (lv_testExpr_14_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3315:5: (lv_testExpr_14_0= ruleOwnedExpression )
                    // InternalGumbo.g:3316:6: lv_testExpr_14_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprOwnedExpressionParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_testExpr_14_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,74,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalGumbo.g:3337:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==54) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalGumbo.g:3338:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumbo.g:3338:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumbo.g:3339:6: lv_c_16_0= ruleSlangCase
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getSlangStmtAccess().getRightCurlyBracketKeyword_3_5());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumbo.g:3362:3: ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumbo.g:3362:3: ( () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumbo.g:3363:4: () otherlv_19= 'spec' ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumbo.g:3363:4: ()
                    // InternalGumbo.g:3364:5: 
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

                    otherlv_19=(Token)match(input,76,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
                      			
                    }
                    // InternalGumbo.g:3377:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumbo.g:3378:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumbo.g:3378:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumbo.g:3379:6: lv_b_20_0= ruleSlangBlock
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
                    // InternalGumbo.g:3398:3: ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? )
                    {
                    // InternalGumbo.g:3398:3: ( () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )? )
                    // InternalGumbo.g:3399:4: () otherlv_22= 'assume' ( (lv_e_23_0= ruleOwnedExpression ) ) (this_STRING_VALUE_24= RULE_STRING_VALUE )?
                    {
                    // InternalGumbo.g:3399:4: ()
                    // InternalGumbo.g:3400:5: 
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

                    otherlv_22=(Token)match(input,55,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1());
                      			
                    }
                    // InternalGumbo.g:3413:4: ( (lv_e_23_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3414:5: (lv_e_23_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3414:5: (lv_e_23_0= ruleOwnedExpression )
                    // InternalGumbo.g:3415:6: lv_e_23_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_e_23_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:3432:4: (this_STRING_VALUE_24= RULE_STRING_VALUE )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_STRING_VALUE) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalGumbo.g:3433:5: this_STRING_VALUE_24= RULE_STRING_VALUE
                            {
                            this_STRING_VALUE_24=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_STRING_VALUE_24, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_5_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumbo.g:3440:3: ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? )
                    {
                    // InternalGumbo.g:3440:3: ( () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )? )
                    // InternalGumbo.g:3441:4: () otherlv_26= 'assert' ( (lv_e_27_0= ruleOwnedExpression ) ) (this_STRING_VALUE_28= RULE_STRING_VALUE )?
                    {
                    // InternalGumbo.g:3441:4: ()
                    // InternalGumbo.g:3442:5: 
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

                    otherlv_26=(Token)match(input,77,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1());
                      			
                    }
                    // InternalGumbo.g:3455:4: ( (lv_e_27_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3456:5: (lv_e_27_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3456:5: (lv_e_27_0= ruleOwnedExpression )
                    // InternalGumbo.g:3457:6: lv_e_27_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_e_27_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:3474:4: (this_STRING_VALUE_28= RULE_STRING_VALUE )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_STRING_VALUE) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalGumbo.g:3475:5: this_STRING_VALUE_28= RULE_STRING_VALUE
                            {
                            this_STRING_VALUE_28=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_STRING_VALUE_28, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_6_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumbo.g:3482:3: ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? )
                    {
                    // InternalGumbo.g:3482:3: ( () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )? )
                    // InternalGumbo.g:3483:4: () otherlv_30= 'halt' (this_STRING_VALUE_31= RULE_STRING_VALUE )?
                    {
                    // InternalGumbo.g:3483:4: ()
                    // InternalGumbo.g:3484:5: 
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

                    otherlv_30=(Token)match(input,78,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
                      			
                    }
                    // InternalGumbo.g:3497:4: (this_STRING_VALUE_31= RULE_STRING_VALUE )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_STRING_VALUE) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGumbo.g:3498:5: this_STRING_VALUE_31= RULE_STRING_VALUE
                            {
                            this_STRING_VALUE_31=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_STRING_VALUE_31, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_7_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumbo.g:3505:3: ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) )
                    {
                    // InternalGumbo.g:3505:3: ( () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) ) )
                    // InternalGumbo.g:3506:4: () otherlv_33= 'do' ( (lv_e_34_0= ruleOwnedExpression ) )
                    {
                    // InternalGumbo.g:3506:4: ()
                    // InternalGumbo.g:3507:5: 
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

                    otherlv_33=(Token)match(input,79,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getSlangStmtAccess().getDoKeyword_8_1());
                      			
                    }
                    // InternalGumbo.g:3520:4: ( (lv_e_34_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3521:5: (lv_e_34_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3521:5: (lv_e_34_0= ruleOwnedExpression )
                    // InternalGumbo.g:3522:6: lv_e_34_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_34_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGumbo.g:3541:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) )
                    {
                    // InternalGumbo.g:3541:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) ) )
                    // InternalGumbo.g:3542:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) )
                    {
                    // InternalGumbo.g:3542:4: ()
                    // InternalGumbo.g:3543:5: 
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

                    // InternalGumbo.g:3552:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumbo.g:3553:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumbo.g:3553:5: (otherlv_36= RULE_ID )
                    // InternalGumbo.g:3554:6: otherlv_36= RULE_ID
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

                    // InternalGumbo.g:3568:4: (otherlv_37= ':' | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? ) )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==39) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==EOF||LA68_0==RULE_ID||LA68_0==RULE_DEFOP||LA68_0==49||(LA68_0>=54 && LA68_0<=55)||LA68_0==59||LA68_0==67||(LA68_0>=71 && LA68_0<=73)||(LA68_0>=75 && LA68_0<=79)||(LA68_0>=82 && LA68_0<=83)||LA68_0==99) ) {
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
                            // InternalGumbo.g:3569:5: otherlv_37= ':'
                            {
                            otherlv_37=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:3574:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? )
                            {
                            // InternalGumbo.g:3574:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )? )
                            // InternalGumbo.g:3575:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )?
                            {
                            // InternalGumbo.g:3575:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==49||LA65_0==67) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // InternalGumbo.g:3576:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    {
                            	    // InternalGumbo.g:3576:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    // InternalGumbo.g:3577:8: lv_l_38_0= ruleSlangLHSSuffix
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
                            	    break loop65;
                                }
                            } while (true);

                            // InternalGumbo.g:3594:6: ( (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==RULE_DEFOP||LA67_0==59) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalGumbo.g:3595:7: (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleOwnedExpression ) )
                                    {
                                    // InternalGumbo.g:3595:7: (otherlv_39= ':=' | this_DEFOP_40= RULE_DEFOP )
                                    int alt66=2;
                                    int LA66_0 = input.LA(1);

                                    if ( (LA66_0==59) ) {
                                        alt66=1;
                                    }
                                    else if ( (LA66_0==RULE_DEFOP) ) {
                                        alt66=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 66, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt66) {
                                        case 1 :
                                            // InternalGumbo.g:3596:8: otherlv_39= ':='
                                            {
                                            otherlv_39=(Token)match(input,59,FollowSets000.FOLLOW_16); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(otherlv_39, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0());
                                              							
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumbo.g:3601:8: this_DEFOP_40= RULE_DEFOP
                                            {
                                            this_DEFOP_40=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_16); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(this_DEFOP_40, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1());
                                              							
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumbo.g:3606:7: ( (lv_e_41_0= ruleOwnedExpression ) )
                                    // InternalGumbo.g:3607:8: (lv_e_41_0= ruleOwnedExpression )
                                    {
                                    // InternalGumbo.g:3607:8: (lv_e_41_0= ruleOwnedExpression )
                                    // InternalGumbo.g:3608:9: lv_e_41_0= ruleOwnedExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_9_2_1_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_e_41_0=ruleOwnedExpression();

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
                                      										"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:3633:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumbo.g:3633:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumbo.g:3634:2: iv_ruleSlangElse= ruleSlangElse EOF
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
    // InternalGumbo.g:3640:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= 'else' ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
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
            // InternalGumbo.g:3646:2: ( (otherlv_0= 'else' ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumbo.g:3647:2: (otherlv_0= 'else' ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumbo.g:3647:2: (otherlv_0= 'else' ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumbo.g:3648:3: otherlv_0= 'else' ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumbo.g:3652:3: ( (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            else if ( (LA71_0==74) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalGumbo.g:3653:4: (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumbo.g:3653:4: (otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumbo.g:3654:5: otherlv_1= 'if' ( (lv_cond_2_0= ruleOwnedExpression ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumbo.g:3658:5: ( (lv_cond_2_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3659:6: (lv_cond_2_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3659:6: (lv_cond_2_0= ruleOwnedExpression )
                    // InternalGumbo.g:3660:7: lv_cond_2_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getCondOwnedExpressionParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_cond_2_0=ruleOwnedExpression();

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
                      								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumbo.g:3677:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumbo.g:3678:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumbo.g:3678:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumbo.g:3679:7: lv_b_3_0= ruleSlangBlock
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

                    // InternalGumbo.g:3696:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==80) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalGumbo.g:3697:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumbo.g:3697:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumbo.g:3698:7: lv_e_4_0= ruleSlangElse
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
                    // InternalGumbo.g:3717:4: this_SlangBlock_5= ruleSlangBlock
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
    // InternalGumbo.g:3733:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumbo.g:3733:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumbo.g:3734:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
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
    // InternalGumbo.g:3740:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:3746:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumbo.g:3747:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumbo.g:3747:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumbo.g:3748:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumbo.g:3748:3: ()
            // InternalGumbo.g:3749:4: 
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

            // InternalGumbo.g:3758:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==68) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalGumbo.g:3759:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumbo.g:3759:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumbo.g:3760:5: lv_inv_1_0= ruleSlangInvariant
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

            // InternalGumbo.g:3777:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==70) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalGumbo.g:3778:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumbo.g:3778:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumbo.g:3779:5: lv_mod_2_0= ruleSlangModifies
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
    // InternalGumbo.g:3800:1: entryRuleSlangLHSSuffix returns [EObject current=null] : iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF ;
    public final EObject entryRuleSlangLHSSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLHSSuffix = null;


        try {
            // InternalGumbo.g:3800:55: (iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF )
            // InternalGumbo.g:3801:2: iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF
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
    // InternalGumbo.g:3807:1: ruleSlangLHSSuffix returns [EObject current=null] : ( ( () otherlv_1= '.' this_ID_2= RULE_ID ) | ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' ) ) ;
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
            // InternalGumbo.g:3813:2: ( ( ( () otherlv_1= '.' this_ID_2= RULE_ID ) | ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' ) ) )
            // InternalGumbo.g:3814:2: ( ( () otherlv_1= '.' this_ID_2= RULE_ID ) | ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' ) )
            {
            // InternalGumbo.g:3814:2: ( ( () otherlv_1= '.' this_ID_2= RULE_ID ) | ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==67) ) {
                alt76=1;
            }
            else if ( (LA76_0==49) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalGumbo.g:3815:3: ( () otherlv_1= '.' this_ID_2= RULE_ID )
                    {
                    // InternalGumbo.g:3815:3: ( () otherlv_1= '.' this_ID_2= RULE_ID )
                    // InternalGumbo.g:3816:4: () otherlv_1= '.' this_ID_2= RULE_ID
                    {
                    // InternalGumbo.g:3816:4: ()
                    // InternalGumbo.g:3817:5: 
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

                    otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
                    // InternalGumbo.g:3836:3: ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' )
                    {
                    // InternalGumbo.g:3836:3: ( () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')' )
                    // InternalGumbo.g:3837:4: () otherlv_4= '(' ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )? otherlv_8= ')'
                    {
                    // InternalGumbo.g:3837:4: ()
                    // InternalGumbo.g:3838:5: 
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

                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumbo.g:3851:4: ( ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )* )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_STRING_VALUE)||(LA75_0>=RULE_INTEGER_LIT && LA75_0<=RULE_MSPB)||(LA75_0>=RULE_OP && LA75_0<=RULE_SIMPLIES)||LA75_0==49||LA75_0==63||LA75_0==71||LA75_0==74||(LA75_0>=84 && LA75_0<=87)||(LA75_0>=90 && LA75_0<=94)||LA75_0==96||(LA75_0>=100 && LA75_0<=106)||(LA75_0>=111 && LA75_0<=112)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalGumbo.g:3852:5: ( (lv_exprs_5_0= ruleOwnedExpression ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )*
                            {
                            // InternalGumbo.g:3852:5: ( (lv_exprs_5_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:3853:6: (lv_exprs_5_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:3853:6: (lv_exprs_5_0= ruleOwnedExpression )
                            // InternalGumbo.g:3854:7: lv_exprs_5_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsOwnedExpressionParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_30);
                            lv_exprs_5_0=ruleOwnedExpression();

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
                              								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalGumbo.g:3871:5: (otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==50) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // InternalGumbo.g:3872:6: otherlv_6= ',' ( (lv_exprs_7_0= ruleOwnedExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalGumbo.g:3876:6: ( (lv_exprs_7_0= ruleOwnedExpression ) )
                            	    // InternalGumbo.g:3877:7: (lv_exprs_7_0= ruleOwnedExpression )
                            	    {
                            	    // InternalGumbo.g:3877:7: (lv_exprs_7_0= ruleOwnedExpression )
                            	    // InternalGumbo.g:3878:8: lv_exprs_7_0= ruleOwnedExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsOwnedExpressionParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_30);
                            	    lv_exprs_7_0=ruleOwnedExpression();

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
                            	      									"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:3906:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumbo.g:3906:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumbo.g:3907:2: iv_ruleSlangCase= ruleSlangCase EOF
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
    // InternalGumbo.g:3913:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )? otherlv_4= '=>' ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
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
            // InternalGumbo.g:3919:2: ( (otherlv_0= 'case' ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )? otherlv_4= '=>' ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumbo.g:3920:2: (otherlv_0= 'case' ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )? otherlv_4= '=>' ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumbo.g:3920:2: (otherlv_0= 'case' ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )? otherlv_4= '=>' ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumbo.g:3921:3: otherlv_0= 'case' ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )? otherlv_4= '=>' ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumbo.g:3925:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumbo.g:3926:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumbo.g:3926:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumbo.g:3927:5: lv_pattern_1_0= ruleSlangPattern
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

            // InternalGumbo.g:3944:3: (otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalGumbo.g:3945:4: otherlv_2= 'if' ( (lv_e_3_0= ruleOwnedExpression ) )
                    {
                    otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumbo.g:3949:4: ( (lv_e_3_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:3950:5: (lv_e_3_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:3950:5: (lv_e_3_0= ruleOwnedExpression )
                    // InternalGumbo.g:3951:6: lv_e_3_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEOwnedExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_e_3_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,62,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumbo.g:3973:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID||LA78_0==55||(LA78_0>=71 && LA78_0<=73)||(LA78_0>=76 && LA78_0<=79)||(LA78_0>=82 && LA78_0<=83)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalGumbo.g:3974:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumbo.g:3974:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumbo.g:3975:5: lv_s_5_0= ruleSlangStmt
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
            	    break loop78;
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
    // InternalGumbo.g:3996:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumbo.g:3996:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumbo.g:3997:2: iv_ruleSlangPattern= ruleSlangPattern EOF
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
    // InternalGumbo.g:4003:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? ) | (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' ) ) ;
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
            // InternalGumbo.g:4009:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? ) | (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' ) ) )
            // InternalGumbo.g:4010:2: ( ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? ) | (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' ) )
            {
            // InternalGumbo.g:4010:2: ( ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? ) | (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==49) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalGumbo.g:4011:3: ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalGumbo.g:4011:3: ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )? )
                    // InternalGumbo.g:4012:4: () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )?
                    {
                    // InternalGumbo.g:4012:4: ()
                    // InternalGumbo.g:4013:5: 
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
                    // InternalGumbo.g:4026:4: (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==49) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalGumbo.g:4027:5: otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumbo.g:4031:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumbo.g:4032:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumbo.g:4032:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumbo.g:4033:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_30);
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

                            // InternalGumbo.g:4050:5: (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==50) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalGumbo.g:4051:6: otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumbo.g:4055:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumbo.g:4056:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumbo.g:4056:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumbo.g:4057:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_30);
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
                            	    break loop79;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:4082:3: (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' )
                    {
                    // InternalGumbo.g:4082:3: (otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')' )
                    // InternalGumbo.g:4083:4: otherlv_7= '(' ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,49,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumbo.g:4087:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumbo.g:4088:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumbo.g:4088:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumbo.g:4089:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalGumbo.g:4106:4: (otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==50) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalGumbo.g:4107:5: otherlv_9= ',' ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,50,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:4111:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumbo.g:4112:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumbo.g:4112:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumbo.g:4113:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:4140:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumbo.g:4140:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumbo.g:4141:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
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
    // InternalGumbo.g:4147:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' ) | ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
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
            // InternalGumbo.g:4153:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' ) | ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumbo.g:4154:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' ) | ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumbo.g:4154:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' ) | ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt87=1;
                }
                break;
            case 49:
                {
                alt87=2;
                }
                break;
            case 81:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalGumbo.g:4155:3: ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumbo.g:4155:3: ( () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumbo.g:4156:4: () this_ID_1= RULE_ID ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumbo.g:4156:4: ()
                    // InternalGumbo.g:4157:5: 
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
                    // InternalGumbo.g:4170:4: ( (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' ) | (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    int alt84=3;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==49) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==39) ) {
                        alt84=2;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalGumbo.g:4171:5: (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )
                            {
                            // InternalGumbo.g:4171:5: (otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')' )
                            // InternalGumbo.g:4172:6: otherlv_2= '(' ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumbo.g:4176:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumbo.g:4177:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumbo.g:4177:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumbo.g:4178:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_30);
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

                            // InternalGumbo.g:4195:6: (otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==50) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // InternalGumbo.g:4196:7: otherlv_4= ',' ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumbo.g:4200:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumbo.g:4201:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumbo.g:4201:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumbo.g:4202:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_30);
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
                            	    break loop83;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_0_2_0_3());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:4226:5: (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumbo.g:4226:5: (otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumbo.g:4227:6: otherlv_7= ':' ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumbo.g:4231:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumbo.g:4232:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumbo.g:4232:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumbo.g:4233:8: lv_type_8_0= ruleSlangType
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
                    // InternalGumbo.g:4254:3: (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' )
                    {
                    // InternalGumbo.g:4254:3: (otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')' )
                    // InternalGumbo.g:4255:4: otherlv_9= '(' ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,49,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumbo.g:4259:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumbo.g:4260:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumbo.g:4260:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumbo.g:4261:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalGumbo.g:4278:4: (otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==50) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalGumbo.g:4279:5: otherlv_11= ',' ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,50,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:4283:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumbo.g:4284:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumbo.g:4284:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumbo.g:4285:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGumbo.g:4309:3: ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumbo.g:4309:3: ( () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumbo.g:4310:4: () otherlv_15= '_' (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumbo.g:4310:4: ()
                    // InternalGumbo.g:4311:5: 
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

                    otherlv_15=(Token)match(input,81,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumbo.g:4324:4: (otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==39) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalGumbo.g:4325:5: otherlv_16= ':' ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumbo.g:4329:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumbo.g:4330:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumbo.g:4330:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumbo.g:4331:7: lv_type_17_0= ruleSlangType
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
    // InternalGumbo.g:4354:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumbo.g:4354:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumbo.g:4355:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
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
    // InternalGumbo.g:4361:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ':=' ( (lv_init_5_0= ruleOwnedExpression ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:4367:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ':=' ( (lv_init_5_0= ruleOwnedExpression ) ) ) )
            // InternalGumbo.g:4368:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ':=' ( (lv_init_5_0= ruleOwnedExpression ) ) )
            {
            // InternalGumbo.g:4368:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ':=' ( (lv_init_5_0= ruleOwnedExpression ) ) )
            // InternalGumbo.g:4369:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ':=' ( (lv_init_5_0= ruleOwnedExpression ) )
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
            // InternalGumbo.g:4390:3: (otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==39) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalGumbo.g:4391:4: otherlv_2= ':' ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumbo.g:4395:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumbo.g:4396:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumbo.g:4396:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumbo.g:4397:6: lv_typeName_3_0= ruleSlangType
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

            otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalGumbo.g:4419:3: ( (lv_init_5_0= ruleOwnedExpression ) )
            // InternalGumbo.g:4420:4: (lv_init_5_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:4420:4: (lv_init_5_0= ruleOwnedExpression )
            // InternalGumbo.g:4421:5: lv_init_5_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangVarDefAccess().getInitOwnedExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_init_5_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:4442:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumbo.g:4442:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumbo.g:4443:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
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
    // InternalGumbo.g:4449:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'val' | kw= 'var' ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:4455:2: ( (kw= 'val' | kw= 'var' ) )
            // InternalGumbo.g:4456:2: (kw= 'val' | kw= 'var' )
            {
            // InternalGumbo.g:4456:2: (kw= 'val' | kw= 'var' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==82) ) {
                alt89=1;
            }
            else if ( (LA89_0==83) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalGumbo.g:4457:3: kw= 'val'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:4463:3: kw= 'var'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSlangBlock"
    // InternalGumbo.g:4472:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumbo.g:4472:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumbo.g:4473:2: iv_ruleSlangBlock= ruleSlangBlock EOF
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
    // InternalGumbo.g:4479:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= '}' ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:4485:2: ( ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= '}' ) )
            // InternalGumbo.g:4486:2: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= '}' )
            {
            // InternalGumbo.g:4486:2: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= '}' )
            // InternalGumbo.g:4487:3: () otherlv_1= '{' ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= '}'
            {
            // InternalGumbo.g:4487:3: ()
            // InternalGumbo.g:4488:4: 
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

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumbo.g:4501:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_ID||LA90_0==55||(LA90_0>=71 && LA90_0<=73)||(LA90_0>=76 && LA90_0<=79)||(LA90_0>=82 && LA90_0<=83)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalGumbo.g:4502:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumbo.g:4502:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumbo.g:4503:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
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
            	    break loop90;
                }
            } while (true);

            // InternalGumbo.g:4520:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==99) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalGumbo.g:4521:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumbo.g:4521:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumbo.g:4522:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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

            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOwnedExpression"
    // InternalGumbo.g:4547:1: entryRuleOwnedExpression returns [EObject current=null] : iv_ruleOwnedExpression= ruleOwnedExpression EOF ;
    public final EObject entryRuleOwnedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedExpression = null;


        try {
            // InternalGumbo.g:4547:56: (iv_ruleOwnedExpression= ruleOwnedExpression EOF )
            // InternalGumbo.g:4548:2: iv_ruleOwnedExpression= ruleOwnedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOwnedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOwnedExpression=ruleOwnedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOwnedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedExpression"


    // $ANTLR start "ruleOwnedExpression"
    // InternalGumbo.g:4554:1: ruleOwnedExpression returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) ) | ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) ) ;
    public final EObject ruleOwnedExpression() throws RecognitionException {
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
            // InternalGumbo.g:4560:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) ) | ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) ) )
            // InternalGumbo.g:4561:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) ) | ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumbo.g:4561:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) ) | ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING_VALUE:
            case RULE_INTEGER_LIT:
            case RULE_HEX:
            case RULE_BIN:
            case RULE_F32_LIT:
            case RULE_F64_LIT:
            case RULE_REAL_LIT:
            case RULE_MSTRING:
            case RULE_MSP:
            case RULE_SLI:
            case RULE_MSPB:
            case 49:
            case 74:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
                {
                alt95=1;
                }
                break;
            case 71:
                {
                alt95=2;
                }
                break;
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt95=3;
                }
                break;
            case RULE_OP:
            case RULE_IMPLIES:
            case RULE_SIMPLIES:
            case 63:
            case 111:
            case 112:
                {
                alt95=4;
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
                    // InternalGumbo.g:4562:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* )
                    {
                    // InternalGumbo.g:4562:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* )
                    // InternalGumbo.g:4563:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                    {
                    // InternalGumbo.g:4563:4: ()
                    // InternalGumbo.g:4564:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOwnedExpressionAccess().getBasicExpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumbo.g:4573:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumbo.g:4574:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumbo.g:4574:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumbo.g:4575:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_77);
                    lv_terms_1_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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

                    // InternalGumbo.g:4592:4: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( ((LA92_0>=RULE_OP && LA92_0<=RULE_SIMPLIES)||LA92_0==63||(LA92_0>=111 && LA92_0<=112)) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalGumbo.g:4593:5: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                    	    {
                    	    // InternalGumbo.g:4593:5: ( (lv_ops_2_0= ruleOperator ) )
                    	    // InternalGumbo.g:4594:6: (lv_ops_2_0= ruleOperator )
                    	    {
                    	    // InternalGumbo.g:4594:6: (lv_ops_2_0= ruleOperator )
                    	    // InternalGumbo.g:4595:7: lv_ops_2_0= ruleOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOwnedExpressionAccess().getOpsOperatorParserRuleCall_0_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_78);
                    	    lv_ops_2_0=ruleOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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

                    	    // InternalGumbo.g:4612:5: ( (lv_terms_3_0= ruleSlangAccess ) )
                    	    // InternalGumbo.g:4613:6: (lv_terms_3_0= ruleSlangAccess )
                    	    {
                    	    // InternalGumbo.g:4613:6: (lv_terms_3_0= ruleSlangAccess )
                    	    // InternalGumbo.g:4614:7: lv_terms_3_0= ruleSlangAccess
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOwnedExpressionAccess().getTermsSlangAccessParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_terms_3_0=ruleSlangAccess();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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


                    }
                    break;
                case 2 :
                    // InternalGumbo.g:4634:3: ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) )
                    {
                    // InternalGumbo.g:4634:3: ( () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) ) )
                    // InternalGumbo.g:4635:4: () otherlv_5= 'if' otherlv_6= '(' ( (lv_ifCond_7_0= ruleOwnedExpression ) ) otherlv_8= ')' ( (lv_thenExpr_9_0= ruleOwnedExpression ) ) otherlv_10= 'else' ( (lv_elseExpr_11_0= ruleOwnedExpression ) )
                    {
                    // InternalGumbo.g:4635:4: ()
                    // InternalGumbo.g:4636:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOwnedExpressionAccess().getIfElseExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,71,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getOwnedExpressionAccess().getIfKeyword_1_1());
                      			
                    }
                    otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOwnedExpressionAccess().getLeftParenthesisKeyword_1_2());
                      			
                    }
                    // InternalGumbo.g:4653:4: ( (lv_ifCond_7_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:4654:5: (lv_ifCond_7_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:4654:5: (lv_ifCond_7_0= ruleOwnedExpression )
                    // InternalGumbo.g:4655:6: lv_ifCond_7_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getIfCondOwnedExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_ifCond_7_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
                      						}
                      						set(
                      							current,
                      							"ifCond",
                      							lv_ifCond_7_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getOwnedExpressionAccess().getRightParenthesisKeyword_1_4());
                      			
                    }
                    // InternalGumbo.g:4676:4: ( (lv_thenExpr_9_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:4677:5: (lv_thenExpr_9_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:4677:5: (lv_thenExpr_9_0= ruleOwnedExpression )
                    // InternalGumbo.g:4678:6: lv_thenExpr_9_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getThenExprOwnedExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    lv_thenExpr_9_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
                      						}
                      						set(
                      							current,
                      							"thenExpr",
                      							lv_thenExpr_9_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,80,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getOwnedExpressionAccess().getElseKeyword_1_6());
                      			
                    }
                    // InternalGumbo.g:4699:4: ( (lv_elseExpr_11_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:4700:5: (lv_elseExpr_11_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:4700:5: (lv_elseExpr_11_0= ruleOwnedExpression )
                    // InternalGumbo.g:4701:6: lv_elseExpr_11_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getElseExprOwnedExpressionParserRuleCall_1_7_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseExpr_11_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
                      						}
                      						set(
                      							current,
                      							"elseExpr",
                      							lv_elseExpr_11_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumbo.g:4720:3: ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) )
                    {
                    // InternalGumbo.g:4720:3: ( () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) ) )
                    // InternalGumbo.g:4721:4: () (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= '=>' ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) )
                    {
                    // InternalGumbo.g:4721:4: ()
                    // InternalGumbo.g:4722:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOwnedExpressionAccess().getQuantifiedExpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumbo.g:4731:4: (otherlv_13= '\\\\all' | otherlv_14= '\\\\some' | otherlv_15= '\\u2200' | otherlv_16= '\\u2203' )
                    int alt93=4;
                    switch ( input.LA(1) ) {
                    case 84:
                        {
                        alt93=1;
                        }
                        break;
                    case 85:
                        {
                        alt93=2;
                        }
                        break;
                    case 86:
                        {
                        alt93=3;
                        }
                        break;
                    case 87:
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
                            // InternalGumbo.g:4732:5: otherlv_13= '\\\\all'
                            {
                            otherlv_13=(Token)match(input,84,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getOwnedExpressionAccess().getAllKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:4737:5: otherlv_14= '\\\\some'
                            {
                            otherlv_14=(Token)match(input,85,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getOwnedExpressionAccess().getSomeKeyword_2_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumbo.g:4742:5: otherlv_15= '\\u2200'
                            {
                            otherlv_15=(Token)match(input,86,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getOwnedExpressionAccess().getForAllKeyword_2_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumbo.g:4747:5: otherlv_16= '\\u2203'
                            {
                            otherlv_16=(Token)match(input,87,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getOwnedExpressionAccess().getThereExistsKeyword_2_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumbo.g:4752:4: ( (lv_qVar_17_0= ruleSlangQuantVar ) )
                    // InternalGumbo.g:4753:5: (lv_qVar_17_0= ruleSlangQuantVar )
                    {
                    // InternalGumbo.g:4753:5: (lv_qVar_17_0= ruleSlangQuantVar )
                    // InternalGumbo.g:4754:6: lv_qVar_17_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getQVarSlangQuantVarParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_qVar_17_0=ruleSlangQuantVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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

                    // InternalGumbo.g:4771:4: (otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==50) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalGumbo.g:4772:5: otherlv_18= ',' ( (lv_qVar_19_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_18=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getOwnedExpressionAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:4776:5: ( (lv_qVar_19_0= ruleSlangQuantVar ) )
                    	    // InternalGumbo.g:4777:6: (lv_qVar_19_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumbo.g:4777:6: (lv_qVar_19_0= ruleSlangQuantVar )
                    	    // InternalGumbo.g:4778:7: lv_qVar_19_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOwnedExpressionAccess().getQVarSlangQuantVarParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_80);
                    	    lv_qVar_19_0=ruleSlangQuantVar();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,62,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getOwnedExpressionAccess().getEqualsSignGreaterThanSignKeyword_2_4());
                      			
                    }
                    // InternalGumbo.g:4800:4: ( (lv_quantifiedExpr_21_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:4801:5: (lv_quantifiedExpr_21_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:4801:5: (lv_quantifiedExpr_21_0= ruleOwnedExpression )
                    // InternalGumbo.g:4802:6: lv_quantifiedExpr_21_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getQuantifiedExprOwnedExpressionParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_quantifiedExpr_21_0=ruleOwnedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
                      						}
                      						set(
                      							current,
                      							"quantifiedExpr",
                      							lv_quantifiedExpr_21_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGumbo.g:4821:3: ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumbo.g:4821:3: ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) )
                    // InternalGumbo.g:4822:4: () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) )
                    {
                    // InternalGumbo.g:4822:4: ()
                    // InternalGumbo.g:4823:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOwnedExpressionAccess().getUnaryExpAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumbo.g:4832:4: ( (lv_op_23_0= ruleOperator ) )
                    // InternalGumbo.g:4833:5: (lv_op_23_0= ruleOperator )
                    {
                    // InternalGumbo.g:4833:5: (lv_op_23_0= ruleOperator )
                    // InternalGumbo.g:4834:6: lv_op_23_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getOpOperatorParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
                    lv_op_23_0=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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

                    // InternalGumbo.g:4851:4: ( (lv_accessExp_24_0= ruleSlangAccess ) )
                    // InternalGumbo.g:4852:5: (lv_accessExp_24_0= ruleSlangAccess )
                    {
                    // InternalGumbo.g:4852:5: (lv_accessExp_24_0= ruleSlangAccess )
                    // InternalGumbo.g:4853:6: lv_accessExp_24_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOwnedExpressionAccess().getAccessExpSlangAccessParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_accessExp_24_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOwnedExpressionRule());
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
    // $ANTLR end "ruleOwnedExpression"


    // $ANTLR start "entryRuleSlangQuantVar"
    // InternalGumbo.g:4875:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumbo.g:4875:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumbo.g:4876:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumbo.g:4882:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )? ) ;
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
            // InternalGumbo.g:4888:2: ( (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )? ) )
            // InternalGumbo.g:4889:2: (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )? )
            {
            // InternalGumbo.g:4889:2: (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )? )
            // InternalGumbo.g:4890:3: this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumbo.g:4898:3: ( (lv_e_2_0= ruleOwnedExpression ) )
            // InternalGumbo.g:4899:4: (lv_e_2_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:4899:4: (lv_e_2_0= ruleOwnedExpression )
            // InternalGumbo.g:4900:5: lv_e_2_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEOwnedExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
            lv_e_2_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:4917:3: ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=88 && LA97_0<=89)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalGumbo.g:4918:4: (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upperBound_5_0= ruleOwnedExpression ) )
                    {
                    // InternalGumbo.g:4918:4: (otherlv_3= '..' | otherlv_4= '..<' )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==88) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==89) ) {
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
                            // InternalGumbo.g:4919:5: otherlv_3= '..'
                            {
                            otherlv_3=(Token)match(input,88,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:4924:5: otherlv_4= '..<'
                            {
                            otherlv_4=(Token)match(input,89,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumbo.g:4929:4: ( (lv_upperBound_5_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:4930:5: (lv_upperBound_5_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:4930:5: (lv_upperBound_5_0= ruleOwnedExpression )
                    // InternalGumbo.g:4931:6: lv_upperBound_5_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangQuantVarAccess().getUpperBoundOwnedExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_5_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:4953:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumbo.g:4953:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumbo.g:4954:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumbo.g:4960:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;

        EObject lv_suffixes_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:4966:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) )
            // InternalGumbo.g:4967:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            {
            // InternalGumbo.g:4967:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            // InternalGumbo.g:4968:3: () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            {
            // InternalGumbo.g:4968:3: ()
            // InternalGumbo.g:4969:4: 
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

            // InternalGumbo.g:4978:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumbo.g:4979:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumbo.g:4979:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumbo.g:4980:5: lv_t_1_0= ruleSlangTerm
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

            // InternalGumbo.g:4997:3: ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==67) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalGumbo.g:4998:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    {
            	    // InternalGumbo.g:4998:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    // InternalGumbo.g:4999:5: lv_suffixes_2_0= ruleSlangAccessSuffix
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
            	    break loop98;
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
    // InternalGumbo.g:5020:1: entryRuleSlangAccessSuffix returns [EObject current=null] : iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF ;
    public final EObject entryRuleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccessSuffix = null;


        try {
            // InternalGumbo.g:5020:58: (iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF )
            // InternalGumbo.g:5021:2: iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF
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
    // InternalGumbo.g:5027:1: ruleSlangAccessSuffix returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;


        	enterRule();

        try {
            // InternalGumbo.g:5033:2: ( ( () otherlv_1= '.' ( (lv_id_2_0= RULE_ID ) ) ) )
            // InternalGumbo.g:5034:2: ( () otherlv_1= '.' ( (lv_id_2_0= RULE_ID ) ) )
            {
            // InternalGumbo.g:5034:2: ( () otherlv_1= '.' ( (lv_id_2_0= RULE_ID ) ) )
            // InternalGumbo.g:5035:3: () otherlv_1= '.' ( (lv_id_2_0= RULE_ID ) )
            {
            // InternalGumbo.g:5035:3: ()
            // InternalGumbo.g:5036:4: 
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangAccessSuffixAccess().getFullStopKeyword_1());
              		
            }
            // InternalGumbo.g:5049:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalGumbo.g:5050:4: (lv_id_2_0= RULE_ID )
            {
            // InternalGumbo.g:5050:4: (lv_id_2_0= RULE_ID )
            // InternalGumbo.g:5051:5: lv_id_2_0= RULE_ID
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


    // $ANTLR start "entryRuleOtherDataRef"
    // InternalGumbo.g:5071:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumbo.g:5071:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumbo.g:5072:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumbo.g:5078:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:5084:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumbo.g:5085:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumbo.g:5085:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumbo.g:5086:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumbo.g:5086:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumbo.g:5087:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumbo.g:5087:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumbo.g:5088:5: (otherlv_0= RULE_ID )
            {
            // InternalGumbo.g:5088:5: (otherlv_0= RULE_ID )
            // InternalGumbo.g:5089:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumbo.g:5103:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==64) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalGumbo.g:5104:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumbo.g:5104:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumbo.g:5105:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
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
            	    break loop99;
                }
            } while (true);


            }

            // InternalGumbo.g:5123:3: (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==67) ) {
                int LA100_1 = input.LA(2);

                if ( (LA100_1==RULE_ID) ) {
                    int LA100_3 = input.LA(3);

                    if ( (synpred114_InternalGumbo()) ) {
                        alt100=1;
                    }
                }
            }
            switch (alt100) {
                case 1 :
                    // InternalGumbo.g:5124:4: otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumbo.g:5128:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumbo.g:5129:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumbo.g:5129:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumbo.g:5130:6: lv_path_3_0= ruleOtherDataRef
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


    // $ANTLR start "entryRuleSlangTerm"
    // InternalGumbo.g:5152:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumbo.g:5152:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumbo.g:5153:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumbo.g:5159:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' ) | ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' ) | ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' ) | ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' ) | ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' ) | ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) ) | ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) ) ) ;
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
            // InternalGumbo.g:5165:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' ) | ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' ) | ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' ) | ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' ) | ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' ) | ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) ) | ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) ) ) )
            // InternalGumbo.g:5166:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' ) | ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' ) | ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' ) | ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' ) | ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' ) | ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) ) | ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) ) )
            {
            // InternalGumbo.g:5166:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' ) | ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' ) | ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' ) | ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' ) | ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' ) | ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) ) | ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) ) )
            int alt111=14;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalGumbo.g:5167:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumbo.g:5167:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumbo.g:5168:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumbo.g:5168:4: ()
                    // InternalGumbo.g:5169:5: 
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

                    // InternalGumbo.g:5178:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumbo.g:5179:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumbo.g:5179:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumbo.g:5180:6: lv_lit_1_0= ruleSlangLit
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
                    // InternalGumbo.g:5199:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumbo.g:5199:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumbo.g:5200:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumbo.g:5200:4: ()
                    // InternalGumbo.g:5201:5: 
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

                    // InternalGumbo.g:5210:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumbo.g:5211:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumbo.g:5211:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumbo.g:5212:6: lv_i_3_0= ruleSlangInterp
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
                    // InternalGumbo.g:5231:3: ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // InternalGumbo.g:5231:3: ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    // InternalGumbo.g:5232:4: ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
                    {
                    // InternalGumbo.g:5232:4: ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) )
                    // InternalGumbo.g:5233:5: ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' )
                    {
                    // InternalGumbo.g:5240:5: ( () otherlv_5= 'In' otherlv_6= '(' )
                    // InternalGumbo.g:5241:6: () otherlv_5= 'In' otherlv_6= '('
                    {
                    // InternalGumbo.g:5241:6: ()
                    // InternalGumbo.g:5242:7: 
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

                    otherlv_5=(Token)match(input,90,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5261:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGumbo.g:5262:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGumbo.g:5262:5: (otherlv_7= RULE_ID )
                    // InternalGumbo.g:5263:6: otherlv_7= RULE_ID
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

                    otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGumbo.g:5283:3: ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' )
                    {
                    // InternalGumbo.g:5283:3: ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' )
                    // InternalGumbo.g:5284:4: ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')'
                    {
                    // InternalGumbo.g:5284:4: ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) )
                    // InternalGumbo.g:5285:5: ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' )
                    {
                    // InternalGumbo.g:5292:5: ( () otherlv_10= 'MaySend' otherlv_11= '(' )
                    // InternalGumbo.g:5293:6: () otherlv_10= 'MaySend' otherlv_11= '('
                    {
                    // InternalGumbo.g:5293:6: ()
                    // InternalGumbo.g:5294:7: 
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

                    otherlv_10=(Token)match(input,91,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1());
                      					
                    }
                    otherlv_11=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5313:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGumbo.g:5314:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGumbo.g:5314:5: (otherlv_12= RULE_ID )
                    // InternalGumbo.g:5315:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5329:4: (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==50) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalGumbo.g:5330:5: otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) )
                            {
                            otherlv_13=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getCommaKeyword_3_2_0());
                              				
                            }
                            // InternalGumbo.g:5334:5: ( (lv_value_14_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:5335:6: (lv_value_14_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:5335:6: (lv_value_14_0= ruleOwnedExpression )
                            // InternalGumbo.g:5336:7: lv_value_14_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueOwnedExpressionParserRuleCall_3_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_value_14_0=ruleOwnedExpression();

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
                              								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumbo.g:5360:3: ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' )
                    {
                    // InternalGumbo.g:5360:3: ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' )
                    // InternalGumbo.g:5361:4: ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')'
                    {
                    // InternalGumbo.g:5361:4: ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) )
                    // InternalGumbo.g:5362:5: ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' )
                    {
                    // InternalGumbo.g:5369:5: ( () otherlv_17= 'MustSend' otherlv_18= '(' )
                    // InternalGumbo.g:5370:6: () otherlv_17= 'MustSend' otherlv_18= '('
                    {
                    // InternalGumbo.g:5370:6: ()
                    // InternalGumbo.g:5371:7: 
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

                    otherlv_17=(Token)match(input,92,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1());
                      					
                    }
                    otherlv_18=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5390:4: ( (otherlv_19= RULE_ID ) )
                    // InternalGumbo.g:5391:5: (otherlv_19= RULE_ID )
                    {
                    // InternalGumbo.g:5391:5: (otherlv_19= RULE_ID )
                    // InternalGumbo.g:5392:6: otherlv_19= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5406:4: (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==50) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalGumbo.g:5407:5: otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) )
                            {
                            otherlv_20=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getSlangTermAccess().getCommaKeyword_4_2_0());
                              				
                            }
                            // InternalGumbo.g:5411:5: ( (lv_value_21_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:5412:6: (lv_value_21_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:5412:6: (lv_value_21_0= ruleOwnedExpression )
                            // InternalGumbo.g:5413:7: lv_value_21_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueOwnedExpressionParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_value_21_0=ruleOwnedExpression();

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
                              								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGumbo.g:5437:3: ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' )
                    {
                    // InternalGumbo.g:5437:3: ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' )
                    // InternalGumbo.g:5438:4: ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')'
                    {
                    // InternalGumbo.g:5438:4: ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) )
                    // InternalGumbo.g:5439:5: ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' )
                    {
                    // InternalGumbo.g:5446:5: ( () otherlv_24= 'NoSend' otherlv_25= '(' )
                    // InternalGumbo.g:5447:6: () otherlv_24= 'NoSend' otherlv_25= '('
                    {
                    // InternalGumbo.g:5447:6: ()
                    // InternalGumbo.g:5448:7: 
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

                    otherlv_24=(Token)match(input,93,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getNoSendKeyword_5_0_0_1());
                      					
                    }
                    otherlv_25=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_25, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5467:4: ( (otherlv_26= RULE_ID ) )
                    // InternalGumbo.g:5468:5: (otherlv_26= RULE_ID )
                    {
                    // InternalGumbo.g:5468:5: (otherlv_26= RULE_ID )
                    // InternalGumbo.g:5469:6: otherlv_26= RULE_ID
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

                    otherlv_27=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGumbo.g:5489:3: ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' )
                    {
                    // InternalGumbo.g:5489:3: ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' )
                    // InternalGumbo.g:5490:4: ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')'
                    {
                    // InternalGumbo.g:5490:4: ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) )
                    // InternalGumbo.g:5491:5: ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' )
                    {
                    // InternalGumbo.g:5498:5: ( () otherlv_29= 'HasEvent' otherlv_30= '(' )
                    // InternalGumbo.g:5499:6: () otherlv_29= 'HasEvent' otherlv_30= '('
                    {
                    // InternalGumbo.g:5499:6: ()
                    // InternalGumbo.g:5500:7: 
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

                    otherlv_29=(Token)match(input,94,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_29, grammarAccess.getSlangTermAccess().getHasEventKeyword_6_0_0_1());
                      					
                    }
                    otherlv_30=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_30, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_6_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5519:4: ( (otherlv_31= RULE_ID ) )
                    // InternalGumbo.g:5520:5: (otherlv_31= RULE_ID )
                    {
                    // InternalGumbo.g:5520:5: (otherlv_31= RULE_ID )
                    // InternalGumbo.g:5521:6: otherlv_31= RULE_ID
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

                    otherlv_32=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumbo.g:5541:3: ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) )
                    {
                    // InternalGumbo.g:5541:3: ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) )
                    // InternalGumbo.g:5542:4: ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) )
                    {
                    // InternalGumbo.g:5557:4: ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) )
                    // InternalGumbo.g:5558:5: () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) )
                    {
                    // InternalGumbo.g:5558:5: ()
                    // InternalGumbo.g:5559:6: 
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

                    // InternalGumbo.g:5568:5: ( ( ruleQualifiedName ) )
                    // InternalGumbo.g:5569:6: ( ruleQualifiedName )
                    {
                    // InternalGumbo.g:5569:6: ( ruleQualifiedName )
                    // InternalGumbo.g:5570:7: ruleQualifiedName
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
                    pushFollow(FollowSets000.FOLLOW_28);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumbo.g:5587:5: ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) )
                    // InternalGumbo.g:5588:6: (lv_callSuffix_35_0= ruleSlangCallSuffix )
                    {
                    // InternalGumbo.g:5588:6: (lv_callSuffix_35_0= ruleSlangCallSuffix )
                    // InternalGumbo.g:5589:7: lv_callSuffix_35_0= ruleSlangCallSuffix
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
                    // InternalGumbo.g:5609:3: ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) )
                    {
                    // InternalGumbo.g:5609:3: ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) )
                    // InternalGumbo.g:5610:4: ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) )
                    {
                    // InternalGumbo.g:5610:4: ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) )
                    // InternalGumbo.g:5611:5: ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' )
                    {
                    // InternalGumbo.g:5622:5: ( () ( ( ruleQCLREF ) ) otherlv_38= '.' )
                    // InternalGumbo.g:5623:6: () ( ( ruleQCLREF ) ) otherlv_38= '.'
                    {
                    // InternalGumbo.g:5623:6: ()
                    // InternalGumbo.g:5624:7: 
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

                    // InternalGumbo.g:5633:6: ( ( ruleQCLREF ) )
                    // InternalGumbo.g:5634:7: ( ruleQCLREF )
                    {
                    // InternalGumbo.g:5634:7: ( ruleQCLREF )
                    // InternalGumbo.g:5635:8: ruleQCLREF
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
                    pushFollow(FollowSets000.FOLLOW_83);
                    ruleQCLREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_38, grammarAccess.getSlangTermAccess().getFullStopKeyword_8_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5658:4: ( (otherlv_39= RULE_ID ) )
                    // InternalGumbo.g:5659:5: (otherlv_39= RULE_ID )
                    {
                    // InternalGumbo.g:5659:5: (otherlv_39= RULE_ID )
                    // InternalGumbo.g:5660:6: otherlv_39= RULE_ID
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
                    // InternalGumbo.g:5676:3: ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' )
                    {
                    // InternalGumbo.g:5676:3: ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' )
                    // InternalGumbo.g:5677:4: ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}'
                    {
                    // InternalGumbo.g:5677:4: ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) )
                    // InternalGumbo.g:5678:5: ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' )
                    {
                    // InternalGumbo.g:5695:5: ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' )
                    // InternalGumbo.g:5696:6: () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '='
                    {
                    // InternalGumbo.g:5696:6: ()
                    // InternalGumbo.g:5697:7: 
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

                    // InternalGumbo.g:5706:6: ( (lv_recordType_41_0= ruleDataElement ) )
                    // InternalGumbo.g:5707:7: (lv_recordType_41_0= ruleDataElement )
                    {
                    // InternalGumbo.g:5707:7: (lv_recordType_41_0= ruleDataElement )
                    // InternalGumbo.g:5708:8: lv_recordType_41_0= ruleDataElement
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

                    otherlv_42=(Token)match(input,74,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_42, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_9_0_0_2());
                      					
                    }
                    // InternalGumbo.g:5729:6: ( (otherlv_43= RULE_ID ) )
                    // InternalGumbo.g:5730:7: (otherlv_43= RULE_ID )
                    {
                    // InternalGumbo.g:5730:7: (otherlv_43= RULE_ID )
                    // InternalGumbo.g:5731:8: otherlv_43= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								/* */
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_43=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_43, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_9_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_44=(Token)match(input,95,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_44, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_9_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5751:4: ( (lv_argExpr_45_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:5752:5: (lv_argExpr_45_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:5752:5: (lv_argExpr_45_0= ruleOwnedExpression )
                    // InternalGumbo.g:5753:6: lv_argExpr_45_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprOwnedExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_85);
                    lv_argExpr_45_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:5770:4: (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==40) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalGumbo.g:5771:5: otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) )
                    	    {
                    	    otherlv_46=(Token)match(input,40,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_46, grammarAccess.getSlangTermAccess().getSemicolonKeyword_9_2_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:5775:5: ( (otherlv_47= RULE_ID ) )
                    	    // InternalGumbo.g:5776:6: (otherlv_47= RULE_ID )
                    	    {
                    	    // InternalGumbo.g:5776:6: (otherlv_47= RULE_ID )
                    	    // InternalGumbo.g:5777:7: otherlv_47= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_47=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_84); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_47, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_9_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_48=(Token)match(input,95,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_9_2_2());
                    	      				
                    	    }
                    	    // InternalGumbo.g:5795:5: ( (lv_argExpr_49_0= ruleOwnedExpression ) )
                    	    // InternalGumbo.g:5796:6: (lv_argExpr_49_0= ruleOwnedExpression )
                    	    {
                    	    // InternalGumbo.g:5796:6: (lv_argExpr_49_0= ruleOwnedExpression )
                    	    // InternalGumbo.g:5797:7: lv_argExpr_49_0= ruleOwnedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprOwnedExpressionParserRuleCall_9_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_85);
                    	    lv_argExpr_49_0=ruleOwnedExpression();

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
                    	      								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalGumbo.g:5821:3: ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? )
                    {
                    // InternalGumbo.g:5821:3: ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? )
                    // InternalGumbo.g:5822:4: () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )?
                    {
                    // InternalGumbo.g:5822:4: ()
                    // InternalGumbo.g:5823:5: 
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

                    // InternalGumbo.g:5832:4: ( (otherlv_52= RULE_ID ) )
                    // InternalGumbo.g:5833:5: (otherlv_52= RULE_ID )
                    {
                    // InternalGumbo.g:5833:5: (otherlv_52= RULE_ID )
                    // InternalGumbo.g:5834:6: otherlv_52= RULE_ID
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

                    // InternalGumbo.g:5848:4: (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==67) ) {
                        int LA104_1 = input.LA(2);

                        if ( (LA104_1==RULE_ID) ) {
                            int LA104_3 = input.LA(3);

                            if ( (synpred136_InternalGumbo()) ) {
                                alt104=1;
                            }
                        }
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalGumbo.g:5849:5: otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) )
                            {
                            otherlv_53=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_53, grammarAccess.getSlangTermAccess().getFullStopKeyword_10_2_0());
                              				
                            }
                            // InternalGumbo.g:5853:5: ( (lv_ref_54_0= ruleOtherDataRef ) )
                            // InternalGumbo.g:5854:6: (lv_ref_54_0= ruleOtherDataRef )
                            {
                            // InternalGumbo.g:5854:6: (lv_ref_54_0= ruleOtherDataRef )
                            // InternalGumbo.g:5855:7: lv_ref_54_0= ruleOtherDataRef
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
                    // InternalGumbo.g:5875:3: ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' )
                    {
                    // InternalGumbo.g:5875:3: ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' )
                    // InternalGumbo.g:5876:4: () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')'
                    {
                    // InternalGumbo.g:5876:4: ()
                    // InternalGumbo.g:5877:5: 
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

                    otherlv_56=(Token)match(input,49,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_11_1());
                      			
                    }
                    // InternalGumbo.g:5890:4: ( (lv_exp_57_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:5891:5: (lv_exp_57_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:5891:5: (lv_exp_57_0= ruleOwnedExpression )
                    // InternalGumbo.g:5892:6: lv_exp_57_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getExpOwnedExpressionParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_exp_57_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_58=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_58, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_11_3());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalGumbo.g:5915:3: ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) )
                    {
                    // InternalGumbo.g:5915:3: ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) )
                    // InternalGumbo.g:5916:4: () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) )
                    {
                    // InternalGumbo.g:5916:4: ()
                    // InternalGumbo.g:5917:5: 
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

                    otherlv_60=(Token)match(input,96,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_60, grammarAccess.getSlangTermAccess().getForKeyword_12_1());
                      			
                    }
                    // InternalGumbo.g:5930:4: ( (lv_r_61_0= ruleSlangForRange ) )
                    // InternalGumbo.g:5931:5: (lv_r_61_0= ruleSlangForRange )
                    {
                    // InternalGumbo.g:5931:5: (lv_r_61_0= ruleSlangForRange )
                    // InternalGumbo.g:5932:6: lv_r_61_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_86);
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

                    // InternalGumbo.g:5949:4: (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==50) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalGumbo.g:5950:5: otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_62=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_62, grammarAccess.getSlangTermAccess().getCommaKeyword_12_3_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:5954:5: ( (lv_r_63_0= ruleSlangForRange ) )
                    	    // InternalGumbo.g:5955:6: (lv_r_63_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumbo.g:5955:6: (lv_r_63_0= ruleSlangForRange )
                    	    // InternalGumbo.g:5956:7: lv_r_63_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_12_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_86);
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
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_64=(Token)match(input,97,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_64, grammarAccess.getSlangTermAccess().getYieldKeyword_12_4());
                      			
                    }
                    // InternalGumbo.g:5978:4: ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==74) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==49) ) {
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
                            // InternalGumbo.g:5979:5: ( (lv_b_65_0= ruleSlangBlock ) )
                            {
                            // InternalGumbo.g:5979:5: ( (lv_b_65_0= ruleSlangBlock ) )
                            // InternalGumbo.g:5980:6: (lv_b_65_0= ruleSlangBlock )
                            {
                            // InternalGumbo.g:5980:6: (lv_b_65_0= ruleSlangBlock )
                            // InternalGumbo.g:5981:7: lv_b_65_0= ruleSlangBlock
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
                            // InternalGumbo.g:5999:5: (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' )
                            {
                            // InternalGumbo.g:5999:5: (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' )
                            // InternalGumbo.g:6000:6: otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')'
                            {
                            otherlv_66=(Token)match(input,49,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_66, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_12_5_1_0());
                              					
                            }
                            // InternalGumbo.g:6004:6: ( (lv_e_67_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:6005:7: (lv_e_67_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:6005:7: (lv_e_67_0= ruleOwnedExpression )
                            // InternalGumbo.g:6006:8: lv_e_67_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEOwnedExpressionParserRuleCall_12_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_e_67_0=ruleOwnedExpression();

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
                              									"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_68=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:6031:3: ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) )
                    {
                    // InternalGumbo.g:6031:3: ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) )
                    // InternalGumbo.g:6032:4: () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) )
                    {
                    // InternalGumbo.g:6032:4: ()
                    // InternalGumbo.g:6033:5: 
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

                    otherlv_70=(Token)match(input,74,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_70, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_13_1());
                      			
                    }
                    // InternalGumbo.g:6046:4: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) )
                    int alt110=2;
                    alt110 = dfa110.predict(input);
                    switch (alt110) {
                        case 1 :
                            // InternalGumbo.g:6047:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' )
                            {
                            // InternalGumbo.g:6047:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' )
                            // InternalGumbo.g:6048:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}'
                            {
                            // InternalGumbo.g:6048:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==49) ) {
                                int LA107_1 = input.LA(2);

                                if ( (LA107_1==83) ) {
                                    alt107=1;
                                }
                                else if ( (LA107_1==RULE_ID) ) {
                                    int LA107_4 = input.LA(3);

                                    if ( (LA107_4==39) ) {
                                        alt107=1;
                                    }
                                }
                            }
                            switch (alt107) {
                                case 1 :
                                    // InternalGumbo.g:6049:7: ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>'
                                    {
                                    // InternalGumbo.g:6049:7: ( (lv_p_71_0= ruleSlangParams ) )
                                    // InternalGumbo.g:6050:8: (lv_p_71_0= ruleSlangParams )
                                    {
                                    // InternalGumbo.g:6050:8: (lv_p_71_0= ruleSlangParams )
                                    // InternalGumbo.g:6051:9: lv_p_71_0= ruleSlangParams
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

                                    otherlv_72=(Token)match(input,62,FollowSets000.FOLLOW_16); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_72, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_13_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumbo.g:6073:6: ( (lv_e_73_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:6074:7: (lv_e_73_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:6074:7: (lv_e_73_0= ruleOwnedExpression )
                            // InternalGumbo.g:6075:8: lv_e_73_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEOwnedExpressionParserRuleCall_13_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_e_73_0=ruleOwnedExpression();

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
                              									"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_74=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_74, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_13_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:6098:5: ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' )
                            {
                            // InternalGumbo.g:6098:5: ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' )
                            // InternalGumbo.g:6099:6: ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}'
                            {
                            // InternalGumbo.g:6099:6: ( (lv_stmt_75_0= ruleSlangStmt ) )*
                            loop108:
                            do {
                                int alt108=2;
                                int LA108_0 = input.LA(1);

                                if ( (LA108_0==RULE_ID||LA108_0==55||(LA108_0>=71 && LA108_0<=73)||(LA108_0>=76 && LA108_0<=79)||(LA108_0>=82 && LA108_0<=83)) ) {
                                    alt108=1;
                                }


                                switch (alt108) {
                            	case 1 :
                            	    // InternalGumbo.g:6100:7: (lv_stmt_75_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumbo.g:6100:7: (lv_stmt_75_0= ruleSlangStmt )
                            	    // InternalGumbo.g:6101:8: lv_stmt_75_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_13_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_75);
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
                            	    break loop108;
                                }
                            } while (true);

                            // InternalGumbo.g:6118:6: ( (lv_r_76_0= ruleSlangRet ) )?
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==99) ) {
                                alt109=1;
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalGumbo.g:6119:7: (lv_r_76_0= ruleSlangRet )
                                    {
                                    // InternalGumbo.g:6119:7: (lv_r_76_0= ruleSlangRet )
                                    // InternalGumbo.g:6120:8: lv_r_76_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_13_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_76);
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

                            otherlv_77=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:6148:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumbo.g:6148:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumbo.g:6149:2: iv_ruleSlangParams= ruleSlangParams EOF
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
    // InternalGumbo.g:6155:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= '(' ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:6161:2: ( (otherlv_0= '(' ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= ')' ) )
            // InternalGumbo.g:6162:2: (otherlv_0= '(' ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= ')' )
            {
            // InternalGumbo.g:6162:2: (otherlv_0= '(' ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= ')' )
            // InternalGumbo.g:6163:3: otherlv_0= '(' ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumbo.g:6167:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumbo.g:6168:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumbo.g:6168:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumbo.g:6169:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalGumbo.g:6186:3: (otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==50) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalGumbo.g:6187:4: otherlv_2= ',' ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumbo.g:6191:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumbo.g:6192:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumbo.g:6192:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumbo.g:6193:6: lv_params_3_0= ruleSlangParam
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

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:6219:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumbo.g:6219:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumbo.g:6220:2: iv_ruleSlangParam= ruleSlangParam EOF
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
    // InternalGumbo.g:6226:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '=>' )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= '*' )? ) ;
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
            // InternalGumbo.g:6232:2: ( ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '=>' )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= '*' )? ) )
            // InternalGumbo.g:6233:2: ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '=>' )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= '*' )? )
            {
            // InternalGumbo.g:6233:2: ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '=>' )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= '*' )? )
            // InternalGumbo.g:6234:3: (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '=>' )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= '*' )?
            {
            // InternalGumbo.g:6234:3: (otherlv_0= 'var' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==83) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalGumbo.g:6235:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:6240:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumbo.g:6241:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumbo.g:6241:4: (lv_name_1_0= RULE_ID )
            // InternalGumbo.g:6242:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumbo.g:6262:3: (otherlv_3= '=>' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==62) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalGumbo.g:6263:4: otherlv_3= '=>'
                    {
                    otherlv_3=(Token)match(input,62,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumbo.g:6268:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumbo.g:6269:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumbo.g:6269:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumbo.g:6270:5: lv_typeName_4_0= ruleSlangType
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

            // InternalGumbo.g:6287:3: (otherlv_5= '*' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==63) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalGumbo.g:6288:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:6297:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumbo.g:6297:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumbo.g:6298:2: iv_ruleSlangForRange= ruleSlangForRange EOF
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
    // InternalGumbo.g:6304:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )? ) ;
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
            // InternalGumbo.g:6310:2: ( (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )? ) )
            // InternalGumbo.g:6311:2: (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )? )
            {
            // InternalGumbo.g:6311:2: (this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )? )
            // InternalGumbo.g:6312:3: this_ID_0= RULE_ID otherlv_1= ':' ( (lv_e_2_0= ruleOwnedExpression ) ) ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumbo.g:6320:3: ( (lv_e_2_0= ruleOwnedExpression ) )
            // InternalGumbo.g:6321:4: (lv_e_2_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:6321:4: (lv_e_2_0= ruleOwnedExpression )
            // InternalGumbo.g:6322:5: lv_e_2_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEOwnedExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
            lv_e_2_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumbo.g:6339:3: ( (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )? )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=88 && LA118_0<=89)) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalGumbo.g:6340:4: (otherlv_3= '..' | otherlv_4= '..<' ) ( (lv_upper_5_0= ruleOwnedExpression ) ) (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )?
                    {
                    // InternalGumbo.g:6340:4: (otherlv_3= '..' | otherlv_4= '..<' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==88) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==89) ) {
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
                            // InternalGumbo.g:6341:5: otherlv_3= '..'
                            {
                            otherlv_3=(Token)match(input,88,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumbo.g:6346:5: otherlv_4= '..<'
                            {
                            otherlv_4=(Token)match(input,89,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumbo.g:6351:4: ( (lv_upper_5_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:6352:5: (lv_upper_5_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:6352:5: (lv_upper_5_0= ruleOwnedExpression )
                    // InternalGumbo.g:6353:6: lv_upper_5_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperOwnedExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_90);
                    lv_upper_5_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:6370:4: (otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) ) )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==98) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // InternalGumbo.g:6371:5: otherlv_6= 'by' ( (lv_step_7_0= ruleOwnedExpression ) )
                            {
                            otherlv_6=(Token)match(input,98,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumbo.g:6375:5: ( (lv_step_7_0= ruleOwnedExpression ) )
                            // InternalGumbo.g:6376:6: (lv_step_7_0= ruleOwnedExpression )
                            {
                            // InternalGumbo.g:6376:6: (lv_step_7_0= ruleOwnedExpression )
                            // InternalGumbo.g:6377:7: lv_step_7_0= ruleOwnedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangForRangeAccess().getStepOwnedExpressionParserRuleCall_3_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_step_7_0=ruleOwnedExpression();

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
                              								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:6400:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumbo.g:6400:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumbo.g:6401:2: iv_ruleSlangRet= ruleSlangRet EOF
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
    // InternalGumbo.g:6407:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_e_2_0= ruleOwnedExpression ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:6413:2: ( ( () otherlv_1= 'return' ( (lv_e_2_0= ruleOwnedExpression ) )? ) )
            // InternalGumbo.g:6414:2: ( () otherlv_1= 'return' ( (lv_e_2_0= ruleOwnedExpression ) )? )
            {
            // InternalGumbo.g:6414:2: ( () otherlv_1= 'return' ( (lv_e_2_0= ruleOwnedExpression ) )? )
            // InternalGumbo.g:6415:3: () otherlv_1= 'return' ( (lv_e_2_0= ruleOwnedExpression ) )?
            {
            // InternalGumbo.g:6415:3: ()
            // InternalGumbo.g:6416:4: 
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

            otherlv_1=(Token)match(input,99,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
              		
            }
            // InternalGumbo.g:6429:3: ( (lv_e_2_0= ruleOwnedExpression ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=RULE_ID && LA119_0<=RULE_STRING_VALUE)||(LA119_0>=RULE_INTEGER_LIT && LA119_0<=RULE_MSPB)||(LA119_0>=RULE_OP && LA119_0<=RULE_SIMPLIES)||LA119_0==49||LA119_0==63||LA119_0==71||LA119_0==74||(LA119_0>=84 && LA119_0<=87)||(LA119_0>=90 && LA119_0<=94)||LA119_0==96||(LA119_0>=100 && LA119_0<=106)||(LA119_0>=111 && LA119_0<=112)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalGumbo.g:6430:4: (lv_e_2_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:6430:4: (lv_e_2_0= ruleOwnedExpression )
                    // InternalGumbo.g:6431:5: lv_e_2_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangRetAccess().getEOwnedExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_2_0=ruleOwnedExpression();

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
                      						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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
    // InternalGumbo.g:6452:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumbo.g:6452:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumbo.g:6453:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
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
    // InternalGumbo.g:6459:1: ruleSlangCallSuffix returns [EObject current=null] : ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ca_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:6465:2: ( ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) ) )
            // InternalGumbo.g:6466:2: ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumbo.g:6466:2: ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) )
            // InternalGumbo.g:6467:3: () ( (lv_ca_1_0= ruleSlangCallArgs ) )
            {
            // InternalGumbo.g:6467:3: ()
            // InternalGumbo.g:6468:4: 
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

            // InternalGumbo.g:6477:3: ( (lv_ca_1_0= ruleSlangCallArgs ) )
            // InternalGumbo.g:6478:4: (lv_ca_1_0= ruleSlangCallArgs )
            {
            // InternalGumbo.g:6478:4: (lv_ca_1_0= ruleSlangCallArgs )
            // InternalGumbo.g:6479:5: lv_ca_1_0= ruleSlangCallArgs
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
    // InternalGumbo.g:6500:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumbo.g:6500:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumbo.g:6501:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
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
    // InternalGumbo.g:6507:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:6513:2: ( ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalGumbo.g:6514:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalGumbo.g:6514:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )? otherlv_5= ')' )
            // InternalGumbo.g:6515:3: () otherlv_1= '(' ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalGumbo.g:6515:3: ()
            // InternalGumbo.g:6516:4: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumbo.g:6529:3: ( ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=RULE_ID && LA121_0<=RULE_STRING_VALUE)||(LA121_0>=RULE_INTEGER_LIT && LA121_0<=RULE_MSPB)||(LA121_0>=RULE_OP && LA121_0<=RULE_SIMPLIES)||LA121_0==49||LA121_0==63||LA121_0==71||LA121_0==74||(LA121_0>=84 && LA121_0<=87)||(LA121_0>=90 && LA121_0<=94)||LA121_0==96||(LA121_0>=100 && LA121_0<=106)||(LA121_0>=111 && LA121_0<=112)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalGumbo.g:6530:4: ( (lv_arg_2_0= ruleOwnedExpression ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )*
                    {
                    // InternalGumbo.g:6530:4: ( (lv_arg_2_0= ruleOwnedExpression ) )
                    // InternalGumbo.g:6531:5: (lv_arg_2_0= ruleOwnedExpression )
                    {
                    // InternalGumbo.g:6531:5: (lv_arg_2_0= ruleOwnedExpression )
                    // InternalGumbo.g:6532:6: lv_arg_2_0= ruleOwnedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_arg_2_0=ruleOwnedExpression();

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
                      							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:6549:4: (otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==50) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalGumbo.g:6550:5: otherlv_3= ',' ( (lv_arg_4_0= ruleOwnedExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:6554:5: ( (lv_arg_4_0= ruleOwnedExpression ) )
                    	    // InternalGumbo.g:6555:6: (lv_arg_4_0= ruleOwnedExpression )
                    	    {
                    	    // InternalGumbo.g:6555:6: (lv_arg_4_0= ruleOwnedExpression )
                    	    // InternalGumbo.g:6556:7: lv_arg_4_0= ruleOwnedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    lv_arg_4_0=ruleOwnedExpression();

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
                    	      								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
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

            otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSlangLit"
    // InternalGumbo.g:6583:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumbo.g:6583:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumbo.g:6584:2: iv_ruleSlangLit= ruleSlangLit EOF
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
    // InternalGumbo.g:6590:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) ) | ( () otherlv_3= 'res' ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= 'F32' ) ) ) | ( () ( (lv_value_17_0= 'F64' ) ) ) | ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) ) ;
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
            // InternalGumbo.g:6596:2: ( ( ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) ) | ( () otherlv_3= 'res' ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= 'F32' ) ) ) | ( () ( (lv_value_17_0= 'F64' ) ) ) | ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) ) )
            // InternalGumbo.g:6597:2: ( ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) ) | ( () otherlv_3= 'res' ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= 'F32' ) ) ) | ( () ( (lv_value_17_0= 'F64' ) ) ) | ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumbo.g:6597:2: ( ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) ) | ( () otherlv_3= 'res' ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= 'F32' ) ) ) | ( () ( (lv_value_17_0= 'F64' ) ) ) | ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) )
            int alt124=11;
            switch ( input.LA(1) ) {
            case 100:
            case 101:
            case 102:
            case 103:
                {
                alt124=1;
                }
                break;
            case 104:
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
            case RULE_F64_LIT:
            case RULE_REAL_LIT:
                {
                alt124=7;
                }
                break;
            case 105:
                {
                alt124=8;
                }
                break;
            case 106:
                {
                alt124=9;
                }
                break;
            case RULE_STRING_VALUE:
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
                    // InternalGumbo.g:6598:3: ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) )
                    {
                    // InternalGumbo.g:6598:3: ( () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) ) )
                    // InternalGumbo.g:6599:4: () ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) )
                    {
                    // InternalGumbo.g:6599:4: ()
                    // InternalGumbo.g:6600:5: 
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

                    // InternalGumbo.g:6609:4: ( ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) ) )
                    // InternalGumbo.g:6610:5: ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) )
                    {
                    // InternalGumbo.g:6610:5: ( (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' ) )
                    // InternalGumbo.g:6611:6: (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' )
                    {
                    // InternalGumbo.g:6611:6: (lv_value_1_1= 'T' | lv_value_1_2= 'F' | lv_value_1_3= 'true' | lv_value_1_4= 'false' )
                    int alt122=4;
                    switch ( input.LA(1) ) {
                    case 100:
                        {
                        alt122=1;
                        }
                        break;
                    case 101:
                        {
                        alt122=2;
                        }
                        break;
                    case 102:
                        {
                        alt122=3;
                        }
                        break;
                    case 103:
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
                            // InternalGumbo.g:6612:7: lv_value_1_1= 'T'
                            {
                            lv_value_1_1=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                            // InternalGumbo.g:6623:7: lv_value_1_2= 'F'
                            {
                            lv_value_1_2=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                            // InternalGumbo.g:6634:7: lv_value_1_3= 'true'
                            {
                            lv_value_1_3=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                            // InternalGumbo.g:6645:7: lv_value_1_4= 'false'
                            {
                            lv_value_1_4=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:6660:3: ( () otherlv_3= 'res' )
                    {
                    // InternalGumbo.g:6660:3: ( () otherlv_3= 'res' )
                    // InternalGumbo.g:6661:4: () otherlv_3= 'res'
                    {
                    // InternalGumbo.g:6661:4: ()
                    // InternalGumbo.g:6662:5: 
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

                    otherlv_3=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangLitAccess().getResKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGumbo.g:6677:3: ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumbo.g:6677:3: ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumbo.g:6678:4: () ( (lv_value_5_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumbo.g:6678:4: ()
                    // InternalGumbo.g:6679:5: 
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

                    // InternalGumbo.g:6688:4: ( (lv_value_5_0= RULE_INTEGER_LIT ) )
                    // InternalGumbo.g:6689:5: (lv_value_5_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumbo.g:6689:5: (lv_value_5_0= RULE_INTEGER_LIT )
                    // InternalGumbo.g:6690:6: lv_value_5_0= RULE_INTEGER_LIT
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
                    // InternalGumbo.g:6708:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumbo.g:6708:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumbo.g:6709:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumbo.g:6709:4: ()
                    // InternalGumbo.g:6710:5: 
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

                    // InternalGumbo.g:6719:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumbo.g:6720:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumbo.g:6720:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumbo.g:6721:6: lv_value_7_0= RULE_HEX
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
                    // InternalGumbo.g:6739:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumbo.g:6739:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumbo.g:6740:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumbo.g:6740:4: ()
                    // InternalGumbo.g:6741:5: 
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

                    // InternalGumbo.g:6750:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumbo.g:6751:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumbo.g:6751:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumbo.g:6752:6: lv_value_9_0= RULE_BIN
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
                    // InternalGumbo.g:6770:3: ( () ( (lv_value_11_0= RULE_F32_LIT ) ) )
                    {
                    // InternalGumbo.g:6770:3: ( () ( (lv_value_11_0= RULE_F32_LIT ) ) )
                    // InternalGumbo.g:6771:4: () ( (lv_value_11_0= RULE_F32_LIT ) )
                    {
                    // InternalGumbo.g:6771:4: ()
                    // InternalGumbo.g:6772:5: 
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

                    // InternalGumbo.g:6781:4: ( (lv_value_11_0= RULE_F32_LIT ) )
                    // InternalGumbo.g:6782:5: (lv_value_11_0= RULE_F32_LIT )
                    {
                    // InternalGumbo.g:6782:5: (lv_value_11_0= RULE_F32_LIT )
                    // InternalGumbo.g:6783:6: lv_value_11_0= RULE_F32_LIT
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
                    // InternalGumbo.g:6801:3: ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) )
                    {
                    // InternalGumbo.g:6801:3: ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) )
                    // InternalGumbo.g:6802:4: () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumbo.g:6802:4: ()
                    // InternalGumbo.g:6803:5: 
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

                    // InternalGumbo.g:6812:4: ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) )
                    // InternalGumbo.g:6813:5: ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) )
                    {
                    // InternalGumbo.g:6813:5: ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) )
                    // InternalGumbo.g:6814:6: (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT )
                    {
                    // InternalGumbo.g:6814:6: (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT )
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
                            // InternalGumbo.g:6815:7: lv_value_13_1= RULE_F64_LIT
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
                            // InternalGumbo.g:6830:7: lv_value_13_2= RULE_REAL_LIT
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
                    // InternalGumbo.g:6849:3: ( () ( (lv_value_15_0= 'F32' ) ) )
                    {
                    // InternalGumbo.g:6849:3: ( () ( (lv_value_15_0= 'F32' ) ) )
                    // InternalGumbo.g:6850:4: () ( (lv_value_15_0= 'F32' ) )
                    {
                    // InternalGumbo.g:6850:4: ()
                    // InternalGumbo.g:6851:5: 
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

                    // InternalGumbo.g:6860:4: ( (lv_value_15_0= 'F32' ) )
                    // InternalGumbo.g:6861:5: (lv_value_15_0= 'F32' )
                    {
                    // InternalGumbo.g:6861:5: (lv_value_15_0= 'F32' )
                    // InternalGumbo.g:6862:6: lv_value_15_0= 'F32'
                    {
                    lv_value_15_0=(Token)match(input,105,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:6876:3: ( () ( (lv_value_17_0= 'F64' ) ) )
                    {
                    // InternalGumbo.g:6876:3: ( () ( (lv_value_17_0= 'F64' ) ) )
                    // InternalGumbo.g:6877:4: () ( (lv_value_17_0= 'F64' ) )
                    {
                    // InternalGumbo.g:6877:4: ()
                    // InternalGumbo.g:6878:5: 
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

                    // InternalGumbo.g:6887:4: ( (lv_value_17_0= 'F64' ) )
                    // InternalGumbo.g:6888:5: (lv_value_17_0= 'F64' )
                    {
                    // InternalGumbo.g:6888:5: (lv_value_17_0= 'F64' )
                    // InternalGumbo.g:6889:6: lv_value_17_0= 'F64'
                    {
                    lv_value_17_0=(Token)match(input,106,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:6903:3: ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) )
                    {
                    // InternalGumbo.g:6903:3: ( () ( (lv_value_19_0= RULE_STRING_VALUE ) ) )
                    // InternalGumbo.g:6904:4: () ( (lv_value_19_0= RULE_STRING_VALUE ) )
                    {
                    // InternalGumbo.g:6904:4: ()
                    // InternalGumbo.g:6905:5: 
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

                    // InternalGumbo.g:6914:4: ( (lv_value_19_0= RULE_STRING_VALUE ) )
                    // InternalGumbo.g:6915:5: (lv_value_19_0= RULE_STRING_VALUE )
                    {
                    // InternalGumbo.g:6915:5: (lv_value_19_0= RULE_STRING_VALUE )
                    // InternalGumbo.g:6916:6: lv_value_19_0= RULE_STRING_VALUE
                    {
                    lv_value_19_0=(Token)match(input,RULE_STRING_VALUE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_19_0, grammarAccess.getSlangLitAccess().getValueSTRING_VALUETerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_19_0,
                      							"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGumbo.g:6934:3: ( () ( (lv_value_21_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumbo.g:6934:3: ( () ( (lv_value_21_0= RULE_MSTRING ) ) )
                    // InternalGumbo.g:6935:4: () ( (lv_value_21_0= RULE_MSTRING ) )
                    {
                    // InternalGumbo.g:6935:4: ()
                    // InternalGumbo.g:6936:5: 
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

                    // InternalGumbo.g:6945:4: ( (lv_value_21_0= RULE_MSTRING ) )
                    // InternalGumbo.g:6946:5: (lv_value_21_0= RULE_MSTRING )
                    {
                    // InternalGumbo.g:6946:5: (lv_value_21_0= RULE_MSTRING )
                    // InternalGumbo.g:6947:6: lv_value_21_0= RULE_MSTRING
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
    // InternalGumbo.g:6968:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumbo.g:6968:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumbo.g:6969:2: iv_ruleSlangInterp= ruleSlangInterp EOF
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
    // InternalGumbo.g:6975:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:6981:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumbo.g:6982:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumbo.g:6982:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
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
                    // InternalGumbo.g:6983:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumbo.g:6983:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumbo.g:6984:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumbo.g:6984:4: ()
                    // InternalGumbo.g:6985:5: 
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

                    // InternalGumbo.g:6994:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumbo.g:6995:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumbo.g:6995:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumbo.g:6996:6: lv_msp_1_0= RULE_MSP
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
                    // InternalGumbo.g:7014:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumbo.g:7014:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumbo.g:7015:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumbo.g:7015:4: ()
                    // InternalGumbo.g:7016:5: 
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

                    // InternalGumbo.g:7025:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumbo.g:7026:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumbo.g:7026:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumbo.g:7027:6: lv_sli_3_0= RULE_SLI
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
                    // InternalGumbo.g:7045:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumbo.g:7045:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumbo.g:7046:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumbo.g:7046:4: ()
                    // InternalGumbo.g:7047:5: 
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

                    // InternalGumbo.g:7056:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumbo.g:7057:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumbo.g:7057:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumbo.g:7058:6: lv_mspb_5_0= RULE_MSPB
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

                    // InternalGumbo.g:7074:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumbo.g:7075:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumbo.g:7075:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumbo.g:7076:6: lv_minterp_6_0= ruleSlangMInterp
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
    // InternalGumbo.g:7098:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumbo.g:7098:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumbo.g:7099:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
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
    // InternalGumbo.g:7105:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= '{' ( (lv_e_1_0= ruleOwnedExpression ) ) otherlv_2= '}' ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
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
            // InternalGumbo.g:7111:2: ( (otherlv_0= '{' ( (lv_e_1_0= ruleOwnedExpression ) ) otherlv_2= '}' ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumbo.g:7112:2: (otherlv_0= '{' ( (lv_e_1_0= ruleOwnedExpression ) ) otherlv_2= '}' ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumbo.g:7112:2: (otherlv_0= '{' ( (lv_e_1_0= ruleOwnedExpression ) ) otherlv_2= '}' ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumbo.g:7113:3: otherlv_0= '{' ( (lv_e_1_0= ruleOwnedExpression ) ) otherlv_2= '}' ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumbo.g:7117:3: ( (lv_e_1_0= ruleOwnedExpression ) )
            // InternalGumbo.g:7118:4: (lv_e_1_0= ruleOwnedExpression )
            {
            // InternalGumbo.g:7118:4: (lv_e_1_0= ruleOwnedExpression )
            // InternalGumbo.g:7119:5: lv_e_1_0= ruleOwnedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEOwnedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_76);
            lv_e_1_0=ruleOwnedExpression();

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
              						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,75,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumbo.g:7140:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
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
                    // InternalGumbo.g:7141:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumbo.g:7141:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumbo.g:7142:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumbo.g:7146:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumbo.g:7147:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumbo.g:7147:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumbo.g:7148:7: lv_m_4_0= ruleSlangMInterp
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
                    // InternalGumbo.g:7167:4: this_MSPE_5= RULE_MSPE
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGumbo.g:7176:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGumbo.g:7176:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGumbo.g:7177:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalGumbo.g:7183:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QCREF_0= ruleQCREF ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QCREF_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7189:2: (this_QCREF_0= ruleQCREF )
            // InternalGumbo.g:7190:2: this_QCREF_0= ruleQCREF
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getQualifiedNameAccess().getQCREFParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_QCREF_0=ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QCREF_0);
              	
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleOperator"
    // InternalGumbo.g:7203:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumbo.g:7203:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumbo.g:7204:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGumbo.g:7210:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        Token this_IMPLIES_3=null;
        Token this_SIMPLIES_4=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7216:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) )
            // InternalGumbo.g:7217:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            {
            // InternalGumbo.g:7217:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            int alt127=5;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt127=1;
                }
                break;
            case 111:
            case 112:
                {
                alt127=2;
                }
                break;
            case 63:
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
                    // InternalGumbo.g:7218:3: this_OP_0= RULE_OP
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
                    // InternalGumbo.g:7226:3: this_PlusMinus_1= rulePlusMinus
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
                    // InternalGumbo.g:7237:3: this_STAR_2= ruleSTAR
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
                    // InternalGumbo.g:7248:3: this_IMPLIES_3= RULE_IMPLIES
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
                    // InternalGumbo.g:7256:3: this_SIMPLIES_4= RULE_SIMPLIES
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
    // InternalGumbo.g:7267:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumbo.g:7267:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumbo.g:7268:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumbo.g:7274:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )? otherlv_15= ';' ) ;
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
            // InternalGumbo.g:7280:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )? otherlv_15= ';' ) )
            // InternalGumbo.g:7281:2: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )? otherlv_15= ';' )
            {
            // InternalGumbo.g:7281:2: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )? otherlv_15= ';' )
            // InternalGumbo.g:7282:3: ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )? otherlv_15= ';'
            {
            // InternalGumbo.g:7282:3: ( ( ruleQPREF ) )
            // InternalGumbo.g:7283:4: ( ruleQPREF )
            {
            // InternalGumbo.g:7283:4: ( ruleQPREF )
            // InternalGumbo.g:7284:5: ruleQPREF
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

            // InternalGumbo.g:7301:3: (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==62) ) {
                alt128=1;
            }
            else if ( (LA128_0==107) ) {
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
                    // InternalGumbo.g:7302:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:7307:4: ( (lv_append_2_0= '+=>' ) )
                    {
                    // InternalGumbo.g:7307:4: ( (lv_append_2_0= '+=>' ) )
                    // InternalGumbo.g:7308:5: (lv_append_2_0= '+=>' )
                    {
                    // InternalGumbo.g:7308:5: (lv_append_2_0= '+=>' )
                    // InternalGumbo.g:7309:6: lv_append_2_0= '+=>'
                    {
                    lv_append_2_0=(Token)match(input,107,FollowSets000.FOLLOW_93); if (state.failed) return current;
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

            // InternalGumbo.g:7322:3: ( (lv_constant_3_0= 'constant' ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==108) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalGumbo.g:7323:4: (lv_constant_3_0= 'constant' )
                    {
                    // InternalGumbo.g:7323:4: (lv_constant_3_0= 'constant' )
                    // InternalGumbo.g:7324:5: lv_constant_3_0= 'constant'
                    {
                    lv_constant_3_0=(Token)match(input,108,FollowSets000.FOLLOW_93); if (state.failed) return current;
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

            // InternalGumbo.g:7336:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumbo.g:7337:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumbo.g:7337:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumbo.g:7338:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumbo.g:7338:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumbo.g:7339:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
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

            // InternalGumbo.g:7356:4: (otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==50) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalGumbo.g:7357:5: otherlv_5= ',' ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_93); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumbo.g:7361:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumbo.g:7362:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumbo.g:7362:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumbo.g:7363:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
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
            	    break loop130;
                }
            } while (true);


            }

            // InternalGumbo.g:7382:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==114) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalGumbo.g:7383:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
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
                    // InternalGumbo.g:7393:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumbo.g:7394:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumbo.g:7394:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumbo.g:7395:6: lv_appliesTo_8_0= ruleContainmentPath
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

                    // InternalGumbo.g:7412:4: (otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==50) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalGumbo.g:7413:5: otherlv_9= ',' ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:7417:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumbo.g:7418:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumbo.g:7418:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumbo.g:7419:7: lv_appliesTo_10_0= ruleContainmentPath
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
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumbo.g:7438:3: ( ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==115) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalGumbo.g:7439:4: ruleInBindingKeywords otherlv_12= '(' ( ( ruleQCREF ) ) otherlv_14= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalGumbo.g:7453:4: ( ( ruleQCREF ) )
                    // InternalGumbo.g:7454:5: ( ruleQCREF )
                    {
                    // InternalGumbo.g:7454:5: ( ruleQCREF )
                    // InternalGumbo.g:7455:6: ruleQCREF
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

                    otherlv_14=(Token)match(input,51,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:7485:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumbo.g:7485:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumbo.g:7486:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumbo.g:7492:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7498:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumbo.g:7499:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumbo.g:7499:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumbo.g:7500:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumbo.g:7500:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumbo.g:7501:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumbo.g:7521:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumbo.g:7521:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumbo.g:7522:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumbo.g:7528:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? ) ;
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
            // InternalGumbo.g:7534:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? ) )
            // InternalGumbo.g:7535:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? )
            {
            // InternalGumbo.g:7535:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? )
            // InternalGumbo.g:7536:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )?
            {
            // InternalGumbo.g:7536:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumbo.g:7537:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumbo.g:7537:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumbo.g:7538:5: lv_ownedValue_0_0= rulePropertyExpression
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

            // InternalGumbo.g:7555:3: ( ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==115) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==117) ) {
                    alt135=1;
                }
            }
            switch (alt135) {
                case 1 :
                    // InternalGumbo.g:7556:4: ruleInModesKeywords otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumbo.g:7570:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumbo.g:7571:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumbo.g:7571:5: (otherlv_3= RULE_ID )
                    // InternalGumbo.g:7572:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumbo.g:7586:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==50) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalGumbo.g:7587:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:7591:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumbo.g:7592:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumbo.g:7592:6: (otherlv_5= RULE_ID )
                    	    // InternalGumbo.g:7593:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:7617:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumbo.g:7617:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumbo.g:7618:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumbo.g:7624:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7630:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumbo.g:7631:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumbo.g:7631:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumbo.g:7632:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumbo.g:7632:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumbo.g:7633:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumbo.g:7653:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumbo.g:7653:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumbo.g:7654:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumbo.g:7660:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumbo.g:7666:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumbo.g:7667:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumbo.g:7667:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt136=11;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // InternalGumbo.g:7668:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumbo.g:7680:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumbo.g:7692:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumbo.g:7704:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumbo.g:7716:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumbo.g:7728:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumbo.g:7740:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumbo.g:7752:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumbo.g:7764:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumbo.g:7776:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumbo.g:7788:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumbo.g:7803:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumbo.g:7803:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumbo.g:7804:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumbo.g:7810:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumbo.g:7816:2: ( ( ( ruleQPREF ) ) )
            // InternalGumbo.g:7817:2: ( ( ruleQPREF ) )
            {
            // InternalGumbo.g:7817:2: ( ( ruleQPREF ) )
            // InternalGumbo.g:7818:3: ( ruleQPREF )
            {
            // InternalGumbo.g:7818:3: ( ruleQPREF )
            // InternalGumbo.g:7819:4: ruleQPREF
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
    // InternalGumbo.g:7839:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumbo.g:7839:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumbo.g:7840:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumbo.g:7846:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:7852:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalGumbo.g:7853:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalGumbo.g:7853:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalGumbo.g:7854:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalGumbo.g:7854:3: ()
            // InternalGumbo.g:7855:4: 
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

            // InternalGumbo.g:7864:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==102) ) {
                alt137=1;
            }
            else if ( (LA137_0==103) ) {
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
                    // InternalGumbo.g:7865:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalGumbo.g:7865:4: ( (lv_value_1_0= 'true' ) )
                    // InternalGumbo.g:7866:5: (lv_value_1_0= 'true' )
                    {
                    // InternalGumbo.g:7866:5: (lv_value_1_0= 'true' )
                    // InternalGumbo.g:7867:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalGumbo.g:7880:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:7889:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumbo.g:7889:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumbo.g:7890:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumbo.g:7896:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumbo.g:7902:2: ( ( ( ruleQPREF ) ) )
            // InternalGumbo.g:7903:2: ( ( ruleQPREF ) )
            {
            // InternalGumbo.g:7903:2: ( ( ruleQPREF ) )
            // InternalGumbo.g:7904:3: ( ruleQPREF )
            {
            // InternalGumbo.g:7904:3: ( ruleQPREF )
            // InternalGumbo.g:7905:4: ruleQPREF
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
    // InternalGumbo.g:7925:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumbo.g:7925:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumbo.g:7926:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumbo.g:7932:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= 'reference' otherlv_1= '(' ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= ')' ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7938:2: ( (otherlv_0= 'reference' otherlv_1= '(' ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= ')' ) )
            // InternalGumbo.g:7939:2: (otherlv_0= 'reference' otherlv_1= '(' ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= ')' )
            {
            // InternalGumbo.g:7939:2: (otherlv_0= 'reference' otherlv_1= '(' ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= ')' )
            // InternalGumbo.g:7940:3: otherlv_0= 'reference' otherlv_1= '(' ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,109,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumbo.g:7948:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumbo.g:7949:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumbo.g:7949:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumbo.g:7950:5: lv_path_2_0= ruleContainmentPathElement
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

            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:7975:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumbo.g:7975:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumbo.g:7976:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumbo.g:7982:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ']' ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:7988:2: ( (otherlv_0= '[' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ']' ) )
            // InternalGumbo.g:7989:2: (otherlv_0= '[' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ']' )
            {
            // InternalGumbo.g:7989:2: (otherlv_0= '[' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ']' )
            // InternalGumbo.g:7990:3: otherlv_0= '[' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumbo.g:7994:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
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
            	    // InternalGumbo.g:7995:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumbo.g:7995:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumbo.g:7996:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
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
            	    if ( cnt138 >= 1 ) break loop138;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(138, input);
                        throw eee;
                }
                cnt138++;
            } while (true);

            otherlv_2=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8021:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumbo.g:8021:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumbo.g:8022:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumbo.g:8028:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumbo.g:8034:2: ( (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalGumbo.g:8035:2: (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalGumbo.g:8035:2: (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalGumbo.g:8036:3: otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumbo.g:8044:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumbo.g:8045:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumbo.g:8045:4: (lv_function_2_0= RULE_ID )
            // InternalGumbo.g:8046:5: lv_function_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8070:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumbo.g:8070:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumbo.g:8071:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumbo.g:8077:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumbo.g:8083:2: ( (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' ) )
            // InternalGumbo.g:8084:2: (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' )
            {
            // InternalGumbo.g:8084:2: (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' )
            // InternalGumbo.g:8085:3: otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumbo.g:8093:3: ( ( ruleQCREF ) )
            // InternalGumbo.g:8094:4: ( ruleQCREF )
            {
            // InternalGumbo.g:8094:4: ( ruleQCREF )
            // InternalGumbo.g:8095:5: ruleQCREF
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

            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8120:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumbo.g:8120:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumbo.g:8121:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumbo.g:8127:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8133:2: ( ( () otherlv_1= '(' ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalGumbo.g:8134:2: ( () otherlv_1= '(' ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalGumbo.g:8134:2: ( () otherlv_1= '(' ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= ')' )
            // InternalGumbo.g:8135:3: () otherlv_1= '(' ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalGumbo.g:8135:3: ()
            // InternalGumbo.g:8136:4: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumbo.g:8149:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RULE_ID||LA140_0==RULE_INTEGER_LIT||LA140_0==RULE_REAL_LIT||LA140_0==RULE_STRING||LA140_0==45||LA140_0==49||LA140_0==64||(LA140_0>=102 && LA140_0<=103)||(LA140_0>=109 && LA140_0<=112)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalGumbo.g:8150:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumbo.g:8150:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumbo.g:8151:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumbo.g:8151:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumbo.g:8152:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalGumbo.g:8169:4: (otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==50) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalGumbo.g:8170:5: otherlv_3= ',' ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_93); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumbo.g:8174:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumbo.g:8175:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumbo.g:8175:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumbo.g:8176:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8203:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumbo.g:8203:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumbo.g:8204:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumbo.g:8210:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8216:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' ) )
            // InternalGumbo.g:8217:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' )
            {
            // InternalGumbo.g:8217:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' )
            // InternalGumbo.g:8218:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';'
            {
            // InternalGumbo.g:8218:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumbo.g:8219:4: (otherlv_0= RULE_ID )
            {
            // InternalGumbo.g:8219:4: (otherlv_0= RULE_ID )
            // InternalGumbo.g:8220:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumbo.g:8238:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumbo.g:8239:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumbo.g:8239:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumbo.g:8240:5: lv_ownedValue_2_0= rulePropertyExpression
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

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8265:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumbo.g:8265:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumbo.g:8266:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumbo.g:8272:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8278:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumbo.g:8279:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumbo.g:8279:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumbo.g:8280:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumbo.g:8280:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumbo.g:8281:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumbo.g:8281:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumbo.g:8282:5: (otherlv_0= RULE_ID )
            {
            // InternalGumbo.g:8282:5: (otherlv_0= RULE_ID )
            // InternalGumbo.g:8283:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumbo.g:8297:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==64) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalGumbo.g:8298:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumbo.g:8298:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumbo.g:8299:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
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

            // InternalGumbo.g:8317:3: (otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==67) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalGumbo.g:8318:4: otherlv_2= '.' ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumbo.g:8322:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumbo.g:8323:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumbo.g:8323:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumbo.g:8324:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumbo.g:8346:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumbo.g:8346:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumbo.g:8347:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumbo.g:8353:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:8359:2: ( (kw= '+' | kw= '-' ) )
            // InternalGumbo.g:8360:2: (kw= '+' | kw= '-' )
            {
            // InternalGumbo.g:8360:2: (kw= '+' | kw= '-' )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==111) ) {
                alt143=1;
            }
            else if ( (LA143_0==112) ) {
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
                    // InternalGumbo.g:8361:3: kw= '+'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:8367:3: kw= '-'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8376:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumbo.g:8376:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumbo.g:8377:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumbo.g:8383:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8389:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumbo.g:8390:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumbo.g:8390:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumbo.g:8391:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumbo.g:8391:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumbo.g:8392:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumbo.g:8412:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumbo.g:8412:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumbo.g:8413:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumbo.g:8419:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumbo.g:8425:2: (this_STRING_0= RULE_STRING )
            // InternalGumbo.g:8426:2: this_STRING_0= RULE_STRING
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
    // InternalGumbo.g:8436:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumbo.g:8436:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumbo.g:8437:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumbo.g:8443:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8449:2: ( ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= ']' ) )
            // InternalGumbo.g:8450:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= ']' )
            {
            // InternalGumbo.g:8450:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= ']' )
            // InternalGumbo.g:8451:3: () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= ']'
            {
            // InternalGumbo.g:8451:3: ()
            // InternalGumbo.g:8452:4: 
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

            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumbo.g:8465:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumbo.g:8466:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumbo.g:8466:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumbo.g:8467:5: lv_lowerBound_2_0= ruleINTVALUE
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

            // InternalGumbo.g:8484:3: (otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==88) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalGumbo.g:8485:4: otherlv_3= '..' ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,88,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumbo.g:8489:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumbo.g:8490:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumbo.g:8490:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumbo.g:8491:6: lv_upperBound_4_0= ruleINTVALUE
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

            otherlv_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8517:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumbo.g:8517:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumbo.g:8518:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumbo.g:8524:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8530:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumbo.g:8531:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumbo.g:8531:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumbo.g:8532:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumbo.g:8532:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumbo.g:8533:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumbo.g:8533:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumbo.g:8534:5: lv_op_0_0= rulePlusMinus
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

            // InternalGumbo.g:8551:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumbo.g:8552:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumbo.g:8552:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumbo.g:8553:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumbo.g:8574:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumbo.g:8574:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumbo.g:8575:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumbo.g:8581:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8587:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumbo.g:8588:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumbo.g:8588:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumbo.g:8589:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumbo.g:8589:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumbo.g:8590:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumbo.g:8590:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumbo.g:8591:5: lv_value_0_0= ruleSignedInt
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

            // InternalGumbo.g:8608:3: ( (otherlv_1= RULE_ID ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_ID) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalGumbo.g:8609:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumbo.g:8609:4: (otherlv_1= RULE_ID )
                    // InternalGumbo.g:8610:5: otherlv_1= RULE_ID
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
    // InternalGumbo.g:8628:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumbo.g:8628:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumbo.g:8629:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumbo.g:8635:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:8641:2: ( ( (kw= '+' | kw= '-' )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumbo.g:8642:2: ( (kw= '+' | kw= '-' )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumbo.g:8642:2: ( (kw= '+' | kw= '-' )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumbo.g:8643:3: (kw= '+' | kw= '-' )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumbo.g:8643:3: (kw= '+' | kw= '-' )?
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==111) ) {
                alt146=1;
            }
            else if ( (LA146_0==112) ) {
                alt146=2;
            }
            switch (alt146) {
                case 1 :
                    // InternalGumbo.g:8644:4: kw= '+'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:8650:4: kw= '-'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_99); if (state.failed) return current;
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
    // InternalGumbo.g:8667:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumbo.g:8667:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumbo.g:8668:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumbo.g:8674:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8680:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumbo.g:8681:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumbo.g:8681:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumbo.g:8682:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumbo.g:8682:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumbo.g:8683:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumbo.g:8683:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumbo.g:8684:5: lv_value_0_0= ruleSignedReal
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

            // InternalGumbo.g:8701:3: ( (otherlv_1= RULE_ID ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_ID) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalGumbo.g:8702:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumbo.g:8702:4: (otherlv_1= RULE_ID )
                    // InternalGumbo.g:8703:5: otherlv_1= RULE_ID
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
    // InternalGumbo.g:8721:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumbo.g:8721:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumbo.g:8722:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumbo.g:8728:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:8734:2: ( ( (kw= '+' | kw= '-' )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumbo.g:8735:2: ( (kw= '+' | kw= '-' )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumbo.g:8735:2: ( (kw= '+' | kw= '-' )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumbo.g:8736:3: (kw= '+' | kw= '-' )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumbo.g:8736:3: (kw= '+' | kw= '-' )?
            int alt148=3;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==111) ) {
                alt148=1;
            }
            else if ( (LA148_0==112) ) {
                alt148=2;
            }
            switch (alt148) {
                case 1 :
                    // InternalGumbo.g:8737:4: kw= '+'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumbo.g:8743:4: kw= '-'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_103); if (state.failed) return current;
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
    // InternalGumbo.g:8760:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumbo.g:8760:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumbo.g:8761:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumbo.g:8767:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= '..' ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8773:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= '..' ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumbo.g:8774:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= '..' ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumbo.g:8774:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= '..' ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumbo.g:8775:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= '..' ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumbo.g:8775:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumbo.g:8776:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumbo.g:8776:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumbo.g:8777:5: lv_minimum_0_0= ruleNumAlt
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

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumbo.g:8798:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumbo.g:8799:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumbo.g:8799:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumbo.g:8800:5: lv_maximum_2_0= ruleNumAlt
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

            // InternalGumbo.g:8817:3: (otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==113) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalGumbo.g:8818:4: otherlv_3= 'delta' ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,113,FollowSets000.FOLLOW_102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumbo.g:8822:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumbo.g:8823:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumbo.g:8823:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumbo.g:8824:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumbo.g:8846:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumbo.g:8846:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumbo.g:8847:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumbo.g:8853:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumbo.g:8859:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumbo.g:8860:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumbo.g:8860:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt150=4;
            switch ( input.LA(1) ) {
            case 111:
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
            case 112:
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
                    // InternalGumbo.g:8861:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumbo.g:8873:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumbo.g:8885:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumbo.g:8897:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumbo.g:8912:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumbo.g:8912:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumbo.g:8913:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumbo.g:8919:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'applies' kw= 'to' ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:8925:2: ( (kw= 'applies' kw= 'to' ) )
            // InternalGumbo.g:8926:2: (kw= 'applies' kw= 'to' )
            {
            // InternalGumbo.g:8926:2: (kw= 'applies' kw= 'to' )
            // InternalGumbo.g:8927:3: kw= 'applies' kw= 'to'
            {
            kw=(Token)match(input,114,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());
              		
            }
            kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8941:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumbo.g:8941:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumbo.g:8942:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumbo.g:8948:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'binding' ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:8954:2: ( (kw= 'in' kw= 'binding' ) )
            // InternalGumbo.g:8955:2: (kw= 'in' kw= 'binding' )
            {
            // InternalGumbo.g:8955:2: (kw= 'in' kw= 'binding' )
            // InternalGumbo.g:8956:3: kw= 'in' kw= 'binding'
            {
            kw=(Token)match(input,115,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,116,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8970:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumbo.g:8970:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumbo.g:8971:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumbo.g:8977:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'modes' ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:8983:2: ( (kw= 'in' kw= 'modes' ) )
            // InternalGumbo.g:8984:2: (kw= 'in' kw= 'modes' )
            {
            // InternalGumbo.g:8984:2: (kw= 'in' kw= 'modes' )
            // InternalGumbo.g:8985:3: kw= 'in' kw= 'modes'
            {
            kw=(Token)match(input,115,FollowSets000.FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,117,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumbo.g:8999:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumbo.g:8999:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumbo.g:9000:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumbo.g:9006:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumbo.g:9012:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumbo.g:9013:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumbo.g:9023:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
    public final String entryRuleQCLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCLREF = null;


        try {
            // InternalGumbo.g:9023:46: (iv_ruleQCLREF= ruleQCLREF EOF )
            // InternalGumbo.g:9024:2: iv_ruleQCLREF= ruleQCLREF EOF
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
    // InternalGumbo.g:9030:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:9036:2: ( (this_ID_0= RULE_ID kw= '::' this_ID_2= RULE_ID ) )
            // InternalGumbo.g:9037:2: (this_ID_0= RULE_ID kw= '::' this_ID_2= RULE_ID )
            {
            // InternalGumbo.g:9037:2: (this_ID_0= RULE_ID kw= '::' this_ID_2= RULE_ID )
            // InternalGumbo.g:9038:3: this_ID_0= RULE_ID kw= '::' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,118,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
    // InternalGumbo.g:9061:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumbo.g:9061:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumbo.g:9062:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumbo.g:9068:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumbo.g:9074:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? ) )
            // InternalGumbo.g:9075:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? )
            {
            // InternalGumbo.g:9075:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? )
            // InternalGumbo.g:9076:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumbo.g:9083:3: (kw= '::' this_ID_2= RULE_ID )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==118) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalGumbo.g:9084:4: kw= '::' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,118,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
    // InternalGumbo.g:9101:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumbo.g:9101:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumbo.g:9102:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumbo.g:9108:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumbo.g:9114:2: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? ) )
            // InternalGumbo.g:9115:2: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? )
            {
            // InternalGumbo.g:9115:2: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? )
            // InternalGumbo.g:9116:3: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )?
            {
            // InternalGumbo.g:9116:3: (this_ID_0= RULE_ID kw= '::' )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==RULE_ID) ) {
                    int LA152_1 = input.LA(2);

                    if ( (LA152_1==118) ) {
                        alt152=1;
                    }


                }


                switch (alt152) {
            	case 1 :
            	    // InternalGumbo.g:9117:4: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
            	      			
            	    }
            	    kw=(Token)match(input,118,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
            // InternalGumbo.g:9137:3: (kw= '.' this_ID_4= RULE_ID )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==67) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalGumbo.g:9138:4: kw= '.' this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
    // InternalGumbo.g:9155:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumbo.g:9155:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumbo.g:9156:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumbo.g:9162:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumbo.g:9168:2: (kw= '*' )
            // InternalGumbo.g:9169:2: kw= '*'
            {
            kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred38_InternalGumbo
    public final void synpred38_InternalGumbo_fragment() throws RecognitionException {   
        EObject lv_c_8_0 = null;


        // InternalGumbo.g:1815:4: ( (lv_c_8_0= ruleSlangDefContract ) )
        // InternalGumbo.g:1815:4: (lv_c_8_0= ruleSlangDefContract )
        {
        // InternalGumbo.g:1815:4: (lv_c_8_0= ruleSlangDefContract )
        // InternalGumbo.g:1816:5: lv_c_8_0= ruleSlangDefContract
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
    // $ANTLR end synpred38_InternalGumbo

    // $ANTLR start synpred114_InternalGumbo
    public final void synpred114_InternalGumbo_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;


        // InternalGumbo.g:5124:4: (otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) ) )
        // InternalGumbo.g:5124:4: otherlv_2= '.' ( (lv_path_3_0= ruleOtherDataRef ) )
        {
        otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return ;
        // InternalGumbo.g:5128:4: ( (lv_path_3_0= ruleOtherDataRef ) )
        // InternalGumbo.g:5129:5: (lv_path_3_0= ruleOtherDataRef )
        {
        // InternalGumbo.g:5129:5: (lv_path_3_0= ruleOtherDataRef )
        // InternalGumbo.g:5130:6: lv_path_3_0= ruleOtherDataRef
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
    // $ANTLR end synpred114_InternalGumbo

    // $ANTLR start synpred136_InternalGumbo
    public final void synpred136_InternalGumbo_fragment() throws RecognitionException {   
        Token otherlv_53=null;
        EObject lv_ref_54_0 = null;


        // InternalGumbo.g:5849:5: (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )
        // InternalGumbo.g:5849:5: otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) )
        {
        otherlv_53=(Token)match(input,67,FollowSets000.FOLLOW_9); if (state.failed) return ;
        // InternalGumbo.g:5853:5: ( (lv_ref_54_0= ruleOtherDataRef ) )
        // InternalGumbo.g:5854:6: (lv_ref_54_0= ruleOtherDataRef )
        {
        // InternalGumbo.g:5854:6: (lv_ref_54_0= ruleOtherDataRef )
        // InternalGumbo.g:5855:7: lv_ref_54_0= ruleOtherDataRef
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
    // $ANTLR end synpred136_InternalGumbo

    // $ANTLR start synpred143_InternalGumbo
    public final void synpred143_InternalGumbo_fragment() throws RecognitionException {   
        Token otherlv_72=null;
        Token otherlv_74=null;
        EObject lv_p_71_0 = null;

        EObject lv_e_73_0 = null;


        // InternalGumbo.g:6047:5: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) )
        // InternalGumbo.g:6047:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' )
        {
        // InternalGumbo.g:6047:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' )
        // InternalGumbo.g:6048:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}'
        {
        // InternalGumbo.g:6048:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )?
        int alt183=2;
        int LA183_0 = input.LA(1);

        if ( (LA183_0==49) ) {
            int LA183_1 = input.LA(2);

            if ( (LA183_1==83) ) {
                alt183=1;
            }
            else if ( (LA183_1==RULE_ID) ) {
                int LA183_4 = input.LA(3);

                if ( (LA183_4==39) ) {
                    alt183=1;
                }
            }
        }
        switch (alt183) {
            case 1 :
                // InternalGumbo.g:6049:7: ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>'
                {
                // InternalGumbo.g:6049:7: ( (lv_p_71_0= ruleSlangParams ) )
                // InternalGumbo.g:6050:8: (lv_p_71_0= ruleSlangParams )
                {
                // InternalGumbo.g:6050:8: (lv_p_71_0= ruleSlangParams )
                // InternalGumbo.g:6051:9: lv_p_71_0= ruleSlangParams
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

                otherlv_72=(Token)match(input,62,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;

        }

        // InternalGumbo.g:6073:6: ( (lv_e_73_0= ruleOwnedExpression ) )
        // InternalGumbo.g:6074:7: (lv_e_73_0= ruleOwnedExpression )
        {
        // InternalGumbo.g:6074:7: (lv_e_73_0= ruleOwnedExpression )
        // InternalGumbo.g:6075:8: lv_e_73_0= ruleOwnedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSlangTermAccess().getEOwnedExpressionParserRuleCall_13_2_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_76);
        lv_e_73_0=ruleOwnedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_74=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred143_InternalGumbo

    // Delegated rules

    public final boolean synpred114_InternalGumbo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalGumbo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalGumbo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalGumbo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalGumbo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalGumbo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalGumbo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalGumbo_fragment(); // can never throw exception
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
    protected DFA136 dfa136 = new DFA136(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\10\uffff\1\15\10\uffff\1\15\5\uffff\1\31\6\uffff";
    static final String dfa_3s = "\1\4\7\uffff\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\2\4\1\61\1\uffff\3\4\1\61\1\uffff\3\4\1\61";
    static final String dfa_4s = "\1\152\7\uffff\1\166\3\uffff\1\4\1\uffff\1\143\1\4\1\uffff\1\160\1\143\1\166\1\uffff\2\4\1\160\1\166\1\uffff\1\143\1\4\1\143\1\112";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\14\1\15\1\16\1\uffff\1\13\2\uffff\1\10\3\uffff\1\12\4\uffff\1\11\4\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\1\1\1\uffff\7\1\3\2\40\uffff\1\11\30\uffff\1\13\17\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\3\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\15\uffff\3\15\22\uffff\1\15\10\uffff\1\20\2\15\2\uffff\2\15\6\uffff\2\15\3\uffff\1\14\1\15\1\uffff\4\15\1\16\6\15\1\uffff\2\15\4\uffff\2\15\7\uffff\3\15\13\uffff\2\15\5\uffff\1\17",
            "",
            "",
            "",
            "\1\21",
            "",
            "\1\22\61\uffff\2\15\17\uffff\3\15\1\uffff\5\15\2\uffff\2\15\17\uffff\1\15",
            "\1\23",
            "",
            "\2\15\15\uffff\3\15\22\uffff\1\15\10\uffff\1\20\2\15\2\uffff\2\15\6\uffff\3\15\2\uffff\2\15\1\uffff\4\15\1\16\6\15\1\uffff\2\15\4\uffff\2\15\7\uffff\3\15\13\uffff\2\15",
            "\1\15\1\uffff\1\15\40\uffff\1\15\11\uffff\1\15\5\uffff\1\15\3\uffff\1\15\7\uffff\1\15\3\uffff\3\15\1\uffff\5\15\2\uffff\2\15\13\uffff\1\24\3\uffff\1\15",
            "\1\20\21\uffff\1\25\6\uffff\1\24\53\uffff\1\26",
            "",
            "\1\27",
            "\1\30",
            "\2\31\15\uffff\3\31\22\uffff\1\31\10\uffff\1\20\2\31\2\uffff\2\31\6\uffff\2\31\3\uffff\2\31\1\uffff\4\31\1\32\6\31\1\uffff\2\31\4\uffff\2\31\7\uffff\3\31\13\uffff\2\31",
            "\1\20\21\uffff\1\33\6\uffff\1\24\53\uffff\1\26",
            "",
            "\1\34\61\uffff\2\31\17\uffff\3\31\1\uffff\5\31\2\uffff\2\31\17\uffff\1\31",
            "\1\35",
            "\1\31\1\uffff\1\31\40\uffff\1\31\11\uffff\1\31\5\uffff\1\31\3\uffff\1\31\7\uffff\1\31\3\uffff\3\31\1\uffff\5\31\2\uffff\2\31\13\uffff\1\24\3\uffff\1\31",
            "\1\20\30\uffff\1\24"
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
            return "5166:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () 'In' '(' ) )=> ( () otherlv_5= 'In' otherlv_6= '(' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( ( ( () 'MaySend' '(' ) )=> ( () otherlv_10= 'MaySend' otherlv_11= '(' ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (lv_value_14_0= ruleOwnedExpression ) ) )? otherlv_15= ')' ) | ( ( ( ( () 'MustSend' '(' ) )=> ( () otherlv_17= 'MustSend' otherlv_18= '(' ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= ',' ( (lv_value_21_0= ruleOwnedExpression ) ) )? otherlv_22= ')' ) | ( ( ( ( () 'NoSend' '(' ) )=> ( () otherlv_24= 'NoSend' otherlv_25= '(' ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' ) | ( ( ( ( () 'HasEvent' '(' ) )=> ( () otherlv_29= 'HasEvent' otherlv_30= '(' ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= ')' ) | ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) '.' ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= '.' ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) '{' ( ( RULE_ID ) ) '=' ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= '{' ( (otherlv_43= RULE_ID ) ) otherlv_44= '=' ) ) ( (lv_argExpr_45_0= ruleOwnedExpression ) ) (otherlv_46= ';' ( (otherlv_47= RULE_ID ) ) otherlv_48= '=' ( (lv_argExpr_49_0= ruleOwnedExpression ) ) )* otherlv_50= '}' ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= '.' ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= '(' ( (lv_exp_57_0= ruleOwnedExpression ) ) otherlv_58= ')' ) | ( () otherlv_60= 'for' ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= ',' ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= 'yield' ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= '(' ( (lv_e_67_0= ruleOwnedExpression ) ) otherlv_68= ')' ) ) ) | ( () otherlv_70= '{' ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) ) ) )";
        }
    }
    static final String dfa_8s = "\62\uffff";
    static final String dfa_9s = "\1\4\30\uffff\1\0\2\uffff\1\0\25\uffff";
    static final String dfa_10s = "\1\160\30\uffff\1\0\2\uffff\1\0\25\uffff";
    static final String dfa_11s = "\1\uffff\1\1\45\uffff\1\2\12\uffff";
    static final String dfa_12s = "\31\uffff\1\0\2\uffff\1\1\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\31\1\1\1\uffff\12\1\2\uffff\3\1\33\uffff\1\1\5\uffff\1\47\7\uffff\1\1\7\uffff\1\34\2\47\1\1\5\47\2\uffff\2\47\4\1\2\uffff\5\1\1\uffff\1\1\2\uffff\1\47\7\1\4\uffff\2\1",
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
            return "6046:4: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= '=>' )? ( (lv_e_73_0= ruleOwnedExpression ) ) otherlv_74= '}' ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= '}' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_25 = input.LA(1);

                         
                        int index110_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalGumbo()) ) {s = 1;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index110_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_28 = input.LA(1);

                         
                        int index110_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalGumbo()) ) {s = 1;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index110_28);
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
    static final String dfa_16s = "\1\4\5\uffff\4\4\1\50\3\uffff\1\50\1\uffff\1\50\1\uffff\1\4\1\uffff\1\50";
    static final String dfa_17s = "\1\160\5\uffff\2\14\2\163\1\166\3\uffff\1\163\1\uffff\1\163\1\uffff\1\4\1\uffff\1\163";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_19s = "\25\uffff}>";
    static final String[] dfa_20s = {
            "\1\12\2\uffff\1\11\4\uffff\1\10\11\uffff\1\5\26\uffff\1\4\3\uffff\1\13\16\uffff\1\1\45\uffff\2\14\5\uffff\1\2\1\3\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\15\2\uffff\1\11\4\uffff\1\10",
            "\1\15\2\uffff\1\11\4\uffff\1\10",
            "\1\16\43\uffff\1\17\11\uffff\2\17\44\uffff\1\15\31\uffff\2\17",
            "\1\20\43\uffff\1\21\11\uffff\2\21\44\uffff\1\15\31\uffff\2\21",
            "\1\23\11\uffff\2\23\44\uffff\1\15\31\uffff\2\23\2\uffff\1\22",
            "",
            "",
            "",
            "\1\17\11\uffff\2\17\44\uffff\1\15\31\uffff\2\17",
            "",
            "\1\21\11\uffff\2\21\44\uffff\1\15\31\uffff\2\21",
            "",
            "\1\24",
            "",
            "\1\23\11\uffff\2\23\44\uffff\1\15\31\uffff\2\23"
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
            return "7667:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x02003A0000000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00003A0000000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000380000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000020L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x800200000039FFB0L,0x000187F17CF00480L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0180000000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0180800000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0180800000000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x01A0C00000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01A0C00000000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0060C00000000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020800000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x3002000000000010L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002008000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002008000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x818200000039FFB0L,0x000187F17CF004E0L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000010L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0180000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000450L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0802008000000042L,0x0000000000000008L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0802000000000042L,0x0000000000000008L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000480L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x800A00000039FFB0L,0x000187F17CF00480L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0002000000000010L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0080000000000012L,0x00000000000CF380L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0002000000000010L,0x0000000000020000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0002008000000002L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0800008000000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0080000000000010L,0x00000008000CFB80L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x800200000039FFB2L,0x000187F17CF00480L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x000200000001FFB0L,0x000007F17C000400L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x4004000000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000009L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0004000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x808200000039FFB0L,0x000187F97CFCFF80L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000010L,0x0000000000080000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x4000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0002200000401090L,0x0001F0C000000001L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0004010000000000L,0x000C000000000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0004010000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x000A200000401090L,0x0001F0C000000001L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000001090L,0x0001800000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    }


}