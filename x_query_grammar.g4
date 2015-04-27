grammar x_query_grammar;

r : XQ ;

ap : 'document("' tag=Tagname '")/' rp   #apSlash 
   | 'document("' tag=Tagname '")//' rp  #apDeep 
   ;

rp : Tagname        #rpTag
   | '*'           #rpStar
   | '.'           #rpCurrent
   | '..'          #rpParent
   | 'text()'      #rpText
   | '('rp')'      #rpPlain
   | left=rp '/' right=rp       #rpNext
   | left=rp '//' right=rp      #rpDeep
   | rp'['f']'     #rpCond
   | left=rp ',' right=rp      #rpInd
   | '@'Tagname    #rpAttr
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
   | Tagname
   | ap
   | '(' XQ ')' 
   | XQ ',' XQ 
   | XQ '/' rp
   | '<' Tagname '>{' XQ '}</' Tagname '>'
   | forClause letClause whereClause returnClause
   | letClause XQ
   ;

forClause : 'for' IntermediateClause ; 

IntermediateClause : Var 'in' XQ 
		   | IntermediateClause ',' IntermediateClause
                   ; 

letClause : ('let' letIntermediateClause)? ;

letIntermediateClause : Var ':=' XQ 
                   | letIntermediateClause ',' letIntermediateClause
                   ;
			
whereClause : ('where' Cond)? ; 

returnClause : 'return' XQ ; 

Cond : XQ '=' XQ 
     | XQ 'eq' XQ
     | XQ '==' XQ 
     | XQ 'is' XQ
     | 'empty(' XQ ')'
     | someClause 
     | '(' Cond ')' 
     | Cond 'and' Cond 
     | Cond 'or' Cond 
     | 'not' Cond
     ;

someClause : 'some' IntermediateClause 'satisfies' Cond ;

Attr_Data : [^'"][_A-Za-z0-9-."' ]* ;

Tagname : [^_A-Za-z][_A-Za-z0-9-.]* ;

File_name : [A-Za-z._-]+ ;

Var : '$' Tagname ;

WS: [\t\r\n ]+ -> skip;
