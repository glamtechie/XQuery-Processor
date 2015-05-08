grammar x_path_grammar;

r : xq ;

ap : 'document("' tag=file_name '")/' rp   #apSlash 
   | 'document("' tag=file_name '")//' rp  #apDeep 
   ;

rp : Id        #rpTag
   | '*'           #rpStar
   | '.'           #rpCurrent
   | '..'          #rpParent
   | 'text()'      #rpText
   | '('rp')'      #rpPlain
   | left=rp '/' right=rp       #rpNext
   | left=rp '//' right=rp      #rpDeep
   | rp'['f']'     #rpCond
   | left=rp ',' right=rp      #rpInd
   | '@'Id    #rpAttr
   ;

f : rp              #fRp
   | left=rp '=' right=rp     #fEq
   | left=rp 'eq' right=rp    #fEq
   | left=rp '==' right=rp    #fIs
   | left=rp 'is' right=rp    #fIs
   | '('f')'       #fInd
   | left=f 'and' right=f     #fAnd
   | left=f 'or' right=f      #fOr
   | 'not' f       #fNot
   ;

xq : var
   | String_constant
   | ap
   | '(' xq ')' 
   | xq ',' xq 
   | xq '/' rp
   | '<' Id '>{' xq '}</' Id '>'
   | forClause (letClause)? (whereClause)? returnClause
   | letClause xq
   ;

forClause : 'for' var 'in' xq (',' var 'in' xq)* ;

letClause : 'let' var ':=' xq (',' var ':=' xq)* ;

whereClause : 'where' cond ; 

returnClause : 'return' xq ; 

cond : xq '=' xq 
     | xq 'eq' xq
     | xq '==' xq 
     | xq 'is' xq
     | 'empty(' xq ')'
     | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond 
     | '(' cond ')' 
     | cond 'and' cond 
     | cond 'or' cond 
     | 'not' cond
     ;

Id : [^_A-Za-z][_A-Za-z0-9-]* ;

var : '$' Id ;

file_name : Id('.'Id)* ; 

String_constant : [^"][_A-Za-z0-9-." ]* ; 

Ws: [\t\r\n ]+ -> skip;
