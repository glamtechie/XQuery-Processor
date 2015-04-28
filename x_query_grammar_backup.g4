grammar x_query_grammar_backup;
t : XQ ;
XQ : Var
   | ID
   | ap
   | '(' XQ ')' 
   | XQ ',' XQ 
   | XQ '/' rp
   | '<' ID '>{' XQ '}</' ID '>'
   | forClause (letClause)? (whereClause)? returnClause
   | letClause XQ
   ;
forClause : 'for' Var 'in' XQ (',' Var 'in' XQ)* ;
letClause : 'let' Var ':=' XQ (',' Var ':=' XQ)* ;
whereClause : 'where' Cond ; 
returnClause : 'return' XQ ; 
Cond : XQ '=' XQ 
     | XQ 'eq' XQ
     | XQ '==' XQ 
     | XQ 'is' XQ
     | 'empty(' XQ ')'
     | 'some' Var 'in' XQ (',' Var 'in' XQ)* 'satisfies' Cond 
     | '(' Cond ')' 
     | Cond 'and' Cond 
     | Cond 'or' Cond 
     | 'not' Cond
     ;
ID : [^_A-Za-z][_A-Za-z0-9-]* ;
Var : '$' ID ;
