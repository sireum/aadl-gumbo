
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

Computational_model : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')'_'('M'|'m')('O'|'o')('D'|'d')('E'|'e')('L'|'l');

Hyperperiod : ('H'|'h')('Y'|'y')('P'|'p')('E'|'e')('R'|'r')('P'|'p')('E'|'e')('R'|'r')('I'|'i')('O'|'o')('D'|'d');

Classifier : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('R'|'r');

Contracts : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('R'|'r')('A'|'a')('C'|'c')('T'|'t')('S'|'s');

Guarantee : ('G'|'g')('U'|'u')('A'|'a')('R'|'r')('A'|'a')('N'|'n')('T'|'t')('E'|'e')('E'|'e');

Reference : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

Constant : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

Periodic : ('P'|'p')('E'|'e')('R'|'r')('I'|'i')('O'|'o')('D'|'d')('I'|'i')('C'|'c');

TracesTo : ('T'|'t')('R'|'r')('A'|'a')('C'|'c')('E'|'e')('S'|'s')('T'|'t')('O'|'o');

Andthen : ('A'|'a')('N'|'n')('D'|'d')('T'|'t')('H'|'h')('E'|'e')('N'|'n');

Applies : ('A'|'a')('P'|'p')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

Binding : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

Compute : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

Implies : ('I'|'i')('M'|'m')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

Library : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

Fun : '-'('F'|'f')('U'|'u')('N'|'n')'-''>';

Assume : ('A'|'a')('S'|'s')('S'|'s')('U'|'u')('M'|'m')('E'|'e');

Orelse : ('O'|'o')('R'|'r')('E'|'e')('L'|'l')('S'|'s')('E'|'e');

Delta : ('D'|'d')('E'|'e')('L'|'l')('T'|'t')('A'|'a');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Flows : ('F'|'f')('L'|'l')('O'|'o')('W'|'w')('S'|'s');

Gumbo : ('G'|'g')('U'|'u')('M'|'m')('B'|'b')('O'|'o');

Modes : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('S'|'s');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

With : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

PlusSignEqualsSignGreaterThanSign : '+''=''>';

And : ('A'|'a')('N'|'n')('D'|'d');

For : ('F'|'f')('O'|'o')('R'|'r');

Not : ('N'|'n')('O'|'o')('T'|'t');

FullStopFullStop : '.''.';

ColonColon : ':'':';

LessThanSignEqualsSign : '<''=';

LessThanSignGreaterThanSign : '<''>';

EqualsSignGreaterThanSign : '=''>';

GreaterThanSignEqualsSign : '>''=';

In : ('I'|'i')('N'|'n');

Or : ('O'|'o')('R'|'r');

To : ('T'|'t')('O'|'o');

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

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
