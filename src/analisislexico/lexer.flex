package analsislexico; 
import static analisislexico.Token.*;
%%
%class Lexer
%type Token
L=[a-zA-Z]
D=[0-9]
WHITE=[\t\n\r]
%
public string lexema;
%%
WHITE{/*Ignore*/}
"#"´´´"{/*Ignore*/}
"="{return ASIGNAR;}
"=="|"<="|">="|"<"|">"|"!="{return RELACIONAR}
reference|begin|end|use|in|out|write|read|turnOn|turnOff|digital|long|boolean|analogic{return PAL_RES}
temIdeal|humAmb|valPh|valElect|toReturn|def|if|for|int|small|float{return PAL_RES}
L+({L}|{D})*{lexema=yytext();return ID}
"+"|"-"|"/"|"*"{return RELACIONAR}
"&&"|"||"|"!"{return LOGICOS}