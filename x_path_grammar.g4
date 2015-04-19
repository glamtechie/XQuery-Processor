grammar x_path_grammar;
r : ap|rp|f;
ap : 'document''('FileNam')''/'rp | 'document''('FileNam')''//'rp;
rp : Tagname | '*' | '.' | '..' | 'text()' | '('rp')' | rp'/'rp | rp'//'rp | rp'['f']' | rp',' rp;
f : rp | rp '=' rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | '('f')' | f 'and' f | f 'or' f | 'not' f;
Tagname : [a-z]+ ;
Filenam :[a-z]+ ;
WS: [\t\r\n]+ -> skip;

