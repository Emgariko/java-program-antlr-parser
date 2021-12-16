grammar JavaProgram;

// PARSER

//variables (just declaration and declaration + definition)
//method_call + constructor
//for, while
// new ?


// :TODO: return key-word

program returns[String str] @init{$str = "";}:
    java_package
    {$str += $java_package.str + "<br>\n";}
    (java_imports {$str += $java_imports.str;})*
    class_definition {$str += "<br>\n" + $class_definition.str;};

java_package returns[String str] @init{$str = "";}:
    JAVA_PACKAGE
    {$str += "<span style=\"color: blue\">" + $JAVA_PACKAGE.text + "</span>";}
    x=WORD {$str += " " + $x.text;}
    (DOT y=WORD {$str += $DOT.text + $y.text;})*
    SEMICOLON {$str += $SEMICOLON.text + "<br>\n";};

java_imports returns[String str] @init{$str = "";}:
    JAVA_IMPORT {$str += "<span style=\"color: blue\">" + $JAVA_IMPORT.text + "</span>";}
    x=WORD {$str += " " + $x.text;}
    (DOT y=WORD {$str += $DOT.text + $y.text;})*                              
    SEMICOLON {$str += $SEMICOLON.text + "<br>\n";};

// class
class_definition returns[String str] @init{$str = "";}:
    (acceess_modifier {$str += $acceess_modifier.str + " ";})?
    CLASS {$str += "<span style=\"color: blue\">" + $CLASS.text + "</span>";}
    WORD {$str += " " + $WORD.text;}
    (java_extends {$str += " " + $java_extends.str;})?
    (java_implements {$str += " " + $java_implements.str;})?
    LEFT_BRACE
    class_body[4]
    RIGHT_BRACE {$str += " " + $LEFT_BRACE.text + "<br>\n" + $class_body.str + $RIGHT_BRACE.text + "<br>\n";};

java_extends returns[String str] @init{$str = "";}:
    EXTENDS
    x=WORD {$str += $EXTENDS.text + " " +
            "<span style=\"color: blue\">" + $x.text + "</span>";};
//    (COMMA y=WORD {$str += $COMMA.text + " " +
//                "<span style=\"color: blue\">" + $y.text + "</span>";})*;

java_implements returns[String str] @init{$str = "";}:
    IMPLEMENTS
    x=WORD {$str += $IMPLEMENTS.text + " " +
                "<span style=\"color: blue\">" + $x.text + "</span>";}
        (COMMA y=WORD {$str += $COMMA.text + " " +
                    "<span style=\"color: blue\">" + $y.text + "</span>";})*;

class_body[int indent] returns[String str] @init{$str = "";}:
    (x=class_member[indent] {$str += $x.str;})*;

class_member[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    (variable[0] {$str += $variable.str;} |
    method[indent] {$str += $method.str;});

// a.k.a field + variable
variable[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    (acceess_modifier {$str += $acceess_modifier.str + " ";})?
    (static_modifier {$str += $static_modifier.str + " ";})?
    (final_modifier {$str += $final_modifier.str + " ";})?
    variable_type
    (x=WORD ASSIGN xx=value {$str += $variable_type.str + " " + $x.text + " " + $ASSIGN.text + " " + $xx.str;} |
    y=WORD {$str += $variable_type.str + " " + $y.text;})
    (COMMA
        (y=WORD ASSIGN yy=value {$str += $COMMA.text + " " + $y.text + " " + $ASSIGN.text + " " + $yy.str;} |
         y=WORD {$str += $COMMA.text + " " + $y.text;})
    )*
    (SEMICOLON {$str += $SEMICOLON.text + "<br>\n";});

variable_type returns[String str] @init{$str = "";}:
    WORD {$str += "<span style=\"color: blue\">" + $WORD.text + "</span>";};

method[int indent] returns[String str] @init{$str = "";}:
    (acceess_modifier {$str += $acceess_modifier.str + " ";})?
    (static_modifier {$str += $static_modifier.str + " " ;})?
    (final_modifier {$str += $final_modifier.str + " ";})?
    vt=variable_type w=WORD LBRACKET {$str += $vt.str + " " + $w.text + $LBRACKET.text;}
    (tx=variable_type x=WORD {$str += $tx.str + " " + $x.text;}
    (COMMA ty=variable_type y=WORD {$str += $COMMA.text + " " + $ty.str + " " + $y.text;})*)?
    RBRACKET LEFT_BRACE {$str += $RBRACKET.text + " " + $LEFT_BRACE.text + "<br>";}
    method_body[indent + 4] {$str += $method_body.str;}
    RIGHT_BRACE {$str += "&nbsp;".repeat(indent) + $RIGHT_BRACE.text + "<br>\n";};

acceess_modifier returns[String str] @init{$str = "";}:
    ACCESS_MODIFIER {$str += "<span style=\"color: blue\">" + $ACCESS_MODIFIER.text + "</span>" + " ";};

static_modifier returns[String str] @init{$str = "";}:
    (STATIC {$str += "<span style=\"color: blue\">" + $STATIC.text + "</span>" + " ";});

final_modifier returns[String str] @init{$str = "";}:
    (FINAL {$str += "<span style=\"color: blue\">" + $FINAL.text + "</span>" + " ";})?;

method_body[int indent] returns[String str] @init{$str = "";}:
    (variable[indent] {$str += $variable.str;} |
        (method_call[indent] SEMICOLON {$str += $method_call.str + $SEMICOLON.text + "<br>\n";}) |
        (new_call[indent] SEMICOLON {$str += $new_call.str + $SEMICOLON.text + "<br>\n";}) |
        (while_loop[indent] {$str += $while_loop.str;})
    )*
    (return_keyword[indent] {$str += $return_keyword.str;})?;

// value - smth what stays after '=', or method call args
value returns[String str] @init{$str = "";}:
    int_value {$str += $int_value.str;} |
    string {$str += $string.str;} |
    method_call[0] {$str += $method_call.str;} |
    new_call[0] {$str += $new_call.str;} |
    WORD {$str += $WORD.text;};  // variable value

string returns[String str] @init{$str = "";}:
    x=QUOTE {$str += $x.text;}
    (WORD {$str +=
            "<span style=\"color: rgb(3 106 7)\">" + $WORD.text + "</span>";} |
     int_value {$str += $int_value.str;})*
    y=QUOTE {$str += $y.text;};

int_value returns[String str] @init{$str = "";}:
    INT {$str += "<span style=\"color: #a04caf\">" + $INT.text + "</span>";};

method_call[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    dt=dot_separated_words LBRACKET {$str += $dt.str + $LBRACKET.text;} (args {$str += $args.str;})?
    RBRACKET {$str += $RBRACKET.text;};

dot_separated_words returns[String str] @init{$str = "";}:
    x=WORD {$str += " " + $x.text;}
    (DOT y=WORD {$str += $DOT.text + $y.text;})*;

args returns[String str] @init{$str = "";}:
    x=value {$str += $x.str;}
    (COMMA y=value {$str += $COMMA.text + " " + $y.str;})*;

new_call[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    NEW {$str += "<span style=\"color: blue\">" + $NEW.text + "</span>" + " ";}
    WORD LBRACKET {$str += $WORD.text + $LBRACKET.text;}
    (args{$str += $args.str;})?
    RBRACKET {$str += $RBRACKET.text;};

while_loop[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    WHILE {$str += "<span style=\"color: blue\">" + $WHILE.text + "</span>" + " ";}
    LBRACKET {$str += $LBRACKET.text;}
    cond {$str += $cond.str;}
    RBRACKET {$str += $RBRACKET.text + " ";}
    LEFT_BRACE {$str += $LEFT_BRACE.text + "<br>\n";}
    method_body[indent + 4] {$str += $method_body.str;}
    RIGHT_BRACE {$str += "&nbsp;".repeat(indent) + $RIGHT_BRACE.text + "<br>\n";};

cond returns[String str] @init{$str = "";}:
    (x=value {$str += $x.str + " ";}
    comp {$str += $comp.str + " " ;}
    y=value {$str += $y.str;}) |
    bool_value {$str += $bool_value.str;};

bool_value returns[String str] @init{$str = "";}:
    (BOOL_TRUE {$str += "<span style=\"color: blue\">" + $BOOL_TRUE.text + "</span>";}) |
    (BOOL_FALSE {$str += "<span style=\"color: blue\">" + $BOOL_FALSE.text + "</span>";});

comp returns[String str] @init{$str = "";}:
    (LE {$str += $LE.text;}) |
    (GR {$str += $GR.text;}) |
    (EQ {$str += $EQ.text;}) |
    (LEQ {$str += $LEQ.text;}) |
    (GEQ {$str += $GEQ.text;});

return_keyword[int indent] returns[String str] @init{$str = "&nbsp;".repeat(indent);}:
    RETURN_KEYWORD {$str += "<span style=\"color: blue\">" + $RETURN_KEYWORD.text + "</span>";}
    (value {$str += " " + $value.str;})?
    SEMICOLON {$str += $SEMICOLON.text + "<br>\n";};

SKIP_WHITESPACES: [ \n\r\t]+ -> skip;

RETURN_KEYWORD: 'return';
BOOL_TRUE: 'true';
BOOL_FALSE: 'false';
WHILE: 'while';
NEW: 'new';
JAVA_PACKAGE: 'package';
JAVA_IMPORT: 'import';
CLASS: 'class';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
ACCESS_MODIFIER: ('private' | 'public' | 'protected');
STATIC: 'static';
FINAL: 'final';
WORD: [a-zA-Z]+; // variables, methods, class names
INT: [0-9]+;
ASSIGN: '=';
SEMICOLON: ';';
LBRACKET: '(';
RBRACKET: ')';
COMMA: ',';
QUOTE: '"';
DOT: '.';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LE : '<';
GR : '>';
EQ : '==';
LEQ : '<=';
GEQ : '<=';