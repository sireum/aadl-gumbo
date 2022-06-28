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
    public static final int Val=51;
    public static final int RULE_HEX=99;
    public static final int EqualsSignGreaterThanSign=57;
    public static final int Var=52;
    public static final int False=32;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=45;
    public static final int LeftParenthesis=63;
    public static final int RULE_MSTRING=85;
    public static final int RULE_SLANG_STRING=84;
    public static final int RULE_OP=97;
    public static final int RULE_BIN=100;
    public static final int RULE_ESC_SEQ=83;
    public static final int RULE_ID=113;
    public static final int RULE_DIGIT=106;
    public static final int Handle=26;
    public static final int ColonColon=54;
    public static final int Some=29;
    public static final int RULE_REAL_IDF=104;
    public static final int PlusSign=66;
    public static final int LeftSquareBracket=76;
    public static final int If=60;
    public static final int Halt=42;
    public static final int F=74;
    public static final int ThereExists=82;
    public static final int RULE_REAL_LIT=103;
    public static final int Classifier=5;
    public static final int Case=40;
    public static final int Comma=67;
    public static final int HyphenMinus=68;
    public static final int NoSend=23;
    public static final int T=75;
    public static final int RULE_MSPE=92;
    public static final int Guarantee=10;
    public static final int RightCurlyBracket=80;
    public static final int RULE_MSPB=90;
    public static final int Modes=34;
    public static final int FullStop=69;
    public static final int RULE_SIMPLIES=96;
    public static final int Reference=12;
    public static final int RULE_IMPLIES=95;
    public static final int RULE_UNICODE_ESC=107;
    public static final int Functions=9;
    public static final int KW__=78;
    public static final int Semicolon=71;
    public static final int RULE_LETTER=105;
    public static final int RULE_EXPONENT=109;
    public static final int Delta=31;
    public static final int QuestionMark=73;
    public static final int RULE_SLI=89;
    public static final int Memoize=22;
    public static final int By=58;
    public static final int Else=41;
    public static final int RULE_EXTENDED_DIGIT=98;
    public static final int Yield=38;
    public static final int All=39;
    public static final int True=44;
    public static final int RULE_INT_EXPONENT=110;
    public static final int In_1=61;
    public static final int FullStopFullStop=53;
    public static final int LessThanSignColon=56;
    public static final int Ensures=21;
    public static final int To=62;
    public static final int Applies=18;
    public static final int RULE_MSP=88;
    public static final int RULE_BASED_INTEGER=111;
    public static final int RightSquareBracket=77;
    public static final int Binding=19;
    public static final int RULE_MSPM=91;
    public static final int RULE_DEFOP=94;
    public static final int RULE_MSPI=87;
    public static final int Requires=16;
    public static final int For=48;
    public static final int RightParenthesis=64;
    public static final int Do=59;
    public static final int ColonEqualsSign=55;
    public static final int Mut=50;
    public static final int State=36;
    public static final int Assume=25;
    public static final int RULE_INTEGER_LIT=101;
    public static final int Invariant=11;
    public static final int Constant=14;
    public static final int RULE_STRING=112;
    public static final int Match=33;
    public static final int Reads=35;
    public static final int RULE_SL_COMMENT=108;
    public static final int Inv=49;
    public static final int EqualsSign=72;
    public static final int Modifies=15;
    public static final int Strict=28;
    public static final int Colon=70;
    public static final int EOF=-1;
    public static final int Asterisk=65;
    public static final int Integration=4;
    public static final int RULE_OPSYM=93;
    public static final int Return=27;
    public static final int Def=47;
    public static final int RULE_WS=114;
    public static final int LeftCurlyBracket=79;
    public static final int RULE_INT_IDF=102;
    public static final int MustSend=13;
    public static final int While=37;
    public static final int Extension=8;
    public static final int FullStopFullStopLessThanSign=46;
    public static final int RULE_IDF=86;
    public static final int Compute=20;
    public static final int MaySend=17;
    public static final int Spec=43;
    public static final int ForAll=81;
    public static final int Cases=30;

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

    // $ANTLR start "Extension"
    public final void mExtension() throws RecognitionException {
        try {
            int _type = Extension;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:32:11: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:32:13: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
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
    // $ANTLR end "Extension"

    // $ANTLR start "Functions"
    public final void mFunctions() throws RecognitionException {
        try {
            int _type = Functions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:34:11: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:34:13: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:36:11: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:36:13: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:38:11: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:38:13: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:40:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:40:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
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

    // $ANTLR start "Modifies"
    public final void mModifies() throws RecognitionException {
        try {
            int _type = Modifies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:46:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:46:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
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

    // $ANTLR start "Requires"
    public final void mRequires() throws RecognitionException {
        try {
            int _type = Requires;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:48:10: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:48:12: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
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

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
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

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
    // $ANTLR end "Requires"

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

    // $ANTLR start "Ensures"
    public final void mEnsures() throws RecognitionException {
        try {
            int _type = Ensures;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:58:9: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:58:11: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
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
    // $ANTLR end "Ensures"

    // $ANTLR start "Memoize"
    public final void mMemoize() throws RecognitionException {
        try {
            int _type = Memoize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:60:9: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:60:11: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
            {
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
    // $ANTLR end "Memoize"

    // $ANTLR start "NoSend"
    public final void mNoSend() throws RecognitionException {
        try {
            int _type = NoSend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:62:8: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:62:10: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:64:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:64:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:66:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:66:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:68:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:68:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:70:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:70:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
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

    // $ANTLR start "Strict"
    public final void mStrict() throws RecognitionException {
        try {
            int _type = Strict;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:72:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:72:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' )
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Strict"

    // $ANTLR start "Some"
    public final void mSome() throws RecognitionException {
        try {
            int _type = Some;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:74:6: ( '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:74:8: '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:76:7: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:76:9: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:78:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalGumboLexer.g:78:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
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
            // InternalGumboLexer.g:80:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:80:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:82:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalGumboLexer.g:82:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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
            // InternalGumboLexer.g:84:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:84:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:86:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:86:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:88:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:88:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:90:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:90:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:92:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:92:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:94:5: ( '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:94:7: '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:96:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:96:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:98:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:98:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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

    // $ANTLR start "Halt"
    public final void mHalt() throws RecognitionException {
        try {
            int _type = Halt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:100:6: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:100:8: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:102:6: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalGumboLexer.g:102:8: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' )
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
            // InternalGumboLexer.g:104:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:104:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:106:35: ( '+' '=' '>' )
            // InternalGumboLexer.g:106:37: '+' '=' '>'
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
            // InternalGumboLexer.g:108:30: ( '.' '.' '<' )
            // InternalGumboLexer.g:108:32: '.' '.' '<'
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

    // $ANTLR start "Val"
    public final void mVal() throws RecognitionException {
        try {
            int _type = Val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:118:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:118:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:120:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:120:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:122:18: ( '.' '.' )
            // InternalGumboLexer.g:122:20: '.' '.'
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
            // InternalGumboLexer.g:124:12: ( ':' ':' )
            // InternalGumboLexer.g:124:14: ':' ':'
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
            // InternalGumboLexer.g:126:17: ( ':' '=' )
            // InternalGumboLexer.g:126:19: ':' '='
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

    // $ANTLR start "LessThanSignColon"
    public final void mLessThanSignColon() throws RecognitionException {
        try {
            int _type = LessThanSignColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:128:19: ( '<' ':' )
            // InternalGumboLexer.g:128:21: '<' ':'
            {
            match('<'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignColon"

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

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:162:14: ( '?' )
            // InternalGumboLexer.g:162:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

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

    // $ANTLR start "RULE_SLANG_STRING"
    public final void mRULE_SLANG_STRING() throws RecognitionException {
        try {
            int _type = RULE_SLANG_STRING;
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
    // $ANTLR end "RULE_SLANG_STRING"

    // $ANTLR start "RULE_MSTRING"
    public final void mRULE_MSTRING() throws RecognitionException {
        try {
            int _type = RULE_MSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:184:14: ( '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:184:16: '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match("\"\"\""); 

            // InternalGumboLexer.g:184:22: (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\"') ) {
                        int LA2_3 = input.LA(3);

                        if ( ((LA2_3>='\u0000' && LA2_3<='!')||(LA2_3>='#' && LA2_3<='\uFFFF')) ) {
                            alt2=3;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='!')||(LA2_1>='#' && LA2_1<='\uFFFF')) ) {
                        alt2=2;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGumboLexer.g:184:23: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:184:30: '\"' ~ ( '\"' )
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
            	case 3 :
            	    // InternalGumboLexer.g:184:41: '\"\"' ~ ( '\"' )
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

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGumboLexer.g:184:55: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\"') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='\"') ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3=='\"') ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4=='\"') ) {
                                alt3=3;
                            }
                            else {
                                alt3=2;}
                        }
                        else {
                            alt3=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboLexer.g:184:56: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:184:62: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:184:69: '\"\"\"\"\"'
                    {
                    match("\"\"\"\"\""); 


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
    // $ANTLR end "RULE_MSTRING"

    // $ANTLR start "RULE_MSP"
    public final void mRULE_MSP() throws RecognitionException {
        try {
            int _type = RULE_MSP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:186:10: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:186:12: RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:186:27: ( RULE_MSPI )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='\"') ) {
                        int LA4_3 = input.LA(3);

                        if ( ((LA4_3>='\u0000' && LA4_3<='!')||(LA4_3>='#' && LA4_3<='\uFFFF')) ) {
                            alt4=1;
                        }


                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='!')||(LA4_1>='#' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGumboLexer.g:186:27: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGumboLexer.g:186:38: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\"') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='\"') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='\"') ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4=='\"') ) {
                                alt5=3;
                            }
                            else {
                                alt5=2;}
                        }
                        else {
                            alt5=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

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
                    // InternalGumboLexer.g:186:39: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:186:45: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:186:52: '\"\"\"\"\"'
                    {
                    match("\"\"\"\"\""); 


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
    // $ANTLR end "RULE_MSP"

    // $ANTLR start "RULE_SLI"
    public final void mRULE_SLI() throws RecognitionException {
        try {
            int _type = RULE_SLI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:188:10: ( RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:188:12: RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            // InternalGumboLexer.g:188:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGumboLexer.g:188:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:188:39: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop6;
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

    // $ANTLR start "RULE_MSPB"
    public final void mRULE_MSPB() throws RecognitionException {
        try {
            int _type = RULE_MSPB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:190:11: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:190:13: RULE_IDF '\"\"\"' ( RULE_MSPI )* '$'
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:190:28: ( RULE_MSPI )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='$') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='$') ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='#')||(LA7_0>='%' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGumboLexer.g:190:28: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MSPB"

    // $ANTLR start "RULE_MSPM"
    public final void mRULE_MSPM() throws RecognitionException {
        try {
            int _type = RULE_MSPM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:192:11: ( '$' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:192:13: '$' ( RULE_MSPI )* '$'
            {
            match('$'); 
            // InternalGumboLexer.g:192:17: ( RULE_MSPI )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='$') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='$') ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='#')||(LA8_0>='%' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGumboLexer.g:192:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MSPM"

    // $ANTLR start "RULE_MSPE"
    public final void mRULE_MSPE() throws RecognitionException {
        try {
            int _type = RULE_MSPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:194:11: ( '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:194:13: '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match('$'); 
            // InternalGumboLexer.g:194:17: ( RULE_MSPI )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\"') ) {
                        int LA9_3 = input.LA(3);

                        if ( ((LA9_3>='\u0000' && LA9_3<='!')||(LA9_3>='#' && LA9_3<='\uFFFF')) ) {
                            alt9=1;
                        }


                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='!')||(LA9_1>='#' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumboLexer.g:194:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGumboLexer.g:194:28: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\"') ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2=='\"') ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3=='\"') ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4=='\"') ) {
                                alt10=3;
                            }
                            else {
                                alt10=2;}
                        }
                        else {
                            alt10=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGumboLexer.g:194:29: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:194:35: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:194:42: '\"\"\"\"\"'
                    {
                    match("\"\"\"\"\""); 


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
    // $ANTLR end "RULE_MSPE"

    // $ANTLR start "RULE_DEFOP"
    public final void mRULE_DEFOP() throws RecognitionException {
        try {
            int _type = RULE_DEFOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:196:12: ( ':' ( RULE_OPSYM )* '=' )
            // InternalGumboLexer.g:196:14: ':' ( RULE_OPSYM )* '='
            {
            match(':'); 
            // InternalGumboLexer.g:196:18: ( RULE_OPSYM )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='=') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='!'||(LA11_1>='%' && LA11_1<='&')||LA11_1=='/'||(LA11_1>='<' && LA11_1<='>')||LA11_1=='^'||LA11_1=='|'||LA11_1=='~'||(LA11_1>='\u2200' && LA11_1<='\u22FF')||(LA11_1>='\u27C0' && LA11_1<='\u27EF')||(LA11_1>='\u2980' && LA11_1<='\u2AFF')) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0=='!'||(LA11_0>='%' && LA11_0<='&')||LA11_0=='/'||LA11_0=='<'||LA11_0=='>'||LA11_0=='^'||LA11_0=='|'||LA11_0=='~'||(LA11_0>='\u2200' && LA11_0<='\u22FF')||(LA11_0>='\u27C0' && LA11_0<='\u27EF')||(LA11_0>='\u2980' && LA11_0<='\u2AFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboLexer.g:196:18: RULE_OPSYM
            	    {
            	    mRULE_OPSYM(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFOP"

    // $ANTLR start "RULE_IMPLIES"
    public final void mRULE_IMPLIES() throws RecognitionException {
        try {
            int _type = RULE_IMPLIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:198:14: ( ( '-' | '~' ) '>' ':' )
            // InternalGumboLexer.g:198:16: ( '-' | '~' ) '>' ':'
            {
            if ( input.LA(1)=='-'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
            // InternalGumboLexer.g:200:15: ( '~' '~' '>' ':' )
            // InternalGumboLexer.g:200:17: '~' '~' '>' ':'
            {
            match('~'); 
            match('~'); 
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

    // $ANTLR start "RULE_OP"
    public final void mRULE_OP() throws RecognitionException {
        try {
            int _type = RULE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:202:9: ( ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF ) )
            // InternalGumboLexer.g:202:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            {
            // InternalGumboLexer.g:202:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='!'||(LA13_0>='%' && LA13_0<='&')||LA13_0=='/'||(LA13_0>='<' && LA13_0<='>')||LA13_0=='^'||LA13_0=='|'||LA13_0=='~'||(LA13_0>='\u2200' && LA13_0<='\u22FF')||(LA13_0>='\u27C0' && LA13_0<='\u27EF')||(LA13_0>='\u2980' && LA13_0<='\u2AFF')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='\\') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumboLexer.g:202:12: ( RULE_OPSYM )+
                    {
                    // InternalGumboLexer.g:202:12: ( RULE_OPSYM )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='!'||(LA12_0>='%' && LA12_0<='&')||LA12_0=='/'||(LA12_0>='<' && LA12_0<='>')||LA12_0=='^'||LA12_0=='|'||LA12_0=='~'||(LA12_0>='\u2200' && LA12_0<='\u22FF')||(LA12_0>='\u27C0' && LA12_0<='\u27EF')||(LA12_0>='\u2980' && LA12_0<='\u2AFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGumboLexer.g:202:12: RULE_OPSYM
                    	    {
                    	    mRULE_OPSYM(); 

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


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:202:24: '\\\\' RULE_IDF
                    {
                    match('\\'); 
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
    // $ANTLR end "RULE_OP"

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
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGumboLexer.g:204:17: RULE_EXTENDED_DIGIT
            	    {
            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalGumboLexer.g:204:38: ( '.' RULE_IDF )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='.') ) {
                alt15=1;
            }
            switch (alt15) {
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
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='1')||LA16_0=='_') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalGumboLexer.g:206:32: ( '.' RULE_IDF )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='.') ) {
                alt17=1;
            }
            switch (alt17) {
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

    // $ANTLR start "RULE_INT_IDF"
    public final void mRULE_INT_IDF() throws RecognitionException {
        try {
            int _type = RULE_INT_IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:208:14: ( RULE_INTEGER_LIT RULE_IDF )
            // InternalGumboLexer.g:208:16: RULE_INTEGER_LIT RULE_IDF
            {
            mRULE_INTEGER_LIT(); 
            mRULE_IDF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_IDF"

    // $ANTLR start "RULE_REAL_IDF"
    public final void mRULE_REAL_IDF() throws RecognitionException {
        try {
            int _type = RULE_REAL_IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:210:15: ( RULE_REAL_LIT RULE_IDF )
            // InternalGumboLexer.g:210:17: RULE_REAL_LIT RULE_IDF
            {
            mRULE_REAL_LIT(); 
            mRULE_IDF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_IDF"

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
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    break loop18;
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
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='\u0000' && LA19_0<='!')||LA19_0=='#'||(LA19_0>='%' && LA19_0<='\uFFFF')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='$') ) {
                alt19=2;
            }
            else if ( (LA19_0=='\"') ) {
                int LA19_3 = input.LA(2);

                if ( ((LA19_3>='\u0000' && LA19_3<='!')||(LA19_3>='#' && LA19_3<='\uFFFF')) ) {
                    alt19=3;
                }
                else if ( (LA19_3=='\"') ) {
                    alt19=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
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

    // $ANTLR start "RULE_OPSYM"
    public final void mRULE_OPSYM() throws RecognitionException {
        try {
            // InternalGumboLexer.g:218:21: ( ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' ) )
            // InternalGumboLexer.g:218:23: ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='%' && input.LA(1)<='&')||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~'||(input.LA(1)>='\u2200' && input.LA(1)<='\u22FF')||(input.LA(1)>='\u27C0' && input.LA(1)<='\u27EF')||(input.LA(1)>='\u2980' && input.LA(1)<='\u2AFF') ) {
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
    // $ANTLR end "RULE_OPSYM"

    // $ANTLR start "RULE_ESC_SEQ"
    public final void mRULE_ESC_SEQ() throws RecognitionException {
        try {
            // InternalGumboLexer.g:220:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:220:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:220:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='\"'||LA20_1=='\''||LA20_1=='\\'||LA20_1=='b'||LA20_1=='f'||LA20_1=='n'||LA20_1=='r'||LA20_1=='t') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='u') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboLexer.g:220:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // InternalGumboLexer.g:220:67: RULE_UNICODE_ESC
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
            // InternalGumboLexer.g:222:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:222:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
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
            // InternalGumboLexer.g:224:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:224:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:224:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGumboLexer.g:224:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // InternalGumboLexer.g:224:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboLexer.g:224:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:224:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalGumboLexer.g:224:41: '\\r'
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
            // InternalGumboLexer.g:226:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:226:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:226:36: ( '+' | '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='+'||LA24_0=='-') ) {
                alt24=1;
            }
            switch (alt24) {
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

            // InternalGumboLexer.g:226:47: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:226:47: RULE_DIGIT
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:228:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:228:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:228:40: ( '+' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboLexer.g:228:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:228:45: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:228:45: RULE_DIGIT
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
            // InternalGumboLexer.g:230:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:230:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:230:17: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:230:17: RULE_DIGIT
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

            // InternalGumboLexer.g:230:29: ( '_' ( RULE_DIGIT )+ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGumboLexer.g:230:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:230:34: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:230:34: RULE_DIGIT
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

            match('.'); 
            // InternalGumboLexer.g:230:52: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:230:52: RULE_DIGIT
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

            // InternalGumboLexer.g:230:64: ( '_' ( RULE_DIGIT )+ )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGumboLexer.g:230:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:230:69: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:230:69: RULE_DIGIT
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

            // InternalGumboLexer.g:230:83: ( RULE_EXPONENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='E'||LA34_0=='e') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboLexer.g:230:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:232:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:232:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:232:20: ( RULE_DIGIT )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGumboLexer.g:232:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // InternalGumboLexer.g:232:32: ( '_' ( RULE_DIGIT )+ )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0=='_') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGumboLexer.g:232:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:232:37: ( RULE_DIGIT )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( ((LA36_0>='0' && LA36_0<='9')) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:232:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalGumboLexer.g:232:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='#') ) {
                alt40=1;
            }
            else {
                alt40=2;}
            switch (alt40) {
                case 1 :
                    // InternalGumboLexer.g:232:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:232:79: ( RULE_INT_EXPONENT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='E'||LA38_0=='e') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGumboLexer.g:232:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:232:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:232:98: ( RULE_INT_EXPONENT )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='E'||LA39_0=='e') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGumboLexer.g:232:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:234:21: ( '0' .. '9' )
            // InternalGumboLexer.g:234:23: '0' .. '9'
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
            // InternalGumboLexer.g:236:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:236:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:238:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:238:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:238:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')||(LA42_0>='A' && LA42_0<='F')||LA42_0=='_'||(LA42_0>='a' && LA42_0<='f')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGumboLexer.g:238:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:238:52: ( '_' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0=='_') ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalGumboLexer.g:238:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop42;
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
            // InternalGumboLexer.g:240:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:240:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:240:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\"') ) {
                alt45=1;
            }
            else if ( (LA45_0=='\'') ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalGumboLexer.g:240:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:240:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0=='\\') ) {
                            alt43=1;
                        }
                        else if ( ((LA43_0>='\u0000' && LA43_0<='!')||(LA43_0>='#' && LA43_0<='[')||(LA43_0>=']' && LA43_0<='\uFFFF')) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalGumboLexer.g:240:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:240:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop43;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:240:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:240:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop44:
                    do {
                        int alt44=3;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0=='\\') ) {
                            alt44=1;
                        }
                        else if ( ((LA44_0>='\u0000' && LA44_0<='&')||(LA44_0>='(' && LA44_0<='[')||(LA44_0>=']' && LA44_0<='\uFFFF')) ) {
                            alt44=2;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalGumboLexer.g:240:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:240:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop44;
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
            // InternalGumboLexer.g:242:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:242:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:242:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')||(LA47_0>='A' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='a' && LA47_0<='z')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGumboLexer.g:242:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:242:32: ( '_' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0=='_') ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalGumboLexer.g:242:32: '_'
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
            	    break loop47;
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
            // InternalGumboLexer.g:244:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:244:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:244:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>='\t' && LA48_0<='\n')||LA48_0=='\r'||LA48_0==' ') ) {
                    alt48=1;
                }


                switch (alt48) {
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
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | MustSend | Constant | Modifies | Requires | MaySend | Applies | Binding | Compute | Ensures | Memoize | NoSend | Assert | Assume | Handle | Return | Strict | Some | Cases | Delta | False | Match | Modes | Reads | State | While | Yield | All | Case | Else | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_IMPLIES | RULE_SIMPLIES | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt49=100;
        alt49 = dfa49.predict(input);
        switch (alt49) {
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
                // InternalGumboLexer.g:1:55: Extension
                {
                mExtension(); 

                }
                break;
            case 6 :
                // InternalGumboLexer.g:1:65: Functions
                {
                mFunctions(); 

                }
                break;
            case 7 :
                // InternalGumboLexer.g:1:75: Guarantee
                {
                mGuarantee(); 

                }
                break;
            case 8 :
                // InternalGumboLexer.g:1:85: Invariant
                {
                mInvariant(); 

                }
                break;
            case 9 :
                // InternalGumboLexer.g:1:95: Reference
                {
                mReference(); 

                }
                break;
            case 10 :
                // InternalGumboLexer.g:1:105: MustSend
                {
                mMustSend(); 

                }
                break;
            case 11 :
                // InternalGumboLexer.g:1:114: Constant
                {
                mConstant(); 

                }
                break;
            case 12 :
                // InternalGumboLexer.g:1:123: Modifies
                {
                mModifies(); 

                }
                break;
            case 13 :
                // InternalGumboLexer.g:1:132: Requires
                {
                mRequires(); 

                }
                break;
            case 14 :
                // InternalGumboLexer.g:1:141: MaySend
                {
                mMaySend(); 

                }
                break;
            case 15 :
                // InternalGumboLexer.g:1:149: Applies
                {
                mApplies(); 

                }
                break;
            case 16 :
                // InternalGumboLexer.g:1:157: Binding
                {
                mBinding(); 

                }
                break;
            case 17 :
                // InternalGumboLexer.g:1:165: Compute
                {
                mCompute(); 

                }
                break;
            case 18 :
                // InternalGumboLexer.g:1:173: Ensures
                {
                mEnsures(); 

                }
                break;
            case 19 :
                // InternalGumboLexer.g:1:181: Memoize
                {
                mMemoize(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:189: NoSend
                {
                mNoSend(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:196: Assert
                {
                mAssert(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:203: Assume
                {
                mAssume(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:210: Handle
                {
                mHandle(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:217: Return
                {
                mReturn(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:224: Strict
                {
                mStrict(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:231: Some
                {
                mSome(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:236: Cases
                {
                mCases(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:242: Delta
                {
                mDelta(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:248: False
                {
                mFalse(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:254: Match
                {
                mMatch(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:260: Modes
                {
                mModes(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:266: Reads
                {
                mReads(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:272: State
                {
                mState(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:278: While
                {
                mWhile(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:284: Yield
                {
                mYield(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:290: All
                {
                mAll(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:294: Case
                {
                mCase(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:299: Else
                {
                mElse(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:304: Halt
                {
                mHalt(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:309: Spec
                {
                mSpec(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:314: True
                {
                mTrue(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:319: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:353: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:382: Def
                {
                mDef(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:386: For
                {
                mFor(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:390: Inv
                {
                mInv(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:394: Mut
                {
                mMut(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:398: Val
                {
                mVal(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:402: Var
                {
                mVar(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:406: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:423: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:434: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:450: LessThanSignColon
                {
                mLessThanSignColon(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:468: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:494: By
                {
                mBy(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:497: Do
                {
                mDo(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:500: If
                {
                mIf(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:503: In_1
                {
                mIn_1(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:508: To
                {
                mTo(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:511: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:527: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:544: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:553: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:562: Comma
                {
                mComma(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:568: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:580: FullStop
                {
                mFullStop(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:589: Colon
                {
                mColon(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:595: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:605: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:616: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:629: F
                {
                mF(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:631: T
                {
                mT(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:633: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:651: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:670: KW__
                {
                mKW__(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:675: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:692: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:710: ForAll
                {
                mForAll(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:717: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:729: RULE_SLANG_STRING
                {
                mRULE_SLANG_STRING(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:747: RULE_MSTRING
                {
                mRULE_MSTRING(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:760: RULE_MSP
                {
                mRULE_MSP(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:769: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:778: RULE_MSPB
                {
                mRULE_MSPB(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:788: RULE_MSPM
                {
                mRULE_MSPM(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:798: RULE_MSPE
                {
                mRULE_MSPE(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:808: RULE_DEFOP
                {
                mRULE_DEFOP(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:819: RULE_IMPLIES
                {
                mRULE_IMPLIES(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:832: RULE_SIMPLIES
                {
                mRULE_SIMPLIES(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:846: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:854: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:863: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:872: RULE_INT_IDF
                {
                mRULE_INT_IDF(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:885: RULE_REAL_IDF
                {
                mRULE_REAL_IDF(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:899: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:915: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 97 :
                // InternalGumboLexer.g:1:929: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 98 :
                // InternalGumboLexer.g:1:946: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 99 :
                // InternalGumboLexer.g:1:958: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 100 :
                // InternalGumboLexer.g:1:966: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA49_eotS =
        "\1\uffff\3\61\1\75\10\61\1\uffff\3\61\1\124\1\126\1\130\1\61\1\134\1\52\1\140\4\uffff\1\143\4\uffff\1\145\2\uffff\1\146\1\147\1\uffff\1\61\1\uffff\1\52\1\uffff\2\162\2\uffff\1\173\1\174\1\uffff\1\61\1\uffff\11\61\1\uffff\11\61\1\u0097\4\61\2\52\1\61\1\u00a2\3\61\1\u00a6\3\uffff\1\u00a8\1\uffff\1\61\1\uffff\1\u00ab\3\uffff\1\u00ac\10\uffff\1\u00ae\3\uffff\1\u00b3\1\uffff\2\52\2\167\1\uffff\1\167\1\uffff\1\167\2\uffff\2\61\1\u00c2\2\uffff\1\176\1\uffff\11\61\1\u00cd\6\61\1\u00d4\7\61\1\uffff\6\61\2\52\1\61\1\u00e7\1\uffff\3\61\3\uffff\1\u00eb\1\u00ec\13\uffff\1\52\1\u00f1\1\u00b9\1\uffff\1\167\2\uffff\1\167\1\u00f7\3\61\2\uffff\3\61\1\u0105\2\61\1\u0108\2\61\1\uffff\6\61\1\uffff\13\61\1\u011c\2\61\1\u011f\1\52\1\u0121\1\61\1\uffff\2\61\1\u0125\7\uffff\1\167\2\uffff\2\162\1\uffff\2\u00fa\1\uffff\3\61\1\uffff\1\u012f\1\uffff\3\61\1\u0135\1\uffff\2\61\1\uffff\1\61\1\u0139\4\61\1\u013e\2\61\1\u0141\1\61\1\u0143\7\61\1\uffff\1\61\1\u014c\1\uffff\1\u014d\1\uffff\1\u014e\1\u014f\1\u0150\2\uffff\1\167\2\u00fa\1\uffff\3\61\4\uffff\3\61\1\uffff\3\61\1\uffff\3\61\1\u0164\1\uffff\2\61\1\uffff\1\61\1\uffff\2\61\1\u016a\1\u016b\1\61\1\u016d\1\u016e\1\u016f\7\uffff\1\167\1\u00fa\1\u00f7\3\61\2\uffff\2\61\1\u0177\1\61\1\u0179\4\61\1\uffff\2\61\1\u0180\1\u0181\1\u0182\2\uffff\1\u0183\4\uffff\1\162\4\61\1\u0188\1\uffff\1\61\1\uffff\3\61\1\u018d\1\u018e\1\u018f\4\uffff\2\61\1\u0193\1\61\1\uffff\1\u0195\1\u0196\1\u0197\1\u0198\3\uffff\1\61\1\u019a\1\u019b\1\uffff\1\u019c\4\uffff\1\u019d\4\uffff";
    static final String DFA49_eofS =
        "\u019e\uffff";
    static final String DFA49_minS =
        "\1\11\14\42\1\101\4\42\1\75\1\56\1\42\1\41\1\72\1\41\4\uffff\1\55\4\uffff\1\42\2\uffff\2\41\1\0\1\42\1\0\1\76\1\uffff\2\43\2\uffff\2\42\1\uffff\1\42\1\0\11\42\1\uffff\16\42\1\117\1\114\6\42\3\uffff\1\74\1\uffff\1\42\1\uffff\1\41\3\uffff\1\41\4\uffff\1\42\3\uffff\2\42\2\0\1\44\1\0\1\72\1\76\2\60\1\uffff\2\60\1\53\1\60\1\uffff\3\42\2\uffff\1\42\1\uffff\30\42\1\uffff\6\42\1\115\1\114\2\42\1\uffff\3\42\3\uffff\2\42\4\uffff\2\0\1\uffff\1\0\1\uffff\2\0\1\72\2\60\1\uffff\2\43\3\60\3\42\1\uffff\1\0\11\42\1\uffff\6\42\1\uffff\17\42\1\105\1\60\1\42\1\uffff\3\42\2\uffff\2\0\3\uffff\1\53\1\60\1\43\1\101\1\60\1\uffff\1\60\1\53\1\uffff\3\42\1\0\1\44\1\0\4\42\1\uffff\2\42\1\uffff\23\42\1\uffff\2\42\1\uffff\1\60\1\uffff\3\42\1\uffff\1\0\1\53\3\60\3\42\1\0\1\uffff\2\0\3\42\1\uffff\3\42\1\uffff\4\42\1\uffff\2\42\1\uffff\1\42\1\uffff\10\42\5\uffff\1\0\2\60\1\53\1\60\3\42\1\0\1\uffff\11\42\1\uffff\5\42\2\uffff\1\42\3\uffff\1\0\1\60\5\42\1\uffff\1\42\1\uffff\6\42\4\uffff\4\42\1\uffff\4\42\3\uffff\3\42\1\uffff\1\42\4\uffff\1\42\4\uffff";
    static final String DFA49_maxS =
        "\1\u2aff\21\172\1\75\1\56\1\172\1\u2aff\1\72\1\u2aff\4\uffff\1\76\4\uffff\1\172\2\uffff\2\u2aff\1\uffff\1\172\1\uffff\1\176\1\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff\16\172\1\157\1\154\6\172\3\uffff\1\74\1\uffff\1\172\1\uffff\1\u2aff\3\uffff\1\u2aff\4\uffff\1\172\3\uffff\1\42\1\165\2\uffff\1\44\1\uffff\1\72\1\76\1\146\1\137\1\uffff\1\71\1\146\2\71\1\uffff\3\172\2\uffff\1\42\1\uffff\30\172\1\uffff\6\172\1\155\1\154\2\172\1\uffff\3\172\3\uffff\2\172\4\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\72\2\172\1\uffff\1\145\1\146\2\71\4\172\1\uffff\1\uffff\11\172\1\uffff\6\172\1\uffff\17\172\1\145\2\172\1\uffff\3\172\2\uffff\2\uffff\3\uffff\1\71\2\146\2\172\1\uffff\2\71\1\uffff\3\172\1\uffff\1\44\1\uffff\4\172\1\uffff\2\172\1\uffff\23\172\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\uffff\1\71\1\145\2\71\3\172\1\uffff\1\uffff\2\uffff\3\172\1\uffff\3\172\1\uffff\4\172\1\uffff\2\172\1\uffff\1\172\1\uffff\10\172\5\uffff\1\uffff\3\71\4\172\1\uffff\1\uffff\11\172\1\uffff\5\172\2\uffff\1\172\3\uffff\1\uffff\6\172\1\uffff\1\172\1\uffff\6\172\4\uffff\4\172\1\uffff\4\172\3\uffff\3\172\1\uffff\1\172\4\uffff\1\172\4\uffff";
    static final String DFA49_acceptS =
        "\30\uffff\1\74\1\75\1\76\1\100\1\uffff\1\104\1\106\1\111\1\112\1\uffff\1\114\1\115\6\uffff\1\132\2\uffff\1\142\1\144\2\uffff\1\143\13\uffff\1\107\26\uffff\1\110\1\52\1\77\1\uffff\1\102\1\uffff\1\63\1\uffff\1\103\1\127\1\65\1\uffff\1\105\1\130\1\137\1\101\1\uffff\1\113\1\116\1\117\12\uffff\1\141\4\uffff\1\135\3\uffff\1\72\1\71\1\uffff\1\123\30\uffff\1\67\12\uffff\1\70\3\uffff\1\73\1\53\1\62\2\uffff\1\64\1\66\1\121\1\120\2\uffff\1\120\1\uffff\1\125\5\uffff\1\134\10\uffff\1\56\12\uffff\1\55\6\uffff\1\57\22\uffff\1\54\3\uffff\1\60\1\61\2\uffff\1\126\1\131\1\133\5\uffff\1\140\2\uffff\1\136\12\uffff\1\45\2\uffff\1\46\23\uffff\1\47\2\uffff\1\50\1\uffff\1\44\3\uffff\1\51\11\uffff\1\124\5\uffff\1\33\3\uffff\1\35\4\uffff\1\40\2\uffff\1\37\1\uffff\1\36\10\uffff\1\41\1\32\1\34\1\42\1\43\11\uffff\1\122\11\uffff\1\30\5\uffff\1\25\1\26\1\uffff\1\24\1\27\1\31\7\uffff\1\21\1\uffff\1\22\6\uffff\1\16\1\23\1\17\1\20\4\uffff\1\13\4\uffff\1\15\1\12\1\14\3\uffff\1\10\1\uffff\1\5\1\6\1\7\1\11\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA49_specialS =
        "\46\uffff\1\4\1\uffff\1\6\12\uffff\1\3\66\uffff\1\21\1\7\1\uffff\1\22\101\uffff\1\20\1\2\1\uffff\1\10\1\uffff\1\11\1\1\15\uffff\1\5\51\uffff\1\24\1\12\17\uffff\1\14\1\uffff\1\13\45\uffff\1\25\7\uffff\1\15\1\uffff\1\16\1\23\37\uffff\1\26\7\uffff\1\17\26\uffff\1\0\55\uffff}>";
    static final String[] DFA49_transitionS = DFA49_transitionS_.DFA49_transitionS;
    private static final class DFA49_transitionS_ {
        static final String[] DFA49_transitionS = {
                "\2\56\2\uffff\1\56\22\uffff\1\56\1\52\1\46\1\uffff\1\50\2\52\1\55\1\30\1\31\1\32\1\22\1\33\1\34\1\23\1\52\1\53\11\54\1\25\1\35\1\26\1\27\1\52\1\36\1\uffff\1\10\1\11\1\2\1\16\1\3\1\4\1\5\1\13\1\1\3\47\1\7\1\12\3\47\1\6\1\14\1\21\1\47\1\24\1\17\1\47\1\20\1\47\1\37\1\15\1\40\1\52\1\41\1\uffff\1\10\1\11\1\2\1\16\1\3\1\4\1\5\1\13\1\1\3\47\1\7\1\12\3\47\1\6\1\14\1\21\1\47\1\24\1\17\1\47\1\20\1\47\1\42\1\52\1\43\1\51\u2181\uffff\1\44\2\52\1\45\u00fc\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\1\63\15\uffff\12\62\7\uffff\5\62\1\60\7\62\1\57\14\62\6\uffff\5\62\1\60\7\62\1\57\14\62",
                "\1\63\15\uffff\12\62\7\uffff\1\66\12\62\1\64\2\62\1\65\13\62\6\uffff\1\66\12\62\1\64\2\62\1\65\13\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\71\1\62\1\70\11\62\1\67\2\62\6\uffff\13\62\1\71\1\62\1\70\11\62\1\67\2\62",
                "\1\63\15\uffff\12\62\7\uffff\1\73\15\62\1\74\5\62\1\72\5\62\4\uffff\1\61\1\uffff\1\73\15\62\1\74\5\62\1\72\5\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\76\5\62\6\uffff\24\62\1\76\5\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\77\25\62\6\uffff\4\62\1\77\25\62",
                "\1\63\15\uffff\12\62\7\uffff\1\102\3\62\1\103\11\62\1\101\5\62\1\100\5\62\6\uffff\1\102\3\62\1\103\11\62\1\101\5\62\1\100\5\62",
                "\1\63\15\uffff\12\62\7\uffff\17\62\1\104\2\62\1\105\7\62\6\uffff\17\62\1\104\2\62\1\105\7\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\106\17\62\1\107\1\62\6\uffff\10\62\1\106\17\62\1\107\1\62",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\110\13\62\6\uffff\16\62\1\110\13\62",
                "\1\63\15\uffff\12\62\7\uffff\1\111\31\62\6\uffff\1\111\31\62",
                "\1\63\15\uffff\12\62\7\uffff\17\62\1\113\3\62\1\112\6\62\6\uffff\17\62\1\113\3\62\1\112\6\62",
                "\1\115\21\52\1\114\7\52\4\uffff\1\52\1\uffff\1\115\21\52\1\114\7\52",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\116\11\62\1\117\13\62\6\uffff\4\62\1\116\11\62\1\117\13\62",
                "\1\63\15\uffff\12\62\7\uffff\7\62\1\120\22\62\6\uffff\7\62\1\120\22\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\121\21\62\6\uffff\10\62\1\121\21\62",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\123\2\62\1\122\10\62\4\uffff\1\61\1\uffff\16\62\1\123\2\62\1\122\10\62",
                "\1\125",
                "\1\127",
                "\1\63\15\uffff\12\62\7\uffff\1\131\31\62\6\uffff\1\131\31\62",
                "\1\135\3\uffff\2\135\10\uffff\1\135\12\uffff\1\132\1\uffff\1\135\1\133\1\135\37\uffff\1\135\35\uffff\1\135\1\uffff\1\135\u2181\uffff\u0100\135\u04c0\uffff\60\135\u0190\uffff\u0180\135",
                "\1\136",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\2\52\1\137\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "",
                "",
                "",
                "",
                "\1\142\20\uffff\1\141",
                "",
                "",
                "",
                "",
                "\1\63\15\uffff\12\144\7\uffff\32\144\6\uffff\32\144",
                "",
                "",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\42\152\1\150\71\152\1\151\uffa3\152",
                "\1\63\15\uffff\12\62\7\uffff\32\62\6\uffff\32\62",
                "\42\153\1\155\1\153\1\154\uffdb\153",
                "\1\156\77\uffff\1\157",
                "",
                "\1\164\12\uffff\1\166\1\uffff\12\54\7\uffff\4\167\1\165\25\167\4\uffff\1\163\1\uffff\1\167\1\161\2\167\1\165\22\167\1\160\2\167",
                "\1\164\12\uffff\1\166\1\uffff\12\54\7\uffff\4\167\1\165\25\167\4\uffff\1\163\1\uffff\4\167\1\165\25\167",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\171\12\62\1\170\1\62\1\172\4\62\4\uffff\1\61\1\uffff\10\62\1\171\12\62\1\170\1\62\1\172\4\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\6\uffff\32\62",
                "\42\176\1\175\uffdd\176",
                "\1\63\15\uffff\12\62\7\uffff\1\177\31\62\6\uffff\1\177\31\62",
                "\1\63\15\uffff\12\62\7\uffff\14\62\1\u0081\1\u0080\14\62\6\uffff\14\62\1\u0081\1\u0080\14\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0082\7\62\6\uffff\22\62\1\u0082\7\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0083\6\62\6\uffff\23\62\1\u0083\6\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0084\7\62\6\uffff\22\62\1\u0084\7\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0085\7\62\6\uffff\22\62\1\u0085\7\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0086\14\62\6\uffff\15\62\1\u0086\14\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u0087\16\62\6\uffff\13\62\1\u0087\16\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u0088\10\62\6\uffff\21\62\1\u0088\10\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\1\u0089\31\62\6\uffff\1\u0089\31\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u008d\4\62\1\u008a\12\62\1\u008b\2\62\1\u008c\6\62\6\uffff\1\u008d\4\62\1\u008a\12\62\1\u008b\2\62\1\u008c\6\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u008e\1\u008f\6\62\6\uffff\22\62\1\u008e\1\u008f\6\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u0090\26\62\6\uffff\3\62\1\u0090\26\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0092\4\62\1\u0091\1\62\6\uffff\23\62\1\u0092\4\62\1\u0091\1\62",
                "\1\63\15\uffff\12\62\7\uffff\14\62\1\u0093\15\62\6\uffff\14\62\1\u0093\15\62",
                "\1\63\15\uffff\12\62\7\uffff\17\62\1\u0094\12\62\6\uffff\17\62\1\u0094\12\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0095\7\62\6\uffff\22\62\1\u0095\7\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0096\14\62\6\uffff\15\62\1\u0096\14\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0098\7\62\6\uffff\22\62\1\u0098\7\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u009a\1\62\1\u0099\14\62\6\uffff\13\62\1\u009a\1\62\1\u0099\14\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u009c\20\62\1\u009b\10\62\6\uffff\1\u009c\20\62\1\u009b\10\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u009d\25\62\6\uffff\4\62\1\u009d\25\62",
                "\1\u009e\37\uffff\1\u009e",
                "\1\u009f\37\uffff\1\u009f",
                "\1\63\15\uffff\12\62\7\uffff\5\62\1\u00a1\5\62\1\u00a0\16\62\6\uffff\5\62\1\u00a1\5\62\1\u00a0\16\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u00a3\21\62\6\uffff\10\62\1\u00a3\21\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00a4\25\62\6\uffff\4\62\1\u00a4\25\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\u00a5\5\62\6\uffff\24\62\1\u00a5\5\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "\1\u00a7",
                "",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u00a9\5\62\1\u00aa\10\62\6\uffff\13\62\1\u00a9\5\62\1\u00aa\10\62",
                "",
                "\1\135\3\uffff\2\135\10\uffff\1\135\14\uffff\3\135\37\uffff\1\135\35\uffff\1\135\1\uffff\1\135\u2181\uffff\u0100\135\u04c0\uffff\60\135\u0190\uffff\u0180\135",
                "",
                "",
                "",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "",
                "",
                "",
                "",
                "\1\63\15\uffff\12\144\7\uffff\32\144\6\uffff\32\144",
                "",
                "",
                "",
                "\1\u00ad",
                "\1\u00af\4\uffff\1\u00af\64\uffff\1\u00af\5\uffff\1\u00af\3\uffff\1\u00af\7\uffff\1\u00af\3\uffff\1\u00af\1\uffff\1\u00af\1\u00b0",
                "\42\152\1\u00b1\71\152\1\151\uffa3\152",
                "\42\153\1\155\1\153\1\154\uffdb\153",
                "\1\u00b2",
                "\42\u00b4\1\u00b5\uffdd\u00b4",
                "\1\141",
                "\1\u00b6",
                "\12\u00b7\7\uffff\6\u00b7\32\uffff\6\u00b7",
                "\2\u00b8\55\uffff\1\u00b9",
                "",
                "\12\u00ba",
                "\12\u00bb\7\uffff\6\u00bb\32\uffff\6\u00bb",
                "\1\u00bc\4\uffff\12\u00bd",
                "\12\u00be",
                "",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00bf\25\62\6\uffff\4\62\1\u00bf\25\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u00c0\6\62\6\uffff\23\62\1\u00c0\6\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u00c1\31\62\4\uffff\1\61\1\uffff\1\u00c1\31\62",
                "",
                "",
                "\1\u00c3",
                "",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u00c4\7\62\6\uffff\22\62\1\u00c4\7\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u00c5\7\62\6\uffff\22\62\1\u00c5\7\62",
                "\1\63\15\uffff\12\62\7\uffff\17\62\1\u00c6\12\62\6\uffff\17\62\1\u00c6\12\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00c7\25\62\6\uffff\4\62\1\u00c7\25\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00c8\25\62\6\uffff\4\62\1\u00c8\25\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\u00c9\5\62\6\uffff\24\62\1\u00c9\5\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00ca\25\62\6\uffff\4\62\1\u00ca\25\62",
                "\1\63\15\uffff\12\62\7\uffff\2\62\1\u00cb\27\62\6\uffff\2\62\1\u00cb\27\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u00cc\7\62\6\uffff\22\62\1\u00cc\7\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u00ce\10\62\6\uffff\21\62\1\u00ce\10\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00cf\25\62\6\uffff\4\62\1\u00cf\25\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\u00d0\5\62\6\uffff\24\62\1\u00d0\5\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\u00d1\5\62\6\uffff\24\62\1\u00d1\5\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u00d2\26\62\6\uffff\3\62\1\u00d2\26\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u00d3\6\62\6\uffff\23\62\1\u00d3\6\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00d6\3\62\1\u00d5\21\62\6\uffff\4\62\1\u00d6\3\62\1\u00d5\21\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u00d7\7\62\6\uffff\22\62\1\u00d7\7\62",
                "\1\63\15\uffff\12\62\7\uffff\2\62\1\u00d8\27\62\6\uffff\2\62\1\u00d8\27\62",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\u00d9\13\62\6\uffff\16\62\1\u00d9\13\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u00da\16\62\6\uffff\13\62\1\u00da\16\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00db\17\62\1\u00dc\5\62\6\uffff\4\62\1\u00db\17\62\1\u00dc\5\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u00dd\26\62\6\uffff\3\62\1\u00dd\26\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00de\25\62\6\uffff\4\62\1\u00de\25\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u00df\26\62\6\uffff\3\62\1\u00df\26\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u00e0\6\62\6\uffff\23\62\1\u00e0\6\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u00e1\21\62\6\uffff\10\62\1\u00e1\21\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u00e2\6\62\6\uffff\23\62\1\u00e2\6\62",
                "\1\63\15\uffff\12\62\7\uffff\2\62\1\u00e3\27\62\6\uffff\2\62\1\u00e3\27\62",
                "\1\u00e4\37\uffff\1\u00e4",
                "\1\u00e5\37\uffff\1\u00e5",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u00e6\6\62\6\uffff\23\62\1\u00e6\6\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u00e8\16\62\6\uffff\13\62\1\u00e8\16\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u00e9\16\62\6\uffff\13\62\1\u00e9\16\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u00ea\25\62\6\uffff\4\62\1\u00ea\25\62",
                "",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "",
                "\42\152\1\u00b1\71\152\1\151\uffa3\152",
                "\60\55\12\u00ed\7\55\6\u00ed\32\55\6\u00ed\uff99\55",
                "",
                "\42\153\1\155\1\153\1\154\uffdb\153",
                "",
                "\42\153\1\155\1\153\1\154\uffdb\153",
                "\42\u00ee\1\u00ef\uffdd\u00ee",
                "\1\u00f0",
                "\12\u00b7\7\uffff\6\u00b7\24\167\6\uffff\6\u00b7\24\167",
                "\2\u00b8\10\167\7\uffff\32\167\6\uffff\32\167",
                "",
                "\1\164\12\uffff\1\166\1\uffff\12\u00ba\13\uffff\1\u00f2\31\uffff\1\163\5\uffff\1\u00f2",
                "\1\u00f5\14\uffff\12\u00f4\7\uffff\6\u00f4\30\uffff\1\u00f3\1\uffff\6\u00f4",
                "\12\u00f6",
                "\12\u00bd",
                "\12\u00be\7\uffff\4\u00fa\1\u00f9\25\u00fa\4\uffff\1\u00f8\1\uffff\4\u00fa\1\u00f9\25\u00fa",
                "\1\63\15\uffff\12\62\7\uffff\6\62\1\u00fb\23\62\6\uffff\6\62\1\u00fb\23\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u00fc\21\62\6\uffff\10\62\1\u00fc\21\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u00fd\10\62\6\uffff\21\62\1\u00fd\10\62",
                "",
                "\42\u00fe\1\u0100\1\u00fe\1\u00ff\uffdb\u00fe",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0101\7\62\6\uffff\22\62\1\u0101\7\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0102\6\62\6\uffff\23\62\1\u0102\6\62",
                "\1\63\15\uffff\12\62\7\uffff\24\62\1\u0103\5\62\6\uffff\24\62\1\u0103\5\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0104\7\62\4\uffff\1\61\1\uffff\22\62\1\u0104\7\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0106\14\62\6\uffff\15\62\1\u0106\14\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u0107\10\62\6\uffff\21\62\1\u0107\10\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0109\6\62\6\uffff\23\62\1\u0109\6\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u010a\25\62\6\uffff\4\62\1\u010a\25\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\1\u010b\31\62\6\uffff\1\u010b\31\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u010c\10\62\6\uffff\21\62\1\u010c\10\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u010d\21\62\6\uffff\10\62\1\u010d\21\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u010e\10\62\6\uffff\21\62\1\u010e\10\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u010f\7\62\6\uffff\22\62\1\u010f\7\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0110\7\62\6\uffff\22\62\1\u0110\7\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\5\62\1\u0111\24\62\6\uffff\5\62\1\u0111\24\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0112\7\62\6\uffff\22\62\1\u0112\7\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0113\25\62\6\uffff\4\62\1\u0113\25\62",
                "\1\63\15\uffff\12\62\7\uffff\7\62\1\u0114\22\62\6\uffff\7\62\1\u0114\22\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0115\21\62\6\uffff\10\62\1\u0115\21\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0116\21\62\6\uffff\10\62\1\u0116\21\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u0117\10\62\6\uffff\21\62\1\u0117\10\62",
                "\1\63\15\uffff\12\62\7\uffff\14\62\1\u0118\15\62\6\uffff\14\62\1\u0118\15\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0119\21\62\6\uffff\10\62\1\u0119\21\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u011a\14\62\6\uffff\15\62\1\u011a\14\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u011b\16\62\6\uffff\13\62\1\u011b\16\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\2\62\1\u011d\27\62\6\uffff\2\62\1\u011d\27\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u011e\25\62\6\uffff\4\62\1\u011e\25\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\u0120\37\uffff\1\u0120",
                "\12\52\7\uffff\32\52\6\uffff\32\52",
                "\1\63\15\uffff\12\62\7\uffff\1\u0122\31\62\6\uffff\1\u0122\31\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0123\25\62\6\uffff\4\62\1\u0123\25\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u0124\26\62\6\uffff\3\62\1\u0124\26\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "\60\55\12\u0126\7\55\6\u0126\32\55\6\u0126\uff99\55",
                "\42\153\1\155\1\153\1\154\uffdb\153",
                "",
                "",
                "",
                "\1\u00bc\4\uffff\12\u00bd",
                "\12\u00f4\7\uffff\6\u00f4\32\uffff\6\u00f4",
                "\1\u00f5\14\uffff\12\u00f4\7\uffff\6\u00f4\30\uffff\1\u00f3\1\uffff\6\u00f4",
                "\4\167\1\u0127\25\167\4\uffff\1\167\1\uffff\4\167\1\u0127\25\167",
                "\12\u00f6\7\uffff\32\167\4\uffff\1\167\1\uffff\32\167",
                "",
                "\12\u0128",
                "\1\u012a\1\uffff\1\u012a\2\uffff\12\u0129",
                "",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u012b\10\62\6\uffff\21\62\1\u012b\10\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u012c\31\62\6\uffff\1\u012c\31\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u012d\21\62\6\uffff\10\62\1\u012d\21\62",
                "\42\u00fe\1\u0100\1\u00fe\1\u00ff\uffdb\u00fe",
                "\1\u012e",
                "\42\u0130\1\u0131\uffdd\u0130",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0132\21\62\6\uffff\10\62\1\u0132\21\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u0133\31\62\6\uffff\1\u0133\31\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0134\6\62\6\uffff\23\62\1\u0134\6\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0136\7\62\6\uffff\22\62\1\u0136\7\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0137\25\62\6\uffff\4\62\1\u0137\25\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0138\21\62\6\uffff\10\62\1\u0138\21\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u013a\14\62\6\uffff\15\62\1\u013a\14\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u013b\25\62\6\uffff\4\62\1\u013b\25\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u013c\10\62\6\uffff\21\62\1\u013c\10\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u013d\14\62\6\uffff\15\62\1\u013d\14\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u013f\25\62\6\uffff\4\62\1\u013f\25\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0140\21\62\6\uffff\10\62\1\u0140\21\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0142\14\62\6\uffff\15\62\1\u0142\14\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\31\62\1\u0144\6\uffff\31\62\1\u0144",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0145\25\62\6\uffff\4\62\1\u0145\25\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0146\6\62\6\uffff\23\62\1\u0146\6\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0147\25\62\6\uffff\4\62\1\u0147\25\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0148\14\62\6\uffff\15\62\1\u0148\14\62",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u0149\26\62\6\uffff\3\62\1\u0149\26\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u014a\25\62\6\uffff\4\62\1\u014a\25\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u014b\6\62\6\uffff\23\62\1\u014b\6\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\12\52\7\uffff\32\52\6\uffff\32\52",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\60\55\12\u0151\7\55\6\u0151\32\55\6\u0151\uff99\55",
                "\1\u0152\4\uffff\12\u0153",
                "\12\u0128\13\uffff\1\u0154\31\uffff\1\u00f8\5\uffff\1\u0154",
                "\12\u0129",
                "\12\u0155",
                "\1\63\15\uffff\12\62\7\uffff\1\u0156\31\62\6\uffff\1\u0156\31\62",
                "\1\63\15\uffff\12\62\7\uffff\13\62\1\u0157\16\62\6\uffff\13\62\1\u0157\16\62",
                "\1\63\15\uffff\12\62\7\uffff\1\u0158\31\62\6\uffff\1\u0158\31\62",
                "\42\u00fe\1\u0100\1\u00fe\1\u00ff\uffdb\u00fe",
                "",
                "\42\u00fe\1\u0100\1\u00fe\1\u00ff\uffdb\u00fe",
                "\42\u0159\1\u015a\uffdd\u0159",
                "\1\63\15\uffff\12\62\7\uffff\5\62\1\u015b\24\62\6\uffff\5\62\1\u015b\24\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u015c\14\62\6\uffff\15\62\1\u015c\14\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u015d\25\62\6\uffff\4\62\1\u015d\25\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u015e\21\62\6\uffff\10\62\1\u015e\21\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u015f\7\62\6\uffff\22\62\1\u015f\7\62",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\u0160\13\62\6\uffff\16\62\1\u0160\13\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0161\6\62\6\uffff\23\62\1\u0161\6\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0162\14\62\6\uffff\15\62\1\u0162\14\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0163\25\62\6\uffff\4\62\1\u0163\25\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0165\14\62\6\uffff\15\62\1\u0165\14\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0166\25\62\6\uffff\4\62\1\u0166\25\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u0167\26\62\6\uffff\3\62\1\u0167\26\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0168\25\62\6\uffff\4\62\1\u0168\25\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0169\7\62\6\uffff\22\62\1\u0169\7\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\6\62\1\u016c\23\62\6\uffff\6\62\1\u016c\23\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "",
                "",
                "\60\55\12\u0170\7\55\6\u0170\32\55\6\u0170\uff99\55",
                "\12\u0171",
                "\12\u0153",
                "\1\u012a\1\uffff\1\u012a\2\uffff\12\u0129",
                "\12\u0155\7\uffff\32\u00fa\4\uffff\1\u00fa\1\uffff\32\u00fa",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0172\6\62\6\uffff\23\62\1\u0172\6\62",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0173\21\62\6\uffff\10\62\1\u0173\21\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0174\14\62\6\uffff\15\62\1\u0174\14\62",
                "\42\u00fe\1\u0100\1\u00fe\1\u00ff\uffdb\u00fe",
                "",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0175\21\62\6\uffff\10\62\1\u0175\21\62",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0176\6\62\6\uffff\23\62\1\u0176\6\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\u0178\13\62\6\uffff\16\62\1\u0178\13\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u017a\14\62\6\uffff\15\62\1\u017a\14\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u017b\25\62\6\uffff\4\62\1\u017b\25\62",
                "\1\63\15\uffff\12\62\7\uffff\2\62\1\u017c\27\62\6\uffff\2\62\1\u017c\27\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u017d\7\62\6\uffff\22\62\1\u017d\7\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\3\62\1\u017e\26\62\6\uffff\3\62\1\u017e\26\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u017f\7\62\6\uffff\22\62\1\u017f\7\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "\42\152\1\u00b1\71\152\1\151\uffa3\152",
                "\12\u0171\7\uffff\32\167\4\uffff\1\167\1\uffff\32\167",
                "\1\63\15\uffff\12\62\7\uffff\10\62\1\u0184\21\62\6\uffff\10\62\1\u0184\21\62",
                "\1\63\15\uffff\12\62\7\uffff\31\62\1\u0185\6\uffff\31\62\1\u0185",
                "\1\63\15\uffff\12\62\7\uffff\23\62\1\u0186\6\62\6\uffff\23\62\1\u0186\6\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0187\25\62\6\uffff\4\62\1\u0187\25\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0189\14\62\6\uffff\15\62\1\u0189\14\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u018a\7\62\6\uffff\22\62\1\u018a\7\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u018b\25\62\6\uffff\4\62\1\u018b\25\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u018c\25\62\6\uffff\4\62\1\u018c\25\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\16\62\1\u0190\13\62\6\uffff\16\62\1\u0190\13\62",
                "\1\63\15\uffff\12\62\7\uffff\4\62\1\u0191\25\62\6\uffff\4\62\1\u0191\25\62",
                "\1\63\15\uffff\12\62\7\uffff\22\62\1\u0192\7\62\4\uffff\1\61\1\uffff\22\62\1\u0192\7\62",
                "\1\63\15\uffff\12\62\7\uffff\21\62\1\u0194\10\62\6\uffff\21\62\1\u0194\10\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\15\62\1\u0199\14\62\6\uffff\15\62\1\u0199\14\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                "",
                "\1\63\15\uffff\12\62\7\uffff\32\62\4\uffff\1\61\1\uffff\32\62",
                "",
                "",
                "",
                ""
        };
    }

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    static class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | MustSend | Constant | Modifies | Requires | MaySend | Applies | Binding | Compute | Ensures | Memoize | NoSend | Assert | Assume | Handle | Return | Strict | Some | Cases | Delta | False | Match | Modes | Reads | State | While | Yield | All | Case | Else | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_IMPLIES | RULE_SIMPLIES | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_368 = input.LA(1);

                        s = -1;
                        if ( (LA49_368=='\"') ) {s = 177;}

                        else if ( (LA49_368=='\\') ) {s = 105;}

                        else if ( ((LA49_368>='\u0000' && LA49_368<='!')||(LA49_368>='#' && LA49_368<='[')||(LA49_368>=']' && LA49_368<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_181 = input.LA(1);

                        s = -1;
                        if ( ((LA49_181>='\u0000' && LA49_181<='!')||(LA49_181>='#' && LA49_181<='\uFFFF')) ) {s = 238;}

                        else if ( (LA49_181=='\"') ) {s = 239;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_176 = input.LA(1);

                        s = -1;
                        if ( ((LA49_176>='\u0000' && LA49_176<='/')||(LA49_176>=':' && LA49_176<='@')||(LA49_176>='G' && LA49_176<='`')||(LA49_176>='g' && LA49_176<='\uFFFF')) ) {s = 45;}

                        else if ( ((LA49_176>='0' && LA49_176<='9')||(LA49_176>='A' && LA49_176<='F')||(LA49_176>='a' && LA49_176<='f')) ) {s = 237;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_51 = input.LA(1);

                        s = -1;
                        if ( (LA49_51=='\"') ) {s = 125;}

                        else if ( ((LA49_51>='\u0000' && LA49_51<='!')||(LA49_51>='#' && LA49_51<='\uFFFF')) ) {s = 126;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_38 = input.LA(1);

                        s = -1;
                        if ( (LA49_38=='\"') ) {s = 104;}

                        else if ( (LA49_38=='\\') ) {s = 105;}

                        else if ( ((LA49_38>='\u0000' && LA49_38<='!')||(LA49_38>='#' && LA49_38<='[')||(LA49_38>=']' && LA49_38<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_195 = input.LA(1);

                        s = -1;
                        if ( ((LA49_195>='\u0000' && LA49_195<='!')||LA49_195=='#'||(LA49_195>='%' && LA49_195<='\uFFFF')) ) {s = 254;}

                        else if ( (LA49_195=='$') ) {s = 255;}

                        else if ( (LA49_195=='\"') ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_40 = input.LA(1);

                        s = -1;
                        if ( ((LA49_40>='\u0000' && LA49_40<='!')||LA49_40=='#'||(LA49_40>='%' && LA49_40<='\uFFFF')) ) {s = 107;}

                        else if ( (LA49_40=='$') ) {s = 108;}

                        else if ( (LA49_40=='\"') ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_107 = input.LA(1);

                        s = -1;
                        if ( (LA49_107=='\"') ) {s = 109;}

                        else if ( ((LA49_107>='\u0000' && LA49_107<='!')||LA49_107=='#'||(LA49_107>='%' && LA49_107<='\uFFFF')) ) {s = 107;}

                        else if ( (LA49_107=='$') ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_178 = input.LA(1);

                        s = -1;
                        if ( (LA49_178=='\"') ) {s = 109;}

                        else if ( ((LA49_178>='\u0000' && LA49_178<='!')||LA49_178=='#'||(LA49_178>='%' && LA49_178<='\uFFFF')) ) {s = 107;}

                        else if ( (LA49_178=='$') ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_180 = input.LA(1);

                        s = -1;
                        if ( (LA49_180=='\"') ) {s = 109;}

                        else if ( ((LA49_180>='\u0000' && LA49_180<='!')||LA49_180=='#'||(LA49_180>='%' && LA49_180<='\uFFFF')) ) {s = 107;}

                        else if ( (LA49_180=='$') ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_238 = input.LA(1);

                        s = -1;
                        if ( (LA49_238=='\"') ) {s = 109;}

                        else if ( ((LA49_238>='\u0000' && LA49_238<='!')||LA49_238=='#'||(LA49_238>='%' && LA49_238<='\uFFFF')) ) {s = 107;}

                        else if ( (LA49_238=='$') ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_256 = input.LA(1);

                        s = -1;
                        if ( ((LA49_256>='\u0000' && LA49_256<='!')||(LA49_256>='#' && LA49_256<='\uFFFF')) ) {s = 304;}

                        else if ( (LA49_256=='\"') ) {s = 305;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_254 = input.LA(1);

                        s = -1;
                        if ( (LA49_254=='$') ) {s = 255;}

                        else if ( ((LA49_254>='\u0000' && LA49_254<='!')||LA49_254=='#'||(LA49_254>='%' && LA49_254<='\uFFFF')) ) {s = 254;}

                        else if ( (LA49_254=='\"') ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_302 = input.LA(1);

                        s = -1;
                        if ( (LA49_302=='$') ) {s = 255;}

                        else if ( ((LA49_302>='\u0000' && LA49_302<='!')||LA49_302=='#'||(LA49_302>='%' && LA49_302<='\uFFFF')) ) {s = 254;}

                        else if ( (LA49_302=='\"') ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA49_304 = input.LA(1);

                        s = -1;
                        if ( (LA49_304=='\"') ) {s = 256;}

                        else if ( ((LA49_304>='\u0000' && LA49_304<='!')||LA49_304=='#'||(LA49_304>='%' && LA49_304<='\uFFFF')) ) {s = 254;}

                        else if ( (LA49_304=='$') ) {s = 255;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA49_345 = input.LA(1);

                        s = -1;
                        if ( (LA49_345=='$') ) {s = 255;}

                        else if ( ((LA49_345>='\u0000' && LA49_345<='!')||LA49_345=='#'||(LA49_345>='%' && LA49_345<='\uFFFF')) ) {s = 254;}

                        else if ( (LA49_345=='\"') ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA49_175 = input.LA(1);

                        s = -1;
                        if ( (LA49_175=='\"') ) {s = 177;}

                        else if ( (LA49_175=='\\') ) {s = 105;}

                        else if ( ((LA49_175>='\u0000' && LA49_175<='!')||(LA49_175>='#' && LA49_175<='[')||(LA49_175>=']' && LA49_175<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA49_106 = input.LA(1);

                        s = -1;
                        if ( (LA49_106=='\"') ) {s = 177;}

                        else if ( (LA49_106=='\\') ) {s = 105;}

                        else if ( ((LA49_106>='\u0000' && LA49_106<='!')||(LA49_106>='#' && LA49_106<='[')||(LA49_106>=']' && LA49_106<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA49_109 = input.LA(1);

                        s = -1;
                        if ( ((LA49_109>='\u0000' && LA49_109<='!')||(LA49_109>='#' && LA49_109<='\uFFFF')) ) {s = 180;}

                        else if ( (LA49_109=='\"') ) {s = 181;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA49_305 = input.LA(1);

                        s = -1;
                        if ( ((LA49_305>='\u0000' && LA49_305<='!')||(LA49_305>='#' && LA49_305<='\uFFFF')) ) {s = 345;}

                        else if ( (LA49_305=='\"') ) {s = 346;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA49_237 = input.LA(1);

                        s = -1;
                        if ( ((LA49_237>='\u0000' && LA49_237<='/')||(LA49_237>=':' && LA49_237<='@')||(LA49_237>='G' && LA49_237<='`')||(LA49_237>='g' && LA49_237<='\uFFFF')) ) {s = 45;}

                        else if ( ((LA49_237>='0' && LA49_237<='9')||(LA49_237>='A' && LA49_237<='F')||(LA49_237>='a' && LA49_237<='f')) ) {s = 294;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA49_294 = input.LA(1);

                        s = -1;
                        if ( ((LA49_294>='\u0000' && LA49_294<='/')||(LA49_294>=':' && LA49_294<='@')||(LA49_294>='G' && LA49_294<='`')||(LA49_294>='g' && LA49_294<='\uFFFF')) ) {s = 45;}

                        else if ( ((LA49_294>='0' && LA49_294<='9')||(LA49_294>='A' && LA49_294<='F')||(LA49_294>='a' && LA49_294<='f')) ) {s = 337;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA49_337 = input.LA(1);

                        s = -1;
                        if ( ((LA49_337>='0' && LA49_337<='9')||(LA49_337>='A' && LA49_337<='F')||(LA49_337>='a' && LA49_337<='f')) ) {s = 368;}

                        else if ( ((LA49_337>='\u0000' && LA49_337<='/')||(LA49_337>=':' && LA49_337<='@')||(LA49_337>='G' && LA49_337<='`')||(LA49_337>='g' && LA49_337<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}