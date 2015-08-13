// Generated from D:/antlr4/ShaderParser/src/HLSL\HLSL.g4 by ANTLR 4.5.1
package HLSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HLSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HLSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HLSLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HLSLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(HLSLParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#version_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion_pre(HLSLParser.Version_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(HLSLParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_qualifier(HLSLParser.Storage_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#type_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_modifier(HLSLParser.Type_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(HLSLParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#float_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_num(HLSLParser.Float_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#bool_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_num(HLSLParser.Bool_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(HLSLParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier_nonarray(HLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(HLSLParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_specifier(HLSLParser.Struct_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(HLSLParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#void_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_type(HLSLParser.Void_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#scala_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala_type(HLSLParser.Scala_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_type(HLSLParser.Vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_type(HLSLParser.Matrix_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaque_type(HLSLParser.Opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_opaque_type(HLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_opaque_type(HLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_int_opaque_type(HLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HLSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(HLSLParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(HLSLParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#left_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_value(HLSLParser.Left_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_struct_selection(HLSLParser.Array_struct_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(HLSLParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_assignment_expression(HLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(HLSLParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(HLSLParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(HLSLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#return_Type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_Type(HLSLParser.Return_TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(HLSLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_member(HLSLParser.Func_decl_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(HLSLParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HLSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(HLSLParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoud_statement(HLSLParser.Compoud_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_statement(HLSLParser.Basic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(HLSLParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(HLSLParser.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(HLSLParser.Simple_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#cbufer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbufer_declaration(HLSLParser.Cbufer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(HLSLParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_statement(HLSLParser.Function_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(HLSLParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(HLSLParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(HLSLParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_rest_statement(HLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(HLSLParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(HLSLParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(HLSLParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_statement(HLSLParser.For_init_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cond_statement(HLSLParser.For_cond_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rest_statement(HLSLParser.For_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(HLSLParser.Jump_statementContext ctx);
}