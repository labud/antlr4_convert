// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MidSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MidSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MidSLParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(MidSLParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MidSLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(MidSLParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#version_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion_pre(MidSLParser.Version_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(MidSLParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_qualifier(MidSLParser.Storage_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#type_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_modifier(MidSLParser.Type_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MidSLParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#float_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_num(MidSLParser.Float_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#bool_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_num(MidSLParser.Bool_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(MidSLParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier_nonarray(MidSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(MidSLParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_specifier(MidSLParser.Struct_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(MidSLParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#void_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_type(MidSLParser.Void_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#scala_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala_type(MidSLParser.Scala_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_type(MidSLParser.Vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#matrix_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_type(MidSLParser.Matrix_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MidSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(MidSLParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(MidSLParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#left_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_value(MidSLParser.Left_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_struct_selection(MidSLParser.Array_struct_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(MidSLParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_assignment_expression(MidSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(MidSLParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(MidSLParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MidSLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#return_Type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_Type(MidSLParser.Return_TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(MidSLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_member(MidSLParser.Func_decl_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(MidSLParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MidSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(MidSLParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoud_statement(MidSLParser.Compoud_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#basic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_statement(MidSLParser.Basic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(MidSLParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(MidSLParser.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(MidSLParser.Simple_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#semantics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemantics(MidSLParser.SemanticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#sample_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_declaration(MidSLParser.Sample_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#texture_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexture_declaration(MidSLParser.Texture_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(MidSLParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#cbuffer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbuffer_declaration(MidSLParser.Cbuffer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#inbuffer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInbuffer_declaration(MidSLParser.Inbuffer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#outbuffer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutbuffer_declaration(MidSLParser.Outbuffer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#inoutbuffer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInoutbuffer_declaration(MidSLParser.Inoutbuffer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(MidSLParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(MidSLParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_statement(MidSLParser.Function_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(MidSLParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_rest_statement(MidSLParser.Selection_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(MidSLParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(MidSLParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(MidSLParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_statement(MidSLParser.For_init_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cond_statement(MidSLParser.For_cond_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rest_statement(MidSLParser.For_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MidSLParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(MidSLParser.Jump_statementContext ctx);
}