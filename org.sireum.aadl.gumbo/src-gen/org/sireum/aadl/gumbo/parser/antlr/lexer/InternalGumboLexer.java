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
    public static final int Enum=41;
    public static final int Val=51;
    public static final int RULE_HEX=98;
    public static final int EqualsSignGreaterThanSign=57;
    public static final int Var=52;
    public static final int False=30;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=45;
    public static final int LeftParenthesis=63;
    public static final int RULE_MSTRING=85;
    public static final int RULE_SLANG_STRING=84;
    public static final int RULE_OP=96;
    public static final int RULE_BIN=99;
    public static final int RULE_ESC_SEQ=83;
    public static final int RULE_ID=111;
    public static final int RULE_DIGIT=89;
    public static final int ColonColon=54;
    public static final int Some=28;
    public static final int RULE_REAL_IDF=103;
    public static final int PlusSign=66;
    public static final int LeftSquareBracket=76;
    public static final int If=60;
    public static final int Halt=42;
    public static final int F=74;
    public static final int ThereExists=82;
    public static final int RULE_REAL_LIT=102;
    public static final int Classifier=5;
    public static final int Case=39;
    public static final int Comma=67;
    public static final int HyphenMinus=68;
    public static final int T=75;
    public static final int RULE_MSPE=93;
    public static final int Guarantee=10;
    public static final int RightCurlyBracket=80;
    public static final int RULE_MSPB=91;
    public static final int Modes=33;
    public static final int FullStop=69;
    public static final int Reference=12;
    public static final int RULE_UNICODE_ESC=105;
    public static final int Functions=9;
    public static final int KW__=78;
    public static final int Semicolon=71;
    public static final int RULE_LETTER=104;
    public static final int RULE_EXPONENT=107;
    public static final int Delta=29;
    public static final int QuestionMark=73;
    public static final int RULE_SLI=90;
    public static final int Memoize=23;
    public static final int By=58;
    public static final int Else=40;
    public static final int RULE_EXTENDED_DIGIT=97;
    public static final int Yield=37;
    public static final int All=38;
    public static final int True=44;
    public static final int RULE_INT_EXPONENT=108;
    public static final int In_1=61;
    public static final int FullStopFullStop=53;
    public static final int LessThanSignColon=56;
    public static final int Ensures=21;
    public static final int To=62;
    public static final int Applies=18;
    public static final int RULE_MSP=88;
    public static final int RULE_BASED_INTEGER=109;
    public static final int RightSquareBracket=77;
    public static final int Binding=19;
    public static final int RULE_MSPM=92;
    public static final int RULE_DEFOP=95;
    public static final int RULE_MSPI=87;
    public static final int Requires=16;
    public static final int For=48;
    public static final int RightParenthesis=64;
    public static final int Do=59;
    public static final int ColonEqualsSign=55;
    public static final int Mut=50;
    public static final int Gumbo=31;
    public static final int State=35;
    public static final int Assume=25;
    public static final int Library=22;
    public static final int RULE_INTEGER_LIT=100;
    public static final int Invariant=11;
    public static final int Constant=14;
    public static final int RULE_STRING=110;
    public static final int Match=32;
    public static final int Reads=34;
    public static final int RULE_SL_COMMENT=106;
    public static final int Inv=49;
    public static final int EqualsSign=72;
    public static final int Modifies=15;
    public static final int Strict=27;
    public static final int Colon=70;
    public static final int EOF=-1;
    public static final int Asterisk=65;
    public static final int Integration=4;
    public static final int RULE_OPSYM=94;
    public static final int Return=26;
    public static final int Def=47;
    public static final int RULE_WS=112;
    public static final int LeftCurlyBracket=79;
    public static final int RULE_INT_IDF=101;
    public static final int MustSend=13;
    public static final int While=36;
    public static final int Extension=8;
    public static final int FullStopFullStopLessThanSign=46;
    public static final int RULE_IDF=86;
    public static final int Compute=20;
    public static final int MaySend=17;
    public static final int Spec=43;
    public static final int ForAll=81;

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

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:60:9: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:60:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' )
            {
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

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "Library"

    // $ANTLR start "Memoize"
    public final void mMemoize() throws RecognitionException {
        try {
            int _type = Memoize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:62:9: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:62:11: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
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

    // $ANTLR start "Strict"
    public final void mStrict() throws RecognitionException {
        try {
            int _type = Strict;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:70:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:70:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:72:6: ( '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:72:8: '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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

    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:74:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalGumboLexer.g:74:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
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
            // InternalGumboLexer.g:76:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:76:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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

    // $ANTLR start "Gumbo"
    public final void mGumbo() throws RecognitionException {
        try {
            int _type = Gumbo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:78:7: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:78:9: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'O' | 'o' )
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

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
    // $ANTLR end "Gumbo"

    // $ANTLR start "Match"
    public final void mMatch() throws RecognitionException {
        try {
            int _type = Match;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:80:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalGumboLexer.g:80:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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
            // InternalGumboLexer.g:82:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:82:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:84:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:84:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:86:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:86:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:88:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:88:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:90:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:90:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:92:5: ( '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:92:7: '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:94:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:94:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:96:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:96:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:98:6: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // InternalGumboLexer.g:98:8: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' )
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enum"

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
            // InternalGumboLexer.g:188:10: ( RULE_IDF '\"' RULE_DIGIT ( RULE_DIGIT )* ( '.' ( RULE_DIGIT )* )? '\"' )
            // InternalGumboLexer.g:188:12: RULE_IDF '\"' RULE_DIGIT ( RULE_DIGIT )* ( '.' ( RULE_DIGIT )* )? '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            mRULE_DIGIT(); 
            // InternalGumboLexer.g:188:36: ( RULE_DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGumboLexer.g:188:36: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalGumboLexer.g:188:48: ( '.' ( RULE_DIGIT )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGumboLexer.g:188:49: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalGumboLexer.g:188:53: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGumboLexer.g:188:53: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

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
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='$') ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='#')||(LA9_0>='%' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumboLexer.g:190:28: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='$') ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='#')||(LA10_0>='%' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumboLexer.g:192:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\"') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='\"') ) {
                        int LA11_3 = input.LA(3);

                        if ( ((LA11_3>='\u0000' && LA11_3<='!')||(LA11_3>='#' && LA11_3<='\uFFFF')) ) {
                            alt11=1;
                        }


                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='!')||(LA11_1>='#' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboLexer.g:194:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGumboLexer.g:194:28: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='\"') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='\"') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='\"') ) {
                            int LA12_4 = input.LA(5);

                            if ( (LA12_4=='\"') ) {
                                alt12=3;
                            }
                            else {
                                alt12=2;}
                        }
                        else {
                            alt12=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
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
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='=') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='!'||(LA13_1>='%' && LA13_1<='&')||LA13_1=='/'||(LA13_1>='<' && LA13_1<='>')||LA13_1=='^'||LA13_1=='|'||LA13_1=='~'||(LA13_1>='\u2200' && LA13_1<='\u22FF')||(LA13_1>='\u27C0' && LA13_1<='\u27EF')||(LA13_1>='\u2980' && LA13_1<='\u2AFF')) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0=='!'||(LA13_0>='%' && LA13_0<='&')||LA13_0=='/'||LA13_0=='<'||LA13_0=='>'||LA13_0=='^'||LA13_0=='|'||LA13_0=='~'||(LA13_0>='\u2200' && LA13_0<='\u22FF')||(LA13_0>='\u27C0' && LA13_0<='\u27EF')||(LA13_0>='\u2980' && LA13_0<='\u2AFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboLexer.g:196:18: RULE_OPSYM
            	    {
            	    mRULE_OPSYM(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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

    // $ANTLR start "RULE_OP"
    public final void mRULE_OP() throws RecognitionException {
        try {
            int _type = RULE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:198:9: ( ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF ) )
            // InternalGumboLexer.g:198:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            {
            // InternalGumboLexer.g:198:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='!'||(LA15_0>='%' && LA15_0<='&')||LA15_0=='/'||(LA15_0>='<' && LA15_0<='>')||LA15_0=='^'||LA15_0=='|'||LA15_0=='~'||(LA15_0>='\u2200' && LA15_0<='\u22FF')||(LA15_0>='\u27C0' && LA15_0<='\u27EF')||(LA15_0>='\u2980' && LA15_0<='\u2AFF')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='\\') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGumboLexer.g:198:12: ( RULE_OPSYM )+
                    {
                    // InternalGumboLexer.g:198:12: ( RULE_OPSYM )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='/'||(LA14_0>='<' && LA14_0<='>')||LA14_0=='^'||LA14_0=='|'||LA14_0=='~'||(LA14_0>='\u2200' && LA14_0<='\u22FF')||(LA14_0>='\u27C0' && LA14_0<='\u27EF')||(LA14_0>='\u2980' && LA14_0<='\u2AFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGumboLexer.g:198:12: RULE_OPSYM
                    	    {
                    	    mRULE_OPSYM(); 

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


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:198:24: '\\\\' RULE_IDF
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
            // InternalGumboLexer.g:200:10: ( '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:200:12: '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )?
            {
            match("0x"); 

            // InternalGumboLexer.g:200:17: ( RULE_EXTENDED_DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGumboLexer.g:200:17: RULE_EXTENDED_DIGIT
            	    {
            	    mRULE_EXTENDED_DIGIT(); 

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

            // InternalGumboLexer.g:200:38: ( '.' RULE_IDF )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='.') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGumboLexer.g:200:39: '.' RULE_IDF
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
            // InternalGumboLexer.g:202:10: ( '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:202:12: '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )?
            {
            match("0b"); 

            // InternalGumboLexer.g:202:17: ( '0' | '1' | '_' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='1')||LA18_0=='_') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalGumboLexer.g:202:32: ( '.' RULE_IDF )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='.') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboLexer.g:202:33: '.' RULE_IDF
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
            // InternalGumboLexer.g:204:14: ( RULE_INTEGER_LIT RULE_IDF )
            // InternalGumboLexer.g:204:16: RULE_INTEGER_LIT RULE_IDF
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
            // InternalGumboLexer.g:206:15: ( RULE_REAL_LIT RULE_IDF )
            // InternalGumboLexer.g:206:17: RULE_REAL_LIT RULE_IDF
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
            // InternalGumboLexer.g:208:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:208:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:208:39: ( RULE_LETTER | RULE_DIGIT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    break loop20;
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
            // InternalGumboLexer.g:210:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:210:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:210:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\u0000' && LA21_0<='!')||LA21_0=='#'||(LA21_0>='%' && LA21_0<='\uFFFF')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='$') ) {
                alt21=2;
            }
            else if ( (LA21_0=='\"') ) {
                int LA21_3 = input.LA(2);

                if ( ((LA21_3>='\u0000' && LA21_3<='!')||(LA21_3>='#' && LA21_3<='\uFFFF')) ) {
                    alt21=3;
                }
                else if ( (LA21_3=='\"') ) {
                    alt21=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboLexer.g:210:23: ~ ( ( '\"' | '$' ) )
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
                    // InternalGumboLexer.g:210:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:210:41: '\"' ~ ( '\"' )
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
                    // InternalGumboLexer.g:210:52: '\"\"' ~ ( '\"' )
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
            // InternalGumboLexer.g:212:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:212:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalGumboLexer.g:214:21: ( ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' ) )
            // InternalGumboLexer.g:214:23: ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' )
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
            // InternalGumboLexer.g:216:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:216:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:216:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='\"'||LA22_1=='\''||LA22_1=='\\'||LA22_1=='b'||LA22_1=='f'||LA22_1=='n'||LA22_1=='r'||LA22_1=='t') ) {
                    alt22=1;
                }
                else if ( (LA22_1=='u') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumboLexer.g:216:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // InternalGumboLexer.g:216:67: RULE_UNICODE_ESC
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
            // InternalGumboLexer.g:218:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:218:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
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
            // InternalGumboLexer.g:220:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:220:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:220:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGumboLexer.g:220:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop23;
                }
            } while (true);

            // InternalGumboLexer.g:220:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGumboLexer.g:220:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:220:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGumboLexer.g:220:41: '\\r'
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
            // InternalGumboLexer.g:222:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:222:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:222:36: ( '+' | '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
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

            // InternalGumboLexer.g:222:47: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:222:47: RULE_DIGIT
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
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // InternalGumboLexer.g:224:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:224:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:224:40: ( '+' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboLexer.g:224:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:224:45: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:224:45: RULE_DIGIT
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
            // InternalGumboLexer.g:226:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:226:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:226:17: ( RULE_DIGIT )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGumboLexer.g:226:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalGumboLexer.g:226:29: ( '_' ( RULE_DIGIT )+ )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='_') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGumboLexer.g:226:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:226:34: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:226:34: RULE_DIGIT
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


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match('.'); 
            // InternalGumboLexer.g:226:52: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:226:52: RULE_DIGIT
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

            // InternalGumboLexer.g:226:64: ( '_' ( RULE_DIGIT )+ )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='_') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGumboLexer.g:226:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:226:69: ( RULE_DIGIT )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( ((LA34_0>='0' && LA34_0<='9')) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:226:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalGumboLexer.g:226:83: ( RULE_EXPONENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='E'||LA36_0=='e') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboLexer.g:226:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:228:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:228:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:228:20: ( RULE_DIGIT )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGumboLexer.g:228:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // InternalGumboLexer.g:228:32: ( '_' ( RULE_DIGIT )+ )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='_') ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGumboLexer.g:228:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:228:37: ( RULE_DIGIT )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( ((LA38_0>='0' && LA38_0<='9')) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:228:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt38 >= 1 ) break loop38;
            	                EarlyExitException eee =
            	                    new EarlyExitException(38, input);
            	                throw eee;
            	        }
            	        cnt38++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalGumboLexer.g:228:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='#') ) {
                alt42=1;
            }
            else {
                alt42=2;}
            switch (alt42) {
                case 1 :
                    // InternalGumboLexer.g:228:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:228:79: ( RULE_INT_EXPONENT )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='E'||LA40_0=='e') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalGumboLexer.g:228:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:228:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:228:98: ( RULE_INT_EXPONENT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='E'||LA41_0=='e') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGumboLexer.g:228:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:230:21: ( '0' .. '9' )
            // InternalGumboLexer.g:230:23: '0' .. '9'
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
            // InternalGumboLexer.g:232:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:232:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:234:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:234:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:234:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')||(LA44_0>='A' && LA44_0<='F')||LA44_0=='_'||(LA44_0>='a' && LA44_0<='f')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGumboLexer.g:234:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:234:52: ( '_' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0=='_') ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalGumboLexer.g:234:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop44;
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
            // InternalGumboLexer.g:236:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:236:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:236:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='\"') ) {
                alt47=1;
            }
            else if ( (LA47_0=='\'') ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGumboLexer.g:236:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:236:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop45:
                    do {
                        int alt45=3;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0=='\\') ) {
                            alt45=1;
                        }
                        else if ( ((LA45_0>='\u0000' && LA45_0<='!')||(LA45_0>='#' && LA45_0<='[')||(LA45_0>=']' && LA45_0<='\uFFFF')) ) {
                            alt45=2;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalGumboLexer.g:236:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:236:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop45;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:236:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:236:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop46:
                    do {
                        int alt46=3;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0=='\\') ) {
                            alt46=1;
                        }
                        else if ( ((LA46_0>='\u0000' && LA46_0<='&')||(LA46_0>='(' && LA46_0<='[')||(LA46_0>=']' && LA46_0<='\uFFFF')) ) {
                            alt46=2;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalGumboLexer.g:236:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:236:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop46;
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
            // InternalGumboLexer.g:238:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:238:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:238:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>='0' && LA49_0<='9')||(LA49_0>='A' && LA49_0<='Z')||LA49_0=='_'||(LA49_0>='a' && LA49_0<='z')) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGumboLexer.g:238:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:238:32: ( '_' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0=='_') ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalGumboLexer.g:238:32: '_'
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
            	    break loop49;
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
            // InternalGumboLexer.g:240:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:240:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:240:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>='\t' && LA50_0<='\n')||LA50_0=='\r'||LA50_0==' ') ) {
                    alt50=1;
                }


                switch (alt50) {
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
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
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
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | MustSend | Constant | Modifies | Requires | MaySend | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | While | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt51=98;
        alt51 = dfa51.predict(input);
        switch (alt51) {
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
                // InternalGumboLexer.g:1:181: Library
                {
                mLibrary(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:189: Memoize
                {
                mMemoize(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:197: Assert
                {
                mAssert(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:204: Assume
                {
                mAssume(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:211: Return
                {
                mReturn(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:218: Strict
                {
                mStrict(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:225: Some
                {
                mSome(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:230: Delta
                {
                mDelta(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:236: False
                {
                mFalse(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:242: Gumbo
                {
                mGumbo(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:248: Match
                {
                mMatch(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:254: Modes
                {
                mModes(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:260: Reads
                {
                mReads(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:266: State
                {
                mState(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:272: While
                {
                mWhile(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:278: Yield
                {
                mYield(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:284: All
                {
                mAll(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:288: Case
                {
                mCase(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:293: Else
                {
                mElse(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:298: Enum
                {
                mEnum(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:303: Halt
                {
                mHalt(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:308: Spec
                {
                mSpec(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:313: True
                {
                mTrue(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:318: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:352: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:381: Def
                {
                mDef(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:385: For
                {
                mFor(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:389: Inv
                {
                mInv(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:393: Mut
                {
                mMut(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:397: Val
                {
                mVal(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:401: Var
                {
                mVar(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:405: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:422: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:433: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:449: LessThanSignColon
                {
                mLessThanSignColon(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:467: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:493: By
                {
                mBy(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:496: Do
                {
                mDo(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:499: If
                {
                mIf(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:502: In_1
                {
                mIn_1(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:507: To
                {
                mTo(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:510: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:526: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:543: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:552: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:561: Comma
                {
                mComma(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:567: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:579: FullStop
                {
                mFullStop(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:588: Colon
                {
                mColon(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:594: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:604: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:615: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:628: F
                {
                mF(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:630: T
                {
                mT(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:632: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:650: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:669: KW__
                {
                mKW__(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:674: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:691: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:709: ForAll
                {
                mForAll(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:716: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:728: RULE_SLANG_STRING
                {
                mRULE_SLANG_STRING(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:746: RULE_MSTRING
                {
                mRULE_MSTRING(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:759: RULE_MSP
                {
                mRULE_MSP(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:768: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:777: RULE_MSPB
                {
                mRULE_MSPB(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:787: RULE_MSPM
                {
                mRULE_MSPM(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:797: RULE_MSPE
                {
                mRULE_MSPE(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:807: RULE_DEFOP
                {
                mRULE_DEFOP(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:818: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:826: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:835: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:844: RULE_INT_IDF
                {
                mRULE_INT_IDF(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:857: RULE_REAL_IDF
                {
                mRULE_REAL_IDF(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:871: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:887: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:901: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:918: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // InternalGumboLexer.g:1:930: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 98 :
                // InternalGumboLexer.g:1:938: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA51_eotS =
        "\1\uffff\3\61\1\74\7\61\1\uffff\4\61\1\123\1\125\1\127\1\61\1\134\1\51\1\137\4\uffff\1\141\4\uffff\1\143\2\uffff\1\144\1\145\1\uffff\1\61\2\uffff\2\156\2\uffff\1\167\1\170\1\61\2\uffff\11\61\1\uffff\11\61\1\u0095\3\61\2\51\1\61\1\u009e\4\61\1\u00a3\3\uffff\1\u00a5\1\uffff\1\61\1\uffff\1\u00a8\3\uffff\1\u00a9\7\uffff\1\u00ab\3\uffff\1\u00b0\1\uffff\2\163\1\uffff\1\163\2\uffff\1\163\1\uffff\2\61\1\u00be\4\uffff\12\61\1\u00ca\7\61\1\u00d2\7\61\1\uffff\4\61\2\51\1\61\1\u00e3\1\uffff\4\61\3\uffff\1\u00e8\1\u00e9\13\uffff\1\u00ed\1\u00b5\1\uffff\1\163\1\u00ef\2\uffff\1\163\3\61\2\uffff\3\61\1\u0100\2\61\1\u0103\1\u0104\2\61\1\uffff\7\61\1\uffff\14\61\1\u011a\1\51\1\u011c\1\61\1\uffff\2\61\1\u0120\1\u0121\6\uffff\1\163\1\uffff\2\u00f2\3\uffff\2\156\3\61\1\uffff\1\u012b\1\uffff\3\61\1\uffff\2\61\2\uffff\1\61\1\u0134\1\61\1\u0136\3\61\1\u013a\2\61\1\u013d\1\61\1\u013f\7\61\1\u0147\1\uffff\1\u0148\1\uffff\1\u0149\1\u014a\1\u014b\3\uffff\2\u00f2\1\uffff\1\163\3\61\4\uffff\6\61\1\uffff\1\61\1\uffff\2\61\1\u015f\1\uffff\2\61\1\uffff\1\61\1\uffff\2\61\1\u0165\1\u0166\2\61\1\u0169\6\uffff\1\u00f2\1\u00ef\1\163\1\uffff\3\61\2\uffff\2\61\1\u0171\1\61\1\u0173\4\61\1\uffff\2\61\1\u017a\1\u017b\1\u017c\2\uffff\1\u017d\1\u017e\2\uffff\1\156\4\61\1\u0183\1\uffff\1\61\1\uffff\3\61\1\u0188\1\u0189\1\u018a\5\uffff\2\61\1\u018e\1\61\1\uffff\1\u0190\1\u0191\1\u0192\1\u0193\3\uffff\1\61\1\u0195\1\u0196\1\uffff\1\u0197\4\uffff\1\u0198\4\uffff";
    static final String DFA51_eofS =
        "\u0199\uffff";
    static final String DFA51_minS =
        "\1\11\13\42\1\101\5\42\1\75\1\56\1\42\1\41\1\72\1\41\4\uffff\1\55\4\uffff\1\42\2\uffff\2\41\1\0\1\42\1\0\1\uffff\2\43\2\uffff\3\42\1\uffff\12\42\1\uffff\15\42\1\117\1\114\7\42\3\uffff\1\74\1\uffff\1\42\1\uffff\1\41\3\uffff\1\41\3\uffff\1\42\3\uffff\2\42\2\0\1\44\1\0\2\60\1\uffff\3\60\1\53\1\uffff\3\42\2\uffff\1\42\1\uffff\32\42\1\uffff\4\42\1\115\1\114\2\42\1\uffff\4\42\3\uffff\2\42\4\uffff\2\0\1\uffff\1\0\1\uffff\2\0\2\60\1\uffff\1\43\1\60\1\43\2\60\3\42\1\uffff\1\0\12\42\1\uffff\7\42\1\uffff\15\42\1\105\1\60\1\42\1\uffff\4\42\2\uffff\2\0\2\uffff\1\53\1\uffff\1\60\1\53\1\uffff\1\60\1\43\1\101\1\60\3\42\1\0\1\44\1\0\3\42\1\uffff\2\42\2\uffff\25\42\1\uffff\1\60\1\uffff\3\42\2\uffff\1\0\3\60\1\53\3\42\1\0\1\uffff\2\0\6\42\1\uffff\1\42\1\uffff\3\42\1\uffff\2\42\1\uffff\1\42\1\uffff\7\42\5\uffff\1\0\1\53\3\60\3\42\1\0\1\uffff\11\42\1\uffff\5\42\2\uffff\2\42\1\uffff\1\0\1\60\5\42\1\uffff\1\42\1\uffff\6\42\5\uffff\4\42\1\uffff\4\42\3\uffff\3\42\1\uffff\1\42\4\uffff\1\42\4\uffff";
    static final String DFA51_maxS =
        "\1\u2aff\21\172\1\75\1\56\1\172\1\u2aff\1\72\1\u2aff\4\uffff\1\55\4\uffff\1\172\2\uffff\2\u2aff\1\uffff\1\172\1\uffff\1\uffff\2\172\2\uffff\3\172\1\uffff\1\71\11\172\1\uffff\15\172\1\157\1\154\7\172\3\uffff\1\74\1\uffff\1\172\1\uffff\1\u2aff\3\uffff\1\u2aff\3\uffff\1\172\3\uffff\1\42\1\165\2\uffff\1\44\1\uffff\1\146\1\137\1\uffff\2\71\1\146\1\71\1\uffff\3\172\2\uffff\1\42\1\uffff\32\172\1\uffff\4\172\1\155\1\154\2\172\1\uffff\4\172\3\uffff\2\172\4\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\2\172\1\uffff\1\145\1\172\1\146\2\71\3\172\1\uffff\1\uffff\12\172\1\uffff\7\172\1\uffff\15\172\1\145\2\172\1\uffff\4\172\2\uffff\2\uffff\2\uffff\1\71\1\uffff\2\71\1\uffff\2\146\5\172\1\uffff\1\44\1\uffff\3\172\1\uffff\2\172\2\uffff\25\172\1\uffff\1\172\1\uffff\3\172\2\uffff\1\uffff\1\145\3\71\3\172\1\uffff\1\uffff\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\7\172\5\uffff\1\uffff\1\71\1\172\2\71\3\172\1\uffff\1\uffff\11\172\1\uffff\5\172\2\uffff\2\172\1\uffff\1\uffff\6\172\1\uffff\1\172\1\uffff\6\172\5\uffff\4\172\1\uffff\4\172\3\uffff\3\172\1\uffff\1\172\4\uffff\1\172\4\uffff";
    static final String DFA51_acceptS =
        "\30\uffff\1\74\1\75\1\76\1\100\1\uffff\1\104\1\106\1\111\1\112\1\uffff\1\114\1\115\5\uffff\1\130\2\uffff\1\140\1\142\3\uffff\1\141\12\uffff\1\107\26\uffff\1\110\1\52\1\77\1\uffff\1\102\1\uffff\1\63\1\uffff\1\127\1\103\1\65\1\uffff\1\105\1\135\1\101\1\uffff\1\113\1\116\1\117\10\uffff\1\137\4\uffff\1\133\3\uffff\1\72\1\71\1\uffff\1\123\32\uffff\1\67\10\uffff\1\70\4\uffff\1\73\1\53\1\62\2\uffff\1\64\1\66\1\121\1\120\2\uffff\1\120\1\uffff\1\125\4\uffff\1\132\10\uffff\1\56\13\uffff\1\55\7\uffff\1\57\20\uffff\1\54\4\uffff\1\60\1\61\2\uffff\1\126\1\131\1\uffff\1\136\2\uffff\1\134\15\uffff\1\44\2\uffff\1\46\1\45\25\uffff\1\50\1\uffff\1\43\3\uffff\1\47\1\51\11\uffff\1\124\10\uffff\1\33\1\uffff\1\34\3\uffff\1\37\2\uffff\1\36\1\uffff\1\35\7\uffff\1\40\1\31\1\32\1\41\1\42\11\uffff\1\122\11\uffff\1\27\5\uffff\1\25\1\26\2\uffff\1\30\7\uffff\1\21\1\uffff\1\22\6\uffff\1\16\1\24\1\17\1\20\1\23\4\uffff\1\13\4\uffff\1\15\1\12\1\14\3\uffff\1\10\1\uffff\1\5\1\6\1\7\1\11\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA51_specialS =
        "\46\uffff\1\0\1\uffff\1\2\77\uffff\1\15\1\3\1\uffff\1\20\100\uffff\1\14\1\1\1\uffff\1\4\1\uffff\1\5\1\11\14\uffff\1\25\52\uffff\1\21\1\6\16\uffff\1\7\1\uffff\1\16\45\uffff\1\22\7\uffff\1\10\1\uffff\1\12\1\24\36\uffff\1\23\7\uffff\1\13\25\uffff\1\17\56\uffff}>";
    static final String[] DFA51_transitionS = DFA51_transitionS_.DFA51_transitionS;
    private static final class DFA51_transitionS_ {
        static final String[] DFA51_transitionS = {
                "\2\55\2\uffff\1\55\22\uffff\1\55\1\51\1\46\1\uffff\1\50\2\51\1\54\1\30\1\31\1\32\1\22\1\33\1\34\1\23\1\51\1\52\11\53\1\25\1\35\1\26\1\27\1\51\1\36\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\20\1\1\2\47\1\12\1\7\4\47\1\6\1\13\1\21\1\47\1\24\1\16\1\47\1\17\1\47\1\37\1\14\1\40\1\51\1\41\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\20\1\1\2\47\1\12\1\7\4\47\1\6\1\13\1\21\1\47\1\24\1\16\1\47\1\17\1\47\1\42\1\51\1\43\1\51\u2181\uffff\1\44\2\51\1\45\u00fc\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "\1\62\15\uffff\12\60\7\uffff\5\60\1\57\7\60\1\56\14\60\6\uffff\5\60\1\57\7\60\1\56\14\60",
                "\1\62\15\uffff\12\60\7\uffff\1\65\12\60\1\63\2\60\1\64\13\60\6\uffff\1\65\12\60\1\63\2\60\1\64\13\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\70\1\60\1\67\11\60\1\66\2\60\6\uffff\13\60\1\70\1\60\1\67\11\60\1\66\2\60",
                "\1\62\15\uffff\12\60\7\uffff\1\72\15\60\1\73\5\60\1\71\5\60\4\uffff\1\61\1\uffff\1\72\15\60\1\73\5\60\1\71\5\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\75\5\60\6\uffff\24\60\1\75\5\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\76\25\60\6\uffff\4\60\1\76\25\60",
                "\1\62\15\uffff\12\60\7\uffff\1\101\3\60\1\102\11\60\1\100\5\60\1\77\5\60\6\uffff\1\101\3\60\1\102\11\60\1\100\5\60\1\77\5\60",
                "\1\62\15\uffff\12\60\7\uffff\17\60\1\103\2\60\1\104\7\60\6\uffff\17\60\1\103\2\60\1\104\7\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\105\17\60\1\106\1\60\6\uffff\10\60\1\105\17\60\1\106\1\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\107\21\60\6\uffff\10\60\1\107\21\60",
                "\1\62\15\uffff\12\60\7\uffff\17\60\1\111\3\60\1\110\6\60\6\uffff\17\60\1\111\3\60\1\110\6\60",
                "\1\113\21\51\1\112\7\51\4\uffff\1\51\1\uffff\1\113\21\51\1\112\7\51",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\114\11\60\1\115\13\60\6\uffff\4\60\1\114\11\60\1\115\13\60",
                "\1\62\15\uffff\12\60\7\uffff\7\60\1\116\22\60\6\uffff\7\60\1\116\22\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\117\21\60\6\uffff\10\60\1\117\21\60",
                "\1\62\15\uffff\12\60\7\uffff\1\120\31\60\6\uffff\1\120\31\60",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\122\2\60\1\121\10\60\4\uffff\1\61\1\uffff\16\60\1\122\2\60\1\121\10\60",
                "\1\124",
                "\1\126",
                "\1\62\15\uffff\12\60\7\uffff\1\130\31\60\6\uffff\1\130\31\60",
                "\1\133\3\uffff\2\133\10\uffff\1\133\12\uffff\1\131\1\uffff\1\133\1\132\1\133\37\uffff\1\133\35\uffff\1\133\1\uffff\1\133\u2181\uffff\u0100\133\u04c0\uffff\60\133\u0190\uffff\u0180\133",
                "\1\135",
                "\1\51\3\uffff\2\51\10\uffff\1\51\14\uffff\2\51\1\136\37\uffff\1\51\35\uffff\1\51\1\uffff\1\51\u2181\uffff\u0100\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "",
                "",
                "",
                "",
                "\1\140",
                "",
                "",
                "",
                "",
                "\1\62\15\uffff\12\142\7\uffff\32\142\6\uffff\32\142",
                "",
                "",
                "\1\51\3\uffff\2\51\10\uffff\1\51\14\uffff\3\51\37\uffff\1\51\35\uffff\1\51\1\uffff\1\51\u2181\uffff\u0100\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "\1\51\3\uffff\2\51\10\uffff\1\51\14\uffff\3\51\37\uffff\1\51\35\uffff\1\51\1\uffff\1\51\u2181\uffff\u0100\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "\42\150\1\146\71\150\1\147\uffa3\150",
                "\1\62\15\uffff\12\60\7\uffff\32\60\6\uffff\32\60",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "\1\161\12\uffff\1\160\1\uffff\12\53\7\uffff\4\163\1\162\25\163\4\uffff\1\157\1\uffff\1\163\1\155\2\163\1\162\22\163\1\154\2\163",
                "\1\161\12\uffff\1\160\1\uffff\12\53\7\uffff\4\163\1\162\25\163\4\uffff\1\157\1\uffff\4\163\1\162\25\163",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\165\12\60\1\164\1\60\1\166\4\60\4\uffff\1\61\1\uffff\10\60\1\165\12\60\1\164\1\60\1\166\4\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\6\uffff\32\60",
                "",
                "\1\171\15\uffff\12\172",
                "\1\62\15\uffff\12\60\7\uffff\1\173\31\60\6\uffff\1\173\31\60",
                "\1\62\15\uffff\12\60\7\uffff\14\60\1\175\1\174\14\60\6\uffff\14\60\1\175\1\174\14\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\176\7\60\6\uffff\22\60\1\176\7\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\177\6\60\6\uffff\23\60\1\177\6\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0080\1\60\1\u0081\5\60\6\uffff\22\60\1\u0080\1\60\1\u0081\5\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0082\7\60\6\uffff\22\60\1\u0082\7\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0083\14\60\6\uffff\15\60\1\u0083\14\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u0084\16\60\6\uffff\13\60\1\u0084\16\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0085\10\60\6\uffff\21\60\1\u0085\10\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\1\u0086\13\60\1\u0087\15\60\6\uffff\1\u0086\13\60\1\u0087\15\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u008b\4\60\1\u0088\12\60\1\u0089\2\60\1\u008a\6\60\6\uffff\1\u008b\4\60\1\u0088\12\60\1\u0089\2\60\1\u008a\6\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u008c\1\u008d\6\60\6\uffff\22\60\1\u008c\1\u008d\6\60",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u008e\26\60\6\uffff\3\60\1\u008e\26\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0090\4\60\1\u008f\1\60\6\uffff\23\60\1\u0090\4\60\1\u008f\1\60",
                "\1\62\15\uffff\12\60\7\uffff\14\60\1\u0091\15\60\6\uffff\14\60\1\u0091\15\60",
                "\1\62\15\uffff\12\60\7\uffff\17\60\1\u0092\12\60\6\uffff\17\60\1\u0092\12\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0093\7\60\6\uffff\22\60\1\u0093\7\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0094\14\60\6\uffff\15\60\1\u0094\14\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\1\60\1\u0096\30\60\6\uffff\1\60\1\u0096\30\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u0098\20\60\1\u0097\10\60\6\uffff\1\u0098\20\60\1\u0097\10\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0099\25\60\6\uffff\4\60\1\u0099\25\60",
                "\1\u009a\37\uffff\1\u009a",
                "\1\u009b\37\uffff\1\u009b",
                "\1\62\15\uffff\12\60\7\uffff\5\60\1\u009d\5\60\1\u009c\16\60\6\uffff\5\60\1\u009d\5\60\1\u009c\16\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u009f\21\60\6\uffff\10\60\1\u009f\21\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00a0\25\60\6\uffff\4\60\1\u00a0\25\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u00a1\16\60\6\uffff\13\60\1\u00a1\16\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\u00a2\5\60\6\uffff\24\60\1\u00a2\5\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "\1\u00a4",
                "",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u00a6\5\60\1\u00a7\10\60\6\uffff\13\60\1\u00a6\5\60\1\u00a7\10\60",
                "",
                "\1\133\3\uffff\2\133\10\uffff\1\133\14\uffff\3\133\37\uffff\1\133\35\uffff\1\133\1\uffff\1\133\u2181\uffff\u0100\133\u04c0\uffff\60\133\u0190\uffff\u0180\133",
                "",
                "",
                "",
                "\1\51\3\uffff\2\51\10\uffff\1\51\14\uffff\3\51\37\uffff\1\51\35\uffff\1\51\1\uffff\1\51\u2181\uffff\u0100\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "",
                "",
                "",
                "\1\62\15\uffff\12\142\7\uffff\32\142\6\uffff\32\142",
                "",
                "",
                "",
                "\1\u00aa",
                "\1\u00ac\4\uffff\1\u00ac\64\uffff\1\u00ac\5\uffff\1\u00ac\3\uffff\1\u00ac\7\uffff\1\u00ac\3\uffff\1\u00ac\1\uffff\1\u00ac\1\u00ad",
                "\42\150\1\u00ae\71\150\1\147\uffa3\150",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "\1\u00af",
                "\42\u00b1\1\u00b2\uffdd\u00b1",
                "\12\u00b3\7\uffff\6\u00b3\32\uffff\6\u00b3",
                "\2\u00b4\55\uffff\1\u00b5",
                "",
                "\12\u00b6",
                "\12\u00b7",
                "\12\u00b8\7\uffff\6\u00b8\32\uffff\6\u00b8",
                "\1\u00b9\4\uffff\12\u00ba",
                "",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00bb\25\60\6\uffff\4\60\1\u00bb\25\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00bc\6\60\6\uffff\23\60\1\u00bc\6\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u00bd\31\60\4\uffff\1\61\1\uffff\1\u00bd\31\60",
                "",
                "",
                "\1\u00bf",
                "",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u00c0\7\60\6\uffff\22\60\1\u00c0\7\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u00c1\7\60\6\uffff\22\60\1\u00c1\7\60",
                "\1\62\15\uffff\12\60\7\uffff\17\60\1\u00c2\12\60\6\uffff\17\60\1\u00c2\12\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00c3\25\60\6\uffff\4\60\1\u00c3\25\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00c4\25\60\6\uffff\4\60\1\u00c4\25\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\u00c5\5\60\6\uffff\24\60\1\u00c5\5\60",
                "\1\62\15\uffff\12\60\7\uffff\14\60\1\u00c6\15\60\6\uffff\14\60\1\u00c6\15\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00c7\25\60\6\uffff\4\60\1\u00c7\25\60",
                "\1\62\15\uffff\12\60\7\uffff\2\60\1\u00c8\27\60\6\uffff\2\60\1\u00c8\27\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u00c9\7\60\6\uffff\22\60\1\u00c9\7\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u00cb\10\60\6\uffff\21\60\1\u00cb\10\60",
                "\1\62\15\uffff\12\60\7\uffff\1\60\1\u00cc\30\60\6\uffff\1\60\1\u00cc\30\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00cd\25\60\6\uffff\4\60\1\u00cd\25\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\u00ce\5\60\6\uffff\24\60\1\u00ce\5\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\u00cf\5\60\6\uffff\24\60\1\u00cf\5\60",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u00d0\26\60\6\uffff\3\60\1\u00d0\26\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00d1\6\60\6\uffff\23\60\1\u00d1\6\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00d4\3\60\1\u00d3\21\60\6\uffff\4\60\1\u00d4\3\60\1\u00d3\21\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u00d5\7\60\6\uffff\22\60\1\u00d5\7\60",
                "\1\62\15\uffff\12\60\7\uffff\2\60\1\u00d6\27\60\6\uffff\2\60\1\u00d6\27\60",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\u00d7\13\60\6\uffff\16\60\1\u00d7\13\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u00d8\16\60\6\uffff\13\60\1\u00d8\16\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00d9\17\60\1\u00da\5\60\6\uffff\4\60\1\u00d9\17\60\1\u00da\5\60",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u00db\26\60\6\uffff\3\60\1\u00db\26\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u00dc\10\60\6\uffff\21\60\1\u00dc\10\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u00dd\21\60\6\uffff\10\60\1\u00dd\21\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00de\6\60\6\uffff\23\60\1\u00de\6\60",
                "\1\62\15\uffff\12\60\7\uffff\2\60\1\u00df\27\60\6\uffff\2\60\1\u00df\27\60",
                "\1\u00e0\37\uffff\1\u00e0",
                "\1\u00e1\37\uffff\1\u00e1",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00e2\6\60\6\uffff\23\60\1\u00e2\6\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u00e4\16\60\6\uffff\13\60\1\u00e4\16\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u00e5\16\60\6\uffff\13\60\1\u00e5\16\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00e6\6\60\6\uffff\23\60\1\u00e6\6\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u00e7\25\60\6\uffff\4\60\1\u00e7\25\60",
                "",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "",
                "\42\150\1\u00ae\71\150\1\147\uffa3\150",
                "\60\54\12\u00ea\7\54\6\u00ea\32\54\6\u00ea\uff99\54",
                "",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "\42\u00eb\1\u00ec\uffdd\u00eb",
                "\12\u00b3\7\uffff\6\u00b3\24\163\6\uffff\6\u00b3\24\163",
                "\2\u00b4\10\163\7\uffff\32\163\6\uffff\32\163",
                "",
                "\1\161\12\uffff\1\160\1\uffff\12\u00b6\13\uffff\1\u00ee\31\uffff\1\157\5\uffff\1\u00ee",
                "\12\u00b7\7\uffff\4\u00f2\1\u00f1\25\u00f2\4\uffff\1\u00f0\1\uffff\4\u00f2\1\u00f1\25\u00f2",
                "\1\u00f5\14\uffff\12\u00f4\7\uffff\6\u00f4\30\uffff\1\u00f3\1\uffff\6\u00f4",
                "\12\u00f6",
                "\12\u00ba",
                "\1\62\15\uffff\12\60\7\uffff\6\60\1\u00f7\23\60\6\uffff\6\60\1\u00f7\23\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u00f8\21\60\6\uffff\10\60\1\u00f8\21\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u00f9\10\60\6\uffff\21\60\1\u00f9\10\60",
                "",
                "\42\u00fa\1\u00fc\1\u00fa\1\u00fb\uffdb\u00fa",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u00fd\7\60\6\uffff\22\60\1\u00fd\7\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u00fe\6\60\6\uffff\23\60\1\u00fe\6\60",
                "\1\62\15\uffff\12\60\7\uffff\24\60\1\u00ff\5\60\6\uffff\24\60\1\u00ff\5\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0101\14\60\6\uffff\15\60\1\u0101\14\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0102\10\60\6\uffff\21\60\1\u0102\10\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0105\6\60\6\uffff\23\60\1\u0105\6\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0106\25\60\6\uffff\4\60\1\u0106\25\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\1\u0107\31\60\6\uffff\1\u0107\31\60",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\u0108\13\60\6\uffff\16\60\1\u0108\13\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0109\10\60\6\uffff\21\60\1\u0109\10\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u010a\21\60\6\uffff\10\60\1\u010a\21\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u010b\10\60\6\uffff\21\60\1\u010b\10\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u010c\7\60\6\uffff\22\60\1\u010c\7\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u010d\7\60\6\uffff\22\60\1\u010d\7\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\5\60\1\u010e\24\60\6\uffff\5\60\1\u010e\24\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u010f\7\60\6\uffff\22\60\1\u010f\7\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0110\25\60\6\uffff\4\60\1\u0110\25\60",
                "\1\62\15\uffff\12\60\7\uffff\7\60\1\u0111\22\60\6\uffff\7\60\1\u0111\22\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0112\21\60\6\uffff\10\60\1\u0112\21\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0113\21\60\6\uffff\10\60\1\u0113\21\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0114\10\60\6\uffff\21\60\1\u0114\10\60",
                "\1\62\15\uffff\12\60\7\uffff\14\60\1\u0115\15\60\6\uffff\14\60\1\u0115\15\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0116\21\60\6\uffff\10\60\1\u0116\21\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u0117\31\60\6\uffff\1\u0117\31\60",
                "\1\62\15\uffff\12\60\7\uffff\2\60\1\u0118\27\60\6\uffff\2\60\1\u0118\27\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0119\25\60\6\uffff\4\60\1\u0119\25\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\u011b\37\uffff\1\u011b",
                "\12\51\7\uffff\32\51\6\uffff\32\51",
                "\1\62\15\uffff\12\60\7\uffff\1\u011d\31\60\6\uffff\1\u011d\31\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u011e\25\60\6\uffff\4\60\1\u011e\25\60",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u011f\26\60\6\uffff\3\60\1\u011f\26\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "\60\54\12\u0122\7\54\6\u0122\32\54\6\u0122\uff99\54",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "",
                "\1\u00b9\4\uffff\12\u00ba",
                "",
                "\12\u0123",
                "\1\u0125\1\uffff\1\u0125\2\uffff\12\u0124",
                "",
                "\12\u00f4\7\uffff\6\u00f4\32\uffff\6\u00f4",
                "\1\u00f5\14\uffff\12\u00f4\7\uffff\6\u00f4\30\uffff\1\u00f3\1\uffff\6\u00f4",
                "\4\163\1\u0126\25\163\4\uffff\1\163\1\uffff\4\163\1\u0126\25\163",
                "\12\u00f6\7\uffff\32\163\4\uffff\1\163\1\uffff\32\163",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0127\10\60\6\uffff\21\60\1\u0127\10\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u0128\31\60\6\uffff\1\u0128\31\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0129\21\60\6\uffff\10\60\1\u0129\21\60",
                "\42\u00fa\1\u00fc\1\u00fa\1\u00fb\uffdb\u00fa",
                "\1\u012a",
                "\42\u012c\1\u012d\uffdd\u012c",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u012e\21\60\6\uffff\10\60\1\u012e\21\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u012f\31\60\6\uffff\1\u012f\31\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0130\6\60\6\uffff\23\60\1\u0130\6\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0131\7\60\6\uffff\22\60\1\u0131\7\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0132\25\60\6\uffff\4\60\1\u0132\25\60",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0133\21\60\6\uffff\10\60\1\u0133\21\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0135\14\60\6\uffff\15\60\1\u0135\14\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0137\25\60\6\uffff\4\60\1\u0137\25\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0138\10\60\6\uffff\21\60\1\u0138\10\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0139\14\60\6\uffff\15\60\1\u0139\14\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u013b\25\60\6\uffff\4\60\1\u013b\25\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u013c\21\60\6\uffff\10\60\1\u013c\21\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u013e\14\60\6\uffff\15\60\1\u013e\14\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\31\60\1\u0140\6\uffff\31\60\1\u0140",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0141\25\60\6\uffff\4\60\1\u0141\25\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0142\6\60\6\uffff\23\60\1\u0142\6\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0143\25\60\6\uffff\4\60\1\u0143\25\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0144\14\60\6\uffff\15\60\1\u0144\14\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u0145\10\60\6\uffff\21\60\1\u0145\10\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0146\6\60\6\uffff\23\60\1\u0146\6\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\12\51\7\uffff\32\51\6\uffff\32\51",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "\60\54\12\u014c\7\54\6\u014c\32\54\6\u014c\uff99\54",
                "\12\u0123\13\uffff\1\u014d\31\uffff\1\u00f0\5\uffff\1\u014d",
                "\12\u0124",
                "\12\u014e",
                "\1\u0150\4\uffff\12\u014f",
                "\1\62\15\uffff\12\60\7\uffff\1\u0151\31\60\6\uffff\1\u0151\31\60",
                "\1\62\15\uffff\12\60\7\uffff\13\60\1\u0152\16\60\6\uffff\13\60\1\u0152\16\60",
                "\1\62\15\uffff\12\60\7\uffff\1\u0153\31\60\6\uffff\1\u0153\31\60",
                "\42\u00fa\1\u00fc\1\u00fa\1\u00fb\uffdb\u00fa",
                "",
                "\42\u00fa\1\u00fc\1\u00fa\1\u00fb\uffdb\u00fa",
                "\42\u0154\1\u0155\uffdd\u0154",
                "\1\62\15\uffff\12\60\7\uffff\5\60\1\u0156\24\60\6\uffff\5\60\1\u0156\24\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0157\14\60\6\uffff\15\60\1\u0157\14\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0158\25\60\6\uffff\4\60\1\u0158\25\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u0159\21\60\6\uffff\10\60\1\u0159\21\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u015a\7\60\6\uffff\22\60\1\u015a\7\60",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\u015b\13\60\6\uffff\16\60\1\u015b\13\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u015c\6\60\6\uffff\23\60\1\u015c\6\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u015d\14\60\6\uffff\15\60\1\u015d\14\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u015e\25\60\6\uffff\4\60\1\u015e\25\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0160\14\60\6\uffff\15\60\1\u0160\14\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0161\25\60\6\uffff\4\60\1\u0161\25\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u0162\26\60\6\uffff\3\60\1\u0162\26\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0163\25\60\6\uffff\4\60\1\u0163\25\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0164\7\60\6\uffff\22\60\1\u0164\7\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\6\60\1\u0167\23\60\6\uffff\6\60\1\u0167\23\60",
                "\1\62\15\uffff\12\60\7\uffff\30\60\1\u0168\1\60\6\uffff\30\60\1\u0168\1\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "",
                "",
                "\60\54\12\u016a\7\54\6\u016a\32\54\6\u016a\uff99\54",
                "\1\u0125\1\uffff\1\u0125\2\uffff\12\u0124",
                "\12\u014e\7\uffff\32\u00f2\4\uffff\1\u00f2\1\uffff\32\u00f2",
                "\12\u014f",
                "\12\u016b",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u016c\6\60\6\uffff\23\60\1\u016c\6\60",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u016d\21\60\6\uffff\10\60\1\u016d\21\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u016e\14\60\6\uffff\15\60\1\u016e\14\60",
                "\42\u00fa\1\u00fc\1\u00fa\1\u00fb\uffdb\u00fa",
                "",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u016f\21\60\6\uffff\10\60\1\u016f\21\60",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0170\6\60\6\uffff\23\60\1\u0170\6\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\u0172\13\60\6\uffff\16\60\1\u0172\13\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0174\14\60\6\uffff\15\60\1\u0174\14\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0175\25\60\6\uffff\4\60\1\u0175\25\60",
                "\1\62\15\uffff\12\60\7\uffff\2\60\1\u0176\27\60\6\uffff\2\60\1\u0176\27\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0177\7\60\6\uffff\22\60\1\u0177\7\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\3\60\1\u0178\26\60\6\uffff\3\60\1\u0178\26\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0179\7\60\6\uffff\22\60\1\u0179\7\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\42\150\1\u00ae\71\150\1\147\uffa3\150",
                "\12\u016b\7\uffff\32\163\4\uffff\1\163\1\uffff\32\163",
                "\1\62\15\uffff\12\60\7\uffff\10\60\1\u017f\21\60\6\uffff\10\60\1\u017f\21\60",
                "\1\62\15\uffff\12\60\7\uffff\31\60\1\u0180\6\uffff\31\60\1\u0180",
                "\1\62\15\uffff\12\60\7\uffff\23\60\1\u0181\6\60\6\uffff\23\60\1\u0181\6\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0182\25\60\6\uffff\4\60\1\u0182\25\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0184\14\60\6\uffff\15\60\1\u0184\14\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u0185\7\60\6\uffff\22\60\1\u0185\7\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0186\25\60\6\uffff\4\60\1\u0186\25\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u0187\25\60\6\uffff\4\60\1\u0187\25\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\16\60\1\u018b\13\60\6\uffff\16\60\1\u018b\13\60",
                "\1\62\15\uffff\12\60\7\uffff\4\60\1\u018c\25\60\6\uffff\4\60\1\u018c\25\60",
                "\1\62\15\uffff\12\60\7\uffff\22\60\1\u018d\7\60\4\uffff\1\61\1\uffff\22\60\1\u018d\7\60",
                "\1\62\15\uffff\12\60\7\uffff\21\60\1\u018f\10\60\6\uffff\21\60\1\u018f\10\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\15\60\1\u0194\14\60\6\uffff\15\60\1\u0194\14\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                "",
                "\1\62\15\uffff\12\60\7\uffff\32\60\4\uffff\1\61\1\uffff\32\60",
                "",
                "",
                "",
                ""
        };
    }

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    static class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | MustSend | Constant | Modifies | Requires | MaySend | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | While | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_38 = input.LA(1);

                        s = -1;
                        if ( (LA51_38=='\"') ) {s = 102;}

                        else if ( (LA51_38=='\\') ) {s = 103;}

                        else if ( ((LA51_38>='\u0000' && LA51_38<='!')||(LA51_38>='#' && LA51_38<='[')||(LA51_38>=']' && LA51_38<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_173 = input.LA(1);

                        s = -1;
                        if ( ((LA51_173>='0' && LA51_173<='9')||(LA51_173>='A' && LA51_173<='F')||(LA51_173>='a' && LA51_173<='f')) ) {s = 234;}

                        else if ( ((LA51_173>='\u0000' && LA51_173<='/')||(LA51_173>=':' && LA51_173<='@')||(LA51_173>='G' && LA51_173<='`')||(LA51_173>='g' && LA51_173<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_40 = input.LA(1);

                        s = -1;
                        if ( ((LA51_40>='\u0000' && LA51_40<='!')||LA51_40=='#'||(LA51_40>='%' && LA51_40<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_40=='$') ) {s = 106;}

                        else if ( (LA51_40=='\"') ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_105 = input.LA(1);

                        s = -1;
                        if ( (LA51_105=='$') ) {s = 106;}

                        else if ( ((LA51_105>='\u0000' && LA51_105<='!')||LA51_105=='#'||(LA51_105>='%' && LA51_105<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_105=='\"') ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_175 = input.LA(1);

                        s = -1;
                        if ( (LA51_175=='\"') ) {s = 107;}

                        else if ( ((LA51_175>='\u0000' && LA51_175<='!')||LA51_175=='#'||(LA51_175>='%' && LA51_175<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_175=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_177 = input.LA(1);

                        s = -1;
                        if ( (LA51_177=='\"') ) {s = 107;}

                        else if ( ((LA51_177>='\u0000' && LA51_177<='!')||LA51_177=='#'||(LA51_177>='%' && LA51_177<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_177=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_235 = input.LA(1);

                        s = -1;
                        if ( (LA51_235=='$') ) {s = 106;}

                        else if ( ((LA51_235>='\u0000' && LA51_235<='!')||LA51_235=='#'||(LA51_235>='%' && LA51_235<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_235=='\"') ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_250 = input.LA(1);

                        s = -1;
                        if ( (LA51_250=='\"') ) {s = 252;}

                        else if ( ((LA51_250>='\u0000' && LA51_250<='!')||LA51_250=='#'||(LA51_250>='%' && LA51_250<='\uFFFF')) ) {s = 250;}

                        else if ( (LA51_250=='$') ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_298 = input.LA(1);

                        s = -1;
                        if ( (LA51_298=='\"') ) {s = 252;}

                        else if ( ((LA51_298>='\u0000' && LA51_298<='!')||LA51_298=='#'||(LA51_298>='%' && LA51_298<='\uFFFF')) ) {s = 250;}

                        else if ( (LA51_298=='$') ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_178 = input.LA(1);

                        s = -1;
                        if ( ((LA51_178>='\u0000' && LA51_178<='!')||(LA51_178>='#' && LA51_178<='\uFFFF')) ) {s = 235;}

                        else if ( (LA51_178=='\"') ) {s = 236;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_300 = input.LA(1);

                        s = -1;
                        if ( (LA51_300=='\"') ) {s = 252;}

                        else if ( ((LA51_300>='\u0000' && LA51_300<='!')||LA51_300=='#'||(LA51_300>='%' && LA51_300<='\uFFFF')) ) {s = 250;}

                        else if ( (LA51_300=='$') ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_340 = input.LA(1);

                        s = -1;
                        if ( (LA51_340=='\"') ) {s = 252;}

                        else if ( ((LA51_340>='\u0000' && LA51_340<='!')||LA51_340=='#'||(LA51_340>='%' && LA51_340<='\uFFFF')) ) {s = 250;}

                        else if ( (LA51_340=='$') ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_172 = input.LA(1);

                        s = -1;
                        if ( (LA51_172=='\"') ) {s = 174;}

                        else if ( (LA51_172=='\\') ) {s = 103;}

                        else if ( ((LA51_172>='\u0000' && LA51_172<='!')||(LA51_172>='#' && LA51_172<='[')||(LA51_172>=']' && LA51_172<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_104 = input.LA(1);

                        s = -1;
                        if ( (LA51_104=='\"') ) {s = 174;}

                        else if ( (LA51_104=='\\') ) {s = 103;}

                        else if ( ((LA51_104>='\u0000' && LA51_104<='!')||(LA51_104>='#' && LA51_104<='[')||(LA51_104>=']' && LA51_104<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_252 = input.LA(1);

                        s = -1;
                        if ( ((LA51_252>='\u0000' && LA51_252<='!')||(LA51_252>='#' && LA51_252<='\uFFFF')) ) {s = 300;}

                        else if ( (LA51_252=='\"') ) {s = 301;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_362 = input.LA(1);

                        s = -1;
                        if ( (LA51_362=='\"') ) {s = 174;}

                        else if ( (LA51_362=='\\') ) {s = 103;}

                        else if ( ((LA51_362>='\u0000' && LA51_362<='!')||(LA51_362>='#' && LA51_362<='[')||(LA51_362>=']' && LA51_362<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_107 = input.LA(1);

                        s = -1;
                        if ( ((LA51_107>='\u0000' && LA51_107<='!')||(LA51_107>='#' && LA51_107<='\uFFFF')) ) {s = 177;}

                        else if ( (LA51_107=='\"') ) {s = 178;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_234 = input.LA(1);

                        s = -1;
                        if ( ((LA51_234>='0' && LA51_234<='9')||(LA51_234>='A' && LA51_234<='F')||(LA51_234>='a' && LA51_234<='f')) ) {s = 290;}

                        else if ( ((LA51_234>='\u0000' && LA51_234<='/')||(LA51_234>=':' && LA51_234<='@')||(LA51_234>='G' && LA51_234<='`')||(LA51_234>='g' && LA51_234<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_290 = input.LA(1);

                        s = -1;
                        if ( ((LA51_290>='\u0000' && LA51_290<='/')||(LA51_290>=':' && LA51_290<='@')||(LA51_290>='G' && LA51_290<='`')||(LA51_290>='g' && LA51_290<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA51_290>='0' && LA51_290<='9')||(LA51_290>='A' && LA51_290<='F')||(LA51_290>='a' && LA51_290<='f')) ) {s = 332;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_332 = input.LA(1);

                        s = -1;
                        if ( ((LA51_332>='\u0000' && LA51_332<='/')||(LA51_332>=':' && LA51_332<='@')||(LA51_332>='G' && LA51_332<='`')||(LA51_332>='g' && LA51_332<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA51_332>='0' && LA51_332<='9')||(LA51_332>='A' && LA51_332<='F')||(LA51_332>='a' && LA51_332<='f')) ) {s = 362;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA51_301 = input.LA(1);

                        s = -1;
                        if ( ((LA51_301>='\u0000' && LA51_301<='!')||(LA51_301>='#' && LA51_301<='\uFFFF')) ) {s = 340;}

                        else if ( (LA51_301=='\"') ) {s = 341;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA51_191 = input.LA(1);

                        s = -1;
                        if ( ((LA51_191>='\u0000' && LA51_191<='!')||LA51_191=='#'||(LA51_191>='%' && LA51_191<='\uFFFF')) ) {s = 250;}

                        else if ( (LA51_191=='$') ) {s = 251;}

                        else if ( (LA51_191=='\"') ) {s = 252;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}