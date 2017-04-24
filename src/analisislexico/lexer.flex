package analisislexico;
import static analisislexico.Token.*;
%%
%class Lexer
%type Token
%line
L=[a-zA-Z_]
D=[0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
private TablaSimbolos tabla;
public Yylex(Reader in,TablaSimbolos t){
    this(in);
    this.tabla=t;
    }
public int linea;
%}
%%
{WHITE} {/* ignore */}
"#".* {/* ignore */}
[\'\'\'][^(\'\'\')][\'\'\'] {/*Ignore*/}
"=" {lexeme=yytext();linea=yyline; return OPASIG;}
"==" {lexeme=yytext(); linea=yyline; return OPREL;}
"<" {lexeme=yytext(); linea=yyline; return OPREL;}
">" {lexeme=yytext(); linea=yyline; return OPREL;}
"<=" {lexeme=yytext(); linea=yyline; return OPREL;}
">=" {lexeme=yytext(); linea=yyline; return OPREL;}
"!=" {lexeme=yytext(); linea=yyline; return OPREL;}
"+" {lexeme=yytext(); linea=yyline; return OPARIT;}
"*" {lexeme=yytext(); linea=yyline; return OPARIT;}
"-" {lexeme=yytext(); linea=yyline; return OPARIT;}
"/" {lexeme=yytext(); linea=yyline; return OPARIT;}
"&&" {lexeme=yytext(); linea=yyline; return OPLOG;}
"||" {lexeme=yytext(); linea=yyline; return OPLOG;}
"!" {lexeme=yytext(); linea=yyline; return OPLOG;}
"(" {lexeme=yytext(); linea=yyline; return OPAGR;}
"{" {lexeme=yytext(); linea=yyline; return OPAGR;}
"}" {lexeme=yytext(); linea=yyline; return OPAGR;}
")" {lexeme=yytext(); linea=yyline; return OPAGR;}
"[" {lexeme=yytext(); linea=yyline; return OPAGR;}
"]" {lexeme=yytext(); linea=yyline; return OPAGR;}
"reference" {lexeme=yytext(); linea=yyline; return PALRES;}
"begin" {lexeme=yytext(); linea=yyline; return PALRES;}
"end" {lexeme=yytext(); linea=yyline; return PALRES;}
"use" {lexeme=yytext(); linea=yyline; return PALRES;}
"in" {lexeme=yytext(); linea=yyline; return PALRES;}
"out" {lexeme=yytext(); linea=yyline; return PALRES;}
"write" {lexeme=yytext(); linea=yyline; return PALRES;}
"read" {lexeme=yytext(); linea=yyline; return PALRES;}
"turnOn" {lexeme=yytext(); linea=yyline; return PALRES;}
"turnOff" {lexeme=yytext(); linea=yyline; return PALRES;}
"digital" {lexeme=yytext(); linea=yyline; return PALRES;}
"long" {lexeme=yytext(); linea=yyline; return PALRES;}
"boolean" {lexeme=yytext(); linea=yyline; return PALRES;}
"temIdeal" {lexeme=yytext(); linea=yyline; return PALRES;}
"humAmb" {lexeme=yytext(); linea=yyline; return PALRES;}
"valPh" {lexeme=yytext(); linea=yyline; return PALRES;}
"valElect" {lexeme=yytext(); linea=yyline; return PALRES;}
"toReturn" {lexeme=yytext(); linea=yyline; return PALRES;}
"def" {lexeme=yytext(); linea=yyline; return PALRES;}
"if" {lexeme=yytext(); linea=yyline; return PALRES;}
"for" {lexeme=yytext(); linea=yyline; return PALRES;}
"int" {lexeme=yytext(); linea=yyline; return PALRES;}
"small" {lexeme=yytext(); linea=yyline; return PALRES;}
"float" {lexeme=yytext(); linea=yyline; return PALRES;}
"analogic" {lexeme=yytext(); linea=yyline; return PALRES;}
{L}({L}|{D})* {lexeme=yytext(); linea=yyline; 
                Simbolo s;
                if((s=tabla.buscar(lexeme))==null)
                    s=tabla.insertar(lexeme);return ID;}
[-+]?{D}+ {lexeme=yytext(); linea=yyline; return INT;}
";" {lexeme=yytext(); linea=yyline; return ENDLN;}
. {lexeme=yytext(); linea=yyline; return ERROR;}
