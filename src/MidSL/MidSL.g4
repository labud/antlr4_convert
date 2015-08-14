grammar MidSL;

test:
    IDENTIFIER;
prog:
    preprocessor*
    (sample_declaration SEMICOLON)*
    (texture_declaration SEMICOLON)*
    (struct_declaration SEMICOLON)*
    (cbuffer_declaration SEMICOLON)?
    (inbuffer_declaration SEMICOLON)?
    (outbuffer_declaration SEMICOLON)?
    (inoutbuffer_declaration SEMICOLON)?
    statement_list
    ;

//宏定义
preprocessor
    :   SHARP version_pre
    ;

version_pre
    : 'version' integer VERSOIN_PROFILE?
    ;

VERSOIN_PROFILE
    :   'core'
    |   'compatibility'
    |   'es'
    ;

//类型修饰语
type_qualifier
    :   (storage_qualifier
    |   type_modifier
    )+
    ;

storage_qualifier
    :   'static'
    |   'uniform'
    |   'extern'
    |   'volatile'
    |   'shared'
    |   'groupshared'
    |   'nointerpolation'
    |   'precise'
    ;

type_modifier
    :   'const'
    |   'row_major'
    |   'column_major'
    ;

//元数据
integer: DECIMAL |  OCTAL | HEX ;

float_num: FLOAT_NUM;

bool_num : 'true' | 'false';

//元数据类型
type_specifier: type_specifier_nonarray array_specifier*;

type_specifier_nonarray
    :   basic_type
    |   IDENTIFIER
    ;

array_specifier :   LEFT_BRACKET expression? RIGHT_BRACKET;
struct_specifier:   DOT (IDENTIFIER array_specifier* | function_call);

basic_type
    :   void_type
    |   scala_type
    |   vector_type
    |   matrix_type
    ;

void_type : 'void';

scala_type: SCALA;

vector_type: VECTOR;

matrix_type: MATRIX;

/*opaque_type
    :   float_opaque_type
    |   int_opaque_type
    |   u_int_opaque_type
    ;

float_opaque_type:  FLOAT_OPAQUE;
int_opaque_type: INT_OPAQUE;
u_int_opaque_type: U_INT_OPAQUE;*/


//表达式

expression
    :   primary_expression
    |   expression INCREAMENT_OP
    |   INCREAMENT_OP expression
    |   ADDDIV_OP expression
    |   UNARY_OP expression
    |   expression MULDIV_OP expression
    |   expression ADDDIV_OP expression
    |   expression SHIFT_OP expression
    |   expression COMPARE_OP expression
    |   expression EQUAL_OP expression
    |   expression BITWISE_OP expression
    |   expression LOGIC_OP expression
    |   expression QUESTION expression COLON expression
    ;

primary_expression
    :   constant_expression
    |   basic_type LEFT_PAREN (expression  (COMMA expression)*)? RIGHT_PAREN
    |   LEFT_PAREN type_specifier RIGHT_PAREN expression
    |   left_value  array_struct_selection?
    ;

constant_expression
    :   integer
    |   float_num
    |   bool_num
    ;

left_value: function_call |   LEFT_PAREN expression RIGHT_PAREN | IDENTIFIER;

array_struct_selection: (array_specifier | struct_specifier)+;

assignment_expression: ASSIGNMENT_OP expression;

arithmetic_assignment_expression: ARITHMETIC_ASSIGNMENT_OP expression;

//函数
function_definition
    : return_Type function_name
        LEFT_PAREN (func_decl_member  (COMMA func_decl_member)* )? RIGHT_PAREN  LEFT_BRACE
            statement_list
        RIGHT_BRACE
    ;

function_declaration: return_Type function_name LEFT_PAREN (func_decl_member  (COMMA func_decl_member)* )?RIGHT_PAREN;

function_call: (array_struct_selection)? function_name LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN;

return_Type: type_specifier;

function_name: FUNC_KEYWORD | IDENTIFIER;

func_decl_member: type_specifier IDENTIFIER;

//语句(块)
statement_list: statement*;

statement
    : simple_statement
    | compoud_statement
    ;

simple_statement
    :   function_definition_statement
    |   basic_statement SEMICOLON
    |   selection_statement
    |   switch_statement
    |   case_label
    |   iteration_statement
    |   jump_statement
    ;

compoud_statement:  LEFT_BRACE statement_list RIGHT_BRACE;

basic_statement
    :   declaration_statement
    |   assignment_statement
    |   expression_statement
    ;

//声明语句(含初始化)
declaration_statement
    :   struct_declaration
    |   simple_declaration
    |   function_declaration
    ;

simple_declaration: type_qualifier? type_specifier  simple_declarator (COMMA simple_declarator)*;
simple_declarator: left_value array_specifier* (COLON semantics)? (assignment_expression)?;
semantics: IDENTIFIER;

sample_declaration: SMPBUFFER type_qualifier? LEFT_PAREN IDENTIFIER '|' IDENTIFIER RIGHT_PAREN IDENTIFIER array_specifier*;
texture_declaration: TXBUFFER type_qualifier? LEFT_PAREN IDENTIFIER '|' IDENTIFIER RIGHT_PAREN IDENTIFIER array_specifier*;

struct_declaration: STRUCT IDENTIFIER LEFT_BRACE (simple_declaration SEMICOLON)+ RIGHT_BRACE;
cbuffer_declaration: CBUFFER IDENTIFIER LEFT_BRACE (simple_declaration SEMICOLON)+ RIGHT_BRACE;
inbuffer_declaration: INBUFFER IDENTIFIER LEFT_BRACE (simple_declaration SEMICOLON)+ RIGHT_BRACE;
outbuffer_declaration: OUTBUFFER IDENTIFIER LEFT_BRACE (simple_declaration SEMICOLON)+ RIGHT_BRACE;
inoutbuffer_declaration: INOUTBUFFER IDENTIFIER LEFT_BRACE (simple_declaration SEMICOLON)+ RIGHT_BRACE;

