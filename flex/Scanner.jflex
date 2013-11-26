import node.Constants;
import java_cup.runtime.Symbol;

%%

%class Lexer
%cup
%implements sym, Constants
%line
%column

%{

  private Symbol symbol(int sym) {
    return new Symbol(sym, yyline+1, yycolumn+1);
  }
  
  private Symbol symbol(int sym, Object val) {
    return new Symbol(sym, yyline+1, yycolumn+1, val);
  }
  
  private void error(String message) {
    System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
  }
%} 

Keyword = ("class" | "interface" | "enum" | "final" | "abstract" |
 "extends" | "implements" | "throws" | "switch" | "case" | "default" 
 |"else" |"for" | "this" | "new" )

keywordBreak = "break"
keywordIf = "if"
keywordWhile = "while"
BTRUE = "true"
BFALSE = "false"
Integer = [0-9]+
Real = [0-9]+\.[0-9]+
ReturnKeyword = "return"
KeywordClass = "class"
StringLiteral = ("\"" [^"\""]* "\"")
ExpressionOperators = ("-"|"*"|"/")
UnaryOperators = ("++"|"--")
LogicalOperators = ("&&"|"||"|"&="|"^="|"|="|"<<="|">>="|">>>=")
AssignmentOperators = ("="|"+="|"-="|"*="|"/="|"%=")
QualifiedName = [:jletter:][:jletterdigit:]*("\."[:jletter:][:jletterdigit:]*)+
CompareOperators = (([">"|"<"|"="|"!"]"=")|">"|"<")
Ident = [:jletter:][:jletterdigit:]*
Access = "public"|"private"
Print = "System.out.println"
Type = ("String" | "boolean" | "int" | "char" | "long" | "float" | "double" | "void")
VectType = ("String[]" | "boolean[]" | "int[]" | "char[]" | "long[]" | "float[]" | "double[]" | "void[]")
new_line = \r|\n|\r\n;
white_space = {new_line} | [ \t\f]
code_literal = \$.*\$

%%

"!" {return symbol( NEG,yytext());}
"{" {return symbol( LCOL,yytext());}
"}" {return symbol( RCOL,yytext());}
"(" {return symbol( LPAR,yytext());}
")" {return symbol( RPAR,yytext());}
"[" {return symbol( LKEY,yytext());}
"]" {return symbol( RKEY,yytext());}
";" {return symbol( DELIM,yytext());}
"," {return symbol( COMMA,yytext());}
"+" {return symbol( PLUSSIGN,yytext());}
{ReturnKeyword} { return symbol(RETURN_KEYWORD,yytext());}
{keywordBreak} { return symbol(BREAK_KEYWORD,yytext());}
{VectType}  { return symbol(VECT_TYPE,yytext());}
"static" {return symbol( STATIC_KEYWORD,yytext());}
"import" {return symbol( IMPORT_KEYWORD,yytext());}
{code_literal} {return symbol(CODE_LITERAL, yytext());}
{Print} {return symbol(PRINT, yytext());}
{BTRUE} {return symbol( BOL_TRUE,yytext());}
{BFALSE} {return symbol( BOL_FALSE,yytext());}
{keywordIf} {return symbol( KEYWORD_IF,yytext());}
{keywordWhile} {return symbol( KEYWORD_WHILE,yytext());}
{Integer} {return symbol( INT_NUMBER,yytext());}
{Real} {return symbol( REAL_NUMBER,yytext());}
{KeywordClass} {return symbol( KEYWORD_CLASS,yytext());}
{Keyword } {return symbol( KEYWORD,yytext());}
{LogicalOperators} {return symbol( LOG_OP,yytext());}
{UnaryOperators} {return symbol( UN_OP,yytext());}
{ExpressionOperators} {return symbol( EXP_OP,yytext());}
{CompareOperators} {return symbol( COMP_OP,yytext());}
{AssignmentOperators} {return symbol( ASS_OP,yytext());}
{StringLiteral} { return symbol( STRING_LITERAL,yytext());}
{Type}  { return symbol(TYPE,yytext()); }
{Access} { return symbol(ACCESS,yytext());}
{QualifiedName} {return symbol(QUALIFIED,yytext());}
{Ident}           {return symbol(IDENT, yytext());}


{white_space}     {}

/* error fallback */
.|\n              {  /* throw new Error("Illegal character <"+ yytext()+">");*/
        error("Illegal character <"+ yytext()+">");
                  }