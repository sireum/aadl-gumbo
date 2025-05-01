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
    public static final int Val=57;
    public static final int RULE_HEX=104;
    public static final int EqualsSignGreaterThanSign=63;
    public static final int Var=58;
    public static final int False=33;
    public static final int Initialize=7;
    public static final int Invariants=8;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=48;
    public static final int LeftParenthesis=69;
    public static final int RULE_MSTRING=90;
    public static final int RULE_OP=102;
    public static final int RULE_BIN=105;
    public static final int RULE_ESC_SEQ=88;
    public static final int F32=50;
    public static final int RULE_ID=119;
    public static final int RULE_DIGIT=112;
    public static final int Handle=26;
    public static final int ColonColon=60;
    public static final int RULE_F64_LIT=110;
    public static final int Some=30;
    public static final int PlusSign=72;
    public static final int LeftSquareBracket=81;
    public static final int If=66;
    public static final int Pure=29;
    public static final int Halt=45;
    public static final int F=79;
    public static final int ThereExists=87;
    public static final int RULE_REAL_LIT=108;
    public static final int Classifier=6;
    public static final int Case=42;
    public static final int Comma=73;
    public static final int HyphenMinus=74;
    public static final int NoSend=23;
    public static final int T=80;
    public static final int RULE_MSPE=97;
    public static final int Guarantee=11;
    public static final int RightCurlyBracket=85;
    public static final int RULE_MSPB=95;
    public static final int Modes=35;
    public static final int FullStop=75;
    public static final int Table=38;
    public static final int RULE_SIMPLIES=101;
    public static final int Reference=13;
    public static final int RULE_IMPLIES=100;
    public static final int RULE_UNICODE_ESC=113;
    public static final int Functions=10;
    public static final int Strictpure=4;
    public static final int Normal=27;
    public static final int KW__=83;
    public static final int Semicolon=77;
    public static final int RULE_LETTER=111;
    public static final int RULE_EXPONENT=115;
    public static final int Delta=32;
    public static final int RULE_SLI=94;
    public static final int By=64;
    public static final int Else=43;
    public static final int RULE_EXTENDED_DIGIT=103;
    public static final int Yield=40;
    public static final int RULE_STRING_VALUE=89;
    public static final int All=41;
    public static final int Infoflow=17;
    public static final int Res=56;
    public static final int F64=51;
    public static final int True=47;
    public static final int RULE_INT_EXPONENT=116;
    public static final int HasEvent=14;
    public static final int In_1=67;
    public static final int FullStopFullStop=59;
    public static final int RULE_F32_LIT=109;
    public static final int LessThanSignColon=62;
    public static final int To=68;
    public static final int Applies=20;
    public static final int RULE_MSP=93;
    public static final int RULE_BASED_INTEGER=117;
    public static final int RightSquareBracket=82;
    public static final int Binding=21;
    public static final int RULE_MSPM=96;
    public static final int RULE_DEFOP=99;
    public static final int RULE_MSPI=92;
    public static final int For=53;
    public static final int RightParenthesis=70;
    public static final int Do=65;
    public static final int ColonEqualsSign=61;
    public static final int Mut=55;
    public static final int State=37;
    public static final int Assume=25;
    public static final int RULE_INTEGER_LIT=106;
    public static final int Invariant=12;
    public static final int Constant=16;
    public static final int RULE_STRING=118;
    public static final int Match=34;
    public static final int Reads=36;
    public static final int RULE_SL_COMMENT=114;
    public static final int Inv=54;
    public static final int EqualsSign=78;
    public static final int Modifies=18;
    public static final int Colon=76;
    public static final int EOF=-1;
    public static final int Asterisk=71;
    public static final int Integration=5;
    public static final int RULE_OPSYM=98;
    public static final int Return=28;
    public static final int Def=52;
    public static final int RULE_WS=120;
    public static final int LeftCurlyBracket=84;
    public static final int RULE_INT_IDF=107;
    public static final int MustSend=15;
    public static final int While=39;
    public static final int From=44;
    public static final int Extension=9;
    public static final int FullStopFullStopLessThanSign=49;
    public static final int RULE_IDF=91;
    public static final int Compute=22;
    public static final int MaySend=19;
    public static final int Spec=46;
    public static final int ForAll=86;
    public static final int Cases=31;

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

    // $ANTLR start "Strictpure"
    public final void mStrictpure() throws RecognitionException {
        try {
            int _type = Strictpure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:24:12: ( '@' ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:24:14: '@' ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            match('@'); 
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Strictpure"

    // $ANTLR start "Integration"
    public final void mIntegration() throws RecognitionException {
        try {
            int _type = Integration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:26:13: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:26:15: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:28:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:28:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:30:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:30:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:32:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:32:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:34:11: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:34:13: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:36:11: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:36:13: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:38:11: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:38:13: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:40:11: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:40:13: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:42:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:42:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:44:10: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:44:12: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:46:10: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:46:12: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:48:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:48:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:50:10: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // InternalGumboLexer.g:50:12: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' )
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
            // InternalGumboLexer.g:52:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:52:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:54:9: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:54:11: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:56:9: ( ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:56:11: ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:58:9: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalGumboLexer.g:58:11: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
            // InternalGumboLexer.g:60:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:60:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
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

    // $ANTLR start "Normal"
    public final void mNormal() throws RecognitionException {
        try {
            int _type = Normal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:70:8: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:70:10: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "Normal"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:72:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:72:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
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

    // $ANTLR start "Pure"
    public final void mPure() throws RecognitionException {
        try {
            int _type = Pure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:74:6: ( '@' ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:74:8: '@' ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            match('@'); 
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pure"

    // $ANTLR start "Some"
    public final void mSome() throws RecognitionException {
        try {
            int _type = Some;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:76:6: ( '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:76:8: '\\\\' ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:78:7: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:78:9: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:80:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalGumboLexer.g:80:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
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
            // InternalGumboLexer.g:82:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:82:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:84:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalGumboLexer.g:84:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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
            // InternalGumboLexer.g:86:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:86:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:88:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:88:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:90:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:90:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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

    // $ANTLR start "Table"
    public final void mTable() throws RecognitionException {
        try {
            int _type = Table;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:92:7: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:92:9: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
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

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
    // $ANTLR end "Table"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:94:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:94:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:96:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalGumboLexer.g:96:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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
            // InternalGumboLexer.g:98:5: ( '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:98:7: '\\\\' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:100:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:100:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:102:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:102:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:104:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // InternalGumboLexer.g:104:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
            // InternalGumboLexer.g:106:6: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:106:8: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:108:6: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalGumboLexer.g:108:8: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' )
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
            // InternalGumboLexer.g:110:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalGumboLexer.g:110:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
            // InternalGumboLexer.g:112:35: ( '+' '=' '>' )
            // InternalGumboLexer.g:112:37: '+' '=' '>'
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
            // InternalGumboLexer.g:114:30: ( '.' '.' '<' )
            // InternalGumboLexer.g:114:32: '.' '.' '<'
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
            // InternalGumboLexer.g:116:5: ( ( 'F' | 'f' ) '3' '2' )
            // InternalGumboLexer.g:116:7: ( 'F' | 'f' ) '3' '2'
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
            // InternalGumboLexer.g:118:5: ( ( 'F' | 'f' ) '6' '4' )
            // InternalGumboLexer.g:118:7: ( 'F' | 'f' ) '6' '4'
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
            // InternalGumboLexer.g:120:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:120:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:122:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:122:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:124:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) )
            // InternalGumboLexer.g:124:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' )
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
            // InternalGumboLexer.g:126:5: ( ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // InternalGumboLexer.g:126:7: ( 'M' | 'm' ) ( 'U' | 'u' ) ( 'T' | 't' )
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
            // InternalGumboLexer.g:128:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalGumboLexer.g:128:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // InternalGumboLexer.g:130:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalGumboLexer.g:130:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
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
            // InternalGumboLexer.g:132:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalGumboLexer.g:132:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // InternalGumboLexer.g:134:18: ( '.' '.' )
            // InternalGumboLexer.g:134:20: '.' '.'
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
            // InternalGumboLexer.g:136:12: ( ':' ':' )
            // InternalGumboLexer.g:136:14: ':' ':'
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
            // InternalGumboLexer.g:138:17: ( ':' '=' )
            // InternalGumboLexer.g:138:19: ':' '='
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
            // InternalGumboLexer.g:140:19: ( '<' ':' )
            // InternalGumboLexer.g:140:21: '<' ':'
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
            // InternalGumboLexer.g:142:27: ( '=' '>' )
            // InternalGumboLexer.g:142:29: '=' '>'
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
            // InternalGumboLexer.g:144:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalGumboLexer.g:144:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
            // InternalGumboLexer.g:146:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:146:6: ( 'D' | 'd' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:148:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalGumboLexer.g:148:6: ( 'I' | 'i' ) ( 'F' | 'f' )
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
            // InternalGumboLexer.g:150:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalGumboLexer.g:150:8: ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // InternalGumboLexer.g:152:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalGumboLexer.g:152:6: ( 'T' | 't' ) ( 'O' | 'o' )
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
            // InternalGumboLexer.g:154:17: ( '(' )
            // InternalGumboLexer.g:154:19: '('
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
            // InternalGumboLexer.g:156:18: ( ')' )
            // InternalGumboLexer.g:156:20: ')'
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
            // InternalGumboLexer.g:158:10: ( '*' )
            // InternalGumboLexer.g:158:12: '*'
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
            // InternalGumboLexer.g:160:10: ( '+' )
            // InternalGumboLexer.g:160:12: '+'
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
            // InternalGumboLexer.g:162:7: ( ',' )
            // InternalGumboLexer.g:162:9: ','
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
            // InternalGumboLexer.g:164:13: ( '-' )
            // InternalGumboLexer.g:164:15: '-'
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
            // InternalGumboLexer.g:166:10: ( '.' )
            // InternalGumboLexer.g:166:12: '.'
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
            // InternalGumboLexer.g:168:7: ( ':' )
            // InternalGumboLexer.g:168:9: ':'
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
            // InternalGumboLexer.g:170:11: ( ';' )
            // InternalGumboLexer.g:170:13: ';'
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
            // InternalGumboLexer.g:172:12: ( '=' )
            // InternalGumboLexer.g:172:14: '='
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
            // InternalGumboLexer.g:174:3: ( ( 'F' | 'f' ) )
            // InternalGumboLexer.g:174:5: ( 'F' | 'f' )
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
            // InternalGumboLexer.g:176:3: ( ( 'T' | 't' ) )
            // InternalGumboLexer.g:176:5: ( 'T' | 't' )
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
            // InternalGumboLexer.g:178:19: ( '[' )
            // InternalGumboLexer.g:178:21: '['
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
            // InternalGumboLexer.g:180:20: ( ']' )
            // InternalGumboLexer.g:180:22: ']'
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
            // InternalGumboLexer.g:182:6: ( '_' )
            // InternalGumboLexer.g:182:8: '_'
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
            // InternalGumboLexer.g:184:18: ( '{' )
            // InternalGumboLexer.g:184:20: '{'
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
            // InternalGumboLexer.g:186:19: ( '}' )
            // InternalGumboLexer.g:186:21: '}'
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
            // InternalGumboLexer.g:188:8: ( '\\u2200' )
            // InternalGumboLexer.g:188:10: '\\u2200'
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
            // InternalGumboLexer.g:190:13: ( '\\u2203' )
            // InternalGumboLexer.g:190:15: '\\u2203'
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
            // InternalGumboLexer.g:192:19: ( '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:192:21: '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGumboLexer.g:192:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGumboLexer.g:192:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:192:39: ~ ( ( '\\\\' | '\"' ) )
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

    // $ANTLR start "RULE_MSTRING"
    public final void mRULE_MSTRING() throws RecognitionException {
        try {
            int _type = RULE_MSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:194:14: ( '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:194:16: '\"\"\"' (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match("\"\"\""); 

            // InternalGumboLexer.g:194:22: (~ ( '\"' ) | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )*
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
            	    // InternalGumboLexer.g:194:23: ~ ( '\"' )
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
            	    // InternalGumboLexer.g:194:30: '\"' ~ ( '\"' )
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
            	    // InternalGumboLexer.g:194:41: '\"\"' ~ ( '\"' )
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

            // InternalGumboLexer.g:194:55: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:194:56: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:194:62: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:194:69: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:196:10: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:196:12: RULE_IDF '\"\"\"' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:196:27: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:196:27: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGumboLexer.g:196:38: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:196:39: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:196:45: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:196:52: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:198:10: ( RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGumboLexer.g:198:12: RULE_IDF '\"' ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            mRULE_IDF(); 
            match('\"'); 
            // InternalGumboLexer.g:198:25: ( RULE_ESC_SEQ | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGumboLexer.g:198:26: RULE_ESC_SEQ
            	    {
            	    mRULE_ESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGumboLexer.g:198:39: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalGumboLexer.g:200:11: ( RULE_IDF '\"\"\"' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:200:13: RULE_IDF '\"\"\"' ( RULE_MSPI )* '$'
            {
            mRULE_IDF(); 
            match("\"\"\""); 

            // InternalGumboLexer.g:200:28: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:200:28: RULE_MSPI
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
            // InternalGumboLexer.g:202:11: ( '$' ( RULE_MSPI )* '$' )
            // InternalGumboLexer.g:202:13: '$' ( RULE_MSPI )* '$'
            {
            match('$'); 
            // InternalGumboLexer.g:202:17: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:202:17: RULE_MSPI
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
            // InternalGumboLexer.g:204:11: ( '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' ) )
            // InternalGumboLexer.g:204:13: '$' ( RULE_MSPI )* ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
            {
            match('$'); 
            // InternalGumboLexer.g:204:17: ( RULE_MSPI )*
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
            	    // InternalGumboLexer.g:204:17: RULE_MSPI
            	    {
            	    mRULE_MSPI(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGumboLexer.g:204:28: ( '\"\"\"' | '\"\"\"\"' | '\"\"\"\"\"' )
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
                    // InternalGumboLexer.g:204:29: '\"\"\"'
                    {
                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:204:35: '\"\"\"\"'
                    {
                    match("\"\"\"\""); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:204:42: '\"\"\"\"\"'
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
            // InternalGumboLexer.g:206:12: ( ':' ( RULE_OPSYM )* '=' )
            // InternalGumboLexer.g:206:14: ':' ( RULE_OPSYM )* '='
            {
            match(':'); 
            // InternalGumboLexer.g:206:18: ( RULE_OPSYM )*
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
            	    // InternalGumboLexer.g:206:18: RULE_OPSYM
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
            // InternalGumboLexer.g:208:14: ( ( '-' | '~' ) '>' ':' )
            // InternalGumboLexer.g:208:16: ( '-' | '~' ) '>' ':'
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
            // InternalGumboLexer.g:210:15: ( '~' '~' '>' ':' )
            // InternalGumboLexer.g:210:17: '~' '~' '>' ':'
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
            // InternalGumboLexer.g:212:9: ( ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF ) )
            // InternalGumboLexer.g:212:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
            {
            // InternalGumboLexer.g:212:11: ( ( RULE_OPSYM )+ | '\\\\' RULE_IDF )
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
                    // InternalGumboLexer.g:212:12: ( RULE_OPSYM )+
                    {
                    // InternalGumboLexer.g:212:12: ( RULE_OPSYM )+
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
                    	    // InternalGumboLexer.g:212:12: RULE_OPSYM
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
                    // InternalGumboLexer.g:212:24: '\\\\' RULE_IDF
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
            // InternalGumboLexer.g:214:10: ( '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:214:12: '0x' ( RULE_EXTENDED_DIGIT )+ ( '.' RULE_IDF )?
            {
            match("0x"); 

            // InternalGumboLexer.g:214:17: ( RULE_EXTENDED_DIGIT )+
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
            	    // InternalGumboLexer.g:214:17: RULE_EXTENDED_DIGIT
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

            // InternalGumboLexer.g:214:38: ( '.' RULE_IDF )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='.') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGumboLexer.g:214:39: '.' RULE_IDF
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
            // InternalGumboLexer.g:216:10: ( '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )? )
            // InternalGumboLexer.g:216:12: '0b' ( '0' | '1' | '_' )+ ( '.' RULE_IDF )?
            {
            match("0b"); 

            // InternalGumboLexer.g:216:17: ( '0' | '1' | '_' )+
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

            // InternalGumboLexer.g:216:32: ( '.' RULE_IDF )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='.') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGumboLexer.g:216:33: '.' RULE_IDF
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
            // InternalGumboLexer.g:218:14: ( RULE_INTEGER_LIT RULE_IDF )
            // InternalGumboLexer.g:218:16: RULE_INTEGER_LIT RULE_IDF
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

    // $ANTLR start "RULE_F32_LIT"
    public final void mRULE_F32_LIT() throws RecognitionException {
        try {
            int _type = RULE_F32_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGumboLexer.g:220:14: ( RULE_REAL_LIT 'f' )
            // InternalGumboLexer.g:220:16: RULE_REAL_LIT 'f'
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
            // InternalGumboLexer.g:222:14: ( RULE_REAL_LIT 'd' )
            // InternalGumboLexer.g:222:16: RULE_REAL_LIT 'd'
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
            // InternalGumboLexer.g:224:19: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )* )
            // InternalGumboLexer.g:224:21: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:224:39: ( RULE_LETTER | RULE_DIGIT )*
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
            // InternalGumboLexer.g:226:20: ( (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) ) )
            // InternalGumboLexer.g:226:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
            {
            // InternalGumboLexer.g:226:22: (~ ( ( '\"' | '$' ) ) | '$$' | '\"' ~ ( '\"' ) | '\"\"' ~ ( '\"' ) )
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
                    // InternalGumboLexer.g:226:23: ~ ( ( '\"' | '$' ) )
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
                    // InternalGumboLexer.g:226:36: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 3 :
                    // InternalGumboLexer.g:226:41: '\"' ~ ( '\"' )
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
                    // InternalGumboLexer.g:226:52: '\"\"' ~ ( '\"' )
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
            // InternalGumboLexer.g:228:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalGumboLexer.g:228:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalGumboLexer.g:230:21: ( ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' ) )
            // InternalGumboLexer.g:230:23: ( '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~' | '\\u2200' .. '\\u22FF' | '\\u2A00' .. '\\u2AFF' | '\\u27C0' .. '\\u27EF' | '\\u2980' .. '\\u29FF' )
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
            // InternalGumboLexer.g:232:23: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC ) )
            // InternalGumboLexer.g:232:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
            {
            // InternalGumboLexer.g:232:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESC )
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
                    // InternalGumboLexer.g:232:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // InternalGumboLexer.g:232:67: RULE_UNICODE_ESC
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
            // InternalGumboLexer.g:234:27: ( '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT )
            // InternalGumboLexer.g:234:29: '\\\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT
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
            // InternalGumboLexer.g:236:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGumboLexer.g:236:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalGumboLexer.g:236:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGumboLexer.g:236:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGumboLexer.g:236:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboLexer.g:236:41: ( '\\r' )? '\\n'
                    {
                    // InternalGumboLexer.g:236:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalGumboLexer.g:236:41: '\\r'
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
            // InternalGumboLexer.g:238:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:238:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:238:36: ( '+' | '-' )?
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

            // InternalGumboLexer.g:238:47: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:238:47: RULE_DIGIT
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
            // InternalGumboLexer.g:240:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalGumboLexer.g:240:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:240:40: ( '+' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboLexer.g:240:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalGumboLexer.g:240:45: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:240:45: RULE_DIGIT
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
            // InternalGumboLexer.g:242:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalGumboLexer.g:242:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalGumboLexer.g:242:17: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:242:17: RULE_DIGIT
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

            // InternalGumboLexer.g:242:29: ( '_' ( RULE_DIGIT )+ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGumboLexer.g:242:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:242:34: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:242:34: RULE_DIGIT
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
            // InternalGumboLexer.g:242:52: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:242:52: RULE_DIGIT
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

            // InternalGumboLexer.g:242:64: ( '_' ( RULE_DIGIT )+ )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGumboLexer.g:242:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:242:69: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:242:69: RULE_DIGIT
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

            // InternalGumboLexer.g:242:83: ( RULE_EXPONENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='E'||LA34_0=='e') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboLexer.g:242:83: RULE_EXPONENT
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
            // InternalGumboLexer.g:244:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalGumboLexer.g:244:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalGumboLexer.g:244:20: ( RULE_DIGIT )+
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
            	    // InternalGumboLexer.g:244:20: RULE_DIGIT
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

            // InternalGumboLexer.g:244:32: ( '_' ( RULE_DIGIT )+ )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0=='_') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGumboLexer.g:244:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalGumboLexer.g:244:37: ( RULE_DIGIT )+
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
            	    	    // InternalGumboLexer.g:244:37: RULE_DIGIT
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

            // InternalGumboLexer.g:244:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='#') ) {
                alt40=1;
            }
            else {
                alt40=2;}
            switch (alt40) {
                case 1 :
                    // InternalGumboLexer.g:244:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalGumboLexer.g:244:79: ( RULE_INT_EXPONENT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='E'||LA38_0=='e') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGumboLexer.g:244:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboLexer.g:244:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalGumboLexer.g:244:98: ( RULE_INT_EXPONENT )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='E'||LA39_0=='e') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGumboLexer.g:244:98: RULE_INT_EXPONENT
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
            // InternalGumboLexer.g:246:21: ( '0' .. '9' )
            // InternalGumboLexer.g:246:23: '0' .. '9'
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
            // InternalGumboLexer.g:248:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalGumboLexer.g:248:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalGumboLexer.g:250:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalGumboLexer.g:250:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalGumboLexer.g:250:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')||(LA42_0>='A' && LA42_0<='F')||LA42_0=='_'||(LA42_0>='a' && LA42_0<='f')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGumboLexer.g:250:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalGumboLexer.g:250:52: ( '_' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0=='_') ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalGumboLexer.g:250:52: '_'
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
            // InternalGumboLexer.g:252:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGumboLexer.g:252:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGumboLexer.g:252:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGumboLexer.g:252:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGumboLexer.g:252:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGumboLexer.g:252:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:252:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGumboLexer.g:252:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGumboLexer.g:252:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGumboLexer.g:252:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalGumboLexer.g:252:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGumboLexer.g:254:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalGumboLexer.g:254:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGumboLexer.g:254:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')||(LA47_0>='A' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='a' && LA47_0<='z')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGumboLexer.g:254:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalGumboLexer.g:254:32: ( '_' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0=='_') ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalGumboLexer.g:254:32: '_'
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
            // InternalGumboLexer.g:256:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGumboLexer.g:256:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGumboLexer.g:256:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalGumboLexer.g:1:8: ( Strictpure | Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | NoSend | Assert | Assume | Handle | Normal | Return | Pure | Some | Cases | Delta | False | Match | Modes | Reads | State | Table | While | Yield | All | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_IMPLIES | RULE_SIMPLIES | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt49=106;
        alt49 = dfa49.predict(input);
        switch (alt49) {
            case 1 :
                // InternalGumboLexer.g:1:10: Strictpure
                {
                mStrictpure(); 

                }
                break;
            case 2 :
                // InternalGumboLexer.g:1:21: Integration
                {
                mIntegration(); 

                }
                break;
            case 3 :
                // InternalGumboLexer.g:1:33: Classifier
                {
                mClassifier(); 

                }
                break;
            case 4 :
                // InternalGumboLexer.g:1:44: Initialize
                {
                mInitialize(); 

                }
                break;
            case 5 :
                // InternalGumboLexer.g:1:55: Invariants
                {
                mInvariants(); 

                }
                break;
            case 6 :
                // InternalGumboLexer.g:1:66: Extension
                {
                mExtension(); 

                }
                break;
            case 7 :
                // InternalGumboLexer.g:1:76: Functions
                {
                mFunctions(); 

                }
                break;
            case 8 :
                // InternalGumboLexer.g:1:86: Guarantee
                {
                mGuarantee(); 

                }
                break;
            case 9 :
                // InternalGumboLexer.g:1:96: Invariant
                {
                mInvariant(); 

                }
                break;
            case 10 :
                // InternalGumboLexer.g:1:106: Reference
                {
                mReference(); 

                }
                break;
            case 11 :
                // InternalGumboLexer.g:1:116: HasEvent
                {
                mHasEvent(); 

                }
                break;
            case 12 :
                // InternalGumboLexer.g:1:125: MustSend
                {
                mMustSend(); 

                }
                break;
            case 13 :
                // InternalGumboLexer.g:1:134: Constant
                {
                mConstant(); 

                }
                break;
            case 14 :
                // InternalGumboLexer.g:1:143: Infoflow
                {
                mInfoflow(); 

                }
                break;
            case 15 :
                // InternalGumboLexer.g:1:152: Modifies
                {
                mModifies(); 

                }
                break;
            case 16 :
                // InternalGumboLexer.g:1:161: MaySend
                {
                mMaySend(); 

                }
                break;
            case 17 :
                // InternalGumboLexer.g:1:169: Applies
                {
                mApplies(); 

                }
                break;
            case 18 :
                // InternalGumboLexer.g:1:177: Binding
                {
                mBinding(); 

                }
                break;
            case 19 :
                // InternalGumboLexer.g:1:185: Compute
                {
                mCompute(); 

                }
                break;
            case 20 :
                // InternalGumboLexer.g:1:193: NoSend
                {
                mNoSend(); 

                }
                break;
            case 21 :
                // InternalGumboLexer.g:1:200: Assert
                {
                mAssert(); 

                }
                break;
            case 22 :
                // InternalGumboLexer.g:1:207: Assume
                {
                mAssume(); 

                }
                break;
            case 23 :
                // InternalGumboLexer.g:1:214: Handle
                {
                mHandle(); 

                }
                break;
            case 24 :
                // InternalGumboLexer.g:1:221: Normal
                {
                mNormal(); 

                }
                break;
            case 25 :
                // InternalGumboLexer.g:1:228: Return
                {
                mReturn(); 

                }
                break;
            case 26 :
                // InternalGumboLexer.g:1:235: Pure
                {
                mPure(); 

                }
                break;
            case 27 :
                // InternalGumboLexer.g:1:240: Some
                {
                mSome(); 

                }
                break;
            case 28 :
                // InternalGumboLexer.g:1:245: Cases
                {
                mCases(); 

                }
                break;
            case 29 :
                // InternalGumboLexer.g:1:251: Delta
                {
                mDelta(); 

                }
                break;
            case 30 :
                // InternalGumboLexer.g:1:257: False
                {
                mFalse(); 

                }
                break;
            case 31 :
                // InternalGumboLexer.g:1:263: Match
                {
                mMatch(); 

                }
                break;
            case 32 :
                // InternalGumboLexer.g:1:269: Modes
                {
                mModes(); 

                }
                break;
            case 33 :
                // InternalGumboLexer.g:1:275: Reads
                {
                mReads(); 

                }
                break;
            case 34 :
                // InternalGumboLexer.g:1:281: State
                {
                mState(); 

                }
                break;
            case 35 :
                // InternalGumboLexer.g:1:287: Table
                {
                mTable(); 

                }
                break;
            case 36 :
                // InternalGumboLexer.g:1:293: While
                {
                mWhile(); 

                }
                break;
            case 37 :
                // InternalGumboLexer.g:1:299: Yield
                {
                mYield(); 

                }
                break;
            case 38 :
                // InternalGumboLexer.g:1:305: All
                {
                mAll(); 

                }
                break;
            case 39 :
                // InternalGumboLexer.g:1:309: Case
                {
                mCase(); 

                }
                break;
            case 40 :
                // InternalGumboLexer.g:1:314: Else
                {
                mElse(); 

                }
                break;
            case 41 :
                // InternalGumboLexer.g:1:319: From
                {
                mFrom(); 

                }
                break;
            case 42 :
                // InternalGumboLexer.g:1:324: Halt
                {
                mHalt(); 

                }
                break;
            case 43 :
                // InternalGumboLexer.g:1:329: Spec
                {
                mSpec(); 

                }
                break;
            case 44 :
                // InternalGumboLexer.g:1:334: True
                {
                mTrue(); 

                }
                break;
            case 45 :
                // InternalGumboLexer.g:1:339: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 46 :
                // InternalGumboLexer.g:1:373: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 47 :
                // InternalGumboLexer.g:1:402: F32
                {
                mF32(); 

                }
                break;
            case 48 :
                // InternalGumboLexer.g:1:406: F64
                {
                mF64(); 

                }
                break;
            case 49 :
                // InternalGumboLexer.g:1:410: Def
                {
                mDef(); 

                }
                break;
            case 50 :
                // InternalGumboLexer.g:1:414: For
                {
                mFor(); 

                }
                break;
            case 51 :
                // InternalGumboLexer.g:1:418: Inv
                {
                mInv(); 

                }
                break;
            case 52 :
                // InternalGumboLexer.g:1:422: Mut
                {
                mMut(); 

                }
                break;
            case 53 :
                // InternalGumboLexer.g:1:426: Res
                {
                mRes(); 

                }
                break;
            case 54 :
                // InternalGumboLexer.g:1:430: Val
                {
                mVal(); 

                }
                break;
            case 55 :
                // InternalGumboLexer.g:1:434: Var
                {
                mVar(); 

                }
                break;
            case 56 :
                // InternalGumboLexer.g:1:438: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 57 :
                // InternalGumboLexer.g:1:455: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 58 :
                // InternalGumboLexer.g:1:466: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 59 :
                // InternalGumboLexer.g:1:482: LessThanSignColon
                {
                mLessThanSignColon(); 

                }
                break;
            case 60 :
                // InternalGumboLexer.g:1:500: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 61 :
                // InternalGumboLexer.g:1:526: By
                {
                mBy(); 

                }
                break;
            case 62 :
                // InternalGumboLexer.g:1:529: Do
                {
                mDo(); 

                }
                break;
            case 63 :
                // InternalGumboLexer.g:1:532: If
                {
                mIf(); 

                }
                break;
            case 64 :
                // InternalGumboLexer.g:1:535: In_1
                {
                mIn_1(); 

                }
                break;
            case 65 :
                // InternalGumboLexer.g:1:540: To
                {
                mTo(); 

                }
                break;
            case 66 :
                // InternalGumboLexer.g:1:543: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 67 :
                // InternalGumboLexer.g:1:559: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 68 :
                // InternalGumboLexer.g:1:576: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 69 :
                // InternalGumboLexer.g:1:585: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 70 :
                // InternalGumboLexer.g:1:594: Comma
                {
                mComma(); 

                }
                break;
            case 71 :
                // InternalGumboLexer.g:1:600: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 72 :
                // InternalGumboLexer.g:1:612: FullStop
                {
                mFullStop(); 

                }
                break;
            case 73 :
                // InternalGumboLexer.g:1:621: Colon
                {
                mColon(); 

                }
                break;
            case 74 :
                // InternalGumboLexer.g:1:627: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 75 :
                // InternalGumboLexer.g:1:637: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 76 :
                // InternalGumboLexer.g:1:648: F
                {
                mF(); 

                }
                break;
            case 77 :
                // InternalGumboLexer.g:1:650: T
                {
                mT(); 

                }
                break;
            case 78 :
                // InternalGumboLexer.g:1:652: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 79 :
                // InternalGumboLexer.g:1:670: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 80 :
                // InternalGumboLexer.g:1:689: KW__
                {
                mKW__(); 

                }
                break;
            case 81 :
                // InternalGumboLexer.g:1:694: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 82 :
                // InternalGumboLexer.g:1:711: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 83 :
                // InternalGumboLexer.g:1:729: ForAll
                {
                mForAll(); 

                }
                break;
            case 84 :
                // InternalGumboLexer.g:1:736: ThereExists
                {
                mThereExists(); 

                }
                break;
            case 85 :
                // InternalGumboLexer.g:1:748: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 86 :
                // InternalGumboLexer.g:1:766: RULE_MSTRING
                {
                mRULE_MSTRING(); 

                }
                break;
            case 87 :
                // InternalGumboLexer.g:1:779: RULE_MSP
                {
                mRULE_MSP(); 

                }
                break;
            case 88 :
                // InternalGumboLexer.g:1:788: RULE_SLI
                {
                mRULE_SLI(); 

                }
                break;
            case 89 :
                // InternalGumboLexer.g:1:797: RULE_MSPB
                {
                mRULE_MSPB(); 

                }
                break;
            case 90 :
                // InternalGumboLexer.g:1:807: RULE_MSPM
                {
                mRULE_MSPM(); 

                }
                break;
            case 91 :
                // InternalGumboLexer.g:1:817: RULE_MSPE
                {
                mRULE_MSPE(); 

                }
                break;
            case 92 :
                // InternalGumboLexer.g:1:827: RULE_DEFOP
                {
                mRULE_DEFOP(); 

                }
                break;
            case 93 :
                // InternalGumboLexer.g:1:838: RULE_IMPLIES
                {
                mRULE_IMPLIES(); 

                }
                break;
            case 94 :
                // InternalGumboLexer.g:1:851: RULE_SIMPLIES
                {
                mRULE_SIMPLIES(); 

                }
                break;
            case 95 :
                // InternalGumboLexer.g:1:865: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 96 :
                // InternalGumboLexer.g:1:873: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 97 :
                // InternalGumboLexer.g:1:882: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 98 :
                // InternalGumboLexer.g:1:891: RULE_INT_IDF
                {
                mRULE_INT_IDF(); 

                }
                break;
            case 99 :
                // InternalGumboLexer.g:1:904: RULE_F32_LIT
                {
                mRULE_F32_LIT(); 

                }
                break;
            case 100 :
                // InternalGumboLexer.g:1:917: RULE_F64_LIT
                {
                mRULE_F64_LIT(); 

                }
                break;
            case 101 :
                // InternalGumboLexer.g:1:930: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 102 :
                // InternalGumboLexer.g:1:946: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 103 :
                // InternalGumboLexer.g:1:960: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 104 :
                // InternalGumboLexer.g:1:977: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 105 :
                // InternalGumboLexer.g:1:989: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 106 :
                // InternalGumboLexer.g:1:997: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA49_eotS =
        "\2\uffff\3\64\1\101\7\64\1\uffff\2\64\1\126\2\64\1\132\1\134\1\64\1\141\1\52\1\144\4\uffff\1\147\3\uffff\1\150\2\uffff\1\152\1\153\1\uffff\1\64\1\uffff\1\52\1\uffff\2\166\4\uffff\1\u0080\1\u0081\1\64\2\uffff\13\64\1\uffff\11\64\1\u00a0\1\64\2\52\1\64\1\u00a7\4\64\1\u00ac\1\uffff\2\64\2\uffff\1\u00b0\1\uffff\1\64\1\uffff\1\u00b3\3\uffff\1\u00b4\10\uffff\1\u00b6\3\uffff\1\u00bb\1\uffff\2\52\2\173\1\uffff\1\173\2\uffff\1\173\1\uffff\2\64\1\u00ca\1\64\2\uffff\1\u0083\1\uffff\11\64\1\u00d6\1\u00d7\1\u00d8\4\64\1\u00dd\4\64\1\u00e2\6\64\1\uffff\2\64\2\52\1\64\1\u00f0\1\uffff\4\64\1\uffff\2\64\2\uffff\1\u00f7\1\u00f8\13\uffff\1\52\1\u00fd\1\u00c1\1\uffff\1\173\1\u00ff\2\uffff\1\173\3\64\1\uffff\1\64\1\uffff\3\64\1\u0113\1\64\1\u0115\2\64\1\u0118\3\uffff\4\64\1\uffff\2\64\1\u011f\1\64\1\uffff\12\64\1\52\1\u012c\1\64\1\uffff\1\64\1\u012f\1\64\1\u0131\2\64\7\uffff\1\173\7\uffff\2\166\4\64\1\uffff\1\u013e\1\uffff\3\64\1\u0144\1\uffff\1\64\1\uffff\1\64\1\u0147\1\uffff\3\64\1\u014b\2\64\1\uffff\2\64\1\u0150\1\64\1\u0152\6\64\1\u0159\1\uffff\1\u015a\1\u015b\1\uffff\1\u015c\1\uffff\1\u015d\1\u015e\1\uffff\1\u00ff\1\uffff\1\u00ff\1\173\4\64\4\uffff\3\64\1\uffff\2\64\1\uffff\2\64\1\u016f\1\uffff\1\64\1\u0171\2\64\1\uffff\1\64\1\uffff\1\64\1\u0176\1\u0177\1\64\1\u0179\1\u017a\10\uffff\1\173\4\64\2\uffff\2\64\1\u0183\4\64\1\uffff\1\64\1\uffff\2\64\1\u018b\1\u018c\2\uffff\1\u018d\3\uffff\1\166\3\64\1\u0191\1\64\1\u0193\1\uffff\4\64\1\u0198\1\u0199\1\u019a\3\uffff\2\64\1\u019e\1\uffff\1\64\1\uffff\1\u01a0\1\u01a1\1\u01a2\1\u01a3\3\uffff\1\64\1\u01a5\1\u01a6\1\uffff\1\u01a7\4\uffff\1\u01a8\4\uffff";
    static final String DFA49_eofS =
        "\u01a9\uffff";
    static final String DFA49_minS =
        "\1\11\1\120\13\42\1\101\5\42\1\75\1\56\1\42\1\41\1\72\1\41\4\uffff\1\55\3\uffff\1\42\2\uffff\2\41\1\0\1\42\1\0\1\76\1\uffff\2\43\4\uffff\3\42\1\uffff\1\0\13\42\1\uffff\13\42\1\117\1\114\7\42\1\uffff\2\42\2\uffff\1\74\1\uffff\1\42\1\uffff\1\41\3\uffff\1\41\5\uffff\1\42\2\uffff\2\42\2\0\1\44\1\0\1\72\1\76\2\60\1\uffff\3\60\1\53\1\uffff\4\42\2\uffff\1\42\1\uffff\34\42\1\uffff\2\42\1\115\1\114\2\42\1\uffff\4\42\1\uffff\2\42\2\uffff\2\42\4\uffff\2\0\1\uffff\1\0\1\uffff\2\0\1\72\2\60\1\uffff\1\43\1\60\1\43\2\60\3\42\1\uffff\1\42\1\0\11\42\3\uffff\4\42\1\uffff\4\42\1\uffff\12\42\1\105\1\60\1\42\1\uffff\6\42\2\uffff\2\0\3\uffff\1\53\1\uffff\1\60\1\53\2\uffff\1\60\1\43\1\101\1\60\4\42\1\0\1\44\1\0\4\42\1\uffff\1\42\1\uffff\2\42\1\uffff\6\42\1\uffff\13\42\1\60\1\uffff\2\42\1\uffff\1\42\1\uffff\2\42\1\0\3\60\1\53\4\42\1\0\1\uffff\2\0\3\42\1\uffff\2\42\1\uffff\3\42\1\uffff\4\42\1\uffff\1\42\1\uffff\6\42\6\uffff\1\0\2\60\4\42\1\0\1\uffff\7\42\1\uffff\1\42\1\uffff\4\42\2\uffff\1\42\2\uffff\1\0\1\60\6\42\1\uffff\7\42\3\uffff\3\42\1\uffff\1\42\1\uffff\4\42\3\uffff\3\42\1\uffff\1\42\4\uffff\1\42\4\uffff";
    static final String DFA49_maxS =
        "\1\u2aff\1\163\21\172\1\75\1\56\1\172\1\u2aff\1\72\1\u2aff\4\uffff\1\76\3\uffff\1\172\2\uffff\2\u2aff\1\uffff\1\172\1\uffff\1\176\1\uffff\2\172\4\uffff\3\172\1\uffff\1\uffff\13\172\1\uffff\13\172\1\157\1\154\7\172\1\uffff\2\172\2\uffff\1\74\1\uffff\1\172\1\uffff\1\u2aff\3\uffff\1\u2aff\5\uffff\1\172\2\uffff\1\42\1\165\2\uffff\1\44\1\uffff\1\72\1\76\1\146\1\137\1\uffff\2\71\1\146\1\71\1\uffff\4\172\2\uffff\1\42\1\uffff\34\172\1\uffff\2\172\1\155\1\154\2\172\1\uffff\4\172\1\uffff\2\172\2\uffff\2\172\4\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\72\2\172\1\uffff\1\145\2\146\2\71\3\172\1\uffff\1\172\1\uffff\11\172\3\uffff\4\172\1\uffff\4\172\1\uffff\12\172\1\145\2\172\1\uffff\6\172\2\uffff\2\uffff\3\uffff\1\71\1\uffff\2\71\2\uffff\2\146\6\172\1\uffff\1\44\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff\6\172\1\uffff\14\172\1\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\146\1\71\1\146\1\71\4\172\1\uffff\1\uffff\2\uffff\3\172\1\uffff\2\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\6\172\6\uffff\1\uffff\2\71\4\172\1\uffff\1\uffff\7\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\2\uffff\1\uffff\7\172\1\uffff\7\172\3\uffff\3\172\1\uffff\1\172\1\uffff\4\172\3\uffff\3\172\1\uffff\1\172\4\uffff\1\172\4\uffff";
    static final String DFA49_acceptS =
        "\31\uffff\1\102\1\103\1\104\1\106\1\uffff\1\112\1\116\1\117\1\uffff\1\121\1\122\6\uffff\1\137\2\uffff\1\150\1\152\1\1\1\32\3\uffff\1\151\14\uffff\1\114\24\uffff\1\115\2\uffff\1\55\1\105\1\uffff\1\110\1\uffff\1\71\1\uffff\1\134\1\111\1\73\1\uffff\1\113\1\135\1\145\1\107\1\120\1\uffff\1\123\1\124\12\uffff\1\147\4\uffff\1\142\4\uffff\1\100\1\77\1\uffff\1\130\34\uffff\1\75\6\uffff\1\76\4\uffff\1\101\2\uffff\1\56\1\70\2\uffff\1\72\1\74\1\126\1\125\2\uffff\1\125\1\uffff\1\132\5\uffff\1\141\10\uffff\1\63\13\uffff\1\57\1\60\1\62\4\uffff\1\65\4\uffff\1\64\15\uffff\1\61\6\uffff\1\66\1\67\2\uffff\1\133\1\136\1\140\1\uffff\1\146\2\uffff\1\143\1\144\17\uffff\1\47\1\uffff\1\50\2\uffff\1\51\6\uffff\1\52\14\uffff\1\46\2\uffff\1\53\1\uffff\1\54\14\uffff\1\131\5\uffff\1\34\2\uffff\1\36\3\uffff\1\41\4\uffff\1\40\1\uffff\1\37\6\uffff\1\33\1\35\1\42\1\43\1\44\1\45\10\uffff\1\127\7\uffff\1\31\1\uffff\1\27\4\uffff\1\25\1\26\1\uffff\1\24\1\30\10\uffff\1\23\7\uffff\1\20\1\21\1\22\3\uffff\1\16\1\uffff\1\15\4\uffff\1\13\1\14\1\17\3\uffff\1\11\1\uffff\1\6\1\7\1\10\1\12\1\uffff\1\4\1\5\1\3\1\2";
    static final String DFA49_specialS =
        "\46\uffff\1\5\1\uffff\1\4\14\uffff\1\22\70\uffff\1\14\1\6\1\uffff\1\11\105\uffff\1\21\1\0\1\uffff\1\7\1\uffff\1\10\1\23\16\uffff\1\3\54\uffff\1\24\1\13\21\uffff\1\15\1\uffff\1\2\45\uffff\1\25\10\uffff\1\16\1\uffff\1\17\1\12\36\uffff\1\26\6\uffff\1\20\24\uffff\1\1\55\uffff}>";
    static final String[] DFA49_transitionS = DFA49_transitionS_.DFA49_transitionS;
    private static final class DFA49_transitionS_ {
        static final String[] DFA49_transitionS = {
                "\2\56\2\uffff\1\56\22\uffff\1\56\1\52\1\46\1\uffff\1\50\2\52\1\55\1\31\1\32\1\33\1\23\1\34\1\35\1\24\1\52\1\53\11\54\1\26\1\36\1\27\1\30\1\52\1\uffff\1\1\1\12\1\13\1\3\1\16\1\4\1\5\1\6\1\10\1\2\3\47\1\11\1\14\3\47\1\7\1\17\1\20\1\47\1\25\1\21\1\47\1\22\1\47\1\37\1\15\1\40\1\52\1\41\1\uffff\1\12\1\13\1\3\1\16\1\4\1\5\1\6\1\10\1\2\3\47\1\11\1\14\3\47\1\7\1\17\1\20\1\47\1\25\1\21\1\47\1\22\1\47\1\42\1\52\1\43\1\51\u2181\uffff\1\44\2\52\1\45\u00fc\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\1\60\2\uffff\1\57\34\uffff\1\60\2\uffff\1\57",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\62\7\63\1\61\14\63\6\uffff\5\63\1\62\7\63\1\61\14\63",
                "\1\65\15\uffff\12\63\7\uffff\1\70\12\63\1\66\2\63\1\67\13\63\6\uffff\1\70\12\63\1\66\2\63\1\67\13\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\72\13\63\1\71\2\63\6\uffff\13\63\1\72\13\63\1\71\2\63",
                "\1\65\15\uffff\3\63\1\76\2\63\1\77\3\63\7\uffff\1\74\15\63\1\100\2\63\1\75\2\63\1\73\5\63\4\uffff\1\64\1\uffff\1\74\15\63\1\100\2\63\1\75\2\63\1\73\5\63",
                "\1\65\15\uffff\12\63\7\uffff\24\63\1\102\5\63\6\uffff\24\63\1\102\5\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\103\25\63\6\uffff\4\63\1\103\25\63",
                "\1\65\15\uffff\12\63\7\uffff\1\104\31\63\6\uffff\1\104\31\63",
                "\1\65\15\uffff\12\63\7\uffff\1\107\15\63\1\106\5\63\1\105\5\63\6\uffff\1\107\15\63\1\106\5\63\1\105\5\63",
                "\1\65\15\uffff\12\63\7\uffff\17\63\1\110\2\63\1\111\7\63\6\uffff\17\63\1\110\2\63\1\111\7\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\112\17\63\1\113\1\63\6\uffff\10\63\1\112\17\63\1\113\1\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\114\13\63\6\uffff\16\63\1\114\13\63",
                "\1\116\21\52\1\115\7\52\4\uffff\1\52\1\uffff\1\116\21\52\1\115\7\52",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\117\11\63\1\120\13\63\6\uffff\4\63\1\117\11\63\1\120\13\63",
                "\1\65\15\uffff\12\63\7\uffff\17\63\1\122\3\63\1\121\6\63\6\uffff\17\63\1\122\3\63\1\121\6\63",
                "\1\65\15\uffff\12\63\7\uffff\1\123\15\63\1\125\2\63\1\124\10\63\4\uffff\1\64\1\uffff\1\123\15\63\1\125\2\63\1\124\10\63",
                "\1\65\15\uffff\12\63\7\uffff\7\63\1\127\22\63\6\uffff\7\63\1\127\22\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\130\21\63\6\uffff\10\63\1\130\21\63",
                "\1\131",
                "\1\133",
                "\1\65\15\uffff\12\63\7\uffff\1\135\31\63\6\uffff\1\135\31\63",
                "\1\140\3\uffff\2\140\10\uffff\1\140\12\uffff\1\136\1\uffff\1\140\1\137\1\140\37\uffff\1\140\35\uffff\1\140\1\uffff\1\140\u2181\uffff\u0100\140\u04c0\uffff\60\140\u0190\uffff\u0180\140",
                "\1\142",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\2\52\1\143\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "",
                "",
                "",
                "",
                "\1\146\20\uffff\1\145",
                "",
                "",
                "",
                "\1\65\15\uffff\12\151\7\uffff\32\151\6\uffff\32\151",
                "",
                "",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "\42\156\1\154\71\156\1\155\uffa3\156",
                "\1\65\15\uffff\12\63\7\uffff\32\63\6\uffff\32\63",
                "\42\157\1\161\1\157\1\160\uffdb\157",
                "\1\162\77\uffff\1\163",
                "",
                "\1\171\12\uffff\1\170\1\uffff\12\54\7\uffff\4\173\1\172\25\173\4\uffff\1\167\1\uffff\1\173\1\165\2\173\1\172\22\173\1\164\2\173",
                "\1\171\12\uffff\1\170\1\uffff\12\54\7\uffff\4\173\1\172\25\173\4\uffff\1\167\1\uffff\4\173\1\172\25\173",
                "",
                "",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\177\2\63\1\175\12\63\1\174\1\63\1\176\4\63\4\uffff\1\64\1\uffff\5\63\1\177\2\63\1\175\12\63\1\174\1\63\1\176\4\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\6\uffff\32\63",
                "",
                "\42\u0083\1\u0082\uffdd\u0083",
                "\1\65\15\uffff\12\63\7\uffff\1\u0084\31\63\6\uffff\1\u0084\31\63",
                "\1\65\15\uffff\12\63\7\uffff\14\63\1\u0086\1\u0085\14\63\6\uffff\14\63\1\u0086\1\u0085\14\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0087\7\63\6\uffff\22\63\1\u0087\7\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0088\6\63\6\uffff\23\63\1\u0088\6\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0089\7\63\6\uffff\22\63\1\u0089\7\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u008a\14\63\6\uffff\15\63\1\u008a\14\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u008b\16\63\6\uffff\13\63\1\u008b\16\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u008c\13\63\6\uffff\16\63\1\u008c\13\63",
                "\1\65\15\uffff\2\63\1\u008d\7\63\7\uffff\32\63\6\uffff\32\63",
                "\1\65\15\uffff\4\63\1\u008e\5\63\7\uffff\32\63\6\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u008f\10\63\6\uffff\21\63\1\u008f\10\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\1\u0090\31\63\6\uffff\1\u0090\31\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u0093\4\63\1\u0091\14\63\1\u0094\1\u0092\6\63\6\uffff\1\u0093\4\63\1\u0091\14\63\1\u0094\1\u0092\6\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u0097\1\63\1\u0096\4\63\1\u0095\7\63\6\uffff\13\63\1\u0097\1\63\1\u0096\4\63\1\u0095\7\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0098\1\u0099\6\63\6\uffff\22\63\1\u0098\1\u0099\6\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u009a\26\63\6\uffff\3\63\1\u009a\26\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u009c\4\63\1\u009b\1\63\6\uffff\23\63\1\u009c\4\63\1\u009b\1\63",
                "\1\65\15\uffff\12\63\7\uffff\17\63\1\u009d\12\63\6\uffff\17\63\1\u009d\12\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u009e\7\63\6\uffff\22\63\1\u009e\7\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u009f\14\63\6\uffff\15\63\1\u009f\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u00a2\1\u00a1\7\63\6\uffff\21\63\1\u00a2\1\u00a1\7\63",
                "\1\u00a3\37\uffff\1\u00a3",
                "\1\u00a4\37\uffff\1\u00a4",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\u00a6\5\63\1\u00a5\16\63\6\uffff\5\63\1\u00a6\5\63\1\u00a5\16\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u00a8\31\63\6\uffff\1\u00a8\31\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00a9\25\63\6\uffff\4\63\1\u00a9\25\63",
                "\1\65\15\uffff\12\63\7\uffff\1\63\1\u00aa\30\63\6\uffff\1\63\1\u00aa\30\63",
                "\1\65\15\uffff\12\63\7\uffff\24\63\1\u00ab\5\63\6\uffff\24\63\1\u00ab\5\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u00ad\21\63\6\uffff\10\63\1\u00ad\21\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00ae\25\63\6\uffff\4\63\1\u00ae\25\63",
                "",
                "",
                "\1\u00af",
                "",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u00b1\5\63\1\u00b2\10\63\6\uffff\13\63\1\u00b1\5\63\1\u00b2\10\63",
                "",
                "\1\140\3\uffff\2\140\10\uffff\1\140\14\uffff\3\140\37\uffff\1\140\35\uffff\1\140\1\uffff\1\140\u2181\uffff\u0100\140\u04c0\uffff\60\140\u0190\uffff\u0180\140",
                "",
                "",
                "",
                "\1\52\3\uffff\2\52\10\uffff\1\52\14\uffff\3\52\37\uffff\1\52\35\uffff\1\52\1\uffff\1\52\u2181\uffff\u0100\52\u04c0\uffff\60\52\u0190\uffff\u0180\52",
                "",
                "",
                "",
                "",
                "",
                "\1\65\15\uffff\12\151\7\uffff\32\151\6\uffff\32\151",
                "",
                "",
                "\1\u00b5",
                "\1\u00b7\4\uffff\1\u00b7\64\uffff\1\u00b7\5\uffff\1\u00b7\3\uffff\1\u00b7\7\uffff\1\u00b7\3\uffff\1\u00b7\1\uffff\1\u00b7\1\u00b8",
                "\42\156\1\u00b9\71\156\1\155\uffa3\156",
                "\42\157\1\161\1\157\1\160\uffdb\157",
                "\1\u00ba",
                "\42\u00bc\1\u00bd\uffdd\u00bc",
                "\1\145",
                "\1\u00be",
                "\12\u00bf\7\uffff\6\u00bf\32\uffff\6\u00bf",
                "\2\u00c0\55\uffff\1\u00c1",
                "",
                "\12\u00c2",
                "\12\u00c3",
                "\12\u00c4\7\uffff\6\u00c4\32\uffff\6\u00c4",
                "\1\u00c5\4\uffff\12\u00c6",
                "",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00c7\25\63\6\uffff\4\63\1\u00c7\25\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u00c8\6\63\6\uffff\23\63\1\u00c8\6\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u00c9\31\63\4\uffff\1\64\1\uffff\1\u00c9\31\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u00cb\13\63\6\uffff\16\63\1\u00cb\13\63",
                "",
                "",
                "\1\u00cc",
                "",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u00cd\7\63\6\uffff\22\63\1\u00cd\7\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u00ce\7\63\6\uffff\22\63\1\u00ce\7\63",
                "\1\65\15\uffff\12\63\7\uffff\17\63\1\u00cf\12\63\6\uffff\17\63\1\u00cf\12\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00d0\25\63\6\uffff\4\63\1\u00d0\25\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00d1\25\63\6\uffff\4\63\1\u00d1\25\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00d2\25\63\6\uffff\4\63\1\u00d2\25\63",
                "\1\65\15\uffff\12\63\7\uffff\2\63\1\u00d3\27\63\6\uffff\2\63\1\u00d3\27\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u00d4\7\63\6\uffff\22\63\1\u00d4\7\63",
                "\1\65\15\uffff\12\63\7\uffff\14\63\1\u00d5\15\63\6\uffff\14\63\1\u00d5\15\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u00d9\10\63\6\uffff\21\63\1\u00d9\10\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00da\25\63\6\uffff\4\63\1\u00da\25\63",
                "\1\65\15\uffff\12\63\7\uffff\24\63\1\u00db\5\63\6\uffff\24\63\1\u00db\5\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u00dc\26\63\6\uffff\3\63\1\u00dc\26\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00de\25\63\6\uffff\4\63\1\u00de\25\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u00df\26\63\6\uffff\3\63\1\u00df\26\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u00e0\6\63\6\uffff\23\63\1\u00e0\6\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u00e1\6\63\6\uffff\23\63\1\u00e1\6\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00e4\3\63\1\u00e3\21\63\6\uffff\4\63\1\u00e4\3\63\1\u00e3\21\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u00e5\7\63\6\uffff\22\63\1\u00e5\7\63",
                "\1\65\15\uffff\12\63\7\uffff\2\63\1\u00e6\27\63\6\uffff\2\63\1\u00e6\27\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u00e7\16\63\6\uffff\13\63\1\u00e7\16\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00e8\17\63\1\u00e9\5\63\6\uffff\4\63\1\u00e8\17\63\1\u00e9\5\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u00ea\26\63\6\uffff\3\63\1\u00ea\26\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00eb\25\63\6\uffff\4\63\1\u00eb\25\63",
                "\1\65\15\uffff\12\63\7\uffff\14\63\1\u00ec\15\63\6\uffff\14\63\1\u00ec\15\63",
                "\1\u00ed\37\uffff\1\u00ed",
                "\1\u00ee\37\uffff\1\u00ee",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u00ef\6\63\6\uffff\23\63\1\u00ef\6\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u00f1\6\63\6\uffff\23\63\1\u00f1\6\63",
                "\1\65\15\uffff\12\63\7\uffff\2\63\1\u00f2\27\63\6\uffff\2\63\1\u00f2\27\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u00f3\16\63\6\uffff\13\63\1\u00f3\16\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u00f4\25\63\6\uffff\4\63\1\u00f4\25\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u00f5\16\63\6\uffff\13\63\1\u00f5\16\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u00f6\16\63\6\uffff\13\63\1\u00f6\16\63",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "",
                "\42\156\1\u00b9\71\156\1\155\uffa3\156",
                "\60\55\12\u00f9\7\55\6\u00f9\32\55\6\u00f9\uff99\55",
                "",
                "\42\157\1\161\1\157\1\160\uffdb\157",
                "",
                "\42\157\1\161\1\157\1\160\uffdb\157",
                "\42\u00fa\1\u00fb\uffdd\u00fa",
                "\1\u00fc",
                "\12\u00bf\7\uffff\6\u00bf\24\173\6\uffff\6\u00bf\24\173",
                "\2\u00c0\10\173\7\uffff\32\173\6\uffff\32\173",
                "",
                "\1\171\12\uffff\1\170\1\uffff\12\u00c2\13\uffff\1\u00fe\31\uffff\1\167\5\uffff\1\u00fe",
                "\12\u00c3\13\uffff\1\u0101\31\uffff\1\u0100\4\uffff\1\u0103\1\u0101\1\u0102",
                "\1\u0106\14\uffff\12\u0105\7\uffff\6\u0105\30\uffff\1\u0104\1\uffff\6\u0105",
                "\12\u0107",
                "\12\u00c6",
                "\1\65\15\uffff\12\63\7\uffff\6\63\1\u0108\23\63\6\uffff\6\63\1\u0108\23\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0109\21\63\6\uffff\10\63\1\u0109\21\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u010a\10\63\6\uffff\21\63\1\u010a\10\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\u010b\24\63\6\uffff\5\63\1\u010b\24\63",
                "\42\u010c\1\u010e\1\u010c\1\u010d\uffdb\u010c",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u010f\7\63\6\uffff\22\63\1\u010f\7\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0110\6\63\6\uffff\23\63\1\u0110\6\63",
                "\1\65\15\uffff\12\63\7\uffff\24\63\1\u0111\5\63\6\uffff\24\63\1\u0111\5\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0112\7\63\4\uffff\1\64\1\uffff\22\63\1\u0112\7\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0114\14\63\6\uffff\15\63\1\u0114\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0116\6\63\6\uffff\23\63\1\u0116\6\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0117\25\63\6\uffff\4\63\1\u0117\25\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\1\u0119\31\63\6\uffff\1\u0119\31\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u011a\10\63\6\uffff\21\63\1\u011a\10\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u011b\10\63\6\uffff\21\63\1\u011b\10\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u011c\7\63\6\uffff\22\63\1\u011c\7\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\25\63\1\u011d\4\63\6\uffff\25\63\1\u011d\4\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u011e\16\63\6\uffff\13\63\1\u011e\16\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0120\7\63\6\uffff\22\63\1\u0120\7\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\u0121\24\63\6\uffff\5\63\1\u0121\24\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0122\7\63\6\uffff\22\63\1\u0122\7\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0123\25\63\6\uffff\4\63\1\u0123\25\63",
                "\1\65\15\uffff\12\63\7\uffff\7\63\1\u0124\22\63\6\uffff\7\63\1\u0124\22\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0125\21\63\6\uffff\10\63\1\u0125\21\63",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u0126\10\63\6\uffff\21\63\1\u0126\10\63",
                "\1\65\15\uffff\12\63\7\uffff\14\63\1\u0127\15\63\6\uffff\14\63\1\u0127\15\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0128\21\63\6\uffff\10\63\1\u0128\21\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0129\14\63\6\uffff\15\63\1\u0129\14\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u012a\31\63\6\uffff\1\u012a\31\63",
                "\1\u012b\37\uffff\1\u012b",
                "\12\52\7\uffff\32\52\6\uffff\32\52",
                "\1\65\15\uffff\12\63\7\uffff\1\u012d\31\63\6\uffff\1\u012d\31\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u012e\25\63\6\uffff\4\63\1\u012e\25\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0130\25\63\6\uffff\4\63\1\u0130\25\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0132\25\63\6\uffff\4\63\1\u0132\25\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u0133\26\63\6\uffff\3\63\1\u0133\26\63",
                "",
                "",
                "\60\55\12\u0134\7\55\6\u0134\32\55\6\u0134\uff99\55",
                "\42\157\1\161\1\157\1\160\uffdb\157",
                "",
                "",
                "",
                "\1\u00c5\4\uffff\12\u00c6",
                "",
                "\12\u0135",
                "\1\u0136\1\uffff\1\u0136\2\uffff\12\u0137",
                "",
                "",
                "\12\u0105\7\uffff\6\u0105\32\uffff\6\u0105",
                "\1\u0106\14\uffff\12\u0105\7\uffff\6\u0105\30\uffff\1\u0104\1\uffff\6\u0105",
                "\4\173\1\u0138\25\173\4\uffff\1\173\1\uffff\4\173\1\u0138\25\173",
                "\12\u0107\7\uffff\32\173\4\uffff\1\173\1\uffff\32\173",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u0139\10\63\6\uffff\21\63\1\u0139\10\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u013a\31\63\6\uffff\1\u013a\31\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u013b\21\63\6\uffff\10\63\1\u013b\21\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u013c\16\63\6\uffff\13\63\1\u013c\16\63",
                "\42\u010c\1\u010e\1\u010c\1\u010d\uffdb\u010c",
                "\1\u013d",
                "\42\u013f\1\u0140\uffdd\u013f",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0141\21\63\6\uffff\10\63\1\u0141\21\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u0142\31\63\6\uffff\1\u0142\31\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0143\6\63\6\uffff\23\63\1\u0143\6\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0145\7\63\6\uffff\22\63\1\u0145\7\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0146\21\63\6\uffff\10\63\1\u0146\21\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0148\14\63\6\uffff\15\63\1\u0148\14\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0149\25\63\6\uffff\4\63\1\u0149\25\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u014a\14\63\6\uffff\15\63\1\u014a\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u014c\25\63\6\uffff\4\63\1\u014c\25\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u014d\25\63\6\uffff\4\63\1\u014d\25\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u014e\25\63\6\uffff\4\63\1\u014e\25\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u014f\21\63\6\uffff\10\63\1\u014f\21\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0151\14\63\6\uffff\15\63\1\u0151\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0153\25\63\6\uffff\4\63\1\u0153\25\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0154\6\63\6\uffff\23\63\1\u0154\6\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0155\25\63\6\uffff\4\63\1\u0155\25\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0156\14\63\6\uffff\15\63\1\u0156\14\63",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u0157\26\63\6\uffff\3\63\1\u0157\26\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u0158\16\63\6\uffff\13\63\1\u0158\16\63",
                "\12\52\7\uffff\32\52\6\uffff\32\52",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\60\55\12\u015f\7\55\6\u015f\32\55\6\u015f\uff99\55",
                "\12\u0135\13\uffff\1\u0101\31\uffff\1\u0100\4\uffff\1\u0103\1\u0101\1\u0102",
                "\12\u0137",
                "\12\u0137\52\uffff\1\u0103\1\uffff\1\u0102",
                "\1\u0160\4\uffff\12\u0161",
                "\1\65\15\uffff\12\63\7\uffff\1\u0162\31\63\6\uffff\1\u0162\31\63",
                "\1\65\15\uffff\12\63\7\uffff\13\63\1\u0163\16\63\6\uffff\13\63\1\u0163\16\63",
                "\1\65\15\uffff\12\63\7\uffff\1\u0164\31\63\6\uffff\1\u0164\31\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u0165\13\63\6\uffff\16\63\1\u0165\13\63",
                "\42\u010c\1\u010e\1\u010c\1\u010d\uffdb\u010c",
                "",
                "\42\u010c\1\u010e\1\u010c\1\u010d\uffdb\u010c",
                "\42\u0166\1\u0167\uffdd\u0166",
                "\1\65\15\uffff\12\63\7\uffff\5\63\1\u0168\24\63\6\uffff\5\63\1\u0168\24\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0169\14\63\6\uffff\15\63\1\u0169\14\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u016a\25\63\6\uffff\4\63\1\u016a\25\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u016b\21\63\6\uffff\10\63\1\u016b\21\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u016c\13\63\6\uffff\16\63\1\u016c\13\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u016d\6\63\6\uffff\23\63\1\u016d\6\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u016e\14\63\6\uffff\15\63\1\u016e\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0170\14\63\6\uffff\15\63\1\u0170\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0172\14\63\6\uffff\15\63\1\u0172\14\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0173\25\63\6\uffff\4\63\1\u0173\25\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u0174\26\63\6\uffff\3\63\1\u0174\26\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0175\7\63\6\uffff\22\63\1\u0175\7\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\6\63\1\u0178\23\63\6\uffff\6\63\1\u0178\23\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "",
                "",
                "",
                "\60\55\12\u017b\7\55\6\u017b\32\55\6\u017b\uff99\55",
                "\12\u017c",
                "\12\u0161",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u017d\6\63\6\uffff\23\63\1\u017d\6\63",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u017e\21\63\6\uffff\10\63\1\u017e\21\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u017f\14\63\6\uffff\15\63\1\u017f\14\63",
                "\1\65\15\uffff\12\63\7\uffff\26\63\1\u0180\3\63\6\uffff\26\63\1\u0180\3\63",
                "\42\u010c\1\u010e\1\u010c\1\u010d\uffdb\u010c",
                "",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u0181\21\63\6\uffff\10\63\1\u0181\21\63",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0182\6\63\6\uffff\23\63\1\u0182\6\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u0184\13\63\6\uffff\16\63\1\u0184\13\63",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0185\14\63\6\uffff\15\63\1\u0185\14\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0186\25\63\6\uffff\4\63\1\u0186\25\63",
                "\1\65\15\uffff\12\63\7\uffff\2\63\1\u0187\27\63\6\uffff\2\63\1\u0187\27\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0188\6\63\6\uffff\23\63\1\u0188\6\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\3\63\1\u0189\26\63\6\uffff\3\63\1\u0189\26\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u018a\7\63\6\uffff\22\63\1\u018a\7\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "\42\156\1\u00b9\71\156\1\155\uffa3\156",
                "\12\u017c\7\uffff\32\173\4\uffff\1\173\1\uffff\32\173",
                "\1\65\15\uffff\12\63\7\uffff\10\63\1\u018e\21\63\6\uffff\10\63\1\u018e\21\63",
                "\1\65\15\uffff\12\63\7\uffff\31\63\1\u018f\6\uffff\31\63\1\u018f",
                "\1\65\15\uffff\12\63\7\uffff\23\63\1\u0190\6\63\6\uffff\23\63\1\u0190\6\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0192\25\63\6\uffff\4\63\1\u0192\25\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u0194\14\63\6\uffff\15\63\1\u0194\14\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u0195\7\63\6\uffff\22\63\1\u0195\7\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0196\25\63\6\uffff\4\63\1\u0196\25\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u0197\25\63\6\uffff\4\63\1\u0197\25\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\16\63\1\u019b\13\63\6\uffff\16\63\1\u019b\13\63",
                "\1\65\15\uffff\12\63\7\uffff\4\63\1\u019c\25\63\6\uffff\4\63\1\u019c\25\63",
                "\1\65\15\uffff\12\63\7\uffff\22\63\1\u019d\7\63\4\uffff\1\64\1\uffff\22\63\1\u019d\7\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\21\63\1\u019f\10\63\6\uffff\21\63\1\u019f\10\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\15\63\1\u01a4\14\63\6\uffff\15\63\1\u01a4\14\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
                "",
                "",
                "",
                "",
                "\1\65\15\uffff\12\63\7\uffff\32\63\4\uffff\1\64\1\uffff\32\63",
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
            return "1:1: Tokens : ( Strictpure | Integration | Classifier | Initialize | Invariants | Extension | Functions | Guarantee | Invariant | Reference | HasEvent | MustSend | Constant | Infoflow | Modifies | MaySend | Applies | Binding | Compute | NoSend | Assert | Assume | Handle | Normal | Return | Pure | Some | Cases | Delta | False | Match | Modes | Reads | State | Table | While | Yield | All | Case | Else | From | Halt | Spec | True | PlusSignEqualsSignGreaterThanSign | FullStopFullStopLessThanSign | F32 | F64 | Def | For | Inv | Mut | Res | Val | Var | FullStopFullStop | ColonColon | ColonEqualsSign | LessThanSignColon | EqualsSignGreaterThanSign | By | Do | If | In_1 | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Colon | Semicolon | EqualsSign | F | T | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | ForAll | ThereExists | RULE_STRING_VALUE | RULE_MSTRING | RULE_MSP | RULE_SLI | RULE_MSPB | RULE_MSPM | RULE_MSPE | RULE_DEFOP | RULE_IMPLIES | RULE_SIMPLIES | RULE_OP | RULE_HEX | RULE_BIN | RULE_INT_IDF | RULE_F32_LIT | RULE_F64_LIT | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_184 = input.LA(1);

                        s = -1;
                        if ( ((LA49_184>='0' && LA49_184<='9')||(LA49_184>='A' && LA49_184<='F')||(LA49_184>='a' && LA49_184<='f')) ) {s = 249;}

                        else if ( ((LA49_184>='\u0000' && LA49_184<='/')||(LA49_184>=':' && LA49_184<='@')||(LA49_184>='G' && LA49_184<='`')||(LA49_184>='g' && LA49_184<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_379 = input.LA(1);

                        s = -1;
                        if ( (LA49_379=='\"') ) {s = 185;}

                        else if ( (LA49_379=='\\') ) {s = 109;}

                        else if ( ((LA49_379>='\u0000' && LA49_379<='!')||(LA49_379>='#' && LA49_379<='[')||(LA49_379>=']' && LA49_379<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_270 = input.LA(1);

                        s = -1;
                        if ( ((LA49_270>='\u0000' && LA49_270<='!')||(LA49_270>='#' && LA49_270<='\uFFFF')) ) {s = 319;}

                        else if ( (LA49_270=='\"') ) {s = 320;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_204 = input.LA(1);

                        s = -1;
                        if ( ((LA49_204>='\u0000' && LA49_204<='!')||LA49_204=='#'||(LA49_204>='%' && LA49_204<='\uFFFF')) ) {s = 268;}

                        else if ( (LA49_204=='$') ) {s = 269;}

                        else if ( (LA49_204=='\"') ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_40 = input.LA(1);

                        s = -1;
                        if ( ((LA49_40>='\u0000' && LA49_40<='!')||LA49_40=='#'||(LA49_40>='%' && LA49_40<='\uFFFF')) ) {s = 111;}

                        else if ( (LA49_40=='$') ) {s = 112;}

                        else if ( (LA49_40=='\"') ) {s = 113;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_38 = input.LA(1);

                        s = -1;
                        if ( (LA49_38=='\"') ) {s = 108;}

                        else if ( (LA49_38=='\\') ) {s = 109;}

                        else if ( ((LA49_38>='\u0000' && LA49_38<='!')||(LA49_38>='#' && LA49_38<='[')||(LA49_38>=']' && LA49_38<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_111 = input.LA(1);

                        s = -1;
                        if ( (LA49_111=='\"') ) {s = 113;}

                        else if ( ((LA49_111>='\u0000' && LA49_111<='!')||LA49_111=='#'||(LA49_111>='%' && LA49_111<='\uFFFF')) ) {s = 111;}

                        else if ( (LA49_111=='$') ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_186 = input.LA(1);

                        s = -1;
                        if ( (LA49_186=='\"') ) {s = 113;}

                        else if ( ((LA49_186>='\u0000' && LA49_186<='!')||LA49_186=='#'||(LA49_186>='%' && LA49_186<='\uFFFF')) ) {s = 111;}

                        else if ( (LA49_186=='$') ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_188 = input.LA(1);

                        s = -1;
                        if ( (LA49_188=='\"') ) {s = 113;}

                        else if ( ((LA49_188>='\u0000' && LA49_188<='!')||LA49_188=='#'||(LA49_188>='%' && LA49_188<='\uFFFF')) ) {s = 111;}

                        else if ( (LA49_188=='$') ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_113 = input.LA(1);

                        s = -1;
                        if ( ((LA49_113>='\u0000' && LA49_113<='!')||(LA49_113>='#' && LA49_113<='\uFFFF')) ) {s = 188;}

                        else if ( (LA49_113=='\"') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_320 = input.LA(1);

                        s = -1;
                        if ( ((LA49_320>='\u0000' && LA49_320<='!')||(LA49_320>='#' && LA49_320<='\uFFFF')) ) {s = 358;}

                        else if ( (LA49_320=='\"') ) {s = 359;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_250 = input.LA(1);

                        s = -1;
                        if ( (LA49_250=='\"') ) {s = 113;}

                        else if ( ((LA49_250>='\u0000' && LA49_250<='!')||LA49_250=='#'||(LA49_250>='%' && LA49_250<='\uFFFF')) ) {s = 111;}

                        else if ( (LA49_250=='$') ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_110 = input.LA(1);

                        s = -1;
                        if ( (LA49_110=='\"') ) {s = 185;}

                        else if ( (LA49_110=='\\') ) {s = 109;}

                        else if ( ((LA49_110>='\u0000' && LA49_110<='!')||(LA49_110>='#' && LA49_110<='[')||(LA49_110>=']' && LA49_110<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_268 = input.LA(1);

                        s = -1;
                        if ( (LA49_268=='$') ) {s = 269;}

                        else if ( ((LA49_268>='\u0000' && LA49_268<='!')||LA49_268=='#'||(LA49_268>='%' && LA49_268<='\uFFFF')) ) {s = 268;}

                        else if ( (LA49_268=='\"') ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA49_317 = input.LA(1);

                        s = -1;
                        if ( (LA49_317=='$') ) {s = 269;}

                        else if ( ((LA49_317>='\u0000' && LA49_317<='!')||LA49_317=='#'||(LA49_317>='%' && LA49_317<='\uFFFF')) ) {s = 268;}

                        else if ( (LA49_317=='\"') ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA49_319 = input.LA(1);

                        s = -1;
                        if ( (LA49_319=='\"') ) {s = 270;}

                        else if ( ((LA49_319>='\u0000' && LA49_319<='!')||LA49_319=='#'||(LA49_319>='%' && LA49_319<='\uFFFF')) ) {s = 268;}

                        else if ( (LA49_319=='$') ) {s = 269;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA49_358 = input.LA(1);

                        s = -1;
                        if ( (LA49_358=='$') ) {s = 269;}

                        else if ( ((LA49_358>='\u0000' && LA49_358<='!')||LA49_358=='#'||(LA49_358>='%' && LA49_358<='\uFFFF')) ) {s = 268;}

                        else if ( (LA49_358=='\"') ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA49_183 = input.LA(1);

                        s = -1;
                        if ( (LA49_183=='\"') ) {s = 185;}

                        else if ( (LA49_183=='\\') ) {s = 109;}

                        else if ( ((LA49_183>='\u0000' && LA49_183<='!')||(LA49_183>='#' && LA49_183<='[')||(LA49_183>=']' && LA49_183<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA49_53 = input.LA(1);

                        s = -1;
                        if ( (LA49_53=='\"') ) {s = 130;}

                        else if ( ((LA49_53>='\u0000' && LA49_53<='!')||(LA49_53>='#' && LA49_53<='\uFFFF')) ) {s = 131;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA49_189 = input.LA(1);

                        s = -1;
                        if ( ((LA49_189>='\u0000' && LA49_189<='!')||(LA49_189>='#' && LA49_189<='\uFFFF')) ) {s = 250;}

                        else if ( (LA49_189=='\"') ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA49_249 = input.LA(1);

                        s = -1;
                        if ( ((LA49_249>='0' && LA49_249<='9')||(LA49_249>='A' && LA49_249<='F')||(LA49_249>='a' && LA49_249<='f')) ) {s = 308;}

                        else if ( ((LA49_249>='\u0000' && LA49_249<='/')||(LA49_249>=':' && LA49_249<='@')||(LA49_249>='G' && LA49_249<='`')||(LA49_249>='g' && LA49_249<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA49_308 = input.LA(1);

                        s = -1;
                        if ( ((LA49_308>='0' && LA49_308<='9')||(LA49_308>='A' && LA49_308<='F')||(LA49_308>='a' && LA49_308<='f')) ) {s = 351;}

                        else if ( ((LA49_308>='\u0000' && LA49_308<='/')||(LA49_308>=':' && LA49_308<='@')||(LA49_308>='G' && LA49_308<='`')||(LA49_308>='g' && LA49_308<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA49_351 = input.LA(1);

                        s = -1;
                        if ( ((LA49_351>='\u0000' && LA49_351<='/')||(LA49_351>=':' && LA49_351<='@')||(LA49_351>='G' && LA49_351<='`')||(LA49_351>='g' && LA49_351<='\uFFFF')) ) {s = 45;}

                        else if ( ((LA49_351>='0' && LA49_351<='9')||(LA49_351>='A' && LA49_351<='F')||(LA49_351>='a' && LA49_351<='f')) ) {s = 379;}

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