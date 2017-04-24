package analisislexico;
import static analisislexico.Token.*;
%%
%class Lexer
%type Token
L=[a-zA-Z_]
D=[0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/* ignore */}
"#".* {/* ignore */}
[\'\'\'][^(\'\'\')][\'\'\'] {/*Ignore*/}
"=" {return OPASIG;}
"==" {return OPREL;}
"<" {return OPREL;}
">" {return OPREL;}
"<=" {return OPREL;}
">=" {return OPREL;}
"!=" {return OPREL;}
"+" {return OPARIT;}
"*" {return OPARIT;}
"-" {return OPARIT;}
"/" {return OPARIT;}
"&&" {return OPLOG;}
"||" {return OPLOG;}
"!" {return OPLOG;}
"(" {return OPAGR;}
")" {return OPAGR;}
"[" {return OPAGR;}
"]" {return OPAGR;}
"reference" {return PALRES;}
"begin" {return PALRES;}
"end" {return PALRES;}
"use" {return PALRES;}
"in" {return PALRES;}
"out" {return PALRES;}
"write" {return PALRES;}
"read" {return PALRES;}
"turnOn" {return PALRES;}
"turnOff" {return PALRES;}
"digital" {return PALRES;}
"long" {return PALRES;}
"boolean" {return PALRES;}
"temIdeal" {return PALRES;}
"humAmb" {return PALRES;}
"valPh" {return PALRES;}
"valElect" {return PALRES;}
"toReturn" {return PALRES;}
"def" {return PALRES;}
"if" {return PALRES;}
"for" {return PALRES;}
"int" {return PALRES;}
"small" {return PALRES;}
"float" {return PALRES;}
"analogic" {return PALRES;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
[-+]?{D}+ {lexeme=yytext();return INT;}
";" {return ENDLN;}
. {return ERROR;}
