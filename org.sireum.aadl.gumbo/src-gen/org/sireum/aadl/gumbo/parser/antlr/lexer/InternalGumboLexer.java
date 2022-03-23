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
    public static final int Enum=38;
    public static final int Val=48;
    public static final int EqualsSignGreaterThanSign=54;
    public static final int Var=49;
    public static final int False=28;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=22;
    public static final int PlusSignEqualsSignGreaterThanSign=42;
    public static final int LeftParenthesis=60;
    public static final int RULE_OP=85;
    public static final int RULE_ID=96;
    public static final int RULE_DIGIT=87;
    public static final int ColonColon=51;
    public static final int Some=26;
    public static final int PlusSign=63;
    public static final int LeftSquareBracket=71;
    public static final int If=57;
    public static final int Halt=39;
    public static final int In=58;
    public static final int ThereExists=77;
    public static final int RULE_REAL_LIT=91;
    public static final int Classifier=5;
    public static final int Case=36;
    public static final int Comma=64;
    public static final int HyphenMinus=65;
    public static final int RULE_MSPE=83;
    public static final int Guarantee=10;
    public static final int RightCurlyBracket=75;
    public static final int RULE_MSPB=81;
    public static final int Modes=31;
    public static final int FullStop=66;
    public static final int Reference=12;
    public static final int Functions=9;
    public static final int KW__=73;
    public static final int Semicolon=68;
    public static final int RULE_LETTER=86;
    public static final int RULE_EXPONENT=89;
    public static final int Delta=27;
    public static final int QuestionMark=70;
    public static final int Memoize=21;
    public static final int By=55;
    public static final int Else=37;
    public static final int RULE_EXTENDED_DIGIT=94;
    public static final int Yield=34;
    public static final int All=35;
    public static final int True=41;
    public static final int RULE_INT_EXPONENT=90;
    public static final int FullStopFullStop=50;
    public static final int LessThanSignColon=53;
    public static final int Ensures=19;
    public static final int To=59;
    public static final int Applies=16;
    public static final int RULE_MSP=80;
    public static final int RULE_BASED_INTEGER=92;
    public static final int RightSquareBracket=72;
    public static final int Binding=17;
    public static final int RULE_MSPM=82;
    public static final int RULE_MSPI=79;
    public static final int Requires=15;
    public static final int For=45;
    public static final int RightParenthesis=61;
    public static final int Do=56;
    public static final int ColonEqualsSign=52;
    public static final int Mut=47;
    public static final int Gumbo=29;
    public static final int State=33;
    public static final int Assume=23;
    public static final int Library=20;
    public static final int RULE_INTEGER_LIT=93;
    public static final int Invariant=11;
    public static final int Constant=13;
    public static final int RULE_STRING=95;
    public static final int Match=30;
    public static final int Reads=32;
    public static final int RULE_SL_COMMENT=88;
    public static final int Inv=46;
    public static final int EqualsSign=69;
    public static final int Modifies=14;
    public static final int Strict=25;
    public static final int Colon=67;
    public static final int EOF=-1;
    public static final int Asterisk=62;
    public static final int Integration=4;
    public static final int RULE_OPSYM=84;
    public static final int Return=24;
    public static final int Def=44;
    public static final int RULE_WS=97;
    public static final int LeftCurlyBracket=74;
    public static final int Extension=8;
    public static final int FullStopFullStopLessThanSign=43;
    public static final int RULE_IDF=78;
    public static final int Compute=18;
    public static final int Spec=40;
    public static final int ForAll=76;

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

    // $ANTLR start "Yield"
    public final void mYield() throws RecognitionException {
        try {
            int _type = Yield;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:84:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:84:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:86:5: ( '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:86:7: '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:88:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:88:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:90:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:90:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:92:6: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // InternalGumboLexer.g:92:8: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' )
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
            // InternalGumboLexer.g:94:6: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:94:8: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:96:6: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalGumboLexer.g:96:8: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' )
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
            // InternalGumboLexer.g:98:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:98:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:100:35: ( '+' '=' '>' )
            // InternalGumboLexer.g:100:37: '+' '=' '>'
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
            // InternalGumboLexer.g:102:30: ( '.' '.' '<' )
            // InternalGumboLexer.g:102:32: '.' '.' '<'
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
            // InternalGumboLexer.g:104:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:104:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:106:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:106:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:108:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) )
            // InternalGumboLexer.g:108:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' )
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
            // InternalGumboLexer.g:110:5: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:110:7: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:112:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:112:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:114:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:114:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:116:18: ( '.' '.' )
            // InternalGumboLexer.g:116:20: '.' '.'
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
            // InternalGumboLexer.g:118:12: ( ':' ':' )
            // InternalGumboLexer.g:118:14: ':' ':'
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
            // InternalGumboLexer.g:120:17: ( ':' '=' )
            // InternalGumboLexer.g:120:19: ':' '='
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
            // InternalGumboLexer.g:122:19: ( '<' ':' )
            // InternalGumboLexer.g:122:21: '<' ':'
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
            // InternalGumboLexer.g:124:27: ( '=' '>' )
            // InternalGumboLexer.g:124:29: '=' '>'
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
            // InternalGumboLexer.g:126:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:126:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
            // InternalGumboLexer.g:128:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:128:6: ( 'D' | 'd' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:130:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:130:6: ( 'I' | 'i' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:132:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:132:6: ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:134:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:134:6: ( 'T' | 't' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:136:17: ( '(' )
            // InternalGumboLexer.g:136:19: '('
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
            // InternalGumboLexer.g:138:18: ( ')' )
            // InternalGumboLexer.g:138:20: ')'
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
            // InternalGumboLexer.g:140:10: ( '*' )
            // InternalGumboLexer.g:140:12: '*'
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
            // InternalGumboLexer.g:142:10: ( '+' )
            // InternalGumboLexer.g:142:12: '+'
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
            // InternalGumboLexer.g:144:7: ( ',' )
            // InternalGumboLexer.g:144:9: ','
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
            // InternalGumboLexer.g:146:13: ( '-' )
            // InternalGumboLexer.g:146:15: '-'
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
            // InternalGumboLexer.g:148:10: ( '.' )
            // InternalGumboLexer.g:148:12: '.'
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
            // InternalGumboLexer.g:150:7: ( ':' )
            // InternalGumboLexer.g:150:9: ':'
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
            // InternalGumboLexer.g:152:11: ( ';' )
            // InternalGumboLexer.g:152:13: ';'
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
            // InternalGumboLexer.g:154:12: ( '=' )
            // InternalGumboLexer.g:154:14: '='
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
            // InternalGumboLexer.g:156:14: ( '?' )
            // InternalGumboLexer.g:156:16: '?'
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

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:158:19: ( '[' )
            // InternalGumboLexer.g:158:21: '['
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
            // InternalGumboLexer.g:160:20: ( ']' )
            // InternalGumboLexer.g:160:22: ']'
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
            // InternalGumboLexer.g:162:6: ( '_' )
            // InternalGumboLexer.g:162:8: '_'
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
            // InternalGumboLexer.g:164:18: ( '{' )
            // InternalGumboLexer.g:164:20: '{'
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
            // InternalGumboLexer.g:166:19: ( '}' )
            // InternalGumboLexer.g:166:21: '}'
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
            // InternalGumboLexer.g:168:8: ( '\\u2200' )
            // InternalGumboLexer.g:168:10: '\\u2200'
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
            // InternalGumboLexer.g:170:13: ( '\\u2203' )
            // InternalGumboLexer.g:170:15: '\\u2203'
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

    // $ANTLR start "RULE_MSP"
    public final void mRULE_MSP() throws RecognitionException {
        try {
            int _type = RULE_MSP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:172:10: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:172:12: RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:172:27: ( RULE_MSPI )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\"') ) {
                        int LA1_3 = input.LA(3);

                        if ( ((LA1_3>='\u0000' && LA1_3<='!')||(LA1_3>='#' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='!')||(LA1_1>='#' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGumboLexer.g:172:27: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGumboLexer.g:172:38: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\"') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\"') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='\"') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='\"') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='\"') ) {
                                alt2=3;
                            }
                            else {
                                alt2=2;}
                        }
                        else {
                            alt2=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboLexer.g:172:39: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:172:45: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:172:52: '\"\"\"\"\"'
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

    // $ANTLR start "RULE_MSPB"
    public final void mRULE_MSPB() throws RecognitionException {
        try {
            int _type = RULE_MSPB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:174:11: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:174:13: RULE_IDF '\"\"\"' ( RULE_MSPI )* '$'
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:174:28: ( RULE_MSPI )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='$') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='$') ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='#')||(LA3_0>='%' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGumboLexer.g:174:28: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalGumboLexer.g:176:11: ( '$' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:176:13: '$' ( RULE_MSPI )* '$'
            {
            match('$'); 
            // InternalGumboLexer.g:176:17: ( RULE_MSPI )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='$') ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='#')||(LA4_0>='%' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGumboLexer.g:176:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // InternalGumboLexer.g:178:11: ( '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:178:13: '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match('$'); 
            // InternalGumboLexer.g:178:17: ( RULE_MSPI )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\"') ) {
                        int LA5_3 = input.LA(3);

                        if ( ((LA5_3>='\u0000' && LA5_3<='!')||(LA5_3>='#' && LA5_3<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='!')||(LA5_1>='#' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGumboLexer.g:178:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGumboLexer.g:178:28: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\"') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='\"') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='\"') ) {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4=='\"') ) {
                                alt6=3;
                            }
                            else {
                                alt6=2;}
                        }
                        else {
                            alt6=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

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
                    // InternalGumboLexer.g:178:29: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:178:35: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:178:42: '\"\"\"\"\"'
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

    // $ANTLR start "RULE_OP"
    public final void mRULE_OP() throws RecognitionException {
        try {
            int _type = RULE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:180:9: ( ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF ) )
            // InternalGumboLexer.g:180:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            {
            // InternalGumboLexer.g:180:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='!'||(LA8_0>='%' && LA8_0<='&')||LA8_0=='/'||(LA8_0>='<' && LA8_0<='>')||LA8_0=='^'||LA8_0=='|'||LA8_0=='~'||(LA8_0>='\u2200' && LA8_0<='\u22FF')||(LA8_0>='\u27C0' && LA8_0<='\u27EF')||(LA8_0>='\u2980' && LA8_0<='\u2AFF')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='\\') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGumboLexer.g:180:12: ( RULE_OPSYM )+
                    {
                    // InternalGumboLexer.g:180:12: ( RULE_OPSYM )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='!'||(LA7_0>='%' && LA7_0<='&')||LA7_0=='/'||(LA7_0>='<' && LA7_0<='>')||LA7_0=='^'||LA7_0=='|'||LA7_0=='~'||(LA7_0>='\u2200' && LA7_0<='\u22FF')||(LA7_0>='\u27C0' && LA7_0<='\u27EF')||(LA7_0>='\u2980' && LA7_0<='\u2AFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGumboLexer.g:180:12: RULE_OPSYM
                    	    {
                    	    mRULE_OPSYM(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:180:24: '\\\\' RULE_IDF
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

    // $ANTLR start "RULE_IDF"
    public final void mRULE_IDF() throws RecognitionException {
        try {
            // InternalGumboLexer.g:182:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:182:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:182:39: ( RULE_LETTER | RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // InternalGumboLexer.g:184:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:184:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:184:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='\u0000' && LA10_0<='!')||LA10_0=='#'||(LA10_0>='%' && LA10_0<='\uFFFF')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='$') ) {
                alt10=2;
            }
            else if ( (LA10_0=='\"') ) {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>='\u0000' && LA10_3<='!')||(LA10_3>='#' && LA10_3<='\uFFFF')) ) {
                    alt10=3;
                }
                else if ( (LA10_3=='\"') ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

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
                    // InternalGumboLexer.g:184:23: ~ ( ( '\"' | '$' ) )
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
                    // InternalGumboLexer.g:184:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:184:41: '\"' ~ ( '\"' )
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
                    // InternalGumboLexer.g:184:52: '\"\"' ~ ( '\"' )
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
            // InternalGumboLexer.g:186:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:186:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalGumboLexer.g:188:21: ( ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' ) )
            // InternalGumboLexer.g:188:23: ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' )
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:190:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:190:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:190:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboLexer.g:190:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalGumboLexer.g:190:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumboLexer.g:190:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:190:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGumboLexer.g:190:41: '\\r'
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
            // InternalGumboLexer.g:192:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:192:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:192:36: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
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

            // InternalGumboLexer.g:192:47: ( RULE_DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumboLexer.g:192:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalGumboLexer.g:194:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:194:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:194:40: ( '+' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGumboLexer.g:194:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:194:45: ( RULE_DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboLexer.g:194:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalGumboLexer.g:196:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:196:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:196:17: ( RULE_DIGIT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGumboLexer.g:196:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

            // InternalGumboLexer.g:196:29: ( '_' ( RULE_DIGIT )+ )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='_') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGumboLexer.g:196:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:196:34: ( RULE_DIGIT )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalGumboLexer.g:196:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('.'); 
            // InternalGumboLexer.g:196:52: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:196:52: RULE_DIGIT
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

            // InternalGumboLexer.g:196:64: ( '_' ( RULE_DIGIT )+ )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='_') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGumboLexer.g:196:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:196:69: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:196:69: RULE_DIGIT
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
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalGumboLexer.g:196:83: ( RULE_EXPONENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='E'||LA24_0=='e') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumboLexer.g:196:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:198:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:198:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:198:20: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:198:20: RULE_DIGIT
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

            // InternalGumboLexer.g:198:32: ( '_' ( RULE_DIGIT )+ )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='_') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboLexer.g:198:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:198:37: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:198:37: RULE_DIGIT
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

            // InternalGumboLexer.g:198:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='#') ) {
                alt30=1;
            }
            else {
                alt30=2;}
            switch (alt30) {
                case 1 :
                    // InternalGumboLexer.g:198:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:198:79: ( RULE_INT_EXPONENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='E'||LA28_0=='e') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalGumboLexer.g:198:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:198:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:198:98: ( RULE_INT_EXPONENT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='E'||LA29_0=='e') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalGumboLexer.g:198:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:200:21: ( '0' .. '9' )
            // InternalGumboLexer.g:200:23: '0' .. '9'
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
            // InternalGumboLexer.g:202:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:202:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:204:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:204:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:204:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')||(LA32_0>='A' && LA32_0<='F')||LA32_0=='_'||(LA32_0>='a' && LA32_0<='f')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGumboLexer.g:204:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:204:52: ( '_' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0=='_') ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalGumboLexer.g:204:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
            // InternalGumboLexer.g:206:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:206:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:206:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\"') ) {
                alt35=1;
            }
            else if ( (LA35_0=='\'') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGumboLexer.g:206:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:206:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop33:
                    do {
                        int alt33=3;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='\\') ) {
                            alt33=1;
                        }
                        else if ( ((LA33_0>='\u0000' && LA33_0<='!')||(LA33_0>='#' && LA33_0<='[')||(LA33_0>=']' && LA33_0<='\uFFFF')) ) {
                            alt33=2;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalGumboLexer.g:206:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:206:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop33;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:206:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:206:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop34:
                    do {
                        int alt34=3;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='\\') ) {
                            alt34=1;
                        }
                        else if ( ((LA34_0>='\u0000' && LA34_0<='&')||(LA34_0>='(' && LA34_0<='[')||(LA34_0>=']' && LA34_0<='\uFFFF')) ) {
                            alt34=2;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalGumboLexer.g:206:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:206:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop34;
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
            // InternalGumboLexer.g:208:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:208:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:208:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='z')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGumboLexer.g:208:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:208:32: ( '_' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0=='_') ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalGumboLexer.g:208:32: '_'
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
            	    break loop37;
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
            // InternalGumboLexer.g:210:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:210:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:210:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='\t' && LA38_0<='\n')||LA38_0=='\r'||LA38_0==' ') ) {
                    alt38=1;
                }


                switch (alt38) {
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
        // InternalGumboLexer.g:1:8: ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | Constant | Modifies | Requires | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_MSP | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_OP | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt39=85;
        alt39 = dfa39.predict(input);
        switch (alt39) {
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
                // InternalGumboLexer.g:1:255: Yield
                {
                mYield(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:261: All
                {
                mAll(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:265: Case
                {
                mCase(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:270: Else
                {
                mElse(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:275: Enum
                {
                mEnum(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:280: Halt
                {
                mHalt(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:285: Spec
                {
                mSpec(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:290: True
                {
                mTrue(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:295: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:329: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:358: Def
                {
                mDef(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:362: For
                {
                mFor(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:366: Inv
                {
                mInv(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:370: Mut
                {
                mMut(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:374: Val
                {
                mVal(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:378: Var
                {
                mVar(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:382: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:399: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:410: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:426: LessThanSignColon
                {
                mLessThanSignColon(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:444: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:470: By
                {
                mBy(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:473: Do
                {
                mDo(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:476: If
                {
                mIf(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:479: In
                {
                mIn(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:482: To
                {
                mTo(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:485: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:501: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:518: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:527: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:536: Comma
                {
                mComma(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:542: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:554: FullStop
                {
                mFullStop(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:563: Colon
                {
                mColon(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:569: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:579: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:590: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:603: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:621: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:640: KW__
                {
                mKW__(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:645: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:662: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:680: ForAll
                {
                mForAll(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:687: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:699: RULE_MSP
                {
                mRULE_MSP(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:708: RULE_MSPB
                {
                mRULE_MSPB(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:718: RULE_MSPM
                {
                mRULE_MSPM(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:728: RULE_MSPE
                {
                mRULE_MSPE(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:738: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:746: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:762: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:776: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:793: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:805: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:813: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA39_eotS =
        "\1\uffff\13\56\1\uffff\4\56\1\117\1\121\1\56\1\125\1\47\1\130\4\uffff\1\132\4\uffff\1\134\2\uffff\1\135\1\136\1\56\2\uffff\1\142\2\uffff\1\150\1\151\1\56\2\uffff\22\56\1\u0083\3\56\2\47\1\56\1\u008c\3\56\1\u0090\2\uffff\1\u0092\1\uffff\1\56\4\uffff\1\u0095\10\uffff\1\u0097\4\uffff\2\56\1\u009e\3\uffff\12\56\1\u00aa\11\56\1\u00b5\3\56\1\uffff\4\56\2\47\1\56\1\u00c1\1\uffff\3\56\3\uffff\1\u00c5\1\u00c6\5\uffff\1\142\3\56\2\uffff\3\56\1\u00d2\2\56\1\u00d5\1\u00d6\2\56\1\uffff\12\56\1\uffff\7\56\1\u00ea\1\47\1\u00ec\1\56\1\uffff\1\56\1\u00ef\1\u00f0\4\uffff\3\56\1\uffff\1\u00f5\1\uffff\3\56\1\uffff\2\56\2\uffff\1\56\1\u00fe\1\56\1\u0100\3\56\1\u0104\1\56\1\u0106\1\56\1\u0108\6\56\1\u010f\1\uffff\1\u0110\1\uffff\1\u0111\1\u0112\2\uffff\3\56\4\uffff\6\56\1\uffff\1\56\1\uffff\2\56\1\u0121\1\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\u0125\1\u0126\2\56\1\u0129\4\uffff\3\56\2\uffff\2\56\1\u012f\1\56\1\u0131\4\56\1\uffff\1\56\1\u0137\1\u0138\2\uffff\1\u0139\1\u013a\1\uffff\4\56\1\u013f\1\uffff\1\56\1\uffff\3\56\1\u0144\1\u0145\4\uffff\2\56\1\u0149\1\56\1\uffff\1\u014b\1\u014c\1\u014d\1\u014e\2\uffff\1\56\1\u0150\1\u0151\1\uffff\1\u0152\4\uffff\1\u0153\4\uffff";
    static final String DFA39_eofS =
        "\u0154\uffff";
    static final String DFA39_minS =
        "\1\11\13\42\1\101\4\42\1\75\1\56\1\42\2\72\1\41\4\uffff\1\55\4\uffff\1\42\2\uffff\2\41\1\42\1\0\1\uffff\1\56\2\uffff\3\42\1\uffff\27\42\1\117\1\114\6\42\2\uffff\1\74\1\uffff\1\42\4\uffff\1\41\3\uffff\1\42\3\uffff\1\0\1\44\1\0\1\uffff\1\60\1\uffff\3\42\2\uffff\31\42\1\uffff\4\42\1\115\1\114\2\42\1\uffff\3\42\3\uffff\2\42\1\uffff\1\0\1\uffff\2\0\1\56\3\42\1\uffff\1\0\12\42\1\uffff\12\42\1\uffff\10\42\1\105\1\60\1\42\1\uffff\3\42\2\uffff\1\0\1\uffff\3\42\1\0\1\44\1\0\3\42\1\uffff\2\42\2\uffff\23\42\1\uffff\1\60\1\uffff\2\42\2\uffff\3\42\1\0\1\uffff\2\0\6\42\1\uffff\1\42\1\uffff\3\42\1\uffff\1\42\1\uffff\1\42\1\uffff\6\42\4\uffff\3\42\1\0\1\uffff\11\42\1\uffff\3\42\2\uffff\2\42\1\uffff\5\42\1\uffff\1\42\1\uffff\5\42\4\uffff\4\42\1\uffff\4\42\2\uffff\3\42\1\uffff\1\42\4\uffff\1\42\4\uffff";
    static final String DFA39_maxS =
        "\1\u2aff\20\172\1\75\1\56\1\172\1\75\1\72\1\u2aff\4\uffff\1\55\4\uffff\1\172\2\uffff\2\u2aff\1\172\1\uffff\1\uffff\1\137\2\uffff\3\172\1\uffff\1\42\26\172\1\157\1\154\6\172\2\uffff\1\74\1\uffff\1\172\4\uffff\1\u2aff\3\uffff\1\172\3\uffff\1\uffff\1\44\1\uffff\1\uffff\1\71\1\uffff\3\172\2\uffff\1\42\30\172\1\uffff\4\172\1\155\1\154\2\172\1\uffff\3\172\3\uffff\2\172\1\uffff\1\uffff\1\uffff\2\uffff\1\137\3\172\1\uffff\1\uffff\12\172\1\uffff\12\172\1\uffff\10\172\1\145\2\172\1\uffff\3\172\2\uffff\1\uffff\1\uffff\3\172\1\uffff\1\44\1\uffff\3\172\1\uffff\2\172\2\uffff\23\172\1\uffff\1\172\1\uffff\2\172\2\uffff\3\172\1\uffff\1\uffff\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\6\172\4\uffff\3\172\1\uffff\1\uffff\11\172\1\uffff\3\172\2\uffff\2\172\1\uffff\5\172\1\uffff\1\172\1\uffff\5\172\4\uffff\4\172\1\uffff\4\172\2\uffff\3\172\1\uffff\1\172\4\uffff\1\172\4\uffff";
    static final String DFA39_acceptS =
        "\27\uffff\1\71\1\72\1\73\1\75\1\uffff\1\101\1\103\1\104\1\105\1\uffff\1\107\1\110\4\uffff\1\117\1\uffff\1\123\1\125\3\uffff\1\124\37\uffff\1\47\1\74\1\uffff\1\77\1\uffff\1\60\1\61\1\100\1\62\1\uffff\1\102\1\120\1\76\1\uffff\1\106\1\111\1\112\3\uffff\1\122\1\uffff\1\121\3\uffff\1\67\1\66\31\uffff\1\64\10\uffff\1\65\3\uffff\1\70\1\50\1\57\2\uffff\1\63\1\uffff\1\115\6\uffff\1\53\13\uffff\1\52\12\uffff\1\54\13\uffff\1\51\3\uffff\1\55\1\56\1\uffff\1\116\11\uffff\1\41\2\uffff\1\43\1\42\23\uffff\1\45\1\uffff\1\40\2\uffff\1\44\1\46\4\uffff\1\114\10\uffff\1\31\1\uffff\1\32\3\uffff\1\35\1\uffff\1\34\1\uffff\1\33\6\uffff\1\36\1\27\1\30\1\37\4\uffff\1\113\11\uffff\1\25\3\uffff\1\23\1\24\2\uffff\1\26\5\uffff\1\17\1\uffff\1\20\5\uffff\1\22\1\15\1\16\1\21\4\uffff\1\12\4\uffff\1\14\1\13\3\uffff\1\10\1\uffff\1\5\1\6\1\7\1\11\1\uffff\1\3\1\4\1\2\1\1";
    static final String DFA39_specialS =
        "\46\uffff\1\2\70\uffff\1\11\1\uffff\1\3\64\uffff\1\12\1\uffff\1\13\1\1\5\uffff\1\10\47\uffff\1\14\4\uffff\1\4\1\uffff\1\0\45\uffff\1\5\1\uffff\1\6\1\15\36\uffff\1\7\75\uffff}>";
    static final String[] DFA39_transitionS = DFA39_transitionS_.DFA39_transitionS;
    private static final class DFA39_transitionS_ {
        static final String[] DFA39_transitionS = {
                "\2\52\2\uffff\1\52\22\uffff\1\52\1\47\1\51\1\uffff\1\46\2\47\1\51\1\27\1\30\1\31\1\21\1\32\1\33\1\22\1\47\12\50\1\24\1\34\1\25\1\26\1\47\1\35\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\17\1\1\2\45\1\12\1\7\4\45\1\6\1\13\1\20\1\45\1\23\2\45\1\16\1\45\1\36\1\14\1\37\1\47\1\40\1\uffff\1\10\1\11\1\2\1\15\1\3\1\4\1\5\1\17\1\1\2\45\1\12\1\7\4\45\1\6\1\13\1\20\1\45\1\23\2\45\1\16\1\45\1\41\1\47\1\42\1\47\u2181\uffff\1\43\2\47\1\44\u00fc\47\u04c0\uffff\60\47\u0190\uffff\u0180\47",
                "\1\57\15\uffff\12\55\7\uffff\5\55\1\54\7\55\1\53\14\55\6\uffff\5\55\1\54\7\55\1\53\14\55",
                "\1\57\15\uffff\12\55\7\uffff\1\62\12\55\1\60\2\55\1\61\13\55\6\uffff\1\62\12\55\1\60\2\55\1\61\13\55",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\65\1\55\1\64\11\55\1\63\2\55\6\uffff\13\55\1\65\1\55\1\64\11\55\1\63\2\55",
                "\1\57\15\uffff\12\55\7\uffff\1\67\15\55\1\70\5\55\1\66\5\55\6\uffff\1\67\15\55\1\70\5\55\1\66\5\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\71\5\55\6\uffff\24\55\1\71\5\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\72\25\55\6\uffff\4\55\1\72\25\55",
                "\1\57\15\uffff\12\55\7\uffff\1\75\3\55\1\74\11\55\1\73\5\55\1\76\5\55\6\uffff\1\75\3\55\1\74\11\55\1\73\5\55\1\76\5\55",
                "\1\57\15\uffff\12\55\7\uffff\17\55\1\77\2\55\1\100\7\55\6\uffff\17\55\1\77\2\55\1\100\7\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\101\17\55\1\102\1\55\6\uffff\10\55\1\101\17\55\1\102\1\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\103\21\55\6\uffff\10\55\1\103\21\55",
                "\1\57\15\uffff\12\55\7\uffff\17\55\1\105\3\55\1\104\6\55\6\uffff\17\55\1\105\3\55\1\104\6\55",
                "\1\107\21\47\1\106\7\47\4\uffff\1\47\1\uffff\1\107\21\47\1\106\7\47",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\110\11\55\1\111\13\55\6\uffff\4\55\1\110\11\55\1\111\13\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\112\21\55\6\uffff\10\55\1\112\21\55",
                "\1\57\15\uffff\12\55\7\uffff\1\113\31\55\6\uffff\1\113\31\55",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\115\2\55\1\114\10\55\6\uffff\16\55\1\115\2\55\1\114\10\55",
                "\1\116",
                "\1\120",
                "\1\57\15\uffff\12\55\7\uffff\1\122\31\55\6\uffff\1\122\31\55",
                "\1\123\2\uffff\1\124",
                "\1\126",
                "\1\47\3\uffff\2\47\10\uffff\1\47\14\uffff\2\47\1\127\37\uffff\1\47\35\uffff\1\47\1\uffff\1\47\u2181\uffff\u0100\47\u04c0\uffff\60\47\u0190\uffff\u0180\47",
                "",
                "",
                "",
                "",
                "\1\131",
                "",
                "",
                "",
                "",
                "\1\57\15\uffff\12\133\7\uffff\32\133\6\uffff\32\133",
                "",
                "",
                "\1\47\3\uffff\2\47\10\uffff\1\47\14\uffff\3\47\37\uffff\1\47\35\uffff\1\47\1\uffff\1\47\u2181\uffff\u0100\47\u04c0\uffff\60\47\u0190\uffff\u0180\47",
                "\1\47\3\uffff\2\47\10\uffff\1\47\14\uffff\3\47\37\uffff\1\47\35\uffff\1\47\1\uffff\1\47\u2181\uffff\u0100\47\u04c0\uffff\60\47\u0190\uffff\u0180\47",
                "\1\57\15\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
                "\42\137\1\141\1\137\1\140\uffdb\137",
                "",
                "\1\144\1\uffff\12\50\45\uffff\1\143",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\146\12\55\1\145\1\55\1\147\4\55\4\uffff\1\56\1\uffff\10\55\1\146\12\55\1\145\1\55\1\147\4\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\6\uffff\32\55",
                "",
                "\1\152",
                "\1\57\15\uffff\12\55\7\uffff\1\153\31\55\6\uffff\1\153\31\55",
                "\1\57\15\uffff\12\55\7\uffff\14\55\1\155\1\154\14\55\6\uffff\14\55\1\155\1\154\14\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\156\7\55\6\uffff\22\55\1\156\7\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\157\6\55\6\uffff\23\55\1\157\6\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\160\1\55\1\161\5\55\6\uffff\22\55\1\160\1\55\1\161\5\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\162\7\55\6\uffff\22\55\1\162\7\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\163\14\55\6\uffff\15\55\1\163\14\55",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\164\16\55\6\uffff\13\55\1\164\16\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\165\10\55\6\uffff\21\55\1\165\10\55",
                "\1\57\15\uffff\12\55\7\uffff\1\166\13\55\1\167\15\55\6\uffff\1\166\13\55\1\167\15\55",
                "\1\57\15\uffff\12\55\7\uffff\1\173\4\55\1\170\12\55\1\171\2\55\1\172\6\55\6\uffff\1\173\4\55\1\170\12\55\1\171\2\55\1\172\6\55",
                "\1\57\15\uffff\12\55\7\uffff\3\55\1\174\26\55\6\uffff\3\55\1\174\26\55",
                "\1\57\15\uffff\12\55\7\uffff\14\55\1\175\15\55\6\uffff\14\55\1\175\15\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\176\6\55\6\uffff\23\55\1\176\6\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\177\6\55\6\uffff\23\55\1\177\6\55",
                "\1\57\15\uffff\12\55\7\uffff\17\55\1\u0080\12\55\6\uffff\17\55\1\u0080\12\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0081\7\55\6\uffff\22\55\1\u0081\7\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u0082\14\55\6\uffff\15\55\1\u0082\14\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\1\55\1\u0084\30\55\6\uffff\1\55\1\u0084\30\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u0086\20\55\1\u0085\10\55\6\uffff\1\u0086\20\55\1\u0085\10\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0087\25\55\6\uffff\4\55\1\u0087\25\55",
                "\1\u0088\37\uffff\1\u0088",
                "\1\u0089\37\uffff\1\u0089",
                "\1\57\15\uffff\12\55\7\uffff\5\55\1\u008b\5\55\1\u008a\16\55\6\uffff\5\55\1\u008b\5\55\1\u008a\16\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u008d\25\55\6\uffff\4\55\1\u008d\25\55",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\u008e\16\55\6\uffff\13\55\1\u008e\16\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\u008f\5\55\6\uffff\24\55\1\u008f\5\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "\1\u0091",
                "",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\u0093\5\55\1\u0094\10\55\6\uffff\13\55\1\u0093\5\55\1\u0094\10\55",
                "",
                "",
                "",
                "",
                "\1\47\3\uffff\2\47\10\uffff\1\47\14\uffff\3\47\37\uffff\1\47\35\uffff\1\47\1\uffff\1\47\u2181\uffff\u0100\47\u04c0\uffff\60\47\u0190\uffff\u0180\47",
                "",
                "",
                "",
                "\1\57\15\uffff\12\133\7\uffff\32\133\6\uffff\32\133",
                "",
                "",
                "",
                "\42\137\1\141\1\137\1\140\uffdb\137",
                "\1\u0096",
                "\42\u0098\1\u0099\uffdd\u0098",
                "",
                "\12\u009a",
                "",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u009b\25\55\6\uffff\4\55\1\u009b\25\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u009c\6\55\6\uffff\23\55\1\u009c\6\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u009d\31\55\4\uffff\1\56\1\uffff\1\u009d\31\55",
                "",
                "",
                "\1\u009f",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00a0\7\55\6\uffff\22\55\1\u00a0\7\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00a1\7\55\6\uffff\22\55\1\u00a1\7\55",
                "\1\57\15\uffff\12\55\7\uffff\17\55\1\u00a2\12\55\6\uffff\17\55\1\u00a2\12\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00a3\25\55\6\uffff\4\55\1\u00a3\25\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00a4\25\55\6\uffff\4\55\1\u00a4\25\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\u00a5\5\55\6\uffff\24\55\1\u00a5\5\55",
                "\1\57\15\uffff\12\55\7\uffff\14\55\1\u00a6\15\55\6\uffff\14\55\1\u00a6\15\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00a7\25\55\6\uffff\4\55\1\u00a7\25\55",
                "\1\57\15\uffff\12\55\7\uffff\2\55\1\u00a8\27\55\6\uffff\2\55\1\u00a8\27\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00a9\7\55\6\uffff\22\55\1\u00a9\7\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00ab\10\55\6\uffff\21\55\1\u00ab\10\55",
                "\1\57\15\uffff\12\55\7\uffff\1\55\1\u00ac\30\55\6\uffff\1\55\1\u00ac\30\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00ad\25\55\6\uffff\4\55\1\u00ad\25\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\u00ae\5\55\6\uffff\24\55\1\u00ae\5\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\u00af\5\55\6\uffff\24\55\1\u00af\5\55",
                "\1\57\15\uffff\12\55\7\uffff\3\55\1\u00b0\26\55\6\uffff\3\55\1\u00b0\26\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00b2\3\55\1\u00b1\21\55\6\uffff\4\55\1\u00b2\3\55\1\u00b1\21\55",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\u00b3\13\55\6\uffff\16\55\1\u00b3\13\55",
                "\1\57\15\uffff\12\55\7\uffff\2\55\1\u00b4\27\55\6\uffff\2\55\1\u00b4\27\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\u00b6\16\55\6\uffff\13\55\1\u00b6\16\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00b7\17\55\1\u00b8\5\55\6\uffff\4\55\1\u00b7\17\55\1\u00b8\5\55",
                "\1\57\15\uffff\12\55\7\uffff\3\55\1\u00b9\26\55\6\uffff\3\55\1\u00b9\26\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00ba\10\55\6\uffff\21\55\1\u00ba\10\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00bb\21\55\6\uffff\10\55\1\u00bb\21\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00bc\6\55\6\uffff\23\55\1\u00bc\6\55",
                "\1\57\15\uffff\12\55\7\uffff\2\55\1\u00bd\27\55\6\uffff\2\55\1\u00bd\27\55",
                "\1\u00be\37\uffff\1\u00be",
                "\1\u00bf\37\uffff\1\u00bf",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00c0\6\55\6\uffff\23\55\1\u00c0\6\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\u00c2\16\55\6\uffff\13\55\1\u00c2\16\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00c3\6\55\6\uffff\23\55\1\u00c3\6\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00c4\25\55\6\uffff\4\55\1\u00c4\25\55",
                "",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\42\137\1\141\1\137\1\140\uffdb\137",
                "",
                "\42\137\1\141\1\137\1\140\uffdb\137",
                "\42\u00c7\1\u00c8\uffdd\u00c7",
                "\1\144\1\uffff\12\u009a\45\uffff\1\143",
                "\1\57\15\uffff\12\55\7\uffff\6\55\1\u00c9\23\55\6\uffff\6\55\1\u00c9\23\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00ca\21\55\6\uffff\10\55\1\u00ca\21\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00cb\10\55\6\uffff\21\55\1\u00cb\10\55",
                "",
                "\42\u00cc\1\u00ce\1\u00cc\1\u00cd\uffdb\u00cc",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00cf\7\55\6\uffff\22\55\1\u00cf\7\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00d0\6\55\6\uffff\23\55\1\u00d0\6\55",
                "\1\57\15\uffff\12\55\7\uffff\24\55\1\u00d1\5\55\6\uffff\24\55\1\u00d1\5\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u00d3\14\55\6\uffff\15\55\1\u00d3\14\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00d4\10\55\6\uffff\21\55\1\u00d4\10\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00d7\6\55\6\uffff\23\55\1\u00d7\6\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00d8\25\55\6\uffff\4\55\1\u00d8\25\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\1\u00d9\31\55\6\uffff\1\u00d9\31\55",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\u00da\13\55\6\uffff\16\55\1\u00da\13\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00db\10\55\6\uffff\21\55\1\u00db\10\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00dc\21\55\6\uffff\10\55\1\u00dc\21\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00dd\10\55\6\uffff\21\55\1\u00dd\10\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00de\7\55\6\uffff\22\55\1\u00de\7\55",
                "\1\57\15\uffff\12\55\7\uffff\5\55\1\u00df\24\55\6\uffff\5\55\1\u00df\24\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00e0\7\55\6\uffff\22\55\1\u00e0\7\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00e1\21\55\6\uffff\10\55\1\u00e1\21\55",
                "\1\57\15\uffff\12\55\7\uffff\7\55\1\u00e2\22\55\6\uffff\7\55\1\u00e2\22\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00e3\21\55\6\uffff\10\55\1\u00e3\21\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00e4\10\55\6\uffff\21\55\1\u00e4\10\55",
                "\1\57\15\uffff\12\55\7\uffff\14\55\1\u00e5\15\55\6\uffff\14\55\1\u00e5\15\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00e6\21\55\6\uffff\10\55\1\u00e6\21\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u00e7\31\55\6\uffff\1\u00e7\31\55",
                "\1\57\15\uffff\12\55\7\uffff\2\55\1\u00e8\27\55\6\uffff\2\55\1\u00e8\27\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00e9\25\55\6\uffff\4\55\1\u00e9\25\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\u00eb\37\uffff\1\u00eb",
                "\12\47\7\uffff\32\47\6\uffff\32\47",
                "\1\57\15\uffff\12\55\7\uffff\1\u00ed\31\55\6\uffff\1\u00ed\31\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\3\55\1\u00ee\26\55\6\uffff\3\55\1\u00ee\26\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "\42\137\1\141\1\137\1\140\uffdb\137",
                "",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u00f1\10\55\6\uffff\21\55\1\u00f1\10\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u00f2\31\55\6\uffff\1\u00f2\31\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00f3\21\55\6\uffff\10\55\1\u00f3\21\55",
                "\42\u00cc\1\u00ce\1\u00cc\1\u00cd\uffdb\u00cc",
                "\1\u00f4",
                "\42\u00f6\1\u00f7\uffdd\u00f6",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00f8\21\55\6\uffff\10\55\1\u00f8\21\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u00f9\31\55\6\uffff\1\u00f9\31\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u00fa\6\55\6\uffff\23\55\1\u00fa\6\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u00fb\7\55\6\uffff\22\55\1\u00fb\7\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u00fc\25\55\6\uffff\4\55\1\u00fc\25\55",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u00fd\21\55\6\uffff\10\55\1\u00fd\21\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u00ff\14\55\6\uffff\15\55\1\u00ff\14\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0101\25\55\6\uffff\4\55\1\u0101\25\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u0102\10\55\6\uffff\21\55\1\u0102\10\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u0103\14\55\6\uffff\15\55\1\u0103\14\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u0105\21\55\6\uffff\10\55\1\u0105\21\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\31\55\1\u0107\6\uffff\31\55\1\u0107",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0109\25\55\6\uffff\4\55\1\u0109\25\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u010a\6\55\6\uffff\23\55\1\u010a\6\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u010b\25\55\6\uffff\4\55\1\u010b\25\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u010c\14\55\6\uffff\15\55\1\u010c\14\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u010d\10\55\6\uffff\21\55\1\u010d\10\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u010e\6\55\6\uffff\23\55\1\u010e\6\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\12\47\7\uffff\32\47\6\uffff\32\47",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\1\u0113\31\55\6\uffff\1\u0113\31\55",
                "\1\57\15\uffff\12\55\7\uffff\13\55\1\u0114\16\55\6\uffff\13\55\1\u0114\16\55",
                "\1\57\15\uffff\12\55\7\uffff\1\u0115\31\55\6\uffff\1\u0115\31\55",
                "\42\u00cc\1\u00ce\1\u00cc\1\u00cd\uffdb\u00cc",
                "",
                "\42\u00cc\1\u00ce\1\u00cc\1\u00cd\uffdb\u00cc",
                "\42\u0116\1\u0117\uffdd\u0116",
                "\1\57\15\uffff\12\55\7\uffff\5\55\1\u0118\24\55\6\uffff\5\55\1\u0118\24\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u0119\14\55\6\uffff\15\55\1\u0119\14\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u011a\25\55\6\uffff\4\55\1\u011a\25\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u011b\21\55\6\uffff\10\55\1\u011b\21\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u011c\7\55\6\uffff\22\55\1\u011c\7\55",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\u011d\13\55\6\uffff\16\55\1\u011d\13\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u011e\6\55\6\uffff\23\55\1\u011e\6\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u011f\14\55\6\uffff\15\55\1\u011f\14\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0120\25\55\6\uffff\4\55\1\u0120\25\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0122\25\55\6\uffff\4\55\1\u0122\25\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0123\25\55\6\uffff\4\55\1\u0123\25\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0124\7\55\6\uffff\22\55\1\u0124\7\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\6\55\1\u0127\23\55\6\uffff\6\55\1\u0127\23\55",
                "\1\57\15\uffff\12\55\7\uffff\30\55\1\u0128\1\55\6\uffff\30\55\1\u0128\1\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u012a\6\55\6\uffff\23\55\1\u012a\6\55",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u012b\21\55\6\uffff\10\55\1\u012b\21\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u012c\14\55\6\uffff\15\55\1\u012c\14\55",
                "\42\u00cc\1\u00ce\1\u00cc\1\u00cd\uffdb\u00cc",
                "",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u012d\21\55\6\uffff\10\55\1\u012d\21\55",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u012e\6\55\6\uffff\23\55\1\u012e\6\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\u0130\13\55\6\uffff\16\55\1\u0130\13\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u0132\14\55\6\uffff\15\55\1\u0132\14\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0133\25\55\6\uffff\4\55\1\u0133\25\55",
                "\1\57\15\uffff\12\55\7\uffff\2\55\1\u0134\27\55\6\uffff\2\55\1\u0134\27\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0135\7\55\6\uffff\22\55\1\u0135\7\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0136\7\55\6\uffff\22\55\1\u0136\7\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\10\55\1\u013b\21\55\6\uffff\10\55\1\u013b\21\55",
                "\1\57\15\uffff\12\55\7\uffff\31\55\1\u013c\6\uffff\31\55\1\u013c",
                "\1\57\15\uffff\12\55\7\uffff\23\55\1\u013d\6\55\6\uffff\23\55\1\u013d\6\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u013e\25\55\6\uffff\4\55\1\u013e\25\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u0140\14\55\6\uffff\15\55\1\u0140\14\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0141\7\55\6\uffff\22\55\1\u0141\7\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0142\25\55\6\uffff\4\55\1\u0142\25\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0143\25\55\6\uffff\4\55\1\u0143\25\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\16\55\1\u0146\13\55\6\uffff\16\55\1\u0146\13\55",
                "\1\57\15\uffff\12\55\7\uffff\4\55\1\u0147\25\55\6\uffff\4\55\1\u0147\25\55",
                "\1\57\15\uffff\12\55\7\uffff\22\55\1\u0148\7\55\4\uffff\1\56\1\uffff\22\55\1\u0148\7\55",
                "\1\57\15\uffff\12\55\7\uffff\21\55\1\u014a\10\55\6\uffff\21\55\1\u014a\10\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\15\55\1\u014f\14\55\6\uffff\15\55\1\u014f\14\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "",
                "",
                "\1\57\15\uffff\12\55\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
                "",
                "",
                "",
                ""
        };
    }

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    static class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | Constant | Modifies | Requires | Applies | Binding | Compute | Ensures | Library | Memoize | Assert | Assume | Return | Strict | Some | Delta | False | Gumbo | Match | Modes | Reads | State | Yield | All | Case | Else | Enum | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | Def | For | Inv | Mut | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | QuestionMark | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_MSP | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_OP | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_206 = input.LA(1);

                        s = -1;
                        if ( ((LA39_206>='\u0000' && LA39_206<='!')||(LA39_206>='#' && LA39_206<='\uFFFF')) ) {s = 246;}

                        else if ( (LA39_206=='\"') ) {s = 247;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_153 = input.LA(1);

                        s = -1;
                        if ( ((LA39_153>='\u0000' && LA39_153<='!')||(LA39_153>='#' && LA39_153<='\uFFFF')) ) {s = 199;}

                        else if ( (LA39_153=='\"') ) {s = 200;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_38 = input.LA(1);

                        s = -1;
                        if ( ((LA39_38>='\u0000' && LA39_38<='!')||LA39_38=='#'||(LA39_38>='%' && LA39_38<='\uFFFF')) ) {s = 95;}

                        else if ( (LA39_38=='$') ) {s = 96;}

                        else if ( (LA39_38=='\"') ) {s = 97;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_97 = input.LA(1);

                        s = -1;
                        if ( ((LA39_97>='\u0000' && LA39_97<='!')||(LA39_97>='#' && LA39_97<='\uFFFF')) ) {s = 152;}

                        else if ( (LA39_97=='\"') ) {s = 153;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_204 = input.LA(1);

                        s = -1;
                        if ( (LA39_204=='\"') ) {s = 206;}

                        else if ( ((LA39_204>='\u0000' && LA39_204<='!')||LA39_204=='#'||(LA39_204>='%' && LA39_204<='\uFFFF')) ) {s = 204;}

                        else if ( (LA39_204=='$') ) {s = 205;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_244 = input.LA(1);

                        s = -1;
                        if ( (LA39_244=='\"') ) {s = 206;}

                        else if ( ((LA39_244>='\u0000' && LA39_244<='!')||LA39_244=='#'||(LA39_244>='%' && LA39_244<='\uFFFF')) ) {s = 204;}

                        else if ( (LA39_244=='$') ) {s = 205;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_246 = input.LA(1);

                        s = -1;
                        if ( (LA39_246=='\"') ) {s = 206;}

                        else if ( ((LA39_246>='\u0000' && LA39_246<='!')||LA39_246=='#'||(LA39_246>='%' && LA39_246<='\uFFFF')) ) {s = 204;}

                        else if ( (LA39_246=='$') ) {s = 205;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_278 = input.LA(1);

                        s = -1;
                        if ( (LA39_278=='\"') ) {s = 206;}

                        else if ( ((LA39_278>='\u0000' && LA39_278<='!')||LA39_278=='#'||(LA39_278>='%' && LA39_278<='\uFFFF')) ) {s = 204;}

                        else if ( (LA39_278=='$') ) {s = 205;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_159 = input.LA(1);

                        s = -1;
                        if ( ((LA39_159>='\u0000' && LA39_159<='!')||LA39_159=='#'||(LA39_159>='%' && LA39_159<='\uFFFF')) ) {s = 204;}

                        else if ( (LA39_159=='$') ) {s = 205;}

                        else if ( (LA39_159=='\"') ) {s = 206;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_95 = input.LA(1);

                        s = -1;
                        if ( (LA39_95=='\"') ) {s = 97;}

                        else if ( ((LA39_95>='\u0000' && LA39_95<='!')||LA39_95=='#'||(LA39_95>='%' && LA39_95<='\uFFFF')) ) {s = 95;}

                        else if ( (LA39_95=='$') ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA39_150 = input.LA(1);

                        s = -1;
                        if ( (LA39_150=='\"') ) {s = 97;}

                        else if ( ((LA39_150>='\u0000' && LA39_150<='!')||LA39_150=='#'||(LA39_150>='%' && LA39_150<='\uFFFF')) ) {s = 95;}

                        else if ( (LA39_150=='$') ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA39_152 = input.LA(1);

                        s = -1;
                        if ( (LA39_152=='\"') ) {s = 97;}

                        else if ( ((LA39_152>='\u0000' && LA39_152<='!')||LA39_152=='#'||(LA39_152>='%' && LA39_152<='\uFFFF')) ) {s = 95;}

                        else if ( (LA39_152=='$') ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA39_199 = input.LA(1);

                        s = -1;
                        if ( (LA39_199=='\"') ) {s = 97;}

                        else if ( ((LA39_199>='\u0000' && LA39_199<='!')||LA39_199=='#'||(LA39_199>='%' && LA39_199<='\uFFFF')) ) {s = 95;}

                        else if ( (LA39_199=='$') ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA39_247 = input.LA(1);

                        s = -1;
                        if ( ((LA39_247>='\u0000' && LA39_247<='!')||(LA39_247>='#' && LA39_247<='\uFFFF')) ) {s = 278;}

                        else if ( (LA39_247=='\"') ) {s = 279;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}