lexer grammar RuleStringLexer;

@lexer::members {
    boolean ignoreWhitespace = true;
}

WS : [ \t\r\n]+ { if(ignoreWhitespace) skip(); } ;

COMMA : ',' ;

SEMI : ';' ;

EQ : '=' ;

EQEQ : EQ EQ;

NEQ : '!=';

NLT : '!<';

NGT : '!>';

LT : '<' ;

GT : '>' ;

NUMINT : [0-9]+ ;

ADD : '+' ;

LTEQ : '<=' ;

GTEQ : '>=' ;

LPAREN : '(';

RPAREN : ')';

LSQBRACKET : '[';

RSQBRACKET : ']';

DOT : '.' ;

ID : [a-zA-Z0-9_]([a-zA-Z0-9_])*;

ATSIGN : '@' ;

ALIAS : [a-zA-Z0-9_]([a-zA-Z0-9_])*;

fragment ENFORCE_WS : { ignoreWhitespace = false; } WS { ignoreWhitespace = true; } ;
