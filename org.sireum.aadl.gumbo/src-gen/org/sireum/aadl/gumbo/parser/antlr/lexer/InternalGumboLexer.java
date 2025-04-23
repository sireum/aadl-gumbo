package org.sireum.aadl.gumbo.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int Val=52;
    public static final int RULE_HEX=97;
    public static final int EqualsSignGreaterThanSign=57;
    public static final int Var=53;
    public static final int False=29;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=22;
    public static final int PlusSignEqualsSignGreaterThanSign=43;
    public static final int LeftParenthesis=63;
    public static final int RULE_MULTIPLICATIVE_OP=87;
    public static final int RULE_BIN=98;
    public static final int RULE_ESC_SEQ=82;
    public static final int F32=45;
    public static final int RULE_ID=112;
    public static final int RULE_DIGIT=103;
    public static final int Handle=24;
    public static final int ColonColon=55;
    public static final int RULE_F64_LIT=101;
    public static final int Some=26;
    public static final int PlusSign=66;
    public static final int LeftSquareBracket=75;
    public static final int If=60;
    public static final int Halt=40;
    public static final int RULE_EQUAL_NOT_OPS=91;
    public static final int F=73;
    public static final int ThereExists=81;
    public static final int RULE_REAL_LIT=99;
    public static final int Classifier=5;
    public static final int RULE_OR_OPS=93;
    public static final int Case=37;
    public static final int Comma=67;
    public static final int HyphenMinus=68;
    public static final int NoSend=21;
    public static final int T=74;
    public static final int Guarantee=9;
    public static final int RightCurlyBracket=79;
    public static final int Modes=31;
    public static final int FullStop=69;
    public static final int RULE_SIMPLIES=95;
    public static final int Reference=11;
    public static final int RULE_IMPLIES=94;
    public static final int RULE_UNICODE_ESC=105;
    public static final int Functions=8;
    public static final int KW__=77;
    public static final int Semicolon=71;
    public static final int RULE_LETTER=102;
    public static final int RULE_EXPONENT=107;
    public static final int Delta=28;
    public static final int RULE_SLI=85;
    public static final int By=58;
    public static final int Else=38;
    public static final int RULE_EXTENDED_DIGIT=96;
    public static final int Yield=35;
    public static final int RULE_STRING_VALUE=83;
    public static final int All=36;
    public static final int Infoflow=15;
    public static final int Res=51;
    public static final int F64=46;
    public static final int True=42;
    public static final int RULE_INT_EXPONENT=108;
    public static final int HasEvent=12;
    public static final int RULE_LT_GT_OPS=90;
    public static final int In_1=61;
    public static final int FullStopFullStop=54;
    public static final int RULE_F32_LIT=100;
    public static final int To=62;
    public static final int Applies=18;
    public static final int RULE_BASED_INTEGER=109;
    public static final int RightSquareBracket=76;
    public static final int Binding=19;
    public static final int RULE_MSPI=104;
    public static final int For=48;
    public static final int RightParenthesis=64;
    public static final int Do=59;
    public static final int ColonEqualsSign=56;
    public static final int Mut=50;
    public static final int State=33;
    public static final int Assume=23;
    public static final int RULE_SLANG_OP=88;
    public static final int RULE_INTEGER_LIT=110;
    public static final int Invariant=10;
    public static final int Constant=14;
    public static final int RULE_STRING=111;
    public static final int RULE_NOT=86;
    public static final int Match=30;
    public static final int Reads=32;
    public static final int RULE_SL_COMMENT=106;
    public static final int Inv=49;
    public static final int EqualsSign=72;
    public static final int Modifies=16;
    public static final int RULE_AND_OPS=92;
    public static final int Colon=70;
    public static final int EOF=-1;
    public static final int Asterisk=65;
    public static final int Integration=4;
    public static final int Return=25;
    public static final int Def=47;
    public static final int RULE_WS=113;
    public static final int LeftCurlyBracket=78;
    public static final int MustSend=13;
    public static final int While=34;
    public static final int From=39;
    public static final int FullStopFullStopLessThanSign=44;
    public static final int RULE_IDF=84;
    public static final int Compute=20;
    public static final int RULE_COLON_OP=89;
    public static final int MaySend=17;
    public static final int Spec=41;
    public static final int ForAll=80;
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

    // $ANTLR start "NoSend"
    public final void mNoSend() throws RecognitionException {
        try {
            int _type = NoSend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:58:8: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:58:10: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:60:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:60:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:62:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:62:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:64:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:64:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:66:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:66:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
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

    // $ANTLR start "Some"
    public final void mSome() throws RecognitionException {
        try {
            int _type = Some;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:68:6: ( '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:68:8: '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            match('\\'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "Some"

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

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:84:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:84:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:86:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:86:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:88:5: ( '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:88:7: '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            match('\\'); 
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

    // $ANTLR start "F32"
    public final void mF32() throws RecognitionException {
        try {
            int _type = F32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:106:5: ( ( 'F' | 'f' ) '3' '2' )
            // InternalGumboLexer.g:106:7: ( 'F' | 'f' ) '3' '2'
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
            // InternalGumboLexer.g:108:5: ( ( 'F' | 'f' ) '6' '4' )
            // InternalGumboLexer.g:108:7: ( 'F' | 'f' ) '6' '4'
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
            // InternalGumboLexer.g:110:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:110:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:112:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:112:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:114:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) )
            // InternalGumboLexer.g:114:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' )
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
            // InternalGumboLexer.g:116:5: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:116:7: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:118:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:118:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:120:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:120:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:122:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:122:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:124:18: ( '.' '.' )
            // InternalGumboLexer.g:124:20: '.' '.'
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
            // InternalGumboLexer.g:126:12: ( ':' ':' )
            // InternalGumboLexer.g:126:14: ':' ':'
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
            // InternalGumboLexer.g:128:17: ( ':' '=' )
            // InternalGumboLexer.g:128:19: ':' '='
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
            // InternalGumboLexer.g:130:27: ( '=' '>' )
            // InternalGumboLexer.g:130:29: '=' '>'
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
            // InternalGumboLexer.g:132:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:132:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
            // InternalGumboLexer.g:134:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:134:6: ( 'D' | 'd' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:136:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:136:6: ( 'I' | 'i' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:138:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:138:8: ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:140:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:140:6: ( 'T' | 't' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:142:17: ( '(' )
            // InternalGumboLexer.g:142:19: '('
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
            // InternalGumboLexer.g:144:18: ( ')' )
            // InternalGumboLexer.g:144:20: ')'
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
            // InternalGumboLexer.g:146:10: ( '*' )
            // InternalGumboLexer.g:146:12: '*'
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
            // InternalGumboLexer.g:148:10: ( '+' )
            // InternalGumboLexer.g:148:12: '+'
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
            // InternalGumboLexer.g:150:7: ( ',' )
            // InternalGumboLexer.g:150:9: ','
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
            // InternalGumboLexer.g:152:13: ( '-' )
            // InternalGumboLexer.g:152:15: '-'
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
            // InternalGumboLexer.g:154:10: ( '.' )
            // InternalGumboLexer.g:154:12: '.'
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
            // InternalGumboLexer.g:156:7: ( ':' )
            // InternalGumboLexer.g:156:9: ':'
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
            // InternalGumboLexer.g:158:11: ( ';' )
            // InternalGumboLexer.g:158:13: ';'
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
            // InternalGumboLexer.g:160:12: ( '=' )
            // InternalGumboLexer.g:160:14: '='
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
            // InternalGumboLexer.g:162:3: ( ( 'F' | 'f' ) )
            // InternalGumboLexer.g:162:5: ( 'F' | 'f' )
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
            // InternalGumboLexer.g:164:3: ( ( 'T' | 't' ) )
            // InternalGumboLexer.g:164:5: ( 'T' | 't' )
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
            // InternalGumboLexer.g:166:19: ( '[' )
            // InternalGumboLexer.g:166:21: '['
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
            // InternalGumboLexer.g:168:20: ( ']' )
            // InternalGumboLexer.g:168:22: ']'
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
            // InternalGumboLexer.g:170:6: ( '_' )
            // InternalGumboLexer.g:170:8: '_'
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
            // InternalGumboLexer.g:172:18: ( '{' )
            // InternalGumboLexer.g:172:20: '{'
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
            // InternalGumboLexer.g:174:19: ( '}' )
            // InternalGumboLexer.g:174:21: '}'
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
            // InternalGumboLexer.g:176:8: ( '\\u2200' )
            // InternalGumboLexer.g:176:10: '\\u2200'
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
            // InternalGumboLexer.g:178:13: ( '\\u2203' )
            // InternalGumboLexer.g:178:15: '\\u2203'
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
            // InternalGumboLexer.g:180:19: ( '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:180:21: '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGumboLexer.g:180:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGumboLexer.g:180:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:180:39: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalGumboLexer.g:182:10: ( RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:182:12: RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            // InternalGumboLexer.g:182:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
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

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:184:10: ( '!' )
            // InternalGumboLexer.g:184:12: '!'
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
            // InternalGumboLexer.g:186:24: ( ( '/' | '%' ) )
            // InternalGumboLexer.g:186:26: ( '/' | '%' )
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
            // InternalGumboLexer.g:188:15: ( ( '+:' | '++' | '-~' | '~-' ) )
            // InternalGumboLexer.g:188:17: ( '+:' | '++' | '-~' | '~-' )
            {
            // InternalGumboLexer.g:188:17: ( '+:' | '++' | '-~' | '~-' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==':') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='+') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case '-':
                {
                alt3=3;
                }
                break;
            case '~':
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
                    // InternalGumboLexer.g:188:18: '+:'
                    {
                    match("+:"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:188:23: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:188:28: '-~'
                    {
                    match("-~"); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:188:33: '~-'
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
            // InternalGumboLexer.g:190:15: ( ':+' )
            // InternalGumboLexer.g:190:17: ':+'
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
            // InternalGumboLexer.g:192:16: ( ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' ) )
            // InternalGumboLexer.g:192:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )
            {
            // InternalGumboLexer.g:192:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGumboLexer.g:192:19: '<<<'
                    {
                    match("<<<"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:192:25: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:192:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:192:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // InternalGumboLexer.g:192:39: '>>>'
                    {
                    match(">>>"); 


                    }
                    break;
                case 6 :
                    // InternalGumboLexer.g:192:45: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 7 :
                    // InternalGumboLexer.g:192:50: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 8 :
                    // InternalGumboLexer.g:192:55: '>'
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
            // InternalGumboLexer.g:194:20: ( ( '=!=' | '===' | '==' | '!=' | '!~' ) )
            // InternalGumboLexer.g:194:22: ( '=!=' | '===' | '==' | '!=' | '!~' )
            {
            // InternalGumboLexer.g:194:22: ( '=!=' | '===' | '==' | '!=' | '!~' )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='=') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='!') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='=') ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4=='=') ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0=='!') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='=') ) {
                    alt5=4;
                }
                else if ( (LA5_2=='~') ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboLexer.g:194:23: '=!='
                    {
                    match("=!="); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:194:29: '==='
                    {
                    match("==="); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:194:35: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // InternalGumboLexer.g:194:40: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 5 :
                    // InternalGumboLexer.g:194:45: '!~'
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
            // InternalGumboLexer.g:196:14: ( ( '&&' | '&' ) )
            // InternalGumboLexer.g:196:16: ( '&&' | '&' )
            {
            // InternalGumboLexer.g:196:16: ( '&&' | '&' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='&') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='&') ) {
                    alt6=1;
                }
                else {
                    alt6=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboLexer.g:196:17: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:196:22: '&'
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
            // InternalGumboLexer.g:198:13: ( ( '|^' | '||' | '|' ) )
            // InternalGumboLexer.g:198:15: ( '|^' | '||' | '|' )
            {
            // InternalGumboLexer.g:198:15: ( '|^' | '||' | '|' )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='|') ) {
                switch ( input.LA(2) ) {
                case '^':
                    {
                    alt7=1;
                    }
                    break;
                case '|':
                    {
                    alt7=2;
                    }
                    break;
                default:
                    alt7=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGumboLexer.g:198:16: '|^'
                    {
                    match("|^"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:198:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:198:26: '|'
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
            // InternalGumboLexer.g:200:14: ( ( '__' | '-' | '~' ) '>' ':' )
            // InternalGumboLexer.g:200:16: ( '__' | '-' | '~' ) '>' ':'
            {
            // InternalGumboLexer.g:200:16: ( '__' | '-' | '~' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '_':
                {
                alt8=1;
                }
                break;
            case '-':
                {
                alt8=2;
                }
                break;
            case '~':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGumboLexer.g:200:17: '__'
                    {
                    match("__"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:200:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:200:26: '~'
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
            // InternalGumboLexer.g:202:15: ( ( '___' | '~~' ) '>' ':' )
            // InternalGumboLexer.g:202:17: ( '___' | '~~' ) '>' ':'
            {
            // InternalGumboLexer.g:202:17: ( '___' | '~~' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='_') ) {
                alt9=1;
            }
            else if ( (LA9_0=='~') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGumboLexer.g:202:18: '___'
                    {
                    match("___"); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:202:24: '~~'
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
            // InternalGumboLexer.g:204:10: ( '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:204:12: '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )?
            {
            match("0x"); 

            // InternalGumboLexer.g:204:17: ( RULE_EXTENDED_DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||(LA10_0>='a' && LA10_0<='f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumboLexer.g:204:17: RULE_EXTENDED_DIGIT
            	    {
            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalGumboLexer.g:204:38: ( '.' RULE_IDF )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGumboLexer.g:204:39: '.' RULE_IDF
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
            // InternalGumboLexer.g:206:10: ( '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:206:12: '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )?
            {
            match("0b"); 

            // InternalGumboLexer.g:206:17: ( '0' | '1' | '_' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='1')||LA12_0=='_') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalGumboLexer.g:206:32: ( '.' RULE_IDF )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='.') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumboLexer.g:206:33: '.' RULE_IDF
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
            // InternalGumboLexer.g:208:14: ( RULE_REAL_LIT 'f' )
            // InternalGumboLexer.g:208:16: RULE_REAL_LIT 'f'
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
            // InternalGumboLexer.g:210:14: ( RULE_REAL_LIT 'd' )
            // InternalGumboLexer.g:210:16: RULE_REAL_LIT 'd'
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
            // InternalGumboLexer.g:212:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:212:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:212:39: ( RULE_LETTER | RULE_DIGIT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
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
            // InternalGumboLexer.g:214:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:214:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:214:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='\u0000' && LA15_0<='!')||LA15_0=='#'||(LA15_0>='%' && LA15_0<='\uFFFF')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='$') ) {
                alt15=2;
            }
            else if ( (LA15_0=='\"') ) {
                int LA15_3 = input.LA(2);

                if ( ((LA15_3>='\u0000' && LA15_3<='!')||(LA15_3>='#' && LA15_3<='\uFFFF')) ) {
                    alt15=3;
                }
                else if ( (LA15_3=='\"') ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGumboLexer.g:214:23: ~ ( ( '\"' | '$' ) )
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
                    // InternalGumboLexer.g:214:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:214:41: '\"' ~ ( '\"' )
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
                    // InternalGumboLexer.g:214:52: '\"\"' ~ ( '\"' )
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
            // InternalGumboLexer.g:216:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:216:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalGumboLexer.g:218:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:218:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:218:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='\"'||LA16_1=='\''||LA16_1=='\\'||LA16_1=='b'||LA16_1=='f'||LA16_1=='n'||LA16_1=='r'||LA16_1=='t') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='u') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

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
                    // InternalGumboLexer.g:218:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // InternalGumboLexer.g:218:67: RULE_UNICODE_ESC
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
            // InternalGumboLexer.g:220:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:220:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
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
            // InternalGumboLexer.g:222:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:222:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:222:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboLexer.g:222:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalGumboLexer.g:222:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboLexer.g:222:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:222:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGumboLexer.g:222:41: '\\r'
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
            // InternalGumboLexer.g:224:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:224:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:224:36: ( '+' | '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='+'||LA20_0=='-') ) {
                alt20=1;
            }
            switch (alt20) {
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

            // InternalGumboLexer.g:224:47: ( RULE_DIGIT )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGumboLexer.g:224:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalGumboLexer.g:226:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:226:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:226:40: ( '+' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumboLexer.g:226:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:226:45: ( RULE_DIGIT )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGumboLexer.g:226:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // InternalGumboLexer.g:228:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:228:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:228:17: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:228:17: RULE_DIGIT
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

            // InternalGumboLexer.g:228:29: ( '_' ( RULE_DIGIT )+ )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='_') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGumboLexer.g:228:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:228:34: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:228:34: RULE_DIGIT
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


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match('.'); 
            // InternalGumboLexer.g:228:52: ( RULE_DIGIT )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboLexer.g:228:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalGumboLexer.g:228:64: ( '_' ( RULE_DIGIT )+ )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='_') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGumboLexer.g:228:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:228:69: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:228:69: RULE_DIGIT
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


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalGumboLexer.g:228:83: ( RULE_EXPONENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='E'||LA30_0=='e') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboLexer.g:228:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:230:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:230:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:230:20: ( RULE_DIGIT )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGumboLexer.g:230:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // InternalGumboLexer.g:230:32: ( '_' ( RULE_DIGIT )+ )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGumboLexer.g:230:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:230:37: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:230:37: RULE_DIGIT
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


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalGumboLexer.g:230:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='#') ) {
                alt36=1;
            }
            else {
                alt36=2;}
            switch (alt36) {
                case 1 :
                    // InternalGumboLexer.g:230:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:230:79: ( RULE_INT_EXPONENT )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='E'||LA34_0=='e') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalGumboLexer.g:230:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:230:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:230:98: ( RULE_INT_EXPONENT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='E'||LA35_0=='e') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGumboLexer.g:230:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:232:21: ( '0' .. '9' )
            // InternalGumboLexer.g:232:23: '0' .. '9'
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
            // InternalGumboLexer.g:234:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:234:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:236:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:236:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:236:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='F')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='f')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGumboLexer.g:236:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:236:52: ( '_' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0=='_') ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalGumboLexer.g:236:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // InternalGumboLexer.g:238:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:238:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:238:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\"') ) {
                alt41=1;
            }
            else if ( (LA41_0=='\'') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboLexer.g:238:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:238:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\\') ) {
                            alt39=1;
                        }
                        else if ( ((LA39_0>='\u0000' && LA39_0<='!')||(LA39_0>='#' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalGumboLexer.g:238:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:238:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop39;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:238:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:238:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='&')||(LA40_0>='(' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGumboLexer.g:238:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:238:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop40;
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
            // InternalGumboLexer.g:240:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:240:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:240:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='0' && LA43_0<='9')||(LA43_0>='A' && LA43_0<='Z')||LA43_0=='_'||(LA43_0>='a' && LA43_0<='z')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGumboLexer.g:240:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:240:32: ( '_' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0=='_') ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalGumboLexer.g:240:32: '_'
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
            	    break loop43;
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
            // InternalGumboLexer.g:242:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\t' && LA44_0<='\n')||LA44_0=='\r'||LA44_0==' ') ) {
                    alt44=1;
                }


                switch (alt44) {
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | NoSend | Assert | Assume | Handle | Return | Some | Cases | Delta | False | Match | Modes | Reads | State | While | Yield | All | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_SLI | RULE_NOT | RULE_MULTIPLICATIVE_OP | RULE_SLANG_OP | RULE_COLON_OP | RULE_LT_GT_OPS | RULE_EQUAL_NOT_OPS | RULE_AND_OPS | RULE_OR_OPS | RULE_IMPLIES | RULE_SIMPLIES | RULE_HEX | RULE_BIN | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt45=100;
        alt45 = dfa45.predict(input);
        switch (alt45) {
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
                // InternalGumboLexer.g:1:172: NoSend
                {
                mNoSend(); 

                }
                break;
            case 19 :
                // InternalGumboLexer.g:1:179: Assert
                {
                mAssert(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:186: Assume
                {
                mAssume(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:193: Handle
                {
                mHandle(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:200: Return
                {
                mReturn(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:207: Some
                {
                mSome(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:212: Cases
                {
                mCases(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:218: Delta
                {
                mDelta(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:224: False
                {
                mFalse(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:230: Match
                {
                mMatch(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:236: Modes
                {
                mModes(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:242: Reads
                {
                mReads(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:248: State
                {
                mState(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:254: While
                {
                mWhile(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:260: Yield
                {
                mYield(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:266: All
                {
                mAll(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:270: Case
                {
                mCase(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:275: Else
                {
                mElse(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:280: From
                {
                mFrom(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:285: Halt
                {
                mHalt(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:290: Spec
                {
                mSpec(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:295: True
                {
                mTrue(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:300: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:334: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:363: F32
                {
                mF32(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:367: F64
                {
                mF64(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:371: Def
                {
                mDef(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:375: For
                {
                mFor(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:379: Inv
                {
                mInv(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:383: Mut
                {
                mMut(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:387: Res
                {
                mRes(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:391: Val
                {
                mVal(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:395: Var
                {
                mVar(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:399: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:416: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:427: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:443: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:469: By
                {
                mBy(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:472: Do
                {
                mDo(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:475: If
                {
                mIf(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:478: In_1
                {
                mIn_1(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:483: To
                {
                mTo(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:486: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:502: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:519: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:528: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:537: Comma
                {
                mComma(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:543: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:555: FullStop
                {
                mFullStop(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:564: Colon
                {
                mColon(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:570: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:580: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:591: F
                {
                mF(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:593: T
                {
                mT(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:595: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:613: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:632: KW__
                {
                mKW__(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:637: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:654: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:672: ForAll
                {
                mForAll(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:679: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:691: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:709: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:718: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:727: RULE_MULTIPLICATIVE_OP
                {
                mRULE_MULTIPLICATIVE_OP(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:750: RULE_SLANG_OP
                {
                mRULE_SLANG_OP(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:764: RULE_COLON_OP
                {
                mRULE_COLON_OP(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:778: RULE_LT_GT_OPS
                {
                mRULE_LT_GT_OPS(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:793: RULE_EQUAL_NOT_OPS
                {
                mRULE_EQUAL_NOT_OPS(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:812: RULE_AND_OPS
                {
                mRULE_AND_OPS(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:825: RULE_OR_OPS
                {
                mRULE_OR_OPS(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:837: RULE_IMPLIES
                {
                mRULE_IMPLIES(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:850: RULE_SIMPLIES
                {
                mRULE_SIMPLIES(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:864: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:873: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:882: RULE_F32_LIT
                {
                mRULE_F32_LIT(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:895: RULE_F64_LIT
                {
                mRULE_F64_LIT(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:908: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:924: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 97 :
                // InternalGumboLexer.g:1:938: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 98 :
                // InternalGumboLexer.g:1:955: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 99 :
                // InternalGumboLexer.g:1:967: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 100 :
                // InternalGumboLexer.g:1:975: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA4_eotS =
        "\1\uffff\1\5\1\10\1\12\2\uffff\1\14\6\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\2\74\1\75\1\74\2\uffff\1\76\6\uffff";
    static final String DFA4_maxS =
        "\1\76\1\75\1\76\1\74\2\uffff\1\76\6\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\7\1\10\1\1\1\2\1\5\1\6";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = DFA4_transitionS_.DFA4_transitionS;
    private static final class DFA4_transitionS_ {
        static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    static class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "192:18: ( '<<<' | '<<' | '<=' | '<' | '>>>' | '>>' | '>=' | '>' )";
        }
    }
    static final String DFA45_eotS =
        "\1\uffff\2\62\1\76\7\62\1\uffff\5\62\1\125\1\130\1\132\1\62\1\137\1\142\4\uffff\1\144\3\uffff\1\147\5\uffff\1\62\1\153\5\uffff\2\157\2\uffff\1\166\1\167\1\uffff\1\62\1\uffff\11\62\1\uffff\11\62\1\u0092\1\62\2\uffff\1\62\1\u0096\6\62\1\u009d\4\uffff\1\u009f\1\uffff\1\62\26\uffff\2\62\1\u00aa\1\62\2\uffff\7\62\1\u00b3\1\u00b4\1\u00b5\4\62\1\u00ba\4\62\1\u00bf\6\62\1\uffff\2\62\1\u00ca\1\uffff\6\62\3\uffff\1\u00d1\1\u00d2\3\uffff\1\157\1\u00d4\3\62\1\uffff\4\62\1\u00e1\2\62\1\u00e4\3\uffff\4\62\1\uffff\2\62\1\u00eb\1\62\1\uffff\12\62\1\uffff\1\62\1\u00f8\2\62\1\u00fb\1\u00fc\10\uffff\7\62\1\u0108\1\uffff\1\62\1\u010a\1\uffff\3\62\1\u010e\2\62\1\uffff\2\62\1\u0113\1\62\1\u0115\5\62\1\u011b\1\u011c\1\uffff\1\u011d\1\u011e\3\uffff\1\u00d4\1\uffff\1\u00d4\7\62\1\uffff\1\62\1\uffff\2\62\1\u012a\1\uffff\1\62\1\u012c\2\62\1\uffff\1\62\1\uffff\1\62\1\u0131\1\u0132\1\62\1\u0134\5\uffff\6\62\1\u013c\3\62\1\uffff\1\62\1\uffff\2\62\1\u0143\1\u0144\2\uffff\1\u0145\2\uffff\3\62\1\u0149\1\62\1\u014b\1\uffff\3\62\1\u014f\1\u0150\1\u0151\3\uffff\2\62\1\u0155\1\uffff\1\62\1\uffff\1\u0157\1\u0158\1\u0159\3\uffff\1\62\1\u015b\1\u015c\1\uffff\1\u015d\3\uffff\1\u015e\4\uffff";
    static final String DFA45_eofS =
        "\u015f\uffff";
    static final String DFA45_minS =
        "\1\11\12\42\1\101\6\42\1\53\1\56\1\42\1\53\1\41\4\uffff\1\55\3\uffff\1\42\4\uffff\1\0\1\42\1\75\1\uffff\1\55\3\uffff\2\56\2\uffff\2\42\1\uffff\1\42\1\uffff\11\42\1\uffff\13\42\2\uffff\11\42\4\uffff\1\74\1\uffff\1\42\12\uffff\1\76\1\uffff\1\42\1\0\6\uffff\2\60\4\42\2\uffff\32\42\1\uffff\3\42\1\uffff\6\42\3\uffff\2\42\2\0\1\uffff\1\56\1\60\3\42\1\uffff\10\42\3\uffff\4\42\1\uffff\4\42\1\uffff\12\42\1\uffff\6\42\2\uffff\1\0\1\uffff\1\60\1\53\2\uffff\10\42\1\uffff\2\42\1\uffff\6\42\1\uffff\14\42\1\uffff\2\42\2\uffff\1\0\3\60\7\42\1\uffff\1\42\1\uffff\3\42\1\uffff\4\42\1\uffff\1\42\1\uffff\5\42\4\uffff\1\0\12\42\1\uffff\1\42\1\uffff\4\42\2\uffff\1\42\1\uffff\1\0\6\42\1\uffff\6\42\3\uffff\3\42\1\uffff\1\42\1\uffff\3\42\3\uffff\3\42\1\uffff\1\42\3\uffff\1\42\4\uffff";
    static final String DFA45_maxS =
        "\1\u2203\12\172\1\163\6\172\1\75\1\56\1\172\1\75\1\76\4\uffff\1\176\3\uffff\1\172\4\uffff\1\uffff\1\172\1\176\1\uffff\1\176\3\uffff\1\170\1\137\2\uffff\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff\13\172\2\uffff\11\172\4\uffff\1\74\1\uffff\1\172\12\uffff\1\137\1\uffff\1\165\1\uffff\6\uffff\2\71\4\172\2\uffff\32\172\1\uffff\3\172\1\uffff\6\172\3\uffff\2\172\2\uffff\1\uffff\1\137\1\146\3\172\1\uffff\10\172\3\uffff\4\172\1\uffff\4\172\1\uffff\12\172\1\uffff\6\172\2\uffff\1\uffff\1\uffff\2\71\2\uffff\10\172\1\uffff\2\172\1\uffff\6\172\1\uffff\14\172\1\uffff\2\172\2\uffff\1\uffff\1\146\1\71\1\146\7\172\1\uffff\1\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\5\172\4\uffff\1\uffff\12\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\1\uffff\1\uffff\6\172\1\uffff\6\172\3\uffff\3\172\1\uffff\1\172\1\uffff\3\172\3\uffff\3\172\1\uffff\1\172\3\uffff\1\172\4\uffff";
    static final String DFA45_acceptS =
        "\27\uffff\1\74\1\75\1\76\1\100\1\uffff\1\104\1\110\1\111\1\uffff\1\113\1\114\1\115\1\116\3\uffff\1\122\1\uffff\1\125\1\127\1\130\2\uffff\1\142\1\144\2\uffff\1\143\1\uffff\1\120\11\uffff\1\106\13\uffff\1\27\1\41\11\uffff\1\107\1\50\1\123\1\77\1\uffff\1\102\1\uffff\1\64\1\65\1\124\1\103\1\66\1\126\1\105\1\137\1\101\1\131\1\uffff\1\112\2\uffff\1\117\1\121\1\132\1\133\1\134\1\141\6\uffff\1\72\1\71\32\uffff\1\67\3\uffff\1\70\6\uffff\1\73\1\51\1\63\4\uffff\1\117\5\uffff\1\56\10\uffff\1\52\1\53\1\55\4\uffff\1\60\4\uffff\1\57\12\uffff\1\54\6\uffff\1\61\1\62\1\uffff\1\140\2\uffff\1\136\1\135\10\uffff\1\42\2\uffff\1\44\6\uffff\1\45\14\uffff\1\46\2\uffff\1\43\1\47\13\uffff\1\30\1\uffff\1\32\3\uffff\1\35\4\uffff\1\34\1\uffff\1\33\5\uffff\1\31\1\36\1\37\1\40\13\uffff\1\26\1\uffff\1\25\4\uffff\1\23\1\24\1\uffff\1\22\7\uffff\1\21\6\uffff\1\16\1\17\1\20\3\uffff\1\14\1\uffff\1\13\3\uffff\1\11\1\12\1\15\3\uffff\1\7\1\uffff\1\5\1\6\1\10\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA45_specialS =
        "\44\uffff\1\1\104\uffff\1\2\70\uffff\1\7\1\0\57\uffff\1\4\51\uffff\1\5\41\uffff\1\6\25\uffff\1\3\51\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\57\2\uffff\1\57\22\uffff\1\57\1\46\1\44\2\uffff\1\47\1\52\1\56\1\27\1\30\1\31\1\22\1\32\1\33\1\23\1\47\1\54\11\55\1\25\1\34\1\51\1\26\1\51\2\uffff\1\10\1\11\1\2\1\14\1\20\1\3\1\4\1\6\1\1\3\45\1\7\1\12\3\45\1\5\1\15\1\21\1\45\1\24\1\16\1\45\1\17\1\45\1\35\1\13\1\36\1\uffff\1\37\1\uffff\1\10\1\11\1\2\1\14\1\20\1\3\1\4\1\6\1\1\3\45\1\7\1\12\3\45\1\5\1\15\1\21\1\45\1\24\1\16\1\45\1\17\1\45\1\40\1\53\1\41\1\50\u2181\uffff\1\42\2\uffff\1\43",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\61\7\63\1\60\14\63\6\uffff\5\63\1\61\7\63\1\60\14\63",
            "\1\64\15\uffff\12\63\7\uffff\1\67\12\63\1\65\2\63\1\66\13\63\6\uffff\1\67\12\63\1\65\2\63\1\66\13\63",
            "\1\64\15\uffff\3\63\1\73\2\63\1\74\3\63\7\uffff\1\71\15\63\1\75\2\63\1\72\2\63\1\70\5\63\4\uffff\1\62\1\uffff\1\71\15\63\1\75\2\63\1\72\2\63\1\70\5\63",
            "\1\64\15\uffff\12\63\7\uffff\24\63\1\77\5\63\6\uffff\24\63\1\77\5\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\100\25\63\6\uffff\4\63\1\100\25\63",
            "\1\64\15\uffff\12\63\7\uffff\1\101\31\63\6\uffff\1\101\31\63",
            "\1\64\15\uffff\12\63\7\uffff\1\104\15\63\1\103\5\63\1\102\5\63\6\uffff\1\104\15\63\1\103\5\63\1\102\5\63",
            "\1\64\15\uffff\12\63\7\uffff\17\63\1\105\2\63\1\106\7\63\6\uffff\17\63\1\105\2\63\1\106\7\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\107\17\63\1\110\1\63\6\uffff\10\63\1\107\17\63\1\110\1\63",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\111\13\63\6\uffff\16\63\1\111\13\63",
            "\1\113\21\uffff\1\112\15\uffff\1\113\21\uffff\1\112",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\114\11\63\1\115\13\63\6\uffff\4\63\1\114\11\63\1\115\13\63",
            "\1\64\15\uffff\12\63\7\uffff\17\63\1\117\3\63\1\116\6\63\6\uffff\17\63\1\117\3\63\1\116\6\63",
            "\1\64\15\uffff\12\63\7\uffff\7\63\1\120\22\63\6\uffff\7\63\1\120\22\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\121\21\63\6\uffff\10\63\1\121\21\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\122\16\63\6\uffff\13\63\1\122\16\63",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\124\2\63\1\123\10\63\4\uffff\1\62\1\uffff\16\63\1\124\2\63\1\123\10\63",
            "\1\127\16\uffff\1\127\2\uffff\1\126",
            "\1\131",
            "\1\64\15\uffff\12\63\7\uffff\1\133\31\63\6\uffff\1\133\31\63",
            "\1\136\16\uffff\1\134\2\uffff\1\135",
            "\1\141\33\uffff\1\141\1\140",
            "",
            "",
            "",
            "",
            "\1\143\20\uffff\1\145\77\uffff\1\127",
            "",
            "",
            "",
            "\1\64\15\uffff\12\64\7\uffff\32\64\4\uffff\1\146\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\1\64\15\uffff\12\63\7\uffff\32\63\6\uffff\32\63",
            "\1\141\100\uffff\1\141",
            "",
            "\1\127\20\uffff\1\145\77\uffff\1\154",
            "",
            "",
            "",
            "\1\161\1\uffff\12\55\45\uffff\1\160\2\uffff\1\156\25\uffff\1\155",
            "\1\161\1\uffff\12\55\45\uffff\1\160",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\165\2\63\1\163\12\63\1\162\1\63\1\164\4\63\4\uffff\1\62\1\uffff\5\63\1\165\2\63\1\163\12\63\1\162\1\63\1\164\4\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\6\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\1\170\31\63\6\uffff\1\170\31\63",
            "\1\64\15\uffff\12\63\7\uffff\14\63\1\172\1\171\14\63\6\uffff\14\63\1\172\1\171\14\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\173\7\63\6\uffff\22\63\1\173\7\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\174\14\63\6\uffff\15\63\1\174\14\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\175\16\63\6\uffff\13\63\1\175\16\63",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\176\13\63\6\uffff\16\63\1\176\13\63",
            "\1\64\15\uffff\2\63\1\177\7\63\7\uffff\32\63\6\uffff\32\63",
            "\1\64\15\uffff\4\63\1\u0080\5\63\7\uffff\32\63\6\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u0081\10\63\6\uffff\21\63\1\u0081\10\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\1\u0082\31\63\6\uffff\1\u0082\31\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u0085\4\63\1\u0083\14\63\1\u0086\1\u0084\6\63\6\uffff\1\u0085\4\63\1\u0083\14\63\1\u0086\1\u0084\6\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u0089\1\63\1\u0088\4\63\1\u0087\7\63\6\uffff\13\63\1\u0089\1\63\1\u0088\4\63\1\u0087\7\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u008a\1\u008b\6\63\6\uffff\22\63\1\u008a\1\u008b\6\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u008c\26\63\6\uffff\3\63\1\u008c\26\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u008e\4\63\1\u008d\1\63\6\uffff\23\63\1\u008e\4\63\1\u008d\1\63",
            "\1\64\15\uffff\12\63\7\uffff\17\63\1\u008f\12\63\6\uffff\17\63\1\u008f\12\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u0090\7\63\6\uffff\22\63\1\u0090\7\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0091\14\63\6\uffff\15\63\1\u0091\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u0093\7\63\6\uffff\22\63\1\u0093\7\63",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\u0095\5\63\1\u0094\16\63\6\uffff\5\63\1\u0095\5\63\1\u0094\16\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u0097\31\63\6\uffff\1\u0097\31\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0098\25\63\6\uffff\4\63\1\u0098\25\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0099\21\63\6\uffff\10\63\1\u0099\21\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u009a\25\63\6\uffff\4\63\1\u009a\25\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u009b\7\63\6\uffff\22\63\1\u009b\7\63",
            "\1\64\15\uffff\12\63\7\uffff\24\63\1\u009c\5\63\6\uffff\24\63\1\u009c\5\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u00a0\5\63\1\u00a1\10\63\6\uffff\13\63\1\u00a0\5\63\1\u00a1\10\63",
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
            "\1\145\40\uffff\1\154",
            "",
            "\1\u00a2\4\uffff\1\u00a2\64\uffff\1\u00a2\5\uffff\1\u00a2\3\uffff\1\u00a2\7\uffff\1\u00a2\3\uffff\1\u00a2\1\uffff\1\u00a2\1\u00a3",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a5",
            "\12\u00a6",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00a7\25\63\6\uffff\4\63\1\u00a7\25\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00a8\6\63\6\uffff\23\63\1\u00a8\6\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u00a9\31\63\4\uffff\1\62\1\uffff\1\u00a9\31\63",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\u00ab\13\63\6\uffff\16\63\1\u00ab\13\63",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00ac\7\63\6\uffff\22\63\1\u00ac\7\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00ad\7\63\6\uffff\22\63\1\u00ad\7\63",
            "\1\64\15\uffff\12\63\7\uffff\17\63\1\u00ae\12\63\6\uffff\17\63\1\u00ae\12\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00af\25\63\6\uffff\4\63\1\u00af\25\63",
            "\1\64\15\uffff\12\63\7\uffff\2\63\1\u00b0\27\63\6\uffff\2\63\1\u00b0\27\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00b1\7\63\6\uffff\22\63\1\u00b1\7\63",
            "\1\64\15\uffff\12\63\7\uffff\14\63\1\u00b2\15\63\6\uffff\14\63\1\u00b2\15\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u00b6\10\63\6\uffff\21\63\1\u00b6\10\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00b7\25\63\6\uffff\4\63\1\u00b7\25\63",
            "\1\64\15\uffff\12\63\7\uffff\24\63\1\u00b8\5\63\6\uffff\24\63\1\u00b8\5\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u00b9\26\63\6\uffff\3\63\1\u00b9\26\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00bb\25\63\6\uffff\4\63\1\u00bb\25\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u00bc\26\63\6\uffff\3\63\1\u00bc\26\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00bd\6\63\6\uffff\23\63\1\u00bd\6\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00be\6\63\6\uffff\23\63\1\u00be\6\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00c1\3\63\1\u00c0\21\63\6\uffff\4\63\1\u00c1\3\63\1\u00c0\21\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00c2\7\63\6\uffff\22\63\1\u00c2\7\63",
            "\1\64\15\uffff\12\63\7\uffff\2\63\1\u00c3\27\63\6\uffff\2\63\1\u00c3\27\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u00c4\16\63\6\uffff\13\63\1\u00c4\16\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00c5\17\63\1\u00c6\5\63\6\uffff\4\63\1\u00c5\17\63\1\u00c6\5\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u00c7\26\63\6\uffff\3\63\1\u00c7\26\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00c8\25\63\6\uffff\4\63\1\u00c8\25\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00c9\6\63\6\uffff\23\63\1\u00c9\6\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00cb\6\63\6\uffff\23\63\1\u00cb\6\63",
            "\1\64\15\uffff\12\63\7\uffff\2\63\1\u00cc\27\63\6\uffff\2\63\1\u00cc\27\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u00cd\16\63\6\uffff\13\63\1\u00cd\16\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u00ce\16\63\6\uffff\13\63\1\u00ce\16\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00cf\25\63\6\uffff\4\63\1\u00cf\25\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00d0\25\63\6\uffff\4\63\1\u00d0\25\63",
            "",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\60\56\12\u00d3\7\56\6\u00d3\32\56\6\u00d3\uff99\56",
            "",
            "\1\161\1\uffff\12\u00a5\45\uffff\1\160",
            "\12\u00a6\13\uffff\1\u00d6\31\uffff\1\u00d5\4\uffff\1\u00d7\1\u00d6\1\u00d8",
            "\1\64\15\uffff\12\63\7\uffff\6\63\1\u00d9\23\63\6\uffff\6\63\1\u00d9\23\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u00da\21\63\6\uffff\10\63\1\u00da\21\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u00db\10\63\6\uffff\21\63\1\u00db\10\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\u00dc\24\63\6\uffff\5\63\1\u00dc\24\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00dd\7\63\6\uffff\22\63\1\u00dd\7\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00de\6\63\6\uffff\23\63\1\u00de\6\63",
            "\1\64\15\uffff\12\63\7\uffff\24\63\1\u00df\5\63\6\uffff\24\63\1\u00df\5\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00e0\7\63\4\uffff\1\62\1\uffff\22\63\1\u00e0\7\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u00e2\6\63\6\uffff\23\63\1\u00e2\6\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00e3\25\63\6\uffff\4\63\1\u00e3\25\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\1\u00e5\31\63\6\uffff\1\u00e5\31\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u00e6\10\63\6\uffff\21\63\1\u00e6\10\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u00e7\10\63\6\uffff\21\63\1\u00e7\10\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00e8\7\63\6\uffff\22\63\1\u00e8\7\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\25\63\1\u00e9\4\63\6\uffff\25\63\1\u00e9\4\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u00ea\16\63\6\uffff\13\63\1\u00ea\16\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00ec\7\63\6\uffff\22\63\1\u00ec\7\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\u00ed\24\63\6\uffff\5\63\1\u00ed\24\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u00ee\7\63\6\uffff\22\63\1\u00ee\7\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00ef\25\63\6\uffff\4\63\1\u00ef\25\63",
            "\1\64\15\uffff\12\63\7\uffff\7\63\1\u00f0\22\63\6\uffff\7\63\1\u00f0\22\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u00f1\21\63\6\uffff\10\63\1\u00f1\21\63",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u00f2\10\63\6\uffff\21\63\1\u00f2\10\63",
            "\1\64\15\uffff\12\63\7\uffff\14\63\1\u00f3\15\63\6\uffff\14\63\1\u00f3\15\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u00f4\21\63\6\uffff\10\63\1\u00f4\21\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u00f5\14\63\6\uffff\15\63\1\u00f5\14\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u00f6\31\63\6\uffff\1\u00f6\31\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00f7\25\63\6\uffff\4\63\1\u00f7\25\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u00f9\25\63\6\uffff\4\63\1\u00f9\25\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u00fa\26\63\6\uffff\3\63\1\u00fa\26\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "\60\56\12\u00fd\7\56\6\u00fd\32\56\6\u00fd\uff99\56",
            "",
            "\12\u00fe",
            "\1\u00ff\1\uffff\1\u00ff\2\uffff\12\u0100",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u0101\10\63\6\uffff\21\63\1\u0101\10\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u0102\31\63\6\uffff\1\u0102\31\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0103\21\63\6\uffff\10\63\1\u0103\21\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u0104\16\63\6\uffff\13\63\1\u0104\16\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0105\21\63\6\uffff\10\63\1\u0105\21\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u0106\31\63\6\uffff\1\u0106\31\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0107\6\63\6\uffff\23\63\1\u0107\6\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0109\21\63\6\uffff\10\63\1\u0109\21\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u010b\14\63\6\uffff\15\63\1\u010b\14\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u010c\25\63\6\uffff\4\63\1\u010c\25\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u010d\14\63\6\uffff\15\63\1\u010d\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u010f\25\63\6\uffff\4\63\1\u010f\25\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0110\25\63\6\uffff\4\63\1\u0110\25\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0111\25\63\6\uffff\4\63\1\u0111\25\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0112\21\63\6\uffff\10\63\1\u0112\21\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0114\14\63\6\uffff\15\63\1\u0114\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0116\25\63\6\uffff\4\63\1\u0116\25\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0117\6\63\6\uffff\23\63\1\u0117\6\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0118\25\63\6\uffff\4\63\1\u0118\25\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0119\14\63\6\uffff\15\63\1\u0119\14\63",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u011a\26\63\6\uffff\3\63\1\u011a\26\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "\60\56\12\u011f\7\56\6\u011f\32\56\6\u011f\uff99\56",
            "\12\u00fe\13\uffff\1\u00d6\31\uffff\1\u00d5\4\uffff\1\u00d7\1\u00d6\1\u00d8",
            "\12\u0100",
            "\12\u0100\52\uffff\1\u00d7\1\uffff\1\u00d8",
            "\1\64\15\uffff\12\63\7\uffff\1\u0120\31\63\6\uffff\1\u0120\31\63",
            "\1\64\15\uffff\12\63\7\uffff\13\63\1\u0121\16\63\6\uffff\13\63\1\u0121\16\63",
            "\1\64\15\uffff\12\63\7\uffff\1\u0122\31\63\6\uffff\1\u0122\31\63",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\u0123\13\63\6\uffff\16\63\1\u0123\13\63",
            "\1\64\15\uffff\12\63\7\uffff\5\63\1\u0124\24\63\6\uffff\5\63\1\u0124\24\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0125\14\63\6\uffff\15\63\1\u0125\14\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0126\25\63\6\uffff\4\63\1\u0126\25\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\u0127\13\63\6\uffff\16\63\1\u0127\13\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0128\6\63\6\uffff\23\63\1\u0128\6\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0129\14\63\6\uffff\15\63\1\u0129\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u012b\14\63\6\uffff\15\63\1\u012b\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u012d\14\63\6\uffff\15\63\1\u012d\14\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u012e\25\63\6\uffff\4\63\1\u012e\25\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u012f\26\63\6\uffff\3\63\1\u012f\26\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u0130\7\63\6\uffff\22\63\1\u0130\7\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\6\63\1\u0133\23\63\6\uffff\6\63\1\u0133\23\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\60\56\12\u0135\7\56\6\u0135\32\56\6\u0135\uff99\56",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0136\6\63\6\uffff\23\63\1\u0136\6\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0137\21\63\6\uffff\10\63\1\u0137\21\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u0138\14\63\6\uffff\15\63\1\u0138\14\63",
            "\1\64\15\uffff\12\63\7\uffff\26\63\1\u0139\3\63\6\uffff\26\63\1\u0139\3\63",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u013a\21\63\6\uffff\10\63\1\u013a\21\63",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u013b\6\63\6\uffff\23\63\1\u013b\6\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u013d\14\63\6\uffff\15\63\1\u013d\14\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u013e\25\63\6\uffff\4\63\1\u013e\25\63",
            "\1\64\15\uffff\12\63\7\uffff\2\63\1\u013f\27\63\6\uffff\2\63\1\u013f\27\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0140\6\63\6\uffff\23\63\1\u0140\6\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\3\63\1\u0141\26\63\6\uffff\3\63\1\u0141\26\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u0142\7\63\6\uffff\22\63\1\u0142\7\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\1\64\15\uffff\12\63\7\uffff\10\63\1\u0146\21\63\6\uffff\10\63\1\u0146\21\63",
            "\1\64\15\uffff\12\63\7\uffff\31\63\1\u0147\6\uffff\31\63\1\u0147",
            "\1\64\15\uffff\12\63\7\uffff\23\63\1\u0148\6\63\6\uffff\23\63\1\u0148\6\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u014a\25\63\6\uffff\4\63\1\u014a\25\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u014c\7\63\6\uffff\22\63\1\u014c\7\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u014d\25\63\6\uffff\4\63\1\u014d\25\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u014e\25\63\6\uffff\4\63\1\u014e\25\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\16\63\1\u0152\13\63\6\uffff\16\63\1\u0152\13\63",
            "\1\64\15\uffff\12\63\7\uffff\4\63\1\u0153\25\63\6\uffff\4\63\1\u0153\25\63",
            "\1\64\15\uffff\12\63\7\uffff\22\63\1\u0154\7\63\4\uffff\1\62\1\uffff\22\63\1\u0154\7\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\21\63\1\u0156\10\63\6\uffff\21\63\1\u0156\10\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\15\63\1\u015a\14\63\6\uffff\15\63\1\u015a\14\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            "\1\64\15\uffff\12\63\7\uffff\32\63\4\uffff\1\62\1\uffff\32\63",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | NoSend | Assert | Assume | Handle | Return | Some | Cases | Delta | False | Match | Modes | Reads | State | While | Yield | All | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_SLI | RULE_NOT | RULE_MULTIPLICATIVE_OP | RULE_SLANG_OP | RULE_COLON_OP | RULE_LT_GT_OPS | RULE_EQUAL_NOT_OPS | RULE_AND_OPS | RULE_OR_OPS | RULE_IMPLIES | RULE_SIMPLIES | RULE_HEX | RULE_BIN | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_163 = input.LA(1);

                        s = -1;
                        if ( ((LA45_163>='\u0000' && LA45_163<='/')||(LA45_163>=':' && LA45_163<='@')||(LA45_163>='G' && LA45_163<='`')||(LA45_163>='g' && LA45_163<='\uFFFF')) ) {s = 46;}

                        else if ( ((LA45_163>='0' && LA45_163<='9')||(LA45_163>='A' && LA45_163<='F')||(LA45_163>='a' && LA45_163<='f')) ) {s = 211;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_36 = input.LA(1);

                        s = -1;
                        if ( (LA45_36=='\\') ) {s = 104;}

                        else if ( ((LA45_36>='\u0000' && LA45_36<='!')||(LA45_36>='#' && LA45_36<='[')||(LA45_36>=']' && LA45_36<='\uFFFF')) ) {s = 105;}

                        else if ( (LA45_36=='\"') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_105 = input.LA(1);

                        s = -1;
                        if ( (LA45_105=='\"') ) {s = 106;}

                        else if ( (LA45_105=='\\') ) {s = 104;}

                        else if ( ((LA45_105>='\u0000' && LA45_105<='!')||(LA45_105>='#' && LA45_105<='[')||(LA45_105>=']' && LA45_105<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_309 = input.LA(1);

                        s = -1;
                        if ( (LA45_309=='\"') ) {s = 106;}

                        else if ( (LA45_309=='\\') ) {s = 104;}

                        else if ( ((LA45_309>='\u0000' && LA45_309<='!')||(LA45_309>='#' && LA45_309<='[')||(LA45_309>=']' && LA45_309<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_211 = input.LA(1);

                        s = -1;
                        if ( ((LA45_211>='0' && LA45_211<='9')||(LA45_211>='A' && LA45_211<='F')||(LA45_211>='a' && LA45_211<='f')) ) {s = 253;}

                        else if ( ((LA45_211>='\u0000' && LA45_211<='/')||(LA45_211>=':' && LA45_211<='@')||(LA45_211>='G' && LA45_211<='`')||(LA45_211>='g' && LA45_211<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_253 = input.LA(1);

                        s = -1;
                        if ( ((LA45_253>='0' && LA45_253<='9')||(LA45_253>='A' && LA45_253<='F')||(LA45_253>='a' && LA45_253<='f')) ) {s = 287;}

                        else if ( ((LA45_253>='\u0000' && LA45_253<='/')||(LA45_253>=':' && LA45_253<='@')||(LA45_253>='G' && LA45_253<='`')||(LA45_253>='g' && LA45_253<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_287 = input.LA(1);

                        s = -1;
                        if ( ((LA45_287>='0' && LA45_287<='9')||(LA45_287>='A' && LA45_287<='F')||(LA45_287>='a' && LA45_287<='f')) ) {s = 309;}

                        else if ( ((LA45_287>='\u0000' && LA45_287<='/')||(LA45_287>=':' && LA45_287<='@')||(LA45_287>='G' && LA45_287<='`')||(LA45_287>='g' && LA45_287<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_162 = input.LA(1);

                        s = -1;
                        if ( (LA45_162=='\"') ) {s = 106;}

                        else if ( (LA45_162=='\\') ) {s = 104;}

                        else if ( ((LA45_162>='\u0000' && LA45_162<='!')||(LA45_162>='#' && LA45_162<='[')||(LA45_162>=']' && LA45_162<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}