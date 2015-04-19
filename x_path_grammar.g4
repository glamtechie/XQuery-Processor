grammar x_path;
ap : 'document''('fileName')''/'rp | 'document''('fileName')''//'rp
rp : tagname | '*' | '.' | '..' | 'text()' | '('rp')' | rp1'/'rp2 | rp1'//'rp2 | rp'['f']' | rp1',' rp2
f : rp | rp '=' rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | '('f')' | f 'and' f | f 'or' f | 'not' f
tagname : [a-z]+ ;  
filename :[a-z]+ ;  


