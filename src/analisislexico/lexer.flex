package analisislexico;
import static analisislexico.Token.*;
import java_cup.runtime.Symbol;
import java.io.Reader;
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
Lexer(Reader in,TablaSimbolos t){
    this(in);
    this.tabla=t;
    }

public int linea;
%}
%%
{WHITE} {/* ignore */}
"#".* {/* ignore */}
[\'\'\'][^(\'\'\')][\'\'\'] {/*Ignore*/}
"=" {lexeme=yytext();linea=yyline; return ASIG;}
"==" {lexeme=yytext(); linea=yyline; return IGUAL;}
"<" {lexeme=yytext(); linea=yyline; return MENQ;}
">" {lexeme=yytext(); linea=yyline; return MAYQ;}
"<=" {lexeme=yytext(); linea=yyline; return MENIQ;}
">=" {lexeme=yytext(); linea=yyline; return MAYIQ;}
"!=" {lexeme=yytext(); linea=yyline; return DIF;}
"+" {lexeme=yytext(); linea=yyline; return SUM;}
"*" {lexeme=yytext(); linea=yyline; return MUL;}
"-" {lexeme=yytext(); linea=yyline; return MEN;}
"/" {lexeme=yytext(); linea=yyline; return DIV;}
"&&" {lexeme=yytext(); linea=yyline; return AND;}
"||" {lexeme=yytext(); linea=yyline; return OR;}
"!" {lexeme=yytext(); linea=yyline; return NOT;}
"(" {lexeme=yytext(); linea=yyline; return PARAB;}
"{" {lexeme=yytext(); linea=yyline; return LLAVAB;}
"}" {lexeme=yytext(); linea=yyline; return LLAVCI;}
")" {lexeme=yytext(); linea=yyline; return PARCI;}
"[" {lexeme=yytext(); linea=yyline; return CORAB;}
"]" {lexeme=yytext(); linea=yyline; return CORCI;}
"reference" {lexeme=yytext(); linea=yyline; return reference;}
"begin" {lexeme=yytext(); linea=yyline; return begin;}
"end" {lexeme=yytext(); linea=yyline; return end;}
"use" {lexeme=yytext(); linea=yyline; return use;}
"in" {lexeme=yytext(); linea=yyline; return In;}
"out" {lexeme=yytext(); linea=yyline; return Out;}
"write" {lexeme=yytext(); linea=yyline; return write;}
"read" {lexeme=yytext(); linea=yyline; return read;}
"turnOn" {lexeme=yytext(); linea=yyline; return turnOn;}
"turnOff" {lexeme=yytext(); linea=yyline; return turnOff;}
"digital" {lexeme=yytext(); linea=yyline; return digital;}
"long" {lexeme=yytext(); linea=yyline; return Long;}
"boolean" {lexeme=yytext(); linea=yyline; return Boolean;}
"temIdeal" {lexeme=yytext(); linea=yyline; return temIdeal;}
"humAmb" {lexeme=yytext(); linea=yyline; return humAmb;}
"valPh" {lexeme=yytext(); linea=yyline; return valPh;}
"valElect" {lexeme=yytext(); linea=yyline; return valElect;}
"toReturn" {lexeme=yytext(); linea=yyline; return toReturn;}
"def" {lexeme=yytext(); linea=yyline; return def;}
"if" {lexeme=yytext(); linea=yyline; return If;}
"for" {lexeme=yytext(); linea=yyline; return For;}
"int" {lexeme=yytext(); linea=yyline; return Int;}
"small" {lexeme=yytext(); linea=yyline; return small;}
"float" {lexeme=yytext(); linea=yyline; return Float;}
"analogic" {lexeme=yytext(); linea=yyline; return analogic;}
"else" {lexeme=yytext(); linea=yyline; return Else;}
"true" {lexeme=yytext(); linea=yyline; return True;}
"false" {lexeme=yytext(); linea=yyline; return False;}
"void" {lexeme=yytext(); linea=yyline; return Void;}
{L}({L}|{D})* {lexeme=yytext(); linea=yyline; 
                Simbolo s;
                if((s=tabla.buscar(lexeme))==null)
                    s=tabla.insertar(lexeme);return ID;}
[-+]?{D}+ {lexeme=yytext(); linea=yyline; return entero;}
{D}+ "." {D}+ {lexeme=yytext(); linea=yyline; return flotante;}
";" {lexeme=yytext(); linea=yyline; return ENDLN;}
"," {lexeme=yytext(); linea=yyline; return COMA;}
. {lexeme=yytext(); linea=yyline; return ERROR;}
