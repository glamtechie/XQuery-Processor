grammar x_path_grammar;
r : ap|rp;
ap : 'document("' tag=Tagname '")/' rp  #apSlash
    | 'document("' tag=Tagname '")//' rp    #apDeep
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
Attr_Data : [^'"][_A-Za-z0-9-."' ]* ;
Tagname : [^_A-Za-z][_A-Za-z0-9-.]* ;
File_name : [A-Za-z._-]+ ;
WS: [\t\r\n ]+ -> skip;
