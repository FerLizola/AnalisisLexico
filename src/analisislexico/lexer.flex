package analisislexico; 
import static analisislexico.Token1.*;
%%
%class Lexer
%type Token
%line
L=[a-zA-Z]
D=[0-9]
Nentero = ("+"|"-"|""){D}*
Nfloat = ("+"|"-"|""){D}*|("+"|"-"|""){D}*"."{D}*
terminadorLinea= ";"
espacioBlanco = {terminadorLinea} | [ \t\f]
WHITE=[\t\n\r]
%{public string lexema;%}
%%
WHITE{/*Ignore*/}
"#"[^\n]*{/*Ignore*/}
"'''"[^"'''"]{/*Ignore*/}
"="{return ASIGNAR;}
"=="|"<="|">="|"<"|">"|"!="{return RELACIONAR}
reference|begin|end|use|in|out|write|read|turnOn|turnOff|digital|long|boolean|analogic{return PAL_RES}
temIdeal|humAmb|valPh|valElect|toReturn|def|if|for|int|small|float{return PAL_RES}
L+({L}|{D})*{lexema=yytext();return ID}
"+"|"-"|"/"|"*"{return ARITMETICOS}
"&&"|"||"|"!"{return LOGICOS}
"("|")"|"["|"]"{return AGRUPACION}
Nentero{lexema=yytex();return INT}

";"{return ENDL;}
