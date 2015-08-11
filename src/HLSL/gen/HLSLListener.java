// Generated from D:/antlr4/ShaderParser/src/HLSL\HLSL.g4 by ANTLR 4.5.1
package HLSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HLSLParser}.
 */
public interface HLSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HLSLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HLSLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(HLSLParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(HLSLParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void enterVersion_pre(HLSLParser.Version_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void exitVersion_pre(HLSLParser.Version_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(HLSLParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(HLSLParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(HLSLParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(HLSLParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(HLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(HLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(HLSLParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(HLSLParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(HLSLParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(HLSLParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(HLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(HLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInvariant_qualifier(HLSLParser.Invariant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInvariant_qualifier(HLSLParser.Invariant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecise_qualifier(HLSLParser.Precise_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecise_qualifier(HLSLParser.Precise_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(HLSLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(HLSLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(HLSLParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(HLSLParser.Float_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void enterBool_num(HLSLParser.Bool_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void exitBool_num(HLSLParser.Bool_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(HLSLParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(HLSLParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_nonarray(HLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_nonarray(HLSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(HLSLParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(HLSLParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(HLSLParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(HLSLParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void enterVoid_type(HLSLParser.Void_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void exitVoid_type(HLSLParser.Void_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void enterScala_type(HLSLParser.Scala_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void exitScala_type(HLSLParser.Scala_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void enterVector_type(HLSLParser.Vector_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void exitVector_type(HLSLParser.Vector_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_type(HLSLParser.Matrix_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_type(HLSLParser.Matrix_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterOpaque_type(HLSLParser.Opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitOpaque_type(HLSLParser.Opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_opaque_type(HLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#float_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_opaque_type(HLSLParser.Float_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_opaque_type(HLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_opaque_type(HLSLParser.Int_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterU_int_opaque_type(HLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#u_int_opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitU_int_opaque_type(HLSLParser.U_int_opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HLSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HLSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(HLSLParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(HLSLParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(HLSLParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(HLSLParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#array_expressoin}.
	 * @param ctx the parse tree
	 */
	void enterArray_expressoin(HLSLParser.Array_expressoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#array_expressoin}.
	 * @param ctx the parse tree
	 */
	void exitArray_expressoin(HLSLParser.Array_expressoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#struct_expression}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expression(HLSLParser.Struct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#struct_expression}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expression(HLSLParser.Struct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(HLSLParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(HLSLParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_assignment_expression(HLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_assignment_expression(HLSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(HLSLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(HLSLParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(HLSLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(HLSLParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(HLSLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(HLSLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_Type(HLSLParser.Return_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_Type(HLSLParser.Return_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(HLSLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(HLSLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_member(HLSLParser.Func_decl_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_member(HLSLParser.Func_decl_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(HLSLParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(HLSLParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HLSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HLSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(HLSLParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(HLSLParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoud_statement(HLSLParser.Compoud_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoud_statement(HLSLParser.Compoud_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_statement(HLSLParser.Basic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_statement(HLSLParser.Basic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(HLSLParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(HLSLParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(HLSLParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(HLSLParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(HLSLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(HLSLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(HLSLParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(HLSLParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_statement(HLSLParser.Function_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_statement(HLSLParser.Function_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(HLSLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(HLSLParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(HLSLParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(HLSLParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(HLSLParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(HLSLParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_rest_statement(HLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_rest_statement(HLSLParser.Selection_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(HLSLParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(HLSLParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(HLSLParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(HLSLParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(HLSLParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(HLSLParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(HLSLParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(HLSLParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond_statement(HLSLParser.For_cond_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond_statement(HLSLParser.For_cond_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_rest_statement(HLSLParser.For_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_rest_statement(HLSLParser.For_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(HLSLParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(HLSLParser.Jump_statementContext ctx);
}