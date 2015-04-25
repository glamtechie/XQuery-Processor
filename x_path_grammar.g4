grammar x_path_grammar;
r : ap|rp;
ap : 'doc''('File_name')''/'rp  #apSlash
    | 'doc''('File_name')''//'rp    #apDeep
    ;
rp : Tagname        #rpTag
    | '*'           #rpStar
    | '.'           #rpCurrent
    | '..'          #rpParent
    | 'text()'      #rpTest
    | '('rp')'      #rpPlain
    | rp'/'rp       #rpNext
    | rp'//'rp      #rpDeep
    | rp'['f']'     #rpCond
    | rp',' rp      #rpInd
    | '@'Tagname    #rpAttr
    ;
f : rp              #fRp
    | rp '=' rp     #fEq
    | rp 'eq' rp    #fEq
    | rp '==' rp    #fIs
    | rp 'is' rp    #fIs
    | '('f')'       #fInd
    | f 'and' f     #fAnd
    | f 'or' f      #fOr
    | 'not' f       #fNot
    | rp '=' Attr_Data #fVal
    ;
Attr_Data : [^'"][_A-Za-z0-9-."' ]* ;
Tagname : [^_A-Za-z'"][_A-Za-z0-9-."' ]* ;
File_name : [A-Za-z._-]+ ;
WS: [\t\r\n ]+ -> skip;

