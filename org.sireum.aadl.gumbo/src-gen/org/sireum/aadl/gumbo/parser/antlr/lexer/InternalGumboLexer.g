
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
lexer grammar InternalGumboLexer;

@header {
package org.sireum.aadl.gumbo.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Strictpure : '@'('S'|'s')('T'|'t')('R'|'r')('I'|'i')('C'|'c')('T'|'t')('P'|'p')('U'|'u')('R'|'r')('E'|'e');

Integration : ('I'|'i')('N'|'n')('T'|'t')('E'|'e')('G'|'g')('R'|'r')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Classifier : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('R'|'r');

Initialize : ('I'|'i')('N'|'n')('I'|'i')('T'|'t')('I'|'i')('A'|'a')('L'|'l')('I'|'i')('Z'|'z')('E'|'e');

Invariants : ('I'|'i')('N'|'n')('V'|'v')('A'|'a')('R'|'r')('I'|'i')('A'|'a')('N'|'n')('T'|'t')('S'|'s');

Extension : ('E'|'e')('X'|'x')('T'|'t')('E'|'e')('N'|'n')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

Functions : ('F'|'f')('U'|'u')('N'|'n')('C'|'c')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('S'|'s');

Guarantee : ('G'|'g')('U'|'u')('A'|'a')('R'|'r')('A'|'a')('N'|'n')('T'|'t')('E'|'e')('E'|'e');

Invariant : ('I'|'i')('N'|'n')('V'|'v')('A'|'a')('R'|'r')('I'|'i')('A'|'a')('N'|'n')('T'|'t');

Reference : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

MustSend : ('M'|'m')('U'|'u')('S'|'s')('T'|'t')('S'|'s')('E'|'e')('N'|'n')('D'|'d');

Constant : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

Modifies : ('M'|'m')('O'|'o')('D'|'d')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('S'|'s');

MaySend : ('M'|'m')('A'|'a')('Y'|'y')('S'|'s')('E'|'e')('N'|'n')('D'|'d');

Applies : ('A'|'a')('P'|'p')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

Binding : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

Compute : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

NoSend : ('N'|'n')('O'|'o')('S'|'s')('E'|'e')('N'|'n')('D'|'d');

Assert : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t');

Assume : ('A'|'a')('S'|'s')('S'|'s')('U'|'u')('M'|'m')('E'|'e');

Handle : ('H'|'h')('A'|'a')('N'|'n')('D'|'d')('L'|'l')('E'|'e');

Return : ('R'|'r')('E'|'e')('T'|'t')('U'|'u')('R'|'r')('N'|'n');

Pure : '@'('P'|'p')('U'|'u')('R'|'r')('E'|'e');

Some : '\\'('S'|'s')('O'|'o')('M'|'m')('E'|'e');

Cases : ('C'|'c')('A'|'a')('S'|'s')('E'|'e')('S'|'s');

Delta : ('D'|'d')('E'|'e')('L'|'l')('T'|'t')('A'|'a');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Match : ('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h');

Modes : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('S'|'s');

Reads : ('R'|'r')('E'|'e')('A'|'a')('D'|'d')('S'|'s');

State : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('E'|'e');

While : ('W'|'w')('H'|'h')('I'|'i')('L'|'l')('E'|'e');

Yield : ('Y'|'y')('I'|'i')('E'|'e')('L'|'l')('D'|'d');

All : '\\'('A'|'a')('L'|'l')('L'|'l');

Case : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');

Else : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

Halt : ('H'|'h')('A'|'a')('L'|'l')('T'|'t');

Spec : ('S'|'s')('P'|'p')('E'|'e')('C'|'c');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

PlusSignEqualsSignGreaterThanSign : '+''=''>';

FullStopFullStopLessThanSign : '.''.''<';

Def : ('D'|'d')('E'|'e')('F'|'f');

For : ('F'|'f')('O'|'o')('R'|'r');

Inv : ('I'|'i')('N'|'n')('V'|'v');

Mut : ('M'|'m')('U'|'u')('T'|'t');

Res : ('R'|'r')('E'|'e')('S'|'s');

Val : ('V'|'v')('A'|'a')('L'|'l');

Var : ('V'|'v')('A'|'a')('R'|'r');

FullStopFullStop : '.''.';

ColonColon : ':'':';

ColonEqualsSign : ':''=';

LessThanSignColon : '<'':';

EqualsSignGreaterThanSign : '=''>';

By : ('B'|'b')('Y'|'y');

Do : ('D'|'d')('O'|'o');

If : ('I'|'i')('F'|'f');

In_1 : ('I'|'i')('N'|'n');

To : ('T'|'t')('O'|'o');

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Colon : ':';

Semicolon : ';';

EqualsSign : '=';

F : ('F'|'f');

T : ('T'|'t');

LeftSquareBracket : '[';

RightSquareBracket : ']';

KW__ : '_';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

ForAll : '\u2200';

ThereExists : '\u2203';

RULE_SLANG_STRING : '"' (RULE_ESC_SEQ|~(('\\'|'"')))* '"';

RULE_MSTRING : '"""' (~('"')|'"' ~('"')|'""' ~('"'))* ('"""'|'""""'|'"""""');

RULE_MSP : RULE_IDF '"""' RULE_MSPI* ('"""'|'""""'|'"""""');

RULE_SLI : RULE_IDF '"' (RULE_ESC_SEQ|~(('\\'|'"')))* '"';

RULE_MSPB : RULE_IDF '"""' RULE_MSPI* '$';

RULE_MSPM : '$' RULE_MSPI* '$';

RULE_MSPE : '$' RULE_MSPI* ('"""'|'""""'|'"""""');

RULE_DEFOP : ':' RULE_OPSYM* '=';

RULE_IMPLIES : ('-'|'~') '>' ':';

RULE_SIMPLIES : '~' '~' '>' ':';

RULE_OP : (RULE_OPSYM+|'\\' RULE_IDF);

RULE_HEX : '0x' RULE_EXTENDED_DIGIT+ ('.' RULE_IDF)?;

RULE_BIN : '0b' ('0'|'1'|'_')+ ('.' RULE_IDF)?;

RULE_INT_IDF : RULE_INTEGER_LIT RULE_IDF;

RULE_REAL_IDF : RULE_REAL_LIT RULE_IDF;

fragment RULE_IDF : (RULE_LETTER|'_') (RULE_LETTER|RULE_DIGIT)*;

fragment RULE_MSPI : (~(('"'|'$'))|'$$'|'"' ~('"')|'""' ~('"'));

fragment RULE_LETTER : ('a'..'z'|'A'..'Z');

fragment RULE_OPSYM : ('/'|'%'|'='|'<'|'>'|'!'|'&'|'^'|'|'|'~'|'\u2200'..'\u22FF'|'\u2A00'..'\u2AFF'|'\u27C0'..'\u27EF'|'\u2980'..'\u29FF');

fragment RULE_ESC_SEQ : ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|RULE_UNICODE_ESC);

fragment RULE_UNICODE_ESC : '\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT;

RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

RULE_INTEGER_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* ('#' RULE_BASED_INTEGER '#' RULE_INT_EXPONENT?|RULE_INT_EXPONENT?);

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXTENDED_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_BASED_INTEGER : RULE_EXTENDED_DIGIT ('_'? RULE_EXTENDED_DIGIT)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
