//gramatyka Przygodzki 299214

grammar Demo;

prog: newblock ;

newblock:  ( (start|function)? NEWLINE )*;

start:var '=' expr0		    #assign
    | PRINT STRING          #printstring
	| PRINT ID   		    #print
	| READ ID   		    #read
	| ID '(' ')'         #functioncall
	|'string' ID '=' STRING #declaratestring
	| var                   #single_ID
	| 'if' '(' icmp ')'NEWLINE* '{' blockif_and_else  '}' 'else' '{' block_else '}'#if_and_else
	| 'if' '(' icmp ')'NEWLINE* '{' blockif  '}' #if
	| 'loop' repetitions '{' newblock '}'      #repeat;


function: 'def' funid NEWLINE*'{' fblock 'return' value NEWLINE* '}';

fblock: ( start? NEWLINE )*;

expr0:  expr1		    	#single0
      | expr0 ADD expr1		#add
      | expr0 SUB expr1	    #sub;

expr1:  expr2			    #single1
      | expr2 MULT expr2	#mult
      | expr2 DIV expr2	    #div;

expr2:   INT			    #int
       | REAL		    	#real
       | ID		            #id
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
       | ID '(' ')'         #functioncall_in_expr;

var: 'int' ID       #declarateint
    | 'real' ID     #declaratereal
    | ID            #just_id;

icmp: ID '==' number #is_equal
      |ID '!=' number #is_not_equal
      |ID '>' number #is_greater
      |ID '<' number #is_less;

number: INT
        | REAL;
blockif: newblock;
blockif_and_else: newblock;
block_else: newblock;

repetitions: INT
    | ID;

value: INT
        |ID;

funid: ID;

READ:	'read';

PRINT:	'print' ;

TOINT: '(int)';

TOREAL: '(real)';

ID:   ('a'..'z'|'A'..'Z')+;

ADD: '+';

MULT: '*';

SUB: '-';

DIV: '/';

REAL: '-'?'0'..'9'+'.''0'..'9'+;

INT: '-'?'0'..'9'+;

STRING: '"'[a-zA-Z0-9_ ]+'"'
        |'\''[a-zA-Z0-9_ ]+'\'';

NEWLINE:	'\r'? '\n';

COMMENT: '#'(~'\n')* -> skip;

WS:   (' '|'\t') -> skip;
