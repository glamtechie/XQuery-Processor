grammar x_path_grammar;
r : ap|rp;
ap : 'doc''('File_Name')''/'rp | 'doc''('File_Name')''//'rp;
rp : Tagname | '*' | '.' | '..' | 'text()' | '('rp')' | rp'/'rp | rp'//'rp | rp'['f']' | rp',' rp | '@'Tagname;
f : rp | rp '=' rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | '('f')' | f 'and' f | f 'or' f | 'not' f;
Tagname : [^_A-Za-z'"][_A-Za-z0-9-."']* ;
File_name : [A-Za-z._-]+ ;
WS: [\t\r\n]+ -> skip;