assignment_statement: left_value array_struct_selection? (assignment_expression | arithmetic_assignment_expression);

expression_statement: expression;


//函数定义语句
function_definition_statement: function_definition;

//条件选择语句
selection_statement:  IF LEFT_PAREN expression RIGHT_PAREN selection_rest_statement;
selection_rest_statement: statement (ELSE statement)? ;

//switch语句
switch_statement: SWITCH LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE statement_list RIGHT_BRACE;

case_label
    : CASE expression COLON
    | DEFUALT COLON
    ;

//循环语句
iteration_statement
    :   WHILE LEFT_PAREN expression RIGHT_PAREN statement
    |   DO statement WHILE LEFT_PAREN expression RIGHT_PAREN SEMICOLON
    |   FOR LEFT_PAREN for_init_statement for_cond_statement for_rest_statement RIGHT_PAREN
    ;

for_init_statement
    :   (basic_statement (',' basic_statement)*)? SEMICOLON
    ;

for_cond_statement: expression SEMICOLON;

for_rest_statement: (basic_statement (',' basic_statement)*)? ;

//跳转语句
jump_statement
    :   CONTINUE SEMICOLON
    |   BREAK SEMICOLON
    |   RETURN SEMICOLON
    |   RETURN expression SEMICOLON
    ;

/**
 *词法
 */

SMPBUFFER: 'samplebuffer';
TXBUFFER: 'texturebuffer';
STRUCT: 'struct';
CBUFFER: 'cbuffer';
INBUFFER: 'inbuffer';
OUTBUFFER: 'outbuffer';
INOUTBUFFER: 'inoutbuffer';

IF: 'if';
ELSE: 'else';
QUESTION: '?';

FOR: 'for';
DO: 'do';
WHILE: 'while';


CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

SWITCH: 'switch';
CASE: 'case';
DEFUALT: 'defualt';

LEFT_PAREN: '(';
RIGHT_PAREN: ')';

LEFT_BRACE: '{';
RIGHT_BRACE: '}';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

DOT: '.';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
SHARP: '#';


//保留函数
FUNC_KEYWORD
    :   'MATMUL'
    ;

//元数据
DECIMAL:   DIGIT+ INTEGER_SUFFIX?;
OCTAL: '\\' OCTAL_DIGIT* INTEGER_SUFFIX?;
HEX:  '\\x' HEX_DIGIT+ INTEGER_SUFFIX?;

FLOAT_NUM
    :   DIGIT+ DOT DIGIT* EXPONENT? FLOAT_SUFFIX?
    |   DOT DIGIT+ EXPONENT? FLOAT_SUFFIX?
    |   DIGIT+ EXPONENT FLOAT_SUFFIX?
    ;

//元数据类型
SCALA
    :   'bool'
    |   'int'
    |   'float'
    |   'double'
    ;

VECTOR
    :   SCALA[2-4]
    |   'vector'
    ;

MATRIX
    :   SCALA[2-4]'x'[2-4]?
    |   'matrix'
    ;

/*FLOAT_OPAQUE: BASIC_OPAQUE_TYPE |
    ( 'sampler1DShadow' | 'sampler2DShadow' | 'sampler2DRectShadow'
    | 'sampler1DArrayShadow' | 'sampler2DArrayShadow' |
      'samplerCubeShadow' | 'samplerCubeArrayShadow');

INT_OPAQUE: 'i'BASIC_OPAQUE_TYPE;

U_INT_OPAQUE: 'u'BASIC_OPAQUE_TYPE | 'atomic_uint';

BASIC_OPAQUE_TYPE:  ('sampler' | 'image')
    ('1D'|'2D'|'3D'|'Cube'|'2DRect'|'1DArray'|'2DArray'|'Buffer'|'2DMS'|'2DMSArray'|'CubeArray');*/

//表达式
INCREAMENT_OP : '++' | '--';

UNARY_OP :  '~' | '!';

MULDIV_OP : '*' | '/' | '%';

ADDDIV_OP : '+' | '-';

SHIFT_OP : '<<' | '>>' ;

COMPARE_OP : '<' | '>' | '<=' | '>=';

EQUAL_OP:   '==' | '!=';

BITWISE_OP: '&' | '^' | '|';

LOGIC_OP:   '&&'| '^^' | '||';

ASSIGNMENT_OP: '=';

ARITHMETIC_ASSIGNMENT_OP
    :   MULDIV_OP ASSIGNMENT_OP
    |   ADDDIV_OP ASSIGNMENT_OP
    |   SHIFT_OP ASSIGNMENT_OP
    |   BITWISE_OP ASSIGNMENT_OP
    ;

/**
 *辅助词法
 */

fragment
DIGIT:  [0-9];

fragment
HEX_DIGIT : [0-9]| [a-f] | [A-F] ;

fragment
OCTAL_DIGIT : [0-7];

fragment
INTEGER_SUFFIX: 'u' | 'U';

fragment
EXPONENT : ('e'|'E') ADDDIV_OP? ('0'..'9')+ ;

fragment
FLOAT_SUFFIX: 'f' | 'F' ;


fragment
LETTER
    :   [a-z]
    |   [A-Z]
    |   '_'
    ;

IDENTIFIER
    :   LETTER (LETTER|DIGIT)*
    ;


//注释
COMMENT
    :   '/*' .*? '*/'    -> channel(HIDDEN) // match anything between /* and */
    ;
WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
    ;