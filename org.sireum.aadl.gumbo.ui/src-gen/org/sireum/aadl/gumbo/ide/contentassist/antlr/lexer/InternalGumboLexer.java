package org.sireum.aadl.gumbo.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class InternalGumboLexer extends Lexer {
    public static final int Val=53;
    public static final int RULE_HEX=99;
    public static final int EqualsSignGreaterThanSign=58;
    public static final int Var=54;
    public static final int False=29;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=23;
    public static final int PlusSignEqualsSignGreaterThanSign=43;
    public static final int LeftParenthesis=64;
    public static final int RULE_MULTIPLICATIVE_OP=89;
    public static final int RULE_BIN=100;
    public static final int RULE_ESC_SEQ=83;
    public static final int F32=46;
    public static final int RULE_ID=114;
    public static final int RULE_DIGIT=105;
    public static final int Handle=25;
    public static final int ColonColon=56;
    public static final int RULE_F64_LIT=103;
    public static final int PlusSign=67;
    public static final int LeftSquareBracket=76;
    public static final int If=61;
    public static final int Halt=40;
    public static final int RULE_EQUAL_NOT_OPS=93;
    public static final int F=74;
    public static final int ThereExists=82;
    public static final int RULE_REAL_LIT=101;
    public static final int Classifier=5;
    public static final int RULE_OR_OPS=95;
    public static final int Case=37;
    public static final int Comma=68;
    public static final int HyphenMinus=69;
    public static final int NoSend=22;
    public static final int T=75;
    public static final int Guarantee=9;
    public static final int RightCurlyBracket=80;
    public static final int Modes=31;
    public static final int FullStop=70;
    public static final int RULE_QUANTIFIER_OP=87;
    public static final int RULE_SIMPLIES=97;
    public static final int Reference=11;
    public static final int RULE_IMPLIES=96;
    public static final int RULE_UNICODE_ESC=107;
    public static final int Functions=8;
    public static final int KW__=78;
    public static final int Semicolon=72;
    public static final int RULE_LETTER=104;
    public static final int RULE_EXPONENT=109;
    public static final int Delta=28;
    public static final int RULE_SLI=86;
    public static final int By=59;
    public static final int Else=38;
    public static final int RULE_EXTENDED_DIGIT=98;
    public static final int Yield=36;
    public static final int RULE_STRING_VALUE=84;
    public static final int All=45;
    public static final int Infoflow=15;
    public static final int Res=52;
    public static final int F64=47;
    public static final int True=42;
    public static final int RULE_INT_EXPONENT=110;
    public static final int HasEvent=12;
    public static final int RULE_LT_GT_OPS=92;
    public static final int In_1=62;
    public static final int FullStopFullStop=55;
    public static final int RULE_F32_LIT=102;
    public static final int To=63;
    public static final int Applies=18;
    public static final int RULE_BASED_INTEGER=111;
    public static final int RightSquareBracket=77;
    public static final int Binding=19;
    public static final int RULE_MSPI=106;
    public static final int For=49;
    public static final int RightParenthesis=65;
    public static final int Do=60;
    public static final int ColonEqualsSign=57;
    public static final int Mut=51;
    public static final int State=33;
    public static final int Assume=24;
    public static final int RULE_SLANG_OP=90;
    public static final int RULE_INTEGER_LIT=112;
    public static final int Invariant=10;
    public static final int Constant=14;
    public static final int RULE_STRING=113;
    public static final int RULE_NOT=88;
    public static final int Match=30;
    public static final int Reads=32;
    public static final int RULE_SL_COMMENT=108;
    public static final int Inv=50;
    public static final int EqualsSign=73;
    public static final int Modifies=16;
    public static final int RULE_AND_OPS=94;
    public static final int Colon=71;
    public static final int EOF=-1;
    public static final int Asterisk=66;
    public static final int Until=34;
    public static final int Integration=4;
    public static final int Return=26;
    public static final int Def=48;
    public static final int RULE_WS=115;
    public static final int LeftCurlyBracket=79;
    public static final int MustSend=13;
    public static final int While=35;
    public static final int From=39;
    public static final int FullStopFullStopLessThanSign=44;
    public static final int RULE_IDF=85;
    public static final int Exists=21;
    public static final int Compute=20;
    public static final int RULE_COLON_OP=91;
    public static final int MaySend=17;
    public static final int Spec=41;
    public static final int ForAll=81;
    public static final int Cases=27;

    // delegates
    // delegators

    public InternalGumboLexer() {;} 
    public InternalGumboLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGumboLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGumboLexer.g"; }

    // $ANTLR start "Integration"
    public final void mIntegration() throws RecognitionException {
        try {
            int _type = Integration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:24:13: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:24:15: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integration"

    // $ANTLR start "Classifier"
    public final void mClassifier() throws RecognitionException {
        try {
            int _type = Classifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:26:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:26:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Classifier"

    // $ANTLR start "Initialize"
    public final void mInitialize() throws RecognitionException {
        try {
            int _type = Initialize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:28:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:28:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Initialize"

    // $ANTLR start "Invariants"
    public final void mInvariants() throws RecognitionException {
        try {
            int _type = Invariants;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:30:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:30:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Invariants"

    // $ANTLR start "Functions"
    public final void mFunctions() throws RecognitionException {
        try {
            int _type = Functions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:32:11: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:32:13: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Functions"

    // $ANTLR start "Guarantee"
    public final void mGuarantee() throws RecognitionException {
        try {
            int _type = Guarantee;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:34:11: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:34:13: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Guarantee"

    // $ANTLR start "Invariant"
    public final void mInvariant() throws RecognitionException {
        try {
            int _type = Invariant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:36:11: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:36:13: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Invariant"

    // $ANTLR start "Reference"
    public final void mReference() throws RecognitionException {
        try {
            int _type = Reference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:38:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:38:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reference"

    // $ANTLR start "HasEvent"
    public final void mHasEvent() throws RecognitionException {
        try {
            int _type = HasEvent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:40:10: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:40:12: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HasEvent"

    // $ANTLR start "MustSend"
    public final void mMustSend() throws RecognitionException {
        try {
            int _type = MustSend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:42:10: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:42:12: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MustSend"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:44:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:44:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Infoflow"
    public final void mInfoflow() throws RecognitionException {
        try {
            int _type = Infoflow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:46:10: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // InternalGumboLexer.g:46:12: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Infoflow"

    // $ANTLR start "Modifies"
    public final void mModifies() throws RecognitionException {
        try {
            int _type = Modifies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:48:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:48:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modifies"

    // $ANTLR start "MaySend"
    public final void mMaySend() throws RecognitionException {
        try {
            int _type = MaySend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:50:9: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:50:11: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaySend"

    // $ANTLR start "Applies"
    public final void mApplies() throws RecognitionException {
        try {
            int _type = Applies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:52:9: ( ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:52:11: ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Applies"

    // $ANTLR start "Binding"
    public final void mBinding() throws RecognitionException {
        try {
            int _type = Binding;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:54:9: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalGumboLexer.g:54:11: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Binding"

    // $ANTLR start "Compute"
    public final void mCompute() throws RecognitionException {
        try {
            int _type = Compute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:56:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:56:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compute"

    // $ANTLR start "Exists"
    public final void mExists() throws RecognitionException {
        try {
            int _type = Exists;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:58:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:58:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exists"

    // $ANTLR start "NoSend"
    public final void mNoSend() throws RecognitionException {
        try {
            int _type = NoSend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:60:8: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:60:10: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NoSend"

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:62:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:62:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Assume"
    public final void mAssume() throws RecognitionException {
        try {
            int _type = Assume;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:64:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:64:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assume"

    // $ANTLR start "Handle"
    public final void mHandle() throws RecognitionException {
        try {
            int _type = Handle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:66:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:66:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Handle"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:68:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:68:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Cases"
    public final void mCases() throws RecognitionException {
        try {
            int _type = Cases;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:70:7: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:70:9: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cases"

    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:72:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalGumboLexer.g:72:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Delta"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:74:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:74:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Match"
    public final void mMatch() throws RecognitionException {
        try {
            int _type = Match;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:76:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalGumboLexer.g:76:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Match"

    // $ANTLR start "Modes"
    public final void mModes() throws RecognitionException {
        try {
            int _type = Modes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:78:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:78:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modes"

    // $ANTLR start "Reads"
    public final void mReads() throws RecognitionException {
        try {
            int _type = Reads;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:80:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:80:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reads"

    // $ANTLR start "State"
    public final void mState() throws RecognitionException {
        try {
            int _type = State;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:82:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:82:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "State"

    // $ANTLR start "Until"
    public final void mUntil() throws RecognitionException {
        try {
            int _type = Until;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:84:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:84:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Until"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:86:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:86:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Yield"
    public final void mYield() throws RecognitionException {
        try {
            int _type = Yield;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:88:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:88:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Yield"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:90:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:90:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:92:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:92:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:94:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // InternalGumboLexer.g:94:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Halt"
    public final void mHalt() throws RecognitionException {
        try {
            int _type = Halt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:96:6: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:96:8: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Halt"

    // $ANTLR start "Spec"
    public final void mSpec() throws RecognitionException {
        try {
            int _type = Spec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:98:6: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalGumboLexer.g:98:8: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Spec"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:100:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:100:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "PlusSignEqualsSignGreaterThanSign"
    public final void mPlusSignEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:102:35: ( '+' '=' '>' )
            // InternalGumboLexer.g:102:37: '+' '=' '>'
            {
            match('+'); 
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSignGreaterThanSign"

    // $ANTLR start "FullStopFullStopLessThanSign"
    public final void mFullStopFullStopLessThanSign() throws RecognitionException {
        try {
            int _type = FullStopFullStopLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:104:30: ( '.' '.' '<' )
            // InternalGumboLexer.g:104:32: '.' '.' '<'
            {
            match('.'); 
            match('.'); 
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStopLessThanSign"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:106:5: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:106:7: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "F32"
    public final void mF32() throws RecognitionException {
        try {
            int _type = F32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:108:5: ( ( 'F' | 'f' ) '3' '2' )
            // InternalGumboLexer.g:108:7: ( 'F' | 'f' ) '3' '2'
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('3'); 
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F32"

    // $ANTLR start "F64"
    public final void mF64() throws RecognitionException {
        try {
            int _type = F64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:110:5: ( ( 'F' | 'f' ) '6' '4' )
            // InternalGumboLexer.g:110:7: ( 'F' | 'f' ) '6' '4'
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('6'); 
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F64"

    // $ANTLR start "Def"
    public final void mDef() throws RecognitionException {
        try {
            int _type = Def;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:112:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:112:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Def"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:114:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:114:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Inv"
    public final void mInv() throws RecognitionException {
        try {
            int _type = Inv;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:116:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) )
            // InternalGumboLexer.g:116:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inv"

    // $ANTLR start "Mut"
    public final void mMut() throws RecognitionException {
        try {
            int _type = Mut;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:118:5: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:118:7: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mut"

    // $ANTLR start "Res"
    public final void mRes() throws RecognitionException {
        try {
            int _type = Res;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:120:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:120:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Res"

    // $ANTLR start "Val"
    public final void mVal() throws RecognitionException {
        try {
            int _type = Val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:122:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:122:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Val"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:124:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:124:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:126:18: ( '.' '.' )
            // InternalGumboLexer.g:126:20: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:128:12: ( ':' ':' )
            // InternalGumboLexer.g:128:14: ':' ':'
            {
            match(':'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:130:17: ( ':' '=' )
            // InternalGumboLexer.g:130:19: ':' '='
            {
            match(':'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:132:27: ( '=' '>' )
            // InternalGumboLexer.g:132:29: '=' '>'
            {
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "By"
    public final void mBy() throws RecognitionException {
        try {
            int _type = By;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:134:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:134:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "By"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:136:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:136:6: ( 'D' | 'd' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:138:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:138:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "In_1"
    public final void mIn_1() throws RecognitionException {
        try {
            int _type = In_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:140:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:140:8: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In_1"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:142:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:142:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:144:17: ( '(' )
            // InternalGumboLexer.g:144:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:146:18: ( ')' )
            // InternalGumboLexer.g:146:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:148:10: ( '*' )
            // InternalGumboLexer.g:148:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:150:10: ( '+' )
            // InternalGumboLexer.g:150:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:152:7: ( ',' )
            // InternalGumboLexer.g:152:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:154:13: ( '-' )
            // InternalGumboLexer.g:154:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:156:10: ( '.' )
            // InternalGumboLexer.g:156:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:158:7: ( ':' )
            // InternalGumboLexer.g:158:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:160:11: ( ';' )
            // InternalGumboLexer.g:160:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:162:12: ( '=' )
            // InternalGumboLexer.g:162:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            int _type = F;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:164:3: ( ( 'F' | 'f' ) )
            // InternalGumboLexer.g:164:5: ( 'F' | 'f' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:166:3: ( ( 'T' | 't' ) )
            // InternalGumboLexer.g:166:5: ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:168:19: ( '[' )
            // InternalGumboLexer.g:168:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:170:20: ( ']' )
            // InternalGumboLexer.g:170:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "KW__"
    public final void mKW__() throws RecognitionException {
        try {
            int _type = KW__;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:172:6: ( '_' )
            // InternalGumboLexer.g:172:8: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW__"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:174:18: ( '{' )
            // InternalGumboLexer.g:174:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:176:19: ( '}' )
            // InternalGumboLexer.g:176:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "ForAll"
    public final void mForAll() throws RecognitionException {
        try {
            int _type = ForAll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:178:8: ( '\\u2200' )
            // InternalGumboLexer.g:178:10: '\\u2200'
            {
            match('\u2200'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ForAll"

    // $ANTLR start "ThereExists"
    public final void mThereExists() throws RecognitionException {
        try {
            int _type = ThereExists;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:180:13: ( '\\u2203' )
            // InternalGumboLexer.g:180:15: '\\u2203'
            {
            match('\u2203'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ThereExists"

    // $ANTLR start "RULE_STRING_VALUE"
    public final void mRULE_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:182:19: ( '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:182:21: '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGumboLexer.g:182:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGumboLexer.g:182:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:182:39: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_VALUE"

    // $ANTLR start "RULE_SLI"
    public final void mRULE_SLI() throws RecognitionException {
        try {
            int _type = RULE_SLI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:184:10: ( RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:184:12: RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            // InternalGumboLexer.g:184:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGumboLexer.g:184:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:184:39: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLI"

    // $ANTLR start "RULE_QUANTIFIER_OP"
    public final void mRULE_QUANTIFIER_OP() throws RecognitionException {
        try {
            int _type = RULE_QUANTIFIER_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:186:20: ( ( '\\\\all' | '\\\\exists' | '\\u2200' | '\\u2203' ) )
            // InternalGumboLexer.g:186:22: ( '\\\\all' | '\\\\exists' | '\\u2200' | '\\u2203' )
            {
            // InternalGumboLexer.g:186:22: ( '\\\\all' | '\\\\exists' | '\\u2200' | '\\u2203' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case '\\':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='a') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='e') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case '\u2200':
                {
                alt3=3;
                }
                break;
            case '\u2203':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGumboLexer.g:186:23: '\\\\all'
                    {
                    match("\\all"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:186:31: '\\\\exists'
                    {
                    match("\\exists"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:186:42: '\\u2200'
                    {
                    match('\u2200'); 

                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:186:51: '\\u2203'
                    {
                    match('\u2203'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUANTIFIER_OP"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:188:10: ( '!' )
            // InternalGumboLexer.g:188:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_MULTIPLICATIVE_OP"
    public final void mRULE_MULTIPLICATIVE_OP() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATIVE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:190:24: ( ( '/' | '%' ) )
            // InternalGumboLexer.g:190:26: ( '/' | '%' )
            {
            if ( input.LA(1)=='%'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATIVE_OP"

    // $ANTLR start "RULE_SLANG_OP"
    public final void mRULE_SLANG_OP() throws RecognitionException {
        try {
            int _type = RULE_SLANG_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:192:15: ( ( '+:' | '++' | '-~' | '~-' ) )
            // InternalGumboLexer.g:192:17: ( '+:' | '++' | '-~' | '~-' )
            {
            // InternalGumboLexer.g:192:17: ( '+:' | '++' | '-~' | '~-' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==':') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='+') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case '-':
                {
                alt4=3;
                }
                break;
            case '~':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGumboLexer.g:192:18: '+:'
                    {
                    match("+:"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:192:23: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:192:28: '-~'
                    {
                    match("-~"); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:192:33: '~-'
                    {
                    match("~-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLANG_OP"

    // $ANTLR start "RULE_COLON_OP"
    public final void mRULE_COLON_OP() throws RecognitionException {
        try {
            int _type = RULE_COLON_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:194:15: ( ':+' )
            // InternalGumboLexer.g:194:17: ':+'
            {
            match(":+"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON_OP"

    // $ANTLR start "RULE_LT_GT_OPS"
    public final void mRULE_LT_GT_OPS() throws RecognitionException {
        try {
            int _type = RULE_LT_GT_OPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:196:16: ( ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' ) )
            // InternalGumboLexer.g:196:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )
            {
            // InternalGumboLexer.g:196:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalGumboLexer.g:196:19: '<<<'
                    {
                    match("<<<"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:196:25: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:196:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:196:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // InternalGumboLexer.g:196:39: '>>>'
                    {
                    match(">>>"); 


                    }
                    break;
                case 6 :
                    // InternalGumboLexer.g:196:45: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 7 :
                    // InternalGumboLexer.g:196:50: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 8 :
                    // InternalGumboLexer.g:196:55: '>'
                    {
                    match('>'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT_GT_OPS"

    // $ANTLR start "RULE_EQUAL_NOT_OPS"
    public final void mRULE_EQUAL_NOT_OPS() throws RecognitionException {
        try {
            int _type = RULE_EQUAL_NOT_OPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:198:20: ( ( '=!=' | '===' | '==' | '!=' | '!~' ) )
            // InternalGumboLexer.g:198:22: ( '=!=' | '===' | '==' | '!=' | '!~' )
            {
            // InternalGumboLexer.g:198:22: ( '=!=' | '===' | '==' | '!=' | '!~' )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='=') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='!') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='=') ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4=='=') ) {
                        alt6=2;
                    }
                    else {
                        alt6=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0=='!') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=4;
                }
                else if ( (LA6_2=='~') ) {
                    alt6=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboLexer.g:198:23: '=!='
                    {
                    match("=!="); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:198:29: '==='
                    {
                    match("==="); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:198:35: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:198:40: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 5 :
                    // InternalGumboLexer.g:198:45: '!~'
                    {
                    match("!~"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL_NOT_OPS"

    // $ANTLR start "RULE_AND_OPS"
    public final void mRULE_AND_OPS() throws RecognitionException {
        try {
            int _type = RULE_AND_OPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:200:14: ( ( '&&' | '&' ) )
            // InternalGumboLexer.g:200:16: ( '&&' | '&' )
            {
            // InternalGumboLexer.g:200:16: ( '&&' | '&' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='&') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='&') ) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGumboLexer.g:200:17: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:200:22: '&'
                    {
                    match('&'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_OPS"

    // $ANTLR start "RULE_OR_OPS"
    public final void mRULE_OR_OPS() throws RecognitionException {
        try {
            int _type = RULE_OR_OPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:202:13: ( ( '|^' | '||' | '|' ) )
            // InternalGumboLexer.g:202:15: ( '|^' | '||' | '|' )
            {
            // InternalGumboLexer.g:202:15: ( '|^' | '||' | '|' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='|') ) {
                switch ( input.LA(2) ) {
                case '^':
                    {
                    alt8=1;
                    }
                    break;
                case '|':
                    {
                    alt8=2;
                    }
                    break;
                default:
                    alt8=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGumboLexer.g:202:16: '|^'
                    {
                    match("|^"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:202:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:202:26: '|'
                    {
                    match('|'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OPS"

    // $ANTLR start "RULE_IMPLIES"
    public final void mRULE_IMPLIES() throws RecognitionException {
        try {
            int _type = RULE_IMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:204:14: ( ( '__' | '-' | '~' ) '>' ':' )
            // InternalGumboLexer.g:204:16: ( '__' | '-' | '~' ) '>' ':'
            {
            // InternalGumboLexer.g:204:16: ( '__' | '-' | '~' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case '_':
                {
                alt9=1;
                }
                break;
            case '-':
                {
                alt9=2;
                }
                break;
            case '~':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGumboLexer.g:204:17: '__'
                    {
                    match("__"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:204:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:204:26: '~'
                    {
                    match('~'); 

                    }
                    break;

            }

            match('>'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPLIES"

    // $ANTLR start "RULE_SIMPLIES"
    public final void mRULE_SIMPLIES() throws RecognitionException {
        try {
            int _type = RULE_SIMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:206:15: ( ( '___' | '~~' ) '>' ':' )
            // InternalGumboLexer.g:206:17: ( '___' | '~~' ) '>' ':'
            {
            // InternalGumboLexer.g:206:17: ( '___' | '~~' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='_') ) {
                alt10=1;
            }
            else if ( (LA10_0=='~') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGumboLexer.g:206:18: '___'
                    {
                    match("___"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:206:24: '~~'
                    {
                    match("~~"); 


                    }
                    break;

            }

            match('>'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLIES"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:208:10: ( '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:208:12: '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )?
            {
            match("0x"); 

            // InternalGumboLexer.g:208:17: ( RULE_EXTENDED_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboLexer.g:208:17: RULE_EXTENDED_DIGIT
            	    {
            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalGumboLexer.g:208:38: ( '.' RULE_IDF )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='.') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGumboLexer.g:208:39: '.' RULE_IDF
                    {
                    match('.'); 
                    mRULE_IDF(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_BIN"
    public final void mRULE_BIN() throws RecognitionException {
        try {
            int _type = RULE_BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:210:10: ( '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:210:12: '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )?
            {
            match("0b"); 

            // InternalGumboLexer.g:210:17: ( '0' | '1' | '_' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='1')||LA13_0=='_') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalGumboLexer.g:210:32: ( '.' RULE_IDF )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='.') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboLexer.g:210:33: '.' RULE_IDF
                    {
                    match('.'); 
                    mRULE_IDF(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN"

    // $ANTLR start "RULE_F32_LIT"
    public final void mRULE_F32_LIT() throws RecognitionException {
        try {
            int _type = RULE_F32_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:212:14: ( RULE_REAL_LIT 'f' )
            // InternalGumboLexer.g:212:16: RULE_REAL_LIT 'f'
            {
            mRULE_REAL_LIT(); 
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_F32_LIT"

    // $ANTLR start "RULE_F64_LIT"
    public final void mRULE_F64_LIT() throws RecognitionException {
        try {
            int _type = RULE_F64_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:214:14: ( RULE_REAL_LIT 'd' )
            // InternalGumboLexer.g:214:16: RULE_REAL_LIT 'd'
            {
            mRULE_REAL_LIT(); 
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_F64_LIT"

    // $ANTLR start "RULE_IDF"
    public final void mRULE_IDF() throws RecognitionException {
        try {
            // InternalGumboLexer.g:216:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:216:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:216:39: ( RULE_LETTER | RULE_DIGIT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumboLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDF"

    // $ANTLR start "RULE_MSPI"
    public final void mRULE_MSPI() throws RecognitionException {
        try {
            // InternalGumboLexer.g:218:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:218:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:218:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='\u0000' && LA16_0<='!')||LA16_0=='#'||(LA16_0>='%' && LA16_0<='\uFFFF')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='$') ) {
                alt16=2;
            }
            else if ( (LA16_0=='\"') ) {
                int LA16_3 = input.LA(2);

                if ( ((LA16_3>='\u0000' && LA16_3<='!')||(LA16_3>='#' && LA16_3<='\uFFFF')) ) {
                    alt16=3;
                }
                else if ( (LA16_3=='\"') ) {
                    alt16=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGumboLexer.g:218:23: ~ ( ( '\"' | '$' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:218:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:218:41: '\"' ~ ( '\"' )
                    {
                    match('\"'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:218:52: '\"\"' ~ ( '\"' )
                    {
                    match("\"\""); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MSPI"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalGumboLexer.g:220:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:220:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_ESC_SEQ"
    public final void mRULE_ESC_SEQ() throws RecognitionException {
        try {
            // InternalGumboLexer.g:222:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:222:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:222:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='\"'||LA17_1=='\''||LA17_1=='\\'||LA17_1=='b'||LA17_1=='f'||LA17_1=='n'||LA17_1=='r'||LA17_1=='t') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='u') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGumboLexer.g:222:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:222:67: RULE_UNICODE_ESC
                    {
                    mRULE_UNICODE_ESC(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC_SEQ"

    // $ANTLR start "RULE_UNICODE_ESC"
    public final void mRULE_UNICODE_ESC() throws RecognitionException {
        try {
            // InternalGumboLexer.g:224:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:224:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
            {
            match('\\'); 
            match('u'); 
            mRULE_EXTENDED_DIGIT(); 
            mRULE_EXTENDED_DIGIT(); 
            mRULE_EXTENDED_DIGIT(); 
            mRULE_EXTENDED_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_ESC"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:226:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:226:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:226:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGumboLexer.g:226:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalGumboLexer.g:226:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboLexer.g:226:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:226:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGumboLexer.g:226:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:228:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:228:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:228:36: ( '+' | '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='+'||LA21_0=='-') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalGumboLexer.g:228:47: ( RULE_DIGIT )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGumboLexer.g:228:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:230:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:230:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:230:40: ( '+' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboLexer.g:230:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:230:45: ( RULE_DIGIT )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGumboLexer.g:230:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:232:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:232:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:232:17: ( RULE_DIGIT )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGumboLexer.g:232:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // InternalGumboLexer.g:232:29: ( '_' ( RULE_DIGIT )+ )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='_') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboLexer.g:232:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:232:34: ( RULE_DIGIT )+
            	    int cnt26=0;
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:232:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt26 >= 1 ) break loop26;
            	                EarlyExitException eee =
            	                    new EarlyExitException(26, input);
            	                throw eee;
            	        }
            	        cnt26++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match('.'); 
            // InternalGumboLexer.g:232:52: ( RULE_DIGIT )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGumboLexer.g:232:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalGumboLexer.g:232:64: ( '_' ( RULE_DIGIT )+ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGumboLexer.g:232:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:232:69: ( RULE_DIGIT )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( ((LA29_0>='0' && LA29_0<='9')) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:232:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalGumboLexer.g:232:83: ( RULE_EXPONENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='E'||LA31_0=='e') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumboLexer.g:232:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_INTEGER_LIT"
    public final void mRULE_INTEGER_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:234:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:234:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:234:20: ( RULE_DIGIT )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGumboLexer.g:234:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // InternalGumboLexer.g:234:32: ( '_' ( RULE_DIGIT )+ )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='_') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGumboLexer.g:234:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:234:37: ( RULE_DIGIT )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( ((LA33_0>='0' && LA33_0<='9')) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:234:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalGumboLexer.g:234:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='#') ) {
                alt37=1;
            }
            else {
                alt37=2;}
            switch (alt37) {
                case 1 :
                    // InternalGumboLexer.g:234:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:234:79: ( RULE_INT_EXPONENT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='E'||LA35_0=='e') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGumboLexer.g:234:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:234:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:234:98: ( RULE_INT_EXPONENT )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='E'||LA36_0=='e') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGumboLexer.g:234:98: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:236:21: ( '0' .. '9' )
            // InternalGumboLexer.g:236:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:238:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:238:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // InternalGumboLexer.g:240:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:240:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:240:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='F')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='f')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGumboLexer.g:240:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:240:52: ( '_' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0=='_') ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalGumboLexer.g:240:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:242:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:242:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:242:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\"') ) {
                alt42=1;
            }
            else if ( (LA42_0=='\'') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGumboLexer.g:242:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:242:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='!')||(LA40_0>='#' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGumboLexer.g:242:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGumboLexer.g:242:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:242:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:242:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\\') ) {
                            alt41=1;
                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='&')||(LA41_0>='(' && LA41_0<='[')||(LA41_0>=']' && LA41_0<='\uFFFF')) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGumboLexer.g:242:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGumboLexer.g:242:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:244:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:244:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:244:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')||(LA44_0>='A' && LA44_0<='Z')||LA44_0=='_'||(LA44_0>='a' && LA44_0<='z')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGumboLexer.g:244:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:244:32: ( '_' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0=='_') ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalGumboLexer.g:244:32: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:246:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:246:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:246:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGumboLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | Exists | NoSend | Assert | Assume | Handle | Return | Cases | Delta | False | Match | Modes | Reads | State | Until | While | Yield | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | All | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_SLI | RULE_QUANTIFIER_OP | RULE_NOT | RULE_MULTIPLICATIVE_OP | RULE_SLANG_OP | RULE_COLON_OP | RULE_LT_GT_OPS | RULE_EQUAL_NOT_OPS | RULE_AND_OPS | RULE_OR_OPS | RULE_IMPLIES | RULE_SIMPLIES | RULE_HEX | RULE_BIN | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt46=102;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1 :
                // InternalGumboLexer.g:1:10: Integration
                {
                mIntegration(); 

                }
                break;
            case 2 :
                // InternalGumboLexer.g:1:22: Classifier
                {
                mClassifier(); 

                }
                break;
            case 3 :
                // InternalGumboLexer.g:1:33: Initialize
                {
                mInitialize(); 

                }
                break;
            case 4 :
                // InternalGumboLexer.g:1:44: Invariants
                {
                mInvariants(); 

                }
                break;
            case 5 :
                // InternalGumboLexer.g:1:55: Functions
                {
                mFunctions(); 

                }
                break;
            case 6 :
                // InternalGumboLexer.g:1:65: Guarantee
                {
                mGuarantee(); 

                }
                break;
            case 7 :
                // InternalGumboLexer.g:1:75: Invariant
                {
                mInvariant(); 

                }
                break;
            case 8 :
                // InternalGumboLexer.g:1:85: Reference
                {
                mReference(); 

                }
                break;
            case 9 :
                // InternalGumboLexer.g:1:95: HasEvent
                {
                mHasEvent(); 

                }
                break;
            case 10 :
                // InternalGumboLexer.g:1:104: MustSend
                {
                mMustSend(); 

                }
                break;
            case 11 :
                // InternalGumboLexer.g:1:113: Constant
                {
                mConstant(); 

                }
                break;
            case 12 :
                // InternalGumboLexer.g:1:122: Infoflow
                {
                mInfoflow(); 

                }
                break;
            case 13 :
                // InternalGumboLexer.g:1:131: Modifies
                {
                mModifies(); 

                }
                break;
            case 14 :
                // InternalGumboLexer.g:1:140: MaySend
                {
                mMaySend(); 

                }
                break;
            case 15 :
                // InternalGumboLexer.g:1:148: Applies
                {
                mApplies(); 

                }
                break;
            case 16 :
                // InternalGumboLexer.g:1:156: Binding
                {
                mBinding(); 

                }
                break;
            case 17 :
                // InternalGumboLexer.g:1:164: Compute
                {
                mCompute(); 

                }
                break;
            case 18 :
                // InternalGumboLexer.g:1:172: Exists
                {
                mExists(); 

                }
                break;
            case 19 :
                // InternalGumboLexer.g:1:179: NoSend
                {
                mNoSend(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:186: Assert
                {
                mAssert(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:193: Assume
                {
                mAssume(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:200: Handle
                {
                mHandle(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:207: Return
                {
                mReturn(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:214: Cases
                {
                mCases(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:220: Delta
                {
                mDelta(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:226: False
                {
                mFalse(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:232: Match
                {
                mMatch(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:238: Modes
                {
                mModes(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:244: Reads
                {
                mReads(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:250: State
                {
                mState(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:256: Until
                {
                mUntil(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:262: While
                {
                mWhile(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:268: Yield
                {
                mYield(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:274: Case
                {
                mCase(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:279: Else
                {
                mElse(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:284: From
                {
                mFrom(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:289: Halt
                {
                mHalt(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:294: Spec
                {
                mSpec(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:299: True
                {
                mTrue(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:304: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:338: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:367: All
                {
                mAll(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:371: F32
                {
                mF32(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:375: F64
                {
                mF64(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:379: Def
                {
                mDef(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:383: For
                {
                mFor(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:387: Inv
                {
                mInv(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:391: Mut
                {
                mMut(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:395: Res
                {
                mRes(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:399: Val
                {
                mVal(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:403: Var
                {
                mVar(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:407: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:424: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:435: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:451: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:477: By
                {
                mBy(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:480: Do
                {
                mDo(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:483: If
                {
                mIf(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:486: In_1
                {
                mIn_1(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:491: To
                {
                mTo(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:494: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:510: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:527: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:536: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:545: Comma
                {
                mComma(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:551: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:563: FullStop
                {
                mFullStop(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:572: Colon
                {
                mColon(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:578: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:588: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:599: F
                {
                mF(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:601: T
                {
                mT(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:603: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:621: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:640: KW__
                {
                mKW__(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:645: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:662: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:680: ForAll
                {
                mForAll(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:687: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:699: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:717: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:726: RULE_QUANTIFIER_OP
                {
                mRULE_QUANTIFIER_OP(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:745: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:754: RULE_MULTIPLICATIVE_OP
                {
                mRULE_MULTIPLICATIVE_OP(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:777: RULE_SLANG_OP
                {
                mRULE_SLANG_OP(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:791: RULE_COLON_OP
                {
                mRULE_COLON_OP(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:805: RULE_LT_GT_OPS
                {
                mRULE_LT_GT_OPS(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:820: RULE_EQUAL_NOT_OPS
                {
                mRULE_EQUAL_NOT_OPS(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:839: RULE_AND_OPS
                {
                mRULE_AND_OPS(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:852: RULE_OR_OPS
                {
                mRULE_OR_OPS(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:864: RULE_IMPLIES
                {
                mRULE_IMPLIES(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:877: RULE_SIMPLIES
                {
                mRULE_SIMPLIES(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:891: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:900: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:909: RULE_F32_LIT
                {
                mRULE_F32_LIT(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:922: RULE_F64_LIT
                {
                mRULE_F64_LIT(); 

                }
                break;
            case 97 :
                // InternalGumboLexer.g:1:935: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 98 :
                // InternalGumboLexer.g:1:951: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 99 :
                // InternalGumboLexer.g:1:965: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 100 :
                // InternalGumboLexer.g:1:982: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 101 :
                // InternalGumboLexer.g:1:994: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 102 :
                // InternalGumboLexer.g:1:1002: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA5_eotS =
        "\1\uffff\1\5\1\10\1\12\2\uffff\1\14\6\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\2\74\1\75\1\74\2\uffff\1\76\6\uffff";
    static final String DFA5_maxS =
        "\1\76\1\75\1\76\1\74\2\uffff\1\76\6\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\7\1\10\1\1\1\2\1\5\1\6";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = DFA5_transitionS_.DFA5_transitionS;
    private static final class DFA5_transitionS_ {
        static final String[] DFA5_transitionS = {
                "\1\1\1\uffff\1\2",
                "\1\3\1\4",
                "\1\7\1\6",
                "\1\11",
                "",
                "",
                "\1\13",
                "",
                "",
                "",
                "",
                "",
                ""
        };
    }

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    static class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "196:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )";
        }
    }
    static final String DFA46_eotS =
        "\1\uffff\2\63\1\77\15\63\1\127\1\132\1\134\1\63\1\141\1\144\4\uffff\1\146\3\uffff\1\151\5\uffff\1\63\1\uffff\1\157\5\uffff\2\163\2\uffff\1\172\1\173\1\uffff\1\63\1\uffff\11\63\1\uffff\12\63\1\u0097\4\63\1\u009d\6\63\1\u00a4\4\uffff\1\u00a6\1\uffff\1\63\30\uffff\2\63\1\u00b1\1\63\2\uffff\7\63\1\u00ba\1\u00bb\1\u00bc\4\63\1\u00c1\4\63\1\u00c6\5\63\1\u00ce\1\63\1\uffff\4\63\1\u00d4\1\uffff\6\63\3\uffff\1\u00db\1\u00dc\3\uffff\1\163\1\u00de\3\63\1\uffff\4\63\1\u00eb\2\63\1\u00ee\3\uffff\4\63\1\uffff\2\63\1\u00f5\1\63\1\uffff\7\63\1\uffff\2\63\1\u0100\2\63\1\uffff\1\63\1\u0104\3\63\1\u0108\10\uffff\7\63\1\u0114\1\uffff\1\63\1\u0116\1\uffff\3\63\1\u011a\2\63\1\uffff\2\63\1\u011f\1\63\1\u0121\5\63\1\uffff\1\63\1\u0128\1\u0129\1\uffff\1\u012a\1\u012b\1\u012c\2\uffff\1\u00de\1\uffff\1\u00de\7\63\1\uffff\1\63\1\uffff\2\63\1\u0138\1\uffff\1\63\1\u013a\2\63\1\uffff\1\63\1\uffff\1\63\1\u013f\1\u0140\1\63\1\u0142\1\u0143\6\uffff\6\63\1\u014b\3\63\1\uffff\1\63\1\uffff\2\63\1\u0152\1\u0153\2\uffff\1\u0154\3\uffff\3\63\1\u0158\1\63\1\u015a\1\uffff\3\63\1\u015e\1\u015f\1\u0160\3\uffff\2\63\1\u0164\1\uffff\1\63\1\uffff\1\u0166\1\u0167\1\u0168\3\uffff\1\63\1\u016a\1\u016b\1\uffff\1\u016c\3\uffff\1\u016d\4\uffff";
    static final String DFA46_eofS =
        "\u016e\uffff";
    static final String DFA46_minS =
        "\1\11\21\42\1\53\1\56\1\42\1\53\1\41\4\uffff\1\55\3\uffff\1\42\4\uffff\1\0\1\42\1\uffff\1\75\1\uffff\1\55\3\uffff\2\56\2\uffff\2\42\1\uffff\1\42\1\uffff\11\42\1\uffff\27\42\4\uffff\1\74\1\uffff\1\42\12\uffff\1\76\3\uffff\1\42\1\0\6\uffff\2\60\4\42\2\uffff\33\42\1\uffff\5\42\1\uffff\6\42\3\uffff\2\42\2\0\1\uffff\1\56\1\60\3\42\1\uffff\10\42\3\uffff\4\42\1\uffff\4\42\1\uffff\7\42\1\uffff\5\42\1\uffff\6\42\2\uffff\1\0\1\uffff\1\60\1\53\2\uffff\10\42\1\uffff\2\42\1\uffff\6\42\1\uffff\12\42\1\uffff\3\42\1\uffff\3\42\1\uffff\1\0\3\60\7\42\1\uffff\1\42\1\uffff\3\42\1\uffff\4\42\1\uffff\1\42\1\uffff\6\42\5\uffff\1\0\12\42\1\uffff\1\42\1\uffff\4\42\2\uffff\1\42\2\uffff\1\0\6\42\1\uffff\6\42\3\uffff\3\42\1\uffff\1\42\1\uffff\3\42\3\uffff\3\42\1\uffff\1\42\3\uffff\1\42\4\uffff";
    static final String DFA46_maxS =
        "\1\u2203\21\172\1\75\1\56\1\172\1\75\1\76\4\uffff\1\176\3\uffff\1\172\4\uffff\1\uffff\1\172\1\uffff\1\176\1\uffff\1\176\3\uffff\1\170\1\137\2\uffff\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff\27\172\4\uffff\1\74\1\uffff\1\172\12\uffff\1\137\3\uffff\1\165\1\uffff\6\uffff\2\71\4\172\2\uffff\33\172\1\uffff\5\172\1\uffff\6\172\3\uffff\2\172\2\uffff\1\uffff\1\137\1\146\3\172\1\uffff\10\172\3\uffff\4\172\1\uffff\4\172\1\uffff\7\172\1\uffff\5\172\1\uffff\6\172\2\uffff\1\uffff\1\uffff\2\71\2\uffff\10\172\1\uffff\2\172\1\uffff\6\172\1\uffff\12\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\uffff\1\146\1\71\1\146\7\172\1\uffff\1\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\6\172\5\uffff\1\uffff\12\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\2\uffff\1\uffff\6\172\1\uffff\6\172\3\uffff\3\172\1\uffff\1\172\1\uffff\3\172\3\uffff\3\172\1\uffff\1\172\3\uffff\1\172\4\uffff";
    static final String DFA46_acceptS =
        "\27\uffff\1\75\1\76\1\77\1\101\1\uffff\1\105\1\111\1\112\1\uffff\1\114\1\115\1\116\1\117\2\uffff\1\122\1\uffff\1\124\1\uffff\1\127\1\131\1\132\2\uffff\1\144\1\146\2\uffff\1\145\1\uffff\1\121\11\uffff\1\107\27\uffff\1\110\1\50\1\125\1\100\1\uffff\1\103\1\uffff\1\65\1\66\1\126\1\104\1\67\1\130\1\106\1\141\1\102\1\133\1\uffff\1\113\1\116\1\117\2\uffff\1\120\1\123\1\134\1\135\1\136\1\143\6\uffff\1\73\1\72\33\uffff\1\70\5\uffff\1\71\6\uffff\1\74\1\51\1\64\4\uffff\1\120\5\uffff\1\57\10\uffff\1\53\1\54\1\56\4\uffff\1\61\4\uffff\1\60\7\uffff\1\52\5\uffff\1\55\6\uffff\1\62\1\63\1\uffff\1\142\2\uffff\1\140\1\137\10\uffff\1\42\2\uffff\1\44\6\uffff\1\45\12\uffff\1\43\3\uffff\1\46\3\uffff\1\47\13\uffff\1\30\1\uffff\1\32\3\uffff\1\35\4\uffff\1\34\1\uffff\1\33\6\uffff\1\31\1\36\1\37\1\40\1\41\13\uffff\1\27\1\uffff\1\26\4\uffff\1\24\1\25\1\uffff\1\22\1\23\7\uffff\1\21\6\uffff\1\16\1\17\1\20\3\uffff\1\14\1\uffff\1\13\3\uffff\1\11\1\12\1\15\3\uffff\1\7\1\uffff\1\5\1\6\1\10\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA46_specialS =
        "\44\uffff\1\6\110\uffff\1\5\73\uffff\1\1\1\7\62\uffff\1\2\53\uffff\1\3\43\uffff\1\4\26\uffff\1\0\51\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\60\2\uffff\1\60\22\uffff\1\60\1\47\1\44\2\uffff\1\50\1\53\1\57\1\27\1\30\1\31\1\22\1\32\1\33\1\23\1\50\1\55\11\56\1\25\1\34\1\52\1\26\1\52\2\uffff\1\10\1\11\1\2\1\14\1\12\1\3\1\4\1\6\1\1\3\45\1\7\1\13\3\45\1\5\1\15\1\21\1\16\1\24\1\17\1\45\1\20\1\45\1\35\1\46\1\36\1\uffff\1\37\1\uffff\1\10\1\11\1\2\1\14\1\12\1\3\1\4\1\6\1\1\3\45\1\7\1\13\3\45\1\5\1\15\1\21\1\16\1\24\1\17\1\45\1\20\1\45\1\40\1\54\1\41\1\51\u2181\uffff\1\42\2\uffff\1\43",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\62\7\64\1\61\14\64\6\uffff\5\64\1\62\7\64\1\61\14\64",
            "\1\65\15\uffff\12\64\7\uffff\1\70\12\64\1\66\2\64\1\67\13\64\6\uffff\1\70\12\64\1\66\2\64\1\67\13\64",
            "\1\65\15\uffff\3\64\1\74\2\64\1\75\3\64\7\uffff\1\72\15\64\1\76\2\64\1\73\2\64\1\71\5\64\4\uffff\1\63\1\uffff\1\72\15\64\1\76\2\64\1\73\2\64\1\71\5\64",
            "\1\65\15\uffff\12\64\7\uffff\24\64\1\100\5\64\6\uffff\24\64\1\100\5\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\101\25\64\6\uffff\4\64\1\101\25\64",
            "\1\65\15\uffff\12\64\7\uffff\1\102\31\64\6\uffff\1\102\31\64",
            "\1\65\15\uffff\12\64\7\uffff\1\105\15\64\1\104\5\64\1\103\5\64\6\uffff\1\105\15\64\1\104\5\64\1\103\5\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\110\3\64\1\106\2\64\1\107\7\64\6\uffff\13\64\1\110\3\64\1\106\2\64\1\107\7\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\111\17\64\1\112\1\64\6\uffff\10\64\1\111\17\64\1\112\1\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\114\13\64\1\113\2\64\6\uffff\13\64\1\114\13\64\1\113\2\64",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\115\13\64\6\uffff\16\64\1\115\13\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\116\11\64\1\117\13\64\6\uffff\4\64\1\116\11\64\1\117\13\64",
            "\1\65\15\uffff\12\64\7\uffff\17\64\1\121\3\64\1\120\6\64\6\uffff\17\64\1\121\3\64\1\120\6\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\122\14\64\6\uffff\15\64\1\122\14\64",
            "\1\65\15\uffff\12\64\7\uffff\7\64\1\123\22\64\6\uffff\7\64\1\123\22\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\124\21\64\6\uffff\10\64\1\124\21\64",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\126\2\64\1\125\10\64\4\uffff\1\63\1\uffff\16\64\1\126\2\64\1\125\10\64",
            "\1\131\16\uffff\1\131\2\uffff\1\130",
            "\1\133",
            "\1\65\15\uffff\12\64\7\uffff\1\135\31\64\6\uffff\1\135\31\64",
            "\1\140\16\uffff\1\136\2\uffff\1\137",
            "\1\143\33\uffff\1\143\1\142",
            "",
            "",
            "",
            "",
            "\1\145\20\uffff\1\147\77\uffff\1\131",
            "",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\150\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "\1\65\15\uffff\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\143\100\uffff\1\143",
            "",
            "\1\131\20\uffff\1\147\77\uffff\1\160",
            "",
            "",
            "",
            "\1\165\1\uffff\12\56\45\uffff\1\164\2\uffff\1\162\25\uffff\1\161",
            "\1\165\1\uffff\12\56\45\uffff\1\164",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\171\2\64\1\167\12\64\1\166\1\64\1\170\4\64\4\uffff\1\63\1\uffff\5\64\1\171\2\64\1\167\12\64\1\166\1\64\1\170\4\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\6\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\1\174\31\64\6\uffff\1\174\31\64",
            "\1\65\15\uffff\12\64\7\uffff\14\64\1\176\1\175\14\64\6\uffff\14\64\1\176\1\175\14\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\177\7\64\6\uffff\22\64\1\177\7\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0080\14\64\6\uffff\15\64\1\u0080\14\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u0081\16\64\6\uffff\13\64\1\u0081\16\64",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\u0082\13\64\6\uffff\16\64\1\u0082\13\64",
            "\1\65\15\uffff\2\64\1\u0083\7\64\7\uffff\32\64\6\uffff\32\64",
            "\1\65\15\uffff\4\64\1\u0084\5\64\7\uffff\32\64\6\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u0085\10\64\6\uffff\21\64\1\u0085\10\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\1\u0086\31\64\6\uffff\1\u0086\31\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u0089\4\64\1\u0087\14\64\1\u008a\1\u0088\6\64\6\uffff\1\u0089\4\64\1\u0087\14\64\1\u008a\1\u0088\6\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u008d\1\64\1\u008c\4\64\1\u008b\7\64\6\uffff\13\64\1\u008d\1\64\1\u008c\4\64\1\u008b\7\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u008e\1\u008f\6\64\6\uffff\22\64\1\u008e\1\u008f\6\64",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u0090\26\64\6\uffff\3\64\1\u0090\26\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0092\4\64\1\u0091\1\64\6\uffff\23\64\1\u0092\4\64\1\u0091\1\64",
            "\1\65\15\uffff\12\64\7\uffff\17\64\1\u0093\12\64\6\uffff\17\64\1\u0093\12\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u0094\7\64\6\uffff\22\64\1\u0094\7\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u0095\16\64\6\uffff\13\64\1\u0095\16\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0096\14\64\6\uffff\15\64\1\u0096\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0098\21\64\6\uffff\10\64\1\u0098\21\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u0099\7\64\6\uffff\22\64\1\u0099\7\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u009a\7\64\6\uffff\22\64\1\u009a\7\64",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\u009c\5\64\1\u009b\16\64\6\uffff\5\64\1\u009c\5\64\1\u009b\16\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u009e\31\64\6\uffff\1\u009e\31\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u009f\25\64\6\uffff\4\64\1\u009f\25\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00a0\6\64\6\uffff\23\64\1\u00a0\6\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u00a1\21\64\6\uffff\10\64\1\u00a1\21\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00a2\25\64\6\uffff\4\64\1\u00a2\25\64",
            "\1\65\15\uffff\12\64\7\uffff\24\64\1\u00a3\5\64\6\uffff\24\64\1\u00a3\5\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u00a7\5\64\1\u00a8\10\64\6\uffff\13\64\1\u00a7\5\64\1\u00a8\10\64",
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
            "\1\147\40\uffff\1\160",
            "",
            "",
            "",
            "\1\u00a9\4\uffff\1\u00a9\64\uffff\1\u00a9\5\uffff\1\u00a9\3\uffff\1\u00a9\7\uffff\1\u00a9\3\uffff\1\u00a9\1\uffff\1\u00a9\1\u00aa",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00ac",
            "\12\u00ad",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00ae\25\64\6\uffff\4\64\1\u00ae\25\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00af\6\64\6\uffff\23\64\1\u00af\6\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u00b0\31\64\4\uffff\1\63\1\uffff\1\u00b0\31\64",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\u00b2\13\64\6\uffff\16\64\1\u00b2\13\64",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00b3\7\64\6\uffff\22\64\1\u00b3\7\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00b4\7\64\6\uffff\22\64\1\u00b4\7\64",
            "\1\65\15\uffff\12\64\7\uffff\17\64\1\u00b5\12\64\6\uffff\17\64\1\u00b5\12\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00b6\25\64\6\uffff\4\64\1\u00b6\25\64",
            "\1\65\15\uffff\12\64\7\uffff\2\64\1\u00b7\27\64\6\uffff\2\64\1\u00b7\27\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00b8\7\64\6\uffff\22\64\1\u00b8\7\64",
            "\1\65\15\uffff\12\64\7\uffff\14\64\1\u00b9\15\64\6\uffff\14\64\1\u00b9\15\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u00bd\10\64\6\uffff\21\64\1\u00bd\10\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00be\25\64\6\uffff\4\64\1\u00be\25\64",
            "\1\65\15\uffff\12\64\7\uffff\24\64\1\u00bf\5\64\6\uffff\24\64\1\u00bf\5\64",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u00c0\26\64\6\uffff\3\64\1\u00c0\26\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00c2\25\64\6\uffff\4\64\1\u00c2\25\64",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u00c3\26\64\6\uffff\3\64\1\u00c3\26\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00c4\6\64\6\uffff\23\64\1\u00c4\6\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00c5\6\64\6\uffff\23\64\1\u00c5\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00c8\3\64\1\u00c7\21\64\6\uffff\4\64\1\u00c8\3\64\1\u00c7\21\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00c9\7\64\6\uffff\22\64\1\u00c9\7\64",
            "\1\65\15\uffff\12\64\7\uffff\2\64\1\u00ca\27\64\6\uffff\2\64\1\u00ca\27\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u00cb\16\64\6\uffff\13\64\1\u00cb\16\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00cc\17\64\1\u00cd\5\64\6\uffff\4\64\1\u00cc\17\64\1\u00cd\5\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u00cf\26\64\6\uffff\3\64\1\u00cf\26\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00d0\7\64\6\uffff\22\64\1\u00d0\7\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00d1\25\64\6\uffff\4\64\1\u00d1\25\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00d2\25\64\6\uffff\4\64\1\u00d2\25\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00d3\6\64\6\uffff\23\64\1\u00d3\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00d5\6\64\6\uffff\23\64\1\u00d5\6\64",
            "\1\65\15\uffff\12\64\7\uffff\2\64\1\u00d6\27\64\6\uffff\2\64\1\u00d6\27\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u00d7\21\64\6\uffff\10\64\1\u00d7\21\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u00d8\16\64\6\uffff\13\64\1\u00d8\16\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u00d9\16\64\6\uffff\13\64\1\u00d9\16\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00da\25\64\6\uffff\4\64\1\u00da\25\64",
            "",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "\60\57\12\u00dd\7\57\6\u00dd\32\57\6\u00dd\uff99\57",
            "",
            "\1\165\1\uffff\12\u00ac\45\uffff\1\164",
            "\12\u00ad\13\uffff\1\u00e0\31\uffff\1\u00df\4\uffff\1\u00e1\1\u00e0\1\u00e2",
            "\1\65\15\uffff\12\64\7\uffff\6\64\1\u00e3\23\64\6\uffff\6\64\1\u00e3\23\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u00e4\21\64\6\uffff\10\64\1\u00e4\21\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u00e5\10\64\6\uffff\21\64\1\u00e5\10\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\u00e6\24\64\6\uffff\5\64\1\u00e6\24\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00e7\7\64\6\uffff\22\64\1\u00e7\7\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00e8\6\64\6\uffff\23\64\1\u00e8\6\64",
            "\1\65\15\uffff\12\64\7\uffff\24\64\1\u00e9\5\64\6\uffff\24\64\1\u00e9\5\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00ea\7\64\4\uffff\1\63\1\uffff\22\64\1\u00ea\7\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00ec\6\64\6\uffff\23\64\1\u00ec\6\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00ed\25\64\6\uffff\4\64\1\u00ed\25\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\1\u00ef\31\64\6\uffff\1\u00ef\31\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u00f0\10\64\6\uffff\21\64\1\u00f0\10\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u00f1\10\64\6\uffff\21\64\1\u00f1\10\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00f2\7\64\6\uffff\22\64\1\u00f2\7\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\25\64\1\u00f3\4\64\6\uffff\25\64\1\u00f3\4\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u00f4\16\64\6\uffff\13\64\1\u00f4\16\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00f6\7\64\6\uffff\22\64\1\u00f6\7\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\u00f7\24\64\6\uffff\5\64\1\u00f7\24\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u00f8\7\64\6\uffff\22\64\1\u00f8\7\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u00f9\25\64\6\uffff\4\64\1\u00f9\25\64",
            "\1\65\15\uffff\12\64\7\uffff\7\64\1\u00fa\22\64\6\uffff\7\64\1\u00fa\22\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u00fb\21\64\6\uffff\10\64\1\u00fb\21\64",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u00fc\10\64\6\uffff\21\64\1\u00fc\10\64",
            "\1\65\15\uffff\12\64\7\uffff\14\64\1\u00fd\15\64\6\uffff\14\64\1\u00fd\15\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u00fe\21\64\6\uffff\10\64\1\u00fe\21\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u00ff\6\64\6\uffff\23\64\1\u00ff\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0101\14\64\6\uffff\15\64\1\u0101\14\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u0102\31\64\6\uffff\1\u0102\31\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0103\25\64\6\uffff\4\64\1\u0103\25\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u0105\16\64\6\uffff\13\64\1\u0105\16\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0106\25\64\6\uffff\4\64\1\u0106\25\64",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u0107\26\64\6\uffff\3\64\1\u0107\26\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "\60\57\12\u0109\7\57\6\u0109\32\57\6\u0109\uff99\57",
            "",
            "\12\u010a",
            "\1\u010b\1\uffff\1\u010b\2\uffff\12\u010c",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u010d\10\64\6\uffff\21\64\1\u010d\10\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u010e\31\64\6\uffff\1\u010e\31\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u010f\21\64\6\uffff\10\64\1\u010f\21\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u0110\16\64\6\uffff\13\64\1\u0110\16\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0111\21\64\6\uffff\10\64\1\u0111\21\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u0112\31\64\6\uffff\1\u0112\31\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0113\6\64\6\uffff\23\64\1\u0113\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0115\21\64\6\uffff\10\64\1\u0115\21\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0117\14\64\6\uffff\15\64\1\u0117\14\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0118\25\64\6\uffff\4\64\1\u0118\25\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0119\14\64\6\uffff\15\64\1\u0119\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u011b\25\64\6\uffff\4\64\1\u011b\25\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u011c\25\64\6\uffff\4\64\1\u011c\25\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u011d\25\64\6\uffff\4\64\1\u011d\25\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u011e\21\64\6\uffff\10\64\1\u011e\21\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0120\14\64\6\uffff\15\64\1\u0120\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0122\25\64\6\uffff\4\64\1\u0122\25\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0123\6\64\6\uffff\23\64\1\u0123\6\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0124\25\64\6\uffff\4\64\1\u0124\25\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0125\14\64\6\uffff\15\64\1\u0125\14\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u0126\7\64\6\uffff\22\64\1\u0126\7\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u0127\26\64\6\uffff\3\64\1\u0127\26\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\60\57\12\u012d\7\57\6\u012d\32\57\6\u012d\uff99\57",
            "\12\u010a\13\uffff\1\u00e0\31\uffff\1\u00df\4\uffff\1\u00e1\1\u00e0\1\u00e2",
            "\12\u010c",
            "\12\u010c\52\uffff\1\u00e1\1\uffff\1\u00e2",
            "\1\65\15\uffff\12\64\7\uffff\1\u012e\31\64\6\uffff\1\u012e\31\64",
            "\1\65\15\uffff\12\64\7\uffff\13\64\1\u012f\16\64\6\uffff\13\64\1\u012f\16\64",
            "\1\65\15\uffff\12\64\7\uffff\1\u0130\31\64\6\uffff\1\u0130\31\64",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\u0131\13\64\6\uffff\16\64\1\u0131\13\64",
            "\1\65\15\uffff\12\64\7\uffff\5\64\1\u0132\24\64\6\uffff\5\64\1\u0132\24\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0133\14\64\6\uffff\15\64\1\u0133\14\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0134\25\64\6\uffff\4\64\1\u0134\25\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\u0135\13\64\6\uffff\16\64\1\u0135\13\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0136\6\64\6\uffff\23\64\1\u0136\6\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0137\14\64\6\uffff\15\64\1\u0137\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0139\14\64\6\uffff\15\64\1\u0139\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u013b\14\64\6\uffff\15\64\1\u013b\14\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u013c\25\64\6\uffff\4\64\1\u013c\25\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u013d\26\64\6\uffff\3\64\1\u013d\26\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u013e\7\64\6\uffff\22\64\1\u013e\7\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\6\64\1\u0141\23\64\6\uffff\6\64\1\u0141\23\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "\60\57\12\u0144\7\57\6\u0144\32\57\6\u0144\uff99\57",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0145\6\64\6\uffff\23\64\1\u0145\6\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0146\21\64\6\uffff\10\64\1\u0146\21\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0147\14\64\6\uffff\15\64\1\u0147\14\64",
            "\1\65\15\uffff\12\64\7\uffff\26\64\1\u0148\3\64\6\uffff\26\64\1\u0148\3\64",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0149\21\64\6\uffff\10\64\1\u0149\21\64",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u014a\6\64\6\uffff\23\64\1\u014a\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u014c\14\64\6\uffff\15\64\1\u014c\14\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u014d\25\64\6\uffff\4\64\1\u014d\25\64",
            "\1\65\15\uffff\12\64\7\uffff\2\64\1\u014e\27\64\6\uffff\2\64\1\u014e\27\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u014f\6\64\6\uffff\23\64\1\u014f\6\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\3\64\1\u0150\26\64\6\uffff\3\64\1\u0150\26\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u0151\7\64\6\uffff\22\64\1\u0151\7\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "\1\65\15\uffff\12\64\7\uffff\10\64\1\u0155\21\64\6\uffff\10\64\1\u0155\21\64",
            "\1\65\15\uffff\12\64\7\uffff\31\64\1\u0156\6\uffff\31\64\1\u0156",
            "\1\65\15\uffff\12\64\7\uffff\23\64\1\u0157\6\64\6\uffff\23\64\1\u0157\6\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0159\25\64\6\uffff\4\64\1\u0159\25\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u015b\7\64\6\uffff\22\64\1\u015b\7\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u015c\25\64\6\uffff\4\64\1\u015c\25\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u015d\25\64\6\uffff\4\64\1\u015d\25\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\16\64\1\u0161\13\64\6\uffff\16\64\1\u0161\13\64",
            "\1\65\15\uffff\12\64\7\uffff\4\64\1\u0162\25\64\6\uffff\4\64\1\u0162\25\64",
            "\1\65\15\uffff\12\64\7\uffff\22\64\1\u0163\7\64\4\uffff\1\63\1\uffff\22\64\1\u0163\7\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\21\64\1\u0165\10\64\6\uffff\21\64\1\u0165\10\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\15\64\1\u0169\14\64\6\uffff\15\64\1\u0169\14\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            "\1\65\15\uffff\12\64\7\uffff\32\64\4\uffff\1\63\1\uffff\32\64",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | Exists | NoSend | Assert | Assume | Handle | Return | Cases | Delta | False | Match | Modes | Reads | State | Until | While | Yield | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | All | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_SLI | RULE_QUANTIFIER_OP | RULE_NOT | RULE_MULTIPLICATIVE_OP | RULE_SLANG_OP | RULE_COLON_OP | RULE_LT_GT_OPS | RULE_EQUAL_NOT_OPS | RULE_AND_OPS | RULE_OR_OPS | RULE_IMPLIES | RULE_SIMPLIES | RULE_HEX | RULE_BIN | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_324 = input.LA(1);

                        s = -1;
                        if ( (LA46_324=='\"') ) {s = 110;}

                        else if ( (LA46_324=='\\') ) {s = 108;}

                        else if ( ((LA46_324>='\u0000' && LA46_324<='!')||(LA46_324>='#' && LA46_324<='[')||(LA46_324>=']' && LA46_324<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_169 = input.LA(1);

                        s = -1;
                        if ( (LA46_169=='\"') ) {s = 110;}

                        else if ( (LA46_169=='\\') ) {s = 108;}

                        else if ( ((LA46_169>='\u0000' && LA46_169<='!')||(LA46_169>='#' && LA46_169<='[')||(LA46_169>=']' && LA46_169<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_221 = input.LA(1);

                        s = -1;
                        if ( ((LA46_221>='0' && LA46_221<='9')||(LA46_221>='A' && LA46_221<='F')||(LA46_221>='a' && LA46_221<='f')) ) {s = 265;}

                        else if ( ((LA46_221>='\u0000' && LA46_221<='/')||(LA46_221>=':' && LA46_221<='@')||(LA46_221>='G' && LA46_221<='`')||(LA46_221>='g' && LA46_221<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_265 = input.LA(1);

                        s = -1;
                        if ( ((LA46_265>='0' && LA46_265<='9')||(LA46_265>='A' && LA46_265<='F')||(LA46_265>='a' && LA46_265<='f')) ) {s = 301;}

                        else if ( ((LA46_265>='\u0000' && LA46_265<='/')||(LA46_265>=':' && LA46_265<='@')||(LA46_265>='G' && LA46_265<='`')||(LA46_265>='g' && LA46_265<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_301 = input.LA(1);

                        s = -1;
                        if ( ((LA46_301>='0' && LA46_301<='9')||(LA46_301>='A' && LA46_301<='F')||(LA46_301>='a' && LA46_301<='f')) ) {s = 324;}

                        else if ( ((LA46_301>='\u0000' && LA46_301<='/')||(LA46_301>=':' && LA46_301<='@')||(LA46_301>='G' && LA46_301<='`')||(LA46_301>='g' && LA46_301<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_109 = input.LA(1);

                        s = -1;
                        if ( (LA46_109=='\"') ) {s = 110;}

                        else if ( (LA46_109=='\\') ) {s = 108;}

                        else if ( ((LA46_109>='\u0000' && LA46_109<='!')||(LA46_109>='#' && LA46_109<='[')||(LA46_109>=']' && LA46_109<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_36 = input.LA(1);

                        s = -1;
                        if ( (LA46_36=='\\') ) {s = 108;}

                        else if ( ((LA46_36>='\u0000' && LA46_36<='!')||(LA46_36>='#' && LA46_36<='[')||(LA46_36>=']' && LA46_36<='\uFFFF')) ) {s = 109;}

                        else if ( (LA46_36=='\"') ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_170 = input.LA(1);

                        s = -1;
                        if ( ((LA46_170>='0' && LA46_170<='9')||(LA46_170>='A' && LA46_170<='F')||(LA46_170>='a' && LA46_170<='f')) ) {s = 221;}

                        else if ( ((LA46_170>='\u0000' && LA46_170<='/')||(LA46_170>=':' && LA46_170<='@')||(LA46_170>='G' && LA46_170<='`')||(LA46_170>='g' && LA46_170<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}