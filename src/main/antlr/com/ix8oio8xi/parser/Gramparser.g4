grammar Gramparser;

gram: gramname importblock? initblock? (terminalLine | nonTerminalLine | skipline)+;

importblock : IMPORTBLOCK ;
initblock : INITBLOCK ;

gramname        : GRAMMARKEYWORD GRAMNAME SEMICOLON ;
skipline        : SKIPKEYWORD REGEXP SEMICOLON ;
terminalLine    : TNAME RETURN REGEXP SEMICOLON ;
nonTerminalLine : NTNAME inherited synthesized RETURN rulesList SEMICOLON ;

rulesList   : rule (OR rule)* ;
rule        : (rulepart)+ ;
inherited   : INHERITED ;
synthesized : SYNTHESIZED ;
rulepart    : (NTNAME inherited) | TNAME | CODE;

SKIPKEYWORD    : 'skip';
GRAMMARKEYWORD : 'grammar';
GRAMNAME       : [A-Z] ([a-z])*;
NTNAME         : [a-z]+;
TNAME          : [A-Z]+;
TYPEVAR        : [a-zA-Z]+;
RETURN         : '~>';
REGEXP         : '"' .*? '"';
CODE           : '{' .*? '}';
LPAR           : '(';
RPAR           : ')';
LBR            : '[';
RBR            : ']';
COLON          : ':';
SEMICOLON      : ';';
COMMA          : ',';
OR             : '|';
INHERITED      : LPAR .*? RPAR;
SYNTHESIZED    : LBR .*? RBR;
IMPORTBLOCK    : '@import/#' .*? '#/';
INITBLOCK      : '@init/#' .*? '#/';

WS: [ \t\r\n]+ -> skip ;
