grammar x_path_grammar;
r : ap|rp;
ap : 'document''('File_Name')''/'rp | 'document''('File_Name')''//'rp;
rp : Tagname | '*' | '.' | '..' | 'text()' | '('rp')' | rp'/'rp | rp'//'rp | rp'['f']' | rp',' rp;
f : rp | rp '=' rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | '('f')' | f 'and' f | f 'or' f | 'not' f;
Tagname : [^_A-Za-z][_A-Za-z0-9-.]* ;
File_name : [A-Za-z]+ ;
WS: [\t\r\n]+ -> skip;

