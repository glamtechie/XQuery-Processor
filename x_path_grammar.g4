grammar x_path_grammar;

r : xq ;

ap : 'document' '("' tag=Id '")' '/' rp   #apSlash
   | 'document' '("' tag=Id '")' '//' rp  #apDeep
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

xq : var    #xVar
   | String_constant    #xStr
   | ap     #xAp
   | '(' xq ')'     #xPlain
   | left=xq ',' right=xq      #xInd
   | xq '/' rp      #xSlash
   | xq '//' rp   #xDeep
   | '<' lt=Id '>' '{' xq '}' '</' rt=Id '>'    #xNode
   | forClause (letClause)? (whereClause)? returnClause #xState
   | letClause xq   #xLet
   ;

forClause : 'for' var 'in' xq (',' var 'in' xq)* ;

letClause : 'let' var ':=' xq (',' var ':=' xq)* ;

whereClause : 'where' cond ;

returnClause : 'return' xq ;

cond : left=xq '=' right=xq              #condEq
     | left=xq 'eq' right=xq             #condEq
     | left=xq '==' right=xq             #condIs
     | left=xq 'is' right=xq             #condIs
     | 'empty''(' xq ')'      #condEmp
     | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond  #condSome
     | '(' cond ')'           #condPlain
     | left=cond 'and' right=cond        #condAnd
     | left=cond 'or' right=cond         #condOr
     | 'not' cond                        #condNot
     ;

Id : [^_A-Za-z][_A-Za-z0-9-.]* ;

var : '$' Id;

String_constant : [^"][_A-Za-z0-9-.!, ]*["$] ;

Ws: [\t\r\n ]+ -> skip;
