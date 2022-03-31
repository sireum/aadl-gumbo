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

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:42:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:42:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:44:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:44:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:46:10: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:46:12: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
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

    // $ANTLR start "Applies"
    public final void mApplies() throws RecognitionException {
        try {
            int _type = Applies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:48:9: ( ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:48:11: ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:50:9: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalGumboLexer.g:50:11: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
            // InternalGumboLexer.g:52:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:52:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:54:9: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:54:11: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:56:9: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:56:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' )
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
            // InternalGumboLexer.g:58:9: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:58:11: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
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

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:64:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:64:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:66:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:66:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' )
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

    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:70:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalGumboLexer.g:70:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
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
            // InternalGumboLexer.g:72:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:72:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:74:7: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:74:9: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'O' | 'o' )
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

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:94:6: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // InternalGumboLexer.g:94:8: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' )
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

    // $ANTLR start "Def"
    public final void mDef() throws RecognitionException {
        try {
            int _type = Def;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:106:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:106:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:108:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:108:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:110:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) )
            // InternalGumboLexer.g:110:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' )
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
            // InternalGumboLexer.g:112:5: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:112:7: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:114:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:114:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:116:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:116:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:118:18: ( '.' '.' )
            // InternalGumboLexer.g:118:20: '.' '.'
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
            // InternalGumboLexer.g:120:12: ( ':' ':' )
            // InternalGumboLexer.g:120:14: ':' ':'
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
            // InternalGumboLexer.g:122:17: ( ':' '=' )
            // InternalGumboLexer.g:122:19: ':' '='
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
            // InternalGumboLexer.g:124:19: ( '<' ':' )
            // InternalGumboLexer.g:124:21: '<' ':'
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
            // InternalGumboLexer.g:126:27: ( '=' '>' )
            // InternalGumboLexer.g:126:29: '=' '>'
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
            // InternalGumboLexer.g:128:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:128:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
            // InternalGumboLexer.g:130:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:130:6: ( 'D' | 'd' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:132:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:132:6: ( 'I' | 'i' ) ( 'F' | 'f' )
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

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:134:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:134:6: ( 'I' | 'i' ) ( 'N' | 'n' )
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
    // $ANTLR end "In"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:136:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:136:6: ( 'T' | 't' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:138:17: ( '(' )
            // InternalGumboLexer.g:138:19: '('
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
            // InternalGumboLexer.g:140:18: ( ')' )
            // InternalGumboLexer.g:140:20: ')'
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
            // InternalGumboLexer.g:142:10: ( '*' )
            // InternalGumboLexer.g:142:12: '*'
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
            // InternalGumboLexer.g:144:10: ( '+' )
            // InternalGumboLexer.g:144:12: '+'
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
            // InternalGumboLexer.g:146:7: ( ',' )
            // InternalGumboLexer.g:146:9: ','
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
            // InternalGumboLexer.g:148:13: ( '-' )
            // InternalGumboLexer.g:148:15: '-'
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
            // InternalGumboLexer.g:150:10: ( '.' )
            // InternalGumboLexer.g:150:12: '.'
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
            // InternalGumboLexer.g:152:7: ( ':' )
            // InternalGumboLexer.g:152:9: ':'
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
            // InternalGumboLexer.g:154:11: ( ';' )
            // InternalGumboLexer.g:154:13: ';'
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
            // InternalGumboLexer.g:156:12: ( '=' )
            // InternalGumboLexer.g:156:14: '='
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
            // InternalGumboLexer.g:158:14: ( '?' )
            // InternalGumboLexer.g:158:16: '?'
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
            // InternalGumboLexer.g:160:3: ( ( 'F' | 'f' ) )
            // InternalGumboLexer.g:160:5: ( 'F' | 'f' )
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
            // InternalGumboLexer.g:162:3: ( ( 'T' | 't' ) )
            // InternalGumboLexer.g:162:5: ( 'T' | 't' )
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
            // InternalGumboLexer.g:164:19: ( '[' )
            // InternalGumboLexer.g:164:21: '['
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
            // InternalGumboLexer.g:166:20: ( ']' )
            // InternalGumboLexer.g:166:22: ']'
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
            // InternalGumboLexer.g:168:6: ( '_' )
            // InternalGumboLexer.g:168:8: '_'
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
            // InternalGumboLexer.g:170:18: ( '{' )
            // InternalGumboLexer.g:170:20: '{'
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
            // InternalGumboLexer.g:172:19: ( '}' )
            // InternalGumboLexer.g:172:21: '}'
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
            // InternalGumboLexer.g:174:8: ( '\\u2200' )
            // InternalGumboLexer.g:174:10: '\\u2200'
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
            // InternalGumboLexer.g:176:13: ( '\\u2203' )
            // InternalGumboLexer.g:176:15: '\\u2203'
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
            // InternalGumboLexer.g:178:19: ( '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:178:21: '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGumboLexer.g:178:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGumboLexer.g:178:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:178:39: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalGumboLexer.g:180:14: ( '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:180:16: '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match("\"\"\""); 

            // InternalGumboLexer.g:180:22: (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )*
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
            	    // InternalGumboLexer.g:180:23: ~ ( '\"' )
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
            	    // InternalGumboLexer.g:180:30: '\"' ~ ( '\"' )
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
            	    // InternalGumboLexer.g:180:41: '\"\"' ~ ( '\"' )
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

            // InternalGumboLexer.g:180:55: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:180:56: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:180:62: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:180:69: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:182:10: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:182:12: RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:182:27: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:182:27: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGumboLexer.g:182:38: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:182:39: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:182:45: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:182:52: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:184:10: ( RULE_IDF '\"' RULE_DIGIT ( RULE_DIGIT )* ( '.' ( RULE_DIGIT )* )? '\"' )
            // InternalGumboLexer.g:184:12: RULE_IDF '\"' RULE_DIGIT ( RULE_DIGIT )* ( '.' ( RULE_DIGIT )* )? '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            mRULE_DIGIT(); 
            // InternalGumboLexer.g:184:36: ( RULE_DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGumboLexer.g:184:36: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalGumboLexer.g:184:48: ( '.' ( RULE_DIGIT )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGumboLexer.g:184:49: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalGumboLexer.g:184:53: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGumboLexer.g:184:53: RULE_DIGIT
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
            // InternalGumboLexer.g:186:11: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:186:13: RULE_IDF '\"\"\"' ( RULE_MSPI )* '$'
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:186:28: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:186:28: RULE_MSPI
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
            // InternalGumboLexer.g:188:11: ( '$' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:188:13: '$' ( RULE_MSPI )* '$'
            {
            match('$'); 
            // InternalGumboLexer.g:188:17: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:188:17: RULE_MSPI
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
            // InternalGumboLexer.g:190:11: ( '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:190:13: '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match('$'); 
            // InternalGumboLexer.g:190:17: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:190:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGumboLexer.g:190:28: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:190:29: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:190:35: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:190:42: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:192:12: ( ':' ( RULE_OPSYM )* '=' )
            // InternalGumboLexer.g:192:14: ':' ( RULE_OPSYM )* '='
            {
            match(':'); 
            // InternalGumboLexer.g:192:18: ( RULE_OPSYM )*
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
            	    // InternalGumboLexer.g:192:18: RULE_OPSYM
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
            // InternalGumboLexer.g:194:9: ( ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF ) )
            // InternalGumboLexer.g:194:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            {
            // InternalGumboLexer.g:194:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
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
                    // InternalGumboLexer.g:194:12: ( RULE_OPSYM )+
                    {
                    // InternalGumboLexer.g:194:12: ( RULE_OPSYM )+
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
                    	    // InternalGumboLexer.g:194:12: RULE_OPSYM
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
                    // InternalGumboLexer.g:194:24: '\\\\' RULE_IDF
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
            // InternalGumboLexer.g:196:10: ( '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:196:12: '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )?
            {
            match("0x"); 

            // InternalGumboLexer.g:196:17: ( RULE_EXTENDED_DIGIT )+
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
            	    // InternalGumboLexer.g:196:17: RULE_EXTENDED_DIGIT
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

            // InternalGumboLexer.g:196:38: ( '.' RULE_IDF )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='.') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGumboLexer.g:196:39: '.' RULE_IDF
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
            // InternalGumboLexer.g:198:10: ( '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:198:12: '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )?
            {
            match("0b"); 

            // InternalGumboLexer.g:198:17: ( '0' | '1' | '_' )+
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

            // InternalGumboLexer.g:198:32: ( '.' RULE_IDF )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='.') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboLexer.g:198:33: '.' RULE_IDF
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
            // InternalGumboLexer.g:200:14: ( RULE_INTEGER_LIT RULE_IDF )
            // InternalGumboLexer.g:200:16: RULE_INTEGER_LIT RULE_IDF
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
            // InternalGumboLexer.g:202:15: ( RULE_REAL_LIT RULE_IDF )
            // InternalGumboLexer.g:202:17: RULE_REAL_LIT RULE_IDF
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
            // InternalGumboLexer.g:204:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:204:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:204:39: ( RULE_LETTER | RULE_DIGIT )*
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
            // InternalGumboLexer.g:206:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:206:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:206:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
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
                    // InternalGumboLexer.g:206:23: ~ ( ( '\"' | '$' ) )
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
                    // InternalGumboLexer.g:206:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:206:41: '\"' ~ ( '\"' )
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
                    // InternalGumboLexer.g:206:52: '\"\"' ~ ( '\"' )
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
            // InternalGumboLexer.g:208:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:208:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalGumboLexer.g:210:21: ( ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' ) )
            // InternalGumboLexer.g:210:23: ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' )
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
            // InternalGumboLexer.g:212:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:212:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:212:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
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
                    // InternalGumboLexer.g:212:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // InternalGumboLexer.g:212:67: RULE_UNICODE_ESC
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
            // InternalGumboLexer.g:214:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:214:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
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
            // InternalGumboLexer.g:216:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:216:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:216:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGumboLexer.g:216:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGumboLexer.g:216:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGumboLexer.g:216:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:216:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGumboLexer.g:216:41: '\\r'
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
            // InternalGumboLexer.g:218:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:218:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:218:36: ( '+' | '-' )?
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

            // InternalGumboLexer.g:218:47: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:218:47: RULE_DIGIT
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
            // InternalGumboLexer.g:220:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:220:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:220:40: ( '+' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboLexer.g:220:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:220:45: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:220:45: RULE_DIGIT
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
            // InternalGumboLexer.g:222:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:222:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:222:17: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:222:17: RULE_DIGIT
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

            // InternalGumboLexer.g:222:29: ( '_' ( RULE_DIGIT )+ )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='_') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGumboLexer.g:222:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:222:34: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:222:34: RULE_DIGIT
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
            // InternalGumboLexer.g:222:52: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:222:52: RULE_DIGIT
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

            // InternalGumboLexer.g:222:64: ( '_' ( RULE_DIGIT )+ )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='_') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGumboLexer.g:222:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:222:69: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:222:69: RULE_DIGIT
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

            // InternalGumboLexer.g:222:83: ( RULE_EXPONENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='E'||LA36_0=='e') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboLexer.g:222:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:224:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:224:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:224:20: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:224:20: RULE_DIGIT
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

            // InternalGumboLexer.g:224:32: ( '_' ( RULE_DIGIT )+ )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='_') ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGumboLexer.g:224:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:224:37: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:224:37: RULE_DIGIT
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

            // InternalGumboLexer.g:224:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='#') ) {
                alt42=1;
            }
            else {
                alt42=2;}
            switch (alt42) {
                case 1 :
                    // InternalGumboLexer.g:224:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:224:79: ( RULE_INT_EXPONENT )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='E'||LA40_0=='e') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalGumboLexer.g:224:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:224:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:224:98: ( RULE_INT_EXPONENT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='E'||LA41_0=='e') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGumboLexer.g:224:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:226:21: ( '0' .. '9' )
            // InternalGumboLexer.g:226:23: '0' .. '9'
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
            // InternalGumboLexer.g:228:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:228:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:230:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:230:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:230:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')||(LA44_0>='A' && LA44_0<='F')||LA44_0=='_'||(LA44_0>='a' && LA44_0<='f')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGumboLexer.g:230:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:230:52: ( '_' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0=='_') ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalGumboLexer.g:230:52: '_'
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
            // InternalGumboLexer.g:232:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:232:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:232:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGumboLexer.g:232:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:232:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGumboLexer.g:232:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:232:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGumboLexer.g:232:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:232:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGumboLexer.g:232:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:232:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGumboLexer.g:234:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:234:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:234:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>='0' && LA49_0<='9')||(LA49_0>='A' && LA49_0<='Z')||LA49_0=='_'||(LA49_0>='a' && LA49_0<='z')) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGumboLexer.g:234:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:234:32: ( '_' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0=='_') ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalGumboLexer.g:234:32: '_'
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
            // InternalGumboLexer.g:236:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:236:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:236:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | Constant | Modifies | Requires | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | While | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt51=96;
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
                // InternalGumboLexer.g:1:105: Constant
                {
                mConstant(); 

                }
                break;
            case 11 :
                // InternalGumboLexer.g:1:114: Modifies
                {
                mModifies(); 

                }
                break;
            case 12 :
                // InternalGumboLexer.g:1:123: Requires
                {
                mRequires(); 

                }
                break;
            case 13 :
                // InternalGumboLexer.g:1:132: Applies
                {
                mApplies(); 

                }
                break;
            case 14 :
                // InternalGumboLexer.g:1:140: Binding
                {
                mBinding(); 

                }
                break;
            case 15 :
                // InternalGumboLexer.g:1:148: Compute
                {
                mCompute(); 

                }
                break;
            case 16 :
                // InternalGumboLexer.g:1:156: Ensures
                {
                mEnsures(); 

                }
                break;
            case 17 :
                // InternalGumboLexer.g:1:164: Library
                {
                mLibrary(); 

                }
                break;
            case 18 :
                // InternalGumboLexer.g:1:172: Memoize
                {
                mMemoize(); 

                }
                break;
            case 19 :
                // InternalGumboLexer.g:1:180: Assert
                {
                mAssert(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:187: Assume
                {
                mAssume(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:194: Return
                {
                mReturn(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:201: Strict
                {
                mStrict(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:208: Some
                {
                mSome(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:213: Delta
                {
                mDelta(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:219: False
                {
                mFalse(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:225: Gumbo
                {
                mGumbo(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:231: Match
                {
                mMatch(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:237: Modes
                {
                mModes(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:243: Reads
                {
                mReads(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:249: State
                {
                mState(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:255: While
                {
                mWhile(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:261: Yield
                {
                mYield(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:267: All
                {
                mAll(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:271: Case
                {
                mCase(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:276: Else
                {
                mElse(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:281: Enum
                {
                mEnum(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:286: Halt
                {
                mHalt(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:291: Spec
                {
                mSpec(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:296: True
                {
                mTrue(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:301: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:335: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:364: Def
                {
                mDef(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:368: For
                {
                mFor(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:372: Inv
                {
                mInv(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:376: Mut
                {
                mMut(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:380: Val
                {
                mVal(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:384: Var
                {
                mVar(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:388: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:405: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:416: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:432: LessThanSignColon
                {
                mLessThanSignColon(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:450: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:476: By
                {
                mBy(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:479: Do
                {
                mDo(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:482: If
                {
                mIf(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:485: In
                {
                mIn(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:488: To
                {
                mTo(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:491: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:507: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:524: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:533: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:542: Comma
                {
                mComma(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:548: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:560: FullStop
                {
                mFullStop(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:569: Colon
                {
                mColon(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:575: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:585: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:596: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:609: F
                {
                mF(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:611: T
                {
                mT(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:613: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:631: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:650: KW__
                {
                mKW__(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:655: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:672: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:690: ForAll
                {
                mForAll(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:697: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:709: RULE_SLANG_STRING
                {
                mRULE_SLANG_STRING(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:727: RULE_MSTRING
                {
                mRULE_MSTRING(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:740: RULE_MSP
                {
                mRULE_MSP(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:749: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:758: RULE_MSPB
                {
                mRULE_MSPB(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:768: RULE_MSPM
                {
                mRULE_MSPM(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:778: RULE_MSPE
                {
                mRULE_MSPE(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:788: RULE_DEFOP
                {
                mRULE_DEFOP(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:799: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:807: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:816: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:825: RULE_INT_IDF
                {
                mRULE_INT_IDF(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:838: RULE_REAL_IDF
                {
                mRULE_REAL_IDF(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:852: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:868: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:882: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:899: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:911: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:919: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA51_eotS =
        "\1\uffff\3\60\1\74\7\60\1\uffff\4\60\1\123\1\125\1\127\1\60\1\134\1\51\1\137\4\uffff\1\141\4\uffff\1\143\2\uffff\1\144\1\145\1\uffff\1\60\2\uffff\2\156\2\uffff\1\167\1\170\1\uffff\1\60\1\uffff\11\60\1\uffff\11\60\1\u0093\3\60\2\51\1\60\1\u009c\4\60\1\u00a1\3\uffff\1\u00a3\1\uffff\1\60\1\uffff\1\u00a6\3\uffff\1\u00a7\7\uffff\1\u00a9\3\uffff\1\u00ae\1\uffff\2\163\1\uffff\1\163\2\uffff\1\163\1\uffff\2\60\1\u00bc\4\uffff\12\60\1\u00c8\11\60\1\u00d3\3\60\1\uffff\4\60\2\51\1\60\1\u00df\1\uffff\4\60\3\uffff\1\u00e4\1\u00e5\13\uffff\1\u00e9\1\u00b3\1\uffff\1\163\1\u00eb\1\uffff\1\163\1\uffff\3\60\2\uffff\3\60\1\u00fc\2\60\1\u00ff\1\u0100\2\60\1\uffff\12\60\1\uffff\7\60\1\u0114\1\51\1\u0116\1\60\1\uffff\2\60\1\u011a\1\u011b\6\uffff\1\163\1\uffff\2\u00ee\3\uffff\2\156\3\60\1\uffff\1\u0125\1\uffff\3\60\1\uffff\2\60\2\uffff\1\60\1\u012e\1\60\1\u0130\3\60\1\u0134\1\60\1\u0136\1\60\1\u0138\6\60\1\u013f\1\uffff\1\u0140\1\uffff\1\u0141\1\u0142\1\u0143\3\uffff\1\u00ee\1\uffff\1\u00ee\1\163\3\60\4\uffff\6\60\1\uffff\1\60\1\uffff\2\60\1\u0157\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\u015b\1\u015c\2\60\1\u015f\6\uffff\1\u00ee\1\u00eb\1\163\1\uffff\3\60\2\uffff\2\60\1\u0167\1\60\1\u0169\4\60\1\uffff\1\60\1\u016f\1\u0170\2\uffff\1\u0171\1\u0172\2\uffff\1\156\4\60\1\u0177\1\uffff\1\60\1\uffff\3\60\1\u017c\1\u017d\4\uffff\2\60\1\u0181\1\60\1\uffff\1\u0183\1\u0184\1\u0185\1\u0186\2\uffff\1\60\1\u0188\1\u0189\1\uffff\1\u018a\4\uffff\1\u018b\4\uffff";
    static final String DFA51_eofS =
        "\u018c\uffff";
    static final String DFA51_minS =
        "\1\11\13\42\1\101\5\42\1\75\1\56\1\42\1\41\1\72\1\41\4\uffff\1\55\4\uffff\1\42\2\uffff\2\41\1\0\1\42\1\0\1\uffff\2\43\2\uffff\2\42\1\uffff\13\42\1\uffff\15\42\1\117\1\114\7\42\3\uffff\1\74\1\uffff\1\42\1\uffff\1\41\3\uffff\1\41\3\uffff\1\42\3\uffff\2\42\2\0\1\44\1\0\2\60\1\uffff\3\60\1\53\1\uffff\3\42\2\uffff\1\42\1\uffff\30\42\1\uffff\4\42\1\115\1\114\2\42\1\uffff\4\42\3\uffff\2\42\4\uffff\2\0\1\uffff\1\0\1\uffff\2\0\2\60\1\uffff\1\43\1\60\1\43\2\60\3\42\1\uffff\1\0\12\42\1\uffff\12\42\1\uffff\10\42\1\105\1\60\1\42\1\uffff\4\42\2\uffff\2\0\2\uffff\1\53\1\uffff\1\60\1\53\1\uffff\1\60\1\43\1\101\1\60\3\42\1\0\1\44\1\0\3\42\1\uffff\2\42\2\uffff\23\42\1\uffff\1\60\1\uffff\3\42\2\uffff\1\0\3\60\1\53\3\42\1\0\1\uffff\2\0\6\42\1\uffff\1\42\1\uffff\3\42\1\uffff\1\42\1\uffff\1\42\1\uffff\6\42\5\uffff\1\0\1\53\3\60\3\42\1\0\1\uffff\11\42\1\uffff\3\42\2\uffff\2\42\1\uffff\1\0\1\60\5\42\1\uffff\1\42\1\uffff\5\42\4\uffff\4\42\1\uffff\4\42\2\uffff\3\42\1\uffff\1\42\4\uffff\1\42\4\uffff";
    static final String DFA51_maxS =
        "\1\u2aff\21\172\1\75\1\56\1\172\1\u2aff\1\72\1\u2aff\4\uffff\1\55\4\uffff\1\172\2\uffff\2\u2aff\1\uffff\1\172\1\uffff\1\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\71\11\172\1\uffff\15\172\1\157\1\154\7\172\3\uffff\1\74\1\uffff\1\172\1\uffff\1\u2aff\3\uffff\1\u2aff\3\uffff\1\172\3\uffff\1\42\1\165\2\uffff\1\44\1\uffff\1\146\1\137\1\uffff\2\71\1\146\1\71\1\uffff\3\172\2\uffff\1\42\1\uffff\30\172\1\uffff\4\172\1\155\1\154\2\172\1\uffff\4\172\3\uffff\2\172\4\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\2\172\1\uffff\1\145\1\172\1\146\2\71\3\172\1\uffff\1\uffff\12\172\1\uffff\12\172\1\uffff\10\172\1\145\2\172\1\uffff\4\172\2\uffff\2\uffff\2\uffff\1\71\1\uffff\2\71\1\uffff\2\146\5\172\1\uffff\1\44\1\uffff\3\172\1\uffff\2\172\2\uffff\23\172\1\uffff\1\172\1\uffff\3\172\2\uffff\1\uffff\1\145\3\71\3\172\1\uffff\1\uffff\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\6\172\5\uffff\1\uffff\1\71\1\172\2\71\3\172\1\uffff\1\uffff\11\172\1\uffff\3\172\2\uffff\2\172\1\uffff\1\uffff\6\172\1\uffff\1\172\1\uffff\5\172\4\uffff\4\172\1\uffff\4\172\2\uffff\3\172\1\uffff\1\172\4\uffff\1\172\4\uffff";
    static final String DFA51_acceptS =
        "\30\uffff\1\72\1\73\1\74\1\76\1\uffff\1\102\1\104\1\107\1\110\1\uffff\1\112\1\113\5\uffff\1\126\2\uffff\1\136\1\140\2\uffff\1\137\13\uffff\1\105\26\uffff\1\106\1\50\1\75\1\uffff\1\100\1\uffff\1\61\1\uffff\1\125\1\101\1\63\1\uffff\1\103\1\133\1\77\1\uffff\1\111\1\114\1\115\10\uffff\1\135\4\uffff\1\131\3\uffff\1\70\1\67\1\uffff\1\121\30\uffff\1\65\10\uffff\1\66\4\uffff\1\71\1\51\1\60\2\uffff\1\62\1\64\1\117\1\116\2\uffff\1\116\1\uffff\1\123\4\uffff\1\130\10\uffff\1\54\13\uffff\1\53\12\uffff\1\55\13\uffff\1\52\4\uffff\1\56\1\57\2\uffff\1\124\1\127\1\uffff\1\134\2\uffff\1\132\15\uffff\1\42\2\uffff\1\44\1\43\23\uffff\1\46\1\uffff\1\41\3\uffff\1\45\1\47\11\uffff\1\122\10\uffff\1\31\1\uffff\1\32\3\uffff\1\35\1\uffff\1\34\1\uffff\1\33\6\uffff\1\36\1\27\1\30\1\37\1\40\11\uffff\1\120\11\uffff\1\25\3\uffff\1\23\1\24\2\uffff\1\26\7\uffff\1\17\1\uffff\1\20\5\uffff\1\22\1\15\1\16\1\21\4\uffff\1\12\4\uffff\1\14\1\13\3\uffff\1\10\1\uffff\1\5\1\6\1\7\1\11\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA51_specialS =
        "\46\uffff\1\0\1\uffff\1\14\77\uffff\1\11\1\13\1\uffff\1\6\76\uffff\1\5\1\10\1\uffff\1\15\1\uffff\1\17\1\25\14\uffff\1\7\50\uffff\1\2\1\20\16\uffff\1\21\1\uffff\1\1\43\uffff\1\3\7\uffff\1\22\1\uffff\1\23\1\16\34\uffff\1\4\7\uffff\1\24\23\uffff\1\12\53\uffff}>";
    static final String[] DFA51_transitionS = DFA51_transitionS_.DFA51_transitionS;
    private static final class DFA51_transitionS_ {
        static final String[] DFA51_transitionS = {
                "\2\55\2\uffff\1\55\22\uffff\1\55\1\51\1\46\1\uffff\1\50\2\51\1\54\1\30\1\31\1\32\1\22\1\33\1\34\1\23\1\51\1\52\11\53\1\25\1\35\1\26\1\27\1\51\1\36\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\20\1\1\2\47\1\12\1\7\4\47\1\6\1\13\1\21\1\47\1\24\1\16\1\47\1\17\1\47\1\37\1\14\1\40\1\51\1\41\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\20\1\1\2\47\1\12\1\7\4\47\1\6\1\13\1\21\1\47\1\24\1\16\1\47\1\17\1\47\1\42\1\51\1\43\1\51\u2181\uffff\1\44\2\51\1\45\u00fc\51\u04c0\uffff\60\51\u0190\uffff\u0180\51",
                "\1\62\15\uffff\12\61\7\uffff\5\61\1\57\7\61\1\56\14\61\6\uffff\5\61\1\57\7\61\1\56\14\61",
                "\1\62\15\uffff\12\61\7\uffff\1\65\12\61\1\63\2\61\1\64\13\61\6\uffff\1\65\12\61\1\63\2\61\1\64\13\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\70\1\61\1\67\11\61\1\66\2\61\6\uffff\13\61\1\70\1\61\1\67\11\61\1\66\2\61",
                "\1\62\15\uffff\12\61\7\uffff\1\72\15\61\1\73\5\61\1\71\5\61\4\uffff\1\60\1\uffff\1\72\15\61\1\73\5\61\1\71\5\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\75\5\61\6\uffff\24\61\1\75\5\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\76\25\61\6\uffff\4\61\1\76\25\61",
                "\1\62\15\uffff\12\61\7\uffff\1\101\3\61\1\100\11\61\1\77\5\61\1\102\5\61\6\uffff\1\101\3\61\1\100\11\61\1\77\5\61\1\102\5\61",
                "\1\62\15\uffff\12\61\7\uffff\17\61\1\103\2\61\1\104\7\61\6\uffff\17\61\1\103\2\61\1\104\7\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\105\17\61\1\106\1\61\6\uffff\10\61\1\105\17\61\1\106\1\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\107\21\61\6\uffff\10\61\1\107\21\61",
                "\1\62\15\uffff\12\61\7\uffff\17\61\1\111\3\61\1\110\6\61\6\uffff\17\61\1\111\3\61\1\110\6\61",
                "\1\113\21\51\1\112\7\51\4\uffff\1\51\1\uffff\1\113\21\51\1\112\7\51",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\114\11\61\1\115\13\61\6\uffff\4\61\1\114\11\61\1\115\13\61",
                "\1\62\15\uffff\12\61\7\uffff\7\61\1\116\22\61\6\uffff\7\61\1\116\22\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\117\21\61\6\uffff\10\61\1\117\21\61",
                "\1\62\15\uffff\12\61\7\uffff\1\120\31\61\6\uffff\1\120\31\61",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\122\2\61\1\121\10\61\4\uffff\1\60\1\uffff\16\61\1\122\2\61\1\121\10\61",
                "\1\124",
                "\1\126",
                "\1\62\15\uffff\12\61\7\uffff\1\130\31\61\6\uffff\1\130\31\61",
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
                "\1\62\15\uffff\12\61\7\uffff\32\61\6\uffff\32\61",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "\1\161\12\uffff\1\160\1\uffff\12\53\7\uffff\4\163\1\162\25\163\4\uffff\1\157\1\uffff\1\163\1\155\2\163\1\162\22\163\1\154\2\163",
                "\1\161\12\uffff\1\160\1\uffff\12\53\7\uffff\4\163\1\162\25\163\4\uffff\1\157\1\uffff\4\163\1\162\25\163",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\165\12\61\1\164\1\61\1\166\4\61\4\uffff\1\60\1\uffff\10\61\1\165\12\61\1\164\1\61\1\166\4\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\6\uffff\32\61",
                "\1\171\15\uffff\12\172",
                "\1\62\15\uffff\12\61\7\uffff\1\173\31\61\6\uffff\1\173\31\61",
                "\1\62\15\uffff\12\61\7\uffff\14\61\1\175\1\174\14\61\6\uffff\14\61\1\175\1\174\14\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\176\7\61\6\uffff\22\61\1\176\7\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\177\6\61\6\uffff\23\61\1\177\6\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0080\1\61\1\u0081\5\61\6\uffff\22\61\1\u0080\1\61\1\u0081\5\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0082\7\61\6\uffff\22\61\1\u0082\7\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0083\14\61\6\uffff\15\61\1\u0083\14\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u0084\16\61\6\uffff\13\61\1\u0084\16\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0085\10\61\6\uffff\21\61\1\u0085\10\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\1\u0086\13\61\1\u0087\15\61\6\uffff\1\u0086\13\61\1\u0087\15\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u008b\4\61\1\u0088\12\61\1\u0089\2\61\1\u008a\6\61\6\uffff\1\u008b\4\61\1\u0088\12\61\1\u0089\2\61\1\u008a\6\61",
                "\1\62\15\uffff\12\61\7\uffff\3\61\1\u008c\26\61\6\uffff\3\61\1\u008c\26\61",
                "\1\62\15\uffff\12\61\7\uffff\14\61\1\u008d\15\61\6\uffff\14\61\1\u008d\15\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u008e\6\61\6\uffff\23\61\1\u008e\6\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u008f\6\61\6\uffff\23\61\1\u008f\6\61",
                "\1\62\15\uffff\12\61\7\uffff\17\61\1\u0090\12\61\6\uffff\17\61\1\u0090\12\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0091\7\61\6\uffff\22\61\1\u0091\7\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0092\14\61\6\uffff\15\61\1\u0092\14\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\1\61\1\u0094\30\61\6\uffff\1\61\1\u0094\30\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u0096\20\61\1\u0095\10\61\6\uffff\1\u0096\20\61\1\u0095\10\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0097\25\61\6\uffff\4\61\1\u0097\25\61",
                "\1\u0098\37\uffff\1\u0098",
                "\1\u0099\37\uffff\1\u0099",
                "\1\62\15\uffff\12\61\7\uffff\5\61\1\u009b\5\61\1\u009a\16\61\6\uffff\5\61\1\u009b\5\61\1\u009a\16\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u009d\21\61\6\uffff\10\61\1\u009d\21\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u009e\25\61\6\uffff\4\61\1\u009e\25\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u009f\16\61\6\uffff\13\61\1\u009f\16\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\u00a0\5\61\6\uffff\24\61\1\u00a0\5\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "",
                "\1\u00a2",
                "",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u00a4\5\61\1\u00a5\10\61\6\uffff\13\61\1\u00a4\5\61\1\u00a5\10\61",
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
                "\1\u00a8",
                "\1\u00aa\4\uffff\1\u00aa\64\uffff\1\u00aa\5\uffff\1\u00aa\3\uffff\1\u00aa\7\uffff\1\u00aa\3\uffff\1\u00aa\1\uffff\1\u00aa\1\u00ab",
                "\42\150\1\u00ac\71\150\1\147\uffa3\150",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "\1\u00ad",
                "\42\u00af\1\u00b0\uffdd\u00af",
                "\12\u00b1\7\uffff\6\u00b1\32\uffff\6\u00b1",
                "\2\u00b2\55\uffff\1\u00b3",
                "",
                "\12\u00b4",
                "\12\u00b5",
                "\12\u00b6\7\uffff\6\u00b6\32\uffff\6\u00b6",
                "\1\u00b8\4\uffff\12\u00b7",
                "",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00b9\25\61\6\uffff\4\61\1\u00b9\25\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u00ba\6\61\6\uffff\23\61\1\u00ba\6\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u00bb\31\61\4\uffff\1\60\1\uffff\1\u00bb\31\61",
                "",
                "",
                "\1\u00bd",
                "",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u00be\7\61\6\uffff\22\61\1\u00be\7\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u00bf\7\61\6\uffff\22\61\1\u00bf\7\61",
                "\1\62\15\uffff\12\61\7\uffff\17\61\1\u00c0\12\61\6\uffff\17\61\1\u00c0\12\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00c1\25\61\6\uffff\4\61\1\u00c1\25\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00c2\25\61\6\uffff\4\61\1\u00c2\25\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\u00c3\5\61\6\uffff\24\61\1\u00c3\5\61",
                "\1\62\15\uffff\12\61\7\uffff\14\61\1\u00c4\15\61\6\uffff\14\61\1\u00c4\15\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00c5\25\61\6\uffff\4\61\1\u00c5\25\61",
                "\1\62\15\uffff\12\61\7\uffff\2\61\1\u00c6\27\61\6\uffff\2\61\1\u00c6\27\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u00c7\7\61\6\uffff\22\61\1\u00c7\7\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u00c9\10\61\6\uffff\21\61\1\u00c9\10\61",
                "\1\62\15\uffff\12\61\7\uffff\1\61\1\u00ca\30\61\6\uffff\1\61\1\u00ca\30\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00cb\25\61\6\uffff\4\61\1\u00cb\25\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\u00cc\5\61\6\uffff\24\61\1\u00cc\5\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\u00cd\5\61\6\uffff\24\61\1\u00cd\5\61",
                "\1\62\15\uffff\12\61\7\uffff\3\61\1\u00ce\26\61\6\uffff\3\61\1\u00ce\26\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00d0\3\61\1\u00cf\21\61\6\uffff\4\61\1\u00d0\3\61\1\u00cf\21\61",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\u00d1\13\61\6\uffff\16\61\1\u00d1\13\61",
                "\1\62\15\uffff\12\61\7\uffff\2\61\1\u00d2\27\61\6\uffff\2\61\1\u00d2\27\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u00d4\16\61\6\uffff\13\61\1\u00d4\16\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00d5\17\61\1\u00d6\5\61\6\uffff\4\61\1\u00d5\17\61\1\u00d6\5\61",
                "\1\62\15\uffff\12\61\7\uffff\3\61\1\u00d7\26\61\6\uffff\3\61\1\u00d7\26\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u00d8\10\61\6\uffff\21\61\1\u00d8\10\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u00d9\21\61\6\uffff\10\61\1\u00d9\21\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u00da\6\61\6\uffff\23\61\1\u00da\6\61",
                "\1\62\15\uffff\12\61\7\uffff\2\61\1\u00db\27\61\6\uffff\2\61\1\u00db\27\61",
                "\1\u00dc\37\uffff\1\u00dc",
                "\1\u00dd\37\uffff\1\u00dd",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u00de\6\61\6\uffff\23\61\1\u00de\6\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u00e0\16\61\6\uffff\13\61\1\u00e0\16\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u00e1\16\61\6\uffff\13\61\1\u00e1\16\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u00e2\6\61\6\uffff\23\61\1\u00e2\6\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u00e3\25\61\6\uffff\4\61\1\u00e3\25\61",
                "",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "",
                "",
                "\42\150\1\u00ac\71\150\1\147\uffa3\150",
                "\60\54\12\u00e6\7\54\6\u00e6\32\54\6\u00e6\uff99\54",
                "",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "\42\u00e7\1\u00e8\uffdd\u00e7",
                "\12\u00b1\7\uffff\6\u00b1\24\163\6\uffff\6\u00b1\24\163",
                "\2\u00b2\10\163\7\uffff\32\163\6\uffff\32\163",
                "",
                "\1\161\12\uffff\1\160\1\uffff\12\u00b4\13\uffff\1\u00ea\31\uffff\1\157\5\uffff\1\u00ea",
                "\12\u00b5\7\uffff\4\u00ee\1\u00ed\25\u00ee\4\uffff\1\u00ec\1\uffff\4\u00ee\1\u00ed\25\u00ee",
                "\1\u00f1\14\uffff\12\u00f0\7\uffff\6\u00f0\30\uffff\1\u00ef\1\uffff\6\u00f0",
                "\12\u00b7",
                "\12\u00f2",
                "\1\62\15\uffff\12\61\7\uffff\6\61\1\u00f3\23\61\6\uffff\6\61\1\u00f3\23\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u00f4\21\61\6\uffff\10\61\1\u00f4\21\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u00f5\10\61\6\uffff\21\61\1\u00f5\10\61",
                "",
                "\42\u00f6\1\u00f8\1\u00f6\1\u00f7\uffdb\u00f6",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u00f9\7\61\6\uffff\22\61\1\u00f9\7\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u00fa\6\61\6\uffff\23\61\1\u00fa\6\61",
                "\1\62\15\uffff\12\61\7\uffff\24\61\1\u00fb\5\61\6\uffff\24\61\1\u00fb\5\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u00fd\14\61\6\uffff\15\61\1\u00fd\14\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u00fe\10\61\6\uffff\21\61\1\u00fe\10\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u0101\6\61\6\uffff\23\61\1\u0101\6\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0102\25\61\6\uffff\4\61\1\u0102\25\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\1\u0103\31\61\6\uffff\1\u0103\31\61",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\u0104\13\61\6\uffff\16\61\1\u0104\13\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0105\10\61\6\uffff\21\61\1\u0105\10\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0106\21\61\6\uffff\10\61\1\u0106\21\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0107\10\61\6\uffff\21\61\1\u0107\10\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0108\7\61\6\uffff\22\61\1\u0108\7\61",
                "\1\62\15\uffff\12\61\7\uffff\5\61\1\u0109\24\61\6\uffff\5\61\1\u0109\24\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u010a\7\61\6\uffff\22\61\1\u010a\7\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u010b\21\61\6\uffff\10\61\1\u010b\21\61",
                "\1\62\15\uffff\12\61\7\uffff\7\61\1\u010c\22\61\6\uffff\7\61\1\u010c\22\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u010d\21\61\6\uffff\10\61\1\u010d\21\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u010e\10\61\6\uffff\21\61\1\u010e\10\61",
                "\1\62\15\uffff\12\61\7\uffff\14\61\1\u010f\15\61\6\uffff\14\61\1\u010f\15\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0110\21\61\6\uffff\10\61\1\u0110\21\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u0111\31\61\6\uffff\1\u0111\31\61",
                "\1\62\15\uffff\12\61\7\uffff\2\61\1\u0112\27\61\6\uffff\2\61\1\u0112\27\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0113\25\61\6\uffff\4\61\1\u0113\25\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\u0115\37\uffff\1\u0115",
                "\12\51\7\uffff\32\51\6\uffff\32\51",
                "\1\62\15\uffff\12\61\7\uffff\1\u0117\31\61\6\uffff\1\u0117\31\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0118\25\61\6\uffff\4\61\1\u0118\25\61",
                "\1\62\15\uffff\12\61\7\uffff\3\61\1\u0119\26\61\6\uffff\3\61\1\u0119\26\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "\60\54\12\u011c\7\54\6\u011c\32\54\6\u011c\uff99\54",
                "\42\151\1\153\1\151\1\152\uffdb\151",
                "",
                "",
                "\1\u00b8\4\uffff\12\u00b7",
                "",
                "\12\u011d",
                "\1\u011e\1\uffff\1\u011e\2\uffff\12\u011f",
                "",
                "\12\u00f0\7\uffff\6\u00f0\32\uffff\6\u00f0",
                "\1\u00f1\14\uffff\12\u00f0\7\uffff\6\u00f0\30\uffff\1\u00ef\1\uffff\6\u00f0",
                "\4\163\1\u0120\25\163\4\uffff\1\163\1\uffff\4\163\1\u0120\25\163",
                "\12\u00f2\7\uffff\32\163\4\uffff\1\163\1\uffff\32\163",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0121\10\61\6\uffff\21\61\1\u0121\10\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u0122\31\61\6\uffff\1\u0122\31\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0123\21\61\6\uffff\10\61\1\u0123\21\61",
                "\42\u00f6\1\u00f8\1\u00f6\1\u00f7\uffdb\u00f6",
                "\1\u0124",
                "\42\u0126\1\u0127\uffdd\u0126",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0128\21\61\6\uffff\10\61\1\u0128\21\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u0129\31\61\6\uffff\1\u0129\31\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u012a\6\61\6\uffff\23\61\1\u012a\6\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u012b\7\61\6\uffff\22\61\1\u012b\7\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u012c\25\61\6\uffff\4\61\1\u012c\25\61",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u012d\21\61\6\uffff\10\61\1\u012d\21\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u012f\14\61\6\uffff\15\61\1\u012f\14\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0131\25\61\6\uffff\4\61\1\u0131\25\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0132\10\61\6\uffff\21\61\1\u0132\10\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0133\14\61\6\uffff\15\61\1\u0133\14\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0135\21\61\6\uffff\10\61\1\u0135\21\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\31\61\1\u0137\6\uffff\31\61\1\u0137",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0139\25\61\6\uffff\4\61\1\u0139\25\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u013a\6\61\6\uffff\23\61\1\u013a\6\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u013b\25\61\6\uffff\4\61\1\u013b\25\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u013c\14\61\6\uffff\15\61\1\u013c\14\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u013d\10\61\6\uffff\21\61\1\u013d\10\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u013e\6\61\6\uffff\23\61\1\u013e\6\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\12\51\7\uffff\32\51\6\uffff\32\51",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "\60\54\12\u0144\7\54\6\u0144\32\54\6\u0144\uff99\54",
                "\12\u011d\13\uffff\1\u0145\31\uffff\1\u00ec\5\uffff\1\u0145",
                "\12\u0146",
                "\12\u011f",
                "\1\u0148\4\uffff\12\u0147",
                "\1\62\15\uffff\12\61\7\uffff\1\u0149\31\61\6\uffff\1\u0149\31\61",
                "\1\62\15\uffff\12\61\7\uffff\13\61\1\u014a\16\61\6\uffff\13\61\1\u014a\16\61",
                "\1\62\15\uffff\12\61\7\uffff\1\u014b\31\61\6\uffff\1\u014b\31\61",
                "\42\u00f6\1\u00f8\1\u00f6\1\u00f7\uffdb\u00f6",
                "",
                "\42\u00f6\1\u00f8\1\u00f6\1\u00f7\uffdb\u00f6",
                "\42\u014c\1\u014d\uffdd\u014c",
                "\1\62\15\uffff\12\61\7\uffff\5\61\1\u014e\24\61\6\uffff\5\61\1\u014e\24\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u014f\14\61\6\uffff\15\61\1\u014f\14\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0150\25\61\6\uffff\4\61\1\u0150\25\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0151\21\61\6\uffff\10\61\1\u0151\21\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0152\7\61\6\uffff\22\61\1\u0152\7\61",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\u0153\13\61\6\uffff\16\61\1\u0153\13\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u0154\6\61\6\uffff\23\61\1\u0154\6\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0155\14\61\6\uffff\15\61\1\u0155\14\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0156\25\61\6\uffff\4\61\1\u0156\25\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0158\25\61\6\uffff\4\61\1\u0158\25\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0159\25\61\6\uffff\4\61\1\u0159\25\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u015a\7\61\6\uffff\22\61\1\u015a\7\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\6\61\1\u015d\23\61\6\uffff\6\61\1\u015d\23\61",
                "\1\62\15\uffff\12\61\7\uffff\30\61\1\u015e\1\61\6\uffff\30\61\1\u015e\1\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "",
                "",
                "",
                "\60\54\12\u0160\7\54\6\u0160\32\54\6\u0160\uff99\54",
                "\1\u011e\1\uffff\1\u011e\2\uffff\12\u011f",
                "\12\u0146\7\uffff\32\u00ee\4\uffff\1\u00ee\1\uffff\32\u00ee",
                "\12\u0147",
                "\12\u0161",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u0162\6\61\6\uffff\23\61\1\u0162\6\61",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0163\21\61\6\uffff\10\61\1\u0163\21\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0164\14\61\6\uffff\15\61\1\u0164\14\61",
                "\42\u00f6\1\u00f8\1\u00f6\1\u00f7\uffdb\u00f6",
                "",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0165\21\61\6\uffff\10\61\1\u0165\21\61",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u0166\6\61\6\uffff\23\61\1\u0166\6\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\u0168\13\61\6\uffff\16\61\1\u0168\13\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u016a\14\61\6\uffff\15\61\1\u016a\14\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u016b\25\61\6\uffff\4\61\1\u016b\25\61",
                "\1\62\15\uffff\12\61\7\uffff\2\61\1\u016c\27\61\6\uffff\2\61\1\u016c\27\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u016d\7\61\6\uffff\22\61\1\u016d\7\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u016e\7\61\6\uffff\22\61\1\u016e\7\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\42\150\1\u00ac\71\150\1\147\uffa3\150",
                "\12\u0161\7\uffff\32\163\4\uffff\1\163\1\uffff\32\163",
                "\1\62\15\uffff\12\61\7\uffff\10\61\1\u0173\21\61\6\uffff\10\61\1\u0173\21\61",
                "\1\62\15\uffff\12\61\7\uffff\31\61\1\u0174\6\uffff\31\61\1\u0174",
                "\1\62\15\uffff\12\61\7\uffff\23\61\1\u0175\6\61\6\uffff\23\61\1\u0175\6\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u0176\25\61\6\uffff\4\61\1\u0176\25\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0178\14\61\6\uffff\15\61\1\u0178\14\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0179\7\61\6\uffff\22\61\1\u0179\7\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u017a\25\61\6\uffff\4\61\1\u017a\25\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u017b\25\61\6\uffff\4\61\1\u017b\25\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\16\61\1\u017e\13\61\6\uffff\16\61\1\u017e\13\61",
                "\1\62\15\uffff\12\61\7\uffff\4\61\1\u017f\25\61\6\uffff\4\61\1\u017f\25\61",
                "\1\62\15\uffff\12\61\7\uffff\22\61\1\u0180\7\61\4\uffff\1\60\1\uffff\22\61\1\u0180\7\61",
                "\1\62\15\uffff\12\61\7\uffff\21\61\1\u0182\10\61\6\uffff\21\61\1\u0182\10\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\15\61\1\u0187\14\61\6\uffff\15\61\1\u0187\14\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
                "",
                "",
                "",
                "",
                "\1\62\15\uffff\12\61\7\uffff\32\61\4\uffff\1\60\1\uffff\32\61",
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
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | Constant | Modifies | Requires | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | While | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_SLANG_STRING | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_REAL_IDF | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
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
                        int LA51_248 = input.LA(1);

                        s = -1;
                        if ( ((LA51_248>='\u0000' && LA51_248<='!')||(LA51_248>='#' && LA51_248<='\uFFFF')) ) {s = 294;}

                        else if ( (LA51_248=='\"') ) {s = 295;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_230 = input.LA(1);

                        s = -1;
                        if ( ((LA51_230>='\u0000' && LA51_230<='/')||(LA51_230>=':' && LA51_230<='@')||(LA51_230>='G' && LA51_230<='`')||(LA51_230>='g' && LA51_230<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA51_230>='0' && LA51_230<='9')||(LA51_230>='A' && LA51_230<='F')||(LA51_230>='a' && LA51_230<='f')) ) {s = 284;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_284 = input.LA(1);

                        s = -1;
                        if ( ((LA51_284>='\u0000' && LA51_284<='/')||(LA51_284>=':' && LA51_284<='@')||(LA51_284>='G' && LA51_284<='`')||(LA51_284>='g' && LA51_284<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA51_284>='0' && LA51_284<='9')||(LA51_284>='A' && LA51_284<='F')||(LA51_284>='a' && LA51_284<='f')) ) {s = 324;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_324 = input.LA(1);

                        s = -1;
                        if ( ((LA51_324>='\u0000' && LA51_324<='/')||(LA51_324>=':' && LA51_324<='@')||(LA51_324>='G' && LA51_324<='`')||(LA51_324>='g' && LA51_324<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA51_324>='0' && LA51_324<='9')||(LA51_324>='A' && LA51_324<='F')||(LA51_324>='a' && LA51_324<='f')) ) {s = 352;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_170 = input.LA(1);

                        s = -1;
                        if ( (LA51_170=='\"') ) {s = 172;}

                        else if ( (LA51_170=='\\') ) {s = 103;}

                        else if ( ((LA51_170>='\u0000' && LA51_170<='!')||(LA51_170>='#' && LA51_170<='[')||(LA51_170>=']' && LA51_170<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_107 = input.LA(1);

                        s = -1;
                        if ( ((LA51_107>='\u0000' && LA51_107<='!')||(LA51_107>='#' && LA51_107<='\uFFFF')) ) {s = 175;}

                        else if ( (LA51_107=='\"') ) {s = 176;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_189 = input.LA(1);

                        s = -1;
                        if ( ((LA51_189>='\u0000' && LA51_189<='!')||LA51_189=='#'||(LA51_189>='%' && LA51_189<='\uFFFF')) ) {s = 246;}

                        else if ( (LA51_189=='$') ) {s = 247;}

                        else if ( (LA51_189=='\"') ) {s = 248;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_171 = input.LA(1);

                        s = -1;
                        if ( ((LA51_171>='0' && LA51_171<='9')||(LA51_171>='A' && LA51_171<='F')||(LA51_171>='a' && LA51_171<='f')) ) {s = 230;}

                        else if ( ((LA51_171>='\u0000' && LA51_171<='/')||(LA51_171>=':' && LA51_171<='@')||(LA51_171>='G' && LA51_171<='`')||(LA51_171>='g' && LA51_171<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_104 = input.LA(1);

                        s = -1;
                        if ( (LA51_104=='\"') ) {s = 172;}

                        else if ( (LA51_104=='\\') ) {s = 103;}

                        else if ( ((LA51_104>='\u0000' && LA51_104<='!')||(LA51_104>='#' && LA51_104<='[')||(LA51_104>=']' && LA51_104<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_352 = input.LA(1);

                        s = -1;
                        if ( (LA51_352=='\"') ) {s = 172;}

                        else if ( (LA51_352=='\\') ) {s = 103;}

                        else if ( ((LA51_352>='\u0000' && LA51_352<='!')||(LA51_352>='#' && LA51_352<='[')||(LA51_352>=']' && LA51_352<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_105 = input.LA(1);

                        s = -1;
                        if ( (LA51_105=='\"') ) {s = 107;}

                        else if ( ((LA51_105>='\u0000' && LA51_105<='!')||LA51_105=='#'||(LA51_105>='%' && LA51_105<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_105=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_40 = input.LA(1);

                        s = -1;
                        if ( ((LA51_40>='\u0000' && LA51_40<='!')||LA51_40=='#'||(LA51_40>='%' && LA51_40<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_40=='$') ) {s = 106;}

                        else if ( (LA51_40=='\"') ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_173 = input.LA(1);

                        s = -1;
                        if ( (LA51_173=='\"') ) {s = 107;}

                        else if ( ((LA51_173>='\u0000' && LA51_173<='!')||LA51_173=='#'||(LA51_173>='%' && LA51_173<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_173=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_295 = input.LA(1);

                        s = -1;
                        if ( ((LA51_295>='\u0000' && LA51_295<='!')||(LA51_295>='#' && LA51_295<='\uFFFF')) ) {s = 332;}

                        else if ( (LA51_295=='\"') ) {s = 333;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_175 = input.LA(1);

                        s = -1;
                        if ( (LA51_175=='\"') ) {s = 107;}

                        else if ( ((LA51_175>='\u0000' && LA51_175<='!')||LA51_175=='#'||(LA51_175>='%' && LA51_175<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_175=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_231 = input.LA(1);

                        s = -1;
                        if ( (LA51_231=='\"') ) {s = 107;}

                        else if ( ((LA51_231>='\u0000' && LA51_231<='!')||LA51_231=='#'||(LA51_231>='%' && LA51_231<='\uFFFF')) ) {s = 105;}

                        else if ( (LA51_231=='$') ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_246 = input.LA(1);

                        s = -1;
                        if ( (LA51_246=='\"') ) {s = 248;}

                        else if ( ((LA51_246>='\u0000' && LA51_246<='!')||LA51_246=='#'||(LA51_246>='%' && LA51_246<='\uFFFF')) ) {s = 246;}

                        else if ( (LA51_246=='$') ) {s = 247;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_292 = input.LA(1);

                        s = -1;
                        if ( (LA51_292=='\"') ) {s = 248;}

                        else if ( ((LA51_292>='\u0000' && LA51_292<='!')||LA51_292=='#'||(LA51_292>='%' && LA51_292<='\uFFFF')) ) {s = 246;}

                        else if ( (LA51_292=='$') ) {s = 247;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_294 = input.LA(1);

                        s = -1;
                        if ( (LA51_294=='\"') ) {s = 248;}

                        else if ( ((LA51_294>='\u0000' && LA51_294<='!')||LA51_294=='#'||(LA51_294>='%' && LA51_294<='\uFFFF')) ) {s = 246;}

                        else if ( (LA51_294=='$') ) {s = 247;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA51_332 = input.LA(1);

                        s = -1;
                        if ( (LA51_332=='\"') ) {s = 248;}

                        else if ( ((LA51_332>='\u0000' && LA51_332<='!')||LA51_332=='#'||(LA51_332>='%' && LA51_332<='\uFFFF')) ) {s = 246;}

                        else if ( (LA51_332=='$') ) {s = 247;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA51_176 = input.LA(1);

                        s = -1;
                        if ( ((LA51_176>='\u0000' && LA51_176<='!')||(LA51_176>='#' && LA51_176<='\uFFFF')) ) {s = 231;}

                        else if ( (LA51_176=='\"') ) {s = 232;}

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