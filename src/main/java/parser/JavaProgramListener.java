// Generated from /Users/emgariko/work/itmo/translation_methods/lab3/src/main/java/parser/JavaProgram.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaProgramParser}.
 */
public interface JavaProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#java_package}.
	 * @param ctx the parse tree
	 */
	void enterJava_package(JavaProgramParser.Java_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#java_package}.
	 * @param ctx the parse tree
	 */
	void exitJava_package(JavaProgramParser.Java_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#java_imports}.
	 * @param ctx the parse tree
	 */
	void enterJava_imports(JavaProgramParser.Java_importsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#java_imports}.
	 * @param ctx the parse tree
	 */
	void exitJava_imports(JavaProgramParser.Java_importsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(JavaProgramParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(JavaProgramParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#java_extends}.
	 * @param ctx the parse tree
	 */
	void enterJava_extends(JavaProgramParser.Java_extendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#java_extends}.
	 * @param ctx the parse tree
	 */
	void exitJava_extends(JavaProgramParser.Java_extendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#java_implements}.
	 * @param ctx the parse tree
	 */
	void enterJava_implements(JavaProgramParser.Java_implementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#java_implements}.
	 * @param ctx the parse tree
	 */
	void exitJava_implements(JavaProgramParser.Java_implementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JavaProgramParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JavaProgramParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(JavaProgramParser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(JavaProgramParser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JavaProgramParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JavaProgramParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(JavaProgramParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(JavaProgramParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaProgramParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaProgramParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#acceess_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAcceess_modifier(JavaProgramParser.Acceess_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#acceess_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAcceess_modifier(JavaProgramParser.Acceess_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#static_modifier}.
	 * @param ctx the parse tree
	 */
	void enterStatic_modifier(JavaProgramParser.Static_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#static_modifier}.
	 * @param ctx the parse tree
	 */
	void exitStatic_modifier(JavaProgramParser.Static_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#final_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFinal_modifier(JavaProgramParser.Final_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#final_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFinal_modifier(JavaProgramParser.Final_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(JavaProgramParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(JavaProgramParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JavaProgramParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JavaProgramParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#int_value}.
	 * @param ctx the parse tree
	 */
	void enterInt_value(JavaProgramParser.Int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#int_value}.
	 * @param ctx the parse tree
	 */
	void exitInt_value(JavaProgramParser.Int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JavaProgramParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JavaProgramParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#dot_separated_words}.
	 * @param ctx the parse tree
	 */
	void enterDot_separated_words(JavaProgramParser.Dot_separated_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#dot_separated_words}.
	 * @param ctx the parse tree
	 */
	void exitDot_separated_words(JavaProgramParser.Dot_separated_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JavaProgramParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JavaProgramParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#new_call}.
	 * @param ctx the parse tree
	 */
	void enterNew_call(JavaProgramParser.New_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#new_call}.
	 * @param ctx the parse tree
	 */
	void exitNew_call(JavaProgramParser.New_callContext ctx);
}