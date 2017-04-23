package analisislexico; 
import static analisislexico.Token.*;
%%
%class Lexer
%type Token
Letra=[a-zA-Z]
Digito=[0-9]
ID = [a-z][a-z0-9]*
Nentero = (+|-|){DIGITO}*
cadena = {Letra}*{Letra|Digito}*
Nfloat = (+|-|){DIGITO}*|(+|-|){DIGITO}*+"."+{Digito}
Espacio = " "
terminadorLinea = ";"
espacioBlanco = {terminadorLinea} | [ \t\f]
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
"+"|"-"|"/"|"*"{return ARITMETICOS}
"&&"|"||"|"!"{return LOGICOS}

//reglas
{Nentero} {
 Token t = new Token(yytext(), "Entero");
 this._existenTokens = true;
 return t;
}

{Espacio} {
 // Ignorar cuando se ingrese un espacio
}
