grammar x_query_grammar;

r : XQ ;

ap : 'document("' tag=ID '")/' rp   #apSlash 
   | 'document("' tag=ID '")//' rp  #apDeep 
   ;

rp : ID        #rpTag
   | '*'           #rpStar
   | '.'           #rpCurrent
   | '..'          #rpParent
   | 'text()'      #rpText
   | '('rp')'      #rpPlain
   | left=rp '/' right=rp       #rpNext
   | left=rp '//' right=rp      #rpDeep
   | rp'['f']'     #rpCond
   | left=rp ',' right=rp      #rpInd
   | '@'ID    #rpAttr
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
   | rp '=' Attr_Data #fVal
   ;

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

Attr_Data : [^'"][_A-Za-z0-9-."' ]* ;

ID : [^_A-Za-z][_A-Za-z0-9-]* ;

File_name : ID('.'ID)* ;

Var : '$' ID ;

WS: [\t\r\n ]+ -> skip;
