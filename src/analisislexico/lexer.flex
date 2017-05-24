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
"reference" {lexeme=yytext(); linea=yyline; return reference;}
"begin" {lexeme=yytext(); linea=yyline; return begin;}
"end" {lexeme=yytext(); linea=yyline; return end;}
"use" {lexeme=yytext(); linea=yyline; return use;}
"in" {lexeme=yytext(); linea=yyline; return in;}
"out" {lexeme=yytext(); linea=yyline; return out;}
"write" {lexeme=yytext(); linea=yyline; return write;}
"read" {lexeme=yytext(); linea=yyline; return read;}
"turnOn" {lexeme=yytext(); linea=yyline; return turnOn;}
"turnOff" {lexeme=yytext(); linea=yyline; return turnOff;}
"digital" {lexeme=yytext(); linea=yyline; return digital;}
"long" {lexeme=yytext(); linea=yyline; return long;}
"boolean" {lexeme=yytext(); linea=yyline; return boolean;}
"temIdeal" {lexeme=yytext(); linea=yyline; return teamIdeal;}
"humAmb" {lexeme=yytext(); linea=yyline; return humAmb;}
"valPh" {lexeme=yytext(); linea=yyline; return valPh;}
"valElect" {lexeme=yytext(); linea=yyline; return valElect;}
"toReturn" {lexeme=yytext(); linea=yyline; return toReturn;}
"def" {lexeme=yytext(); linea=yyline; return def;}
"if" {lexeme=yytext(); linea=yyline; return if;}
"for" {lexeme=yytext(); linea=yyline; return for;}
"int" {lexeme=yytext(); linea=yyline; return int;}
"small" {lexeme=yytext(); linea=yyline; return small;}
"float" {lexeme=yytext(); linea=yyline; return float;}
"analogic" {lexeme=yytext(); linea=yyline; return analogic;}
{L}({L}|{D})* {lexeme=yytext(); linea=yyline; 
                Simbolo s;
                if((s=tabla.buscar(lexeme))==null)
                    s=tabla.insertar(lexeme);return ID;}
[-+]?{D}+ {lexeme=yytext(); linea=yyline; return INT;}
";" {lexeme=yytext(); linea=yyline; return ENDLN;}
. {lexeme=yytext(); linea=yyline; return ERROR;}
