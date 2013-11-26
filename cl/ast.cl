package node;

Prog ::= CompilationUnit 

CompilationUnit ::=  ClassDeclaration
                |     ImportList ClassDeclaration

ClassDeclaration ::= "String":pub "String":cla "String":nome "String":lcol ClassStatements "String":rcol

ImportList ::=  ImportStatement
            |   ImportStatement ImportList 

ImportStatement ::= "String":importKeyword "String":qualifiedName "String":ptvirgula


Field_var_dec ::= "String":mod "String":tipo "String":nome "String":ptvirgula

Field_var_declarations ::= Field_var_dec
                         | Field_var_dec Field_var_declarations

Expression ::= NumericExpression
            |  LogicalExpression

NumericExpression ::= "String":nome NumericExpression
                    | "String":nome
                    | NumericExpression "String":operador NumericExpression
                    | MethodCall

LogicalExpression ::= "String":nome
                    | NumericExpression "String":operador NumericExpression
                    | LogicalExpression "String":operador LogicalExpression
                    | MethodCall

PrintStatement ::= "String":comando "String":lpar StringExpression "String":rpar "String":ptvirgula

StringExpression ::= StringExpression "String":mais StringExpression
                  | "String":literal
                  | MethodCall
                  
Statements ::= Statement Statements
            | Statement

Statement ::= Expression "String":ptvirgula
          | VarDefinition "String":ptvirgula
          | IfStatement
          | WhileStatement
          | PrintStatement
          | CodeLiteralStatement
          | BreakStatement
          | ReturnStatement
          | MethodCall "String":ptvirgula

BreakStatement ::= "String":breakKeyword "String":ptvirgula

MethodCall ::= "String":name "String":lpar ParamCallList "String":rpar

ParamCallList ::= ParamCall "String":comma ParamCallList
              |   ParamCall

ParamCall ::= "String":name

ReturnStatement ::= "String":returnKeyword Expression "String":ptvirgula
                |   "String":returnKeyword StringExpression "String":ptvirgula

CodeLiteralStatement ::= "String":lit

IfStatement ::= "String":ifKeyword "String":lpar LogicalExpression "String":rpar  "String":lcha Statements "String":rcha

WhileStatement ::= "String":whileKeyword "String":lpar LogicalExpression "String":rpar  "String":lcha Statements "String":rcha  

Parametro ::= "String":tipo "String":nome

ListParam ::= Parametro "String":virgula ListParam
          | Parametro

IdentList ::= "String":nome "String":virgula IdentList
            | "String":nome

VarDefinition ::= "String":nome IdentList

DeclaracaoMetodo ::= "String":mod "String":tipo "String":nome "String":lpar ListParam "String":rpar "String":lcha Statements "String":rcha
                  |  "String":mod "String":staticKeyword "String":tipo "String":nome "String":lpar ListParam "String":rpar "String":lcha Statements "String":rcha

ClassStatement ::= Field_var_dec
                | DeclaracaoMetodo

ClassStatements ::= ClassStatement ClassStatements
                | ClassStatement
