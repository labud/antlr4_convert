// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLSLParser}.
 */
public interface GLSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GLSLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GLSLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(GLSLParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(GLSLParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void enterVersion_pre(GLSLParser.Version_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void exitVersion_pre(GLSLParser.Version_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(GLSLParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(GLSLParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(GLSLParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(GLSLParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(GLSLParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(GLSLParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInvariant_qualifier(GLSLParser.Invariant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInvariant_qualifier(GLSLParser.Invariant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecise_qualifier(GLSLParser.Precise_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecise_qualifier(GLSLParser.Precise_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GLSLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GLSLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(GLSLParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(GLSLParser.Float_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void enterBool_num(GLSLParser.Bool_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void exitBool_num(GLSLParser.Bool_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(GLSLParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(GLSLParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_nonarray(GLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_nonarray(GLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(GLSLParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(GLSLParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(GLSLParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(GLSLParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(GLSLParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(GLSLParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void enterVoid_type(GLSLParser.Void_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void exitVoid_type(GLSLParser.Void_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void enterScala_type(GLSLParser.Scala_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void exitScala_type(GLSLParser.Scala_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void enterVector_type(GLSLParser.Vector_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void exitVector_type(GLSLParser.Vector_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_type(GLSLParser.Matrix_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_type(GLSLParser.Matrix_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterOpaque_type(GLSLParser.Opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitOpaque_type(GLSLParser.Opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_opaque_type(GLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_opaque_type(GLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_opaque_type(GLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_opaque_type(GLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterU_int_opaque_type(GLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitU_int_opaque_type(GLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GLSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GLSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(GLSLParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(GLSLParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(GLSLParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(GLSLParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#left_value}.
	 * @param ctx the parse tree
	 */
	void enterLeft_value(GLSLParser.Left_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#left_value}.
	 * @param ctx the parse tree
	 */
	void exitLeft_value(GLSLParser.Left_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 */
	void enterArray_struct_selection(GLSLParser.Array_struct_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 */
	void exitArray_struct_selection(GLSLParser.Array_struct_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(GLSLParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(GLSLParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_assignment_expression(GLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_assignment_expression(GLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(GLSLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(GLSLParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(GLSLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(GLSLParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GLSLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GLSLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_Type(GLSLParser.Return_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_Type(GLSLParser.Return_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(GLSLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(GLSLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_member(GLSLParser.Func_decl_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_member(GLSLParser.Func_decl_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(GLSLParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(GLSLParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GLSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GLSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(GLSLParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(GLSLParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoud_statement(GLSLParser.Compoud_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoud_statement(GLSLParser.Compoud_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_statement(GLSLParser.Basic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_statement(GLSLParser.Basic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(GLSLParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(GLSLParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(GLSLParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(GLSLParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(GLSLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(GLSLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(GLSLParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(GLSLParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_statement(GLSLParser.Function_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_statement(GLSLParser.Function_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(GLSLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(GLSLParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(GLSLParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(GLSLParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(GLSLParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(GLSLParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_rest_statement(GLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_rest_statement(GLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(GLSLParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(GLSLParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(GLSLParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(GLSLParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(GLSLParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(GLSLParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(GLSLParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(GLSLParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond_statement(GLSLParser.For_cond_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond_statement(GLSLParser.For_cond_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_rest_statement(GLSLParser.For_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_rest_statement(GLSLParser.For_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(GLSLParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(GLSLParser.Jump_statementContext ctx);
}