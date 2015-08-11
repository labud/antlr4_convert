// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GLSLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(GLSLParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#version_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion_pre(GLSLParser.Version_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(GLSLParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout_qualifier(GLSLParser.Layout_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_qualifier(GLSLParser.Storage_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant_qualifier(GLSLParser.Invariant_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#precise_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecise_qualifier(GLSLParser.Precise_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GLSLParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#float_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_num(GLSLParser.Float_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#bool_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_num(GLSLParser.Bool_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(GLSLParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier_nonarray(GLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(GLSLParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_specifier(GLSLParser.Struct_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(GLSLParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#void_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_type(GLSLParser.Void_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#scala_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala_type(GLSLParser.Scala_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_type(GLSLParser.Vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_type(GLSLParser.Matrix_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaque_type(GLSLParser.Opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_opaque_type(GLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_opaque_type(GLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_int_opaque_type(GLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GLSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(GLSLParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(GLSLParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#left_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_value(GLSLParser.Left_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_struct_selection(GLSLParser.Array_struct_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(GLSLParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_assignment_expression(GLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(GLSLParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(GLSLParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GLSLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#return_Type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_Type(GLSLParser.Return_TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(GLSLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_member(GLSLParser.Func_decl_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(GLSLParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GLSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(GLSLParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoud_statement(GLSLParser.Compoud_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_statement(GLSLParser.Basic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(GLSLParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(GLSLParser.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(GLSLParser.Simple_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(GLSLParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_statement(GLSLParser.Function_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(GLSLParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(GLSLParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(GLSLParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_rest_statement(GLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(GLSLParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(GLSLParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(GLSLParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_statement(GLSLParser.For_init_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cond_statement(GLSLParser.For_cond_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rest_statement(GLSLParser.For_rest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(GLSLParser.Jump_statementContext ctx);
}