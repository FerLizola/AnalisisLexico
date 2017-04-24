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
"=" {lexeme=yytext(); return OPASIG;}
"==" {lexeme=yytext(); return OPREL;}
"<" {lexeme=yytext(); return OPREL;}
">" {lexeme=yytext(); return OPREL;}
"<=" {lexeme=yytext(); return OPREL;}
">=" {lexeme=yytext(); return OPREL;}
"!=" {lexeme=yytext(); return OPREL;}
"+" {lexeme=yytext(); return OPARIT;}
"*" {lexeme=yytext(); return OPARIT;}
"-" {lexeme=yytext(); return OPARIT;}
"/" {lexeme=yytext(); return OPARIT;}
"&&" {lexeme=yytext(); return OPLOG;}
"||" {lexeme=yytext(); return OPLOG;}
"!" {lexeme=yytext(); return OPLOG;}
"(" {lexeme=yytext(); return OPAGR;}
")" {lexeme=yytext(); return OPAGR;}
"[" {lexeme=yytext(); return OPAGR;}
"]" {lexeme=yytext(); return OPAGR;}
"reference" {lexeme=yytext(); return PALRES;}
"begin" {lexeme=yytext(); return PALRES;}
"end" {lexeme=yytext(); return PALRES;}
"use" {lexeme=yytext(); return PALRES;}
"in" {lexeme=yytext(); return PALRES;}
"out" {lexeme=yytext(); return PALRES;}
"write" {lexeme=yytext(); return PALRES;}
"read" {lexeme=yytext(); return PALRES;}
"turnOn" {lexeme=yytext(); return PALRES;}
"turnOff" {lexeme=yytext(); return PALRES;}
"digital" {lexeme=yytext(); return PALRES;}
"long" {lexeme=yytext(); return PALRES;}
"boolean" {lexeme=yytext(); return PALRES;}
"temIdeal" {lexeme=yytext(); return PALRES;}
"humAmb" {lexeme=yytext(); return PALRES;}
"valPh" {lexeme=yytext(); return PALRES;}
"valElect" {lexeme=yytext(); return PALRES;}
"toReturn" {lexeme=yytext(); return PALRES;}
"def" {lexeme=yytext(); return PALRES;}
"if" {lexeme=yytext(); return PALRES;}
"for" {lexeme=yytext(); return PALRES;}
"int" {lexeme=yytext(); return PALRES;}
"small" {lexeme=yytext(); return PALRES;}
"float" {lexeme=yytext(); return PALRES;}
"analogic" {lexeme=yytext(); return PALRES;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
[-+]?{D}+ {lexeme=yytext();return INT;}
";" {lexeme=yytext(); return ENDLN;}
. {lexeme=yytext(); return ERROR;}
