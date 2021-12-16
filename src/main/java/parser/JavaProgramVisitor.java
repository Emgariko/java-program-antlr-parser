// Generated from /Users/emgariko/work/itmo/translation_methods/lab3/src/main/java/parser/JavaProgram.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#java_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_package(JavaProgramParser.Java_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#java_imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_imports(JavaProgramParser.Java_importsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(JavaProgramParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#java_extends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_extends(JavaProgramParser.Java_extendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#java_implements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_implements(JavaProgramParser.Java_implementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(JavaProgramParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(JavaProgramParser.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JavaProgramParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(JavaProgramParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(JavaProgramParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#acceess_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceess_modifier(JavaProgramParser.Acceess_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#static_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_modifier(JavaProgramParser.Static_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#final_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_modifier(JavaProgramParser.Final_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(JavaProgramParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JavaProgramParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_value(JavaProgramParser.Int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(JavaProgramParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#dot_separated_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_separated_words(JavaProgramParser.Dot_separated_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JavaProgramParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#new_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_call(JavaProgramParser.New_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(JavaProgramParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(JavaProgramParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(JavaProgramParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(JavaProgramParser.CompContext ctx);
}