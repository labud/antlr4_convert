// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MidSLParser}.
 */
public interface MidSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MidSLParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(MidSLParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(MidSLParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MidSLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MidSLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(MidSLParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(MidSLParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void enterVersion_pre(MidSLParser.Version_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#version_pre}.
	 * @param ctx the parse tree
	 */
	void exitVersion_pre(MidSLParser.Version_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(MidSLParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(MidSLParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(MidSLParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(MidSLParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#type_modifier}.
	 * @param ctx the parse tree
	 */
	void enterType_modifier(MidSLParser.Type_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#type_modifier}.
	 * @param ctx the parse tree
	 */
	void exitType_modifier(MidSLParser.Type_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MidSLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MidSLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(MidSLParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(MidSLParser.Float_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void enterBool_num(MidSLParser.Bool_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#bool_num}.
	 * @param ctx the parse tree
	 */
	void exitBool_num(MidSLParser.Bool_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(MidSLParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(MidSLParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_nonarray(MidSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_nonarray(MidSLParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(MidSLParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(MidSLParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(MidSLParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(MidSLParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(MidSLParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(MidSLParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void enterVoid_type(MidSLParser.Void_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#void_type}.
	 * @param ctx the parse tree
	 */
	void exitVoid_type(MidSLParser.Void_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void enterScala_type(MidSLParser.Scala_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#scala_type}.
	 * @param ctx the parse tree
	 */
	void exitScala_type(MidSLParser.Scala_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void enterVector_type(MidSLParser.Vector_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#vector_type}.
	 * @param ctx the parse tree
	 */
	void exitVector_type(MidSLParser.Vector_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_type(MidSLParser.Matrix_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#matrix_type}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_type(MidSLParser.Matrix_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MidSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MidSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(MidSLParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(MidSLParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(MidSLParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(MidSLParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#left_value}.
	 * @param ctx the parse tree
	 */
	void enterLeft_value(MidSLParser.Left_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#left_value}.
	 * @param ctx the parse tree
	 */
	void exitLeft_value(MidSLParser.Left_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 */
	void enterArray_struct_selection(MidSLParser.Array_struct_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#array_struct_selection}.
	 * @param ctx the parse tree
	 */
	void exitArray_struct_selection(MidSLParser.Array_struct_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(MidSLParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(MidSLParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_assignment_expression(MidSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#arithmetic_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_assignment_expression(MidSLParser.Arithmetic_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(MidSLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(MidSLParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MidSLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MidSLParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MidSLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MidSLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_Type(MidSLParser.Return_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#return_Type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_Type(MidSLParser.Return_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MidSLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MidSLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_member(MidSLParser.Func_decl_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#func_decl_member}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_member(MidSLParser.Func_decl_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MidSLParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MidSLParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MidSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MidSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(MidSLParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(MidSLParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoud_statement(MidSLParser.Compoud_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#compoud_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoud_statement(MidSLParser.Compoud_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_statement(MidSLParser.Basic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#basic_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_statement(MidSLParser.Basic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(MidSLParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(MidSLParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(MidSLParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(MidSLParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(MidSLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(MidSLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#semantics}.
	 * @param ctx the parse tree
	 */
	void enterSemantics(MidSLParser.SemanticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#semantics}.
	 * @param ctx the parse tree
	 */
	void exitSemantics(MidSLParser.SemanticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#sample_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSample_declaration(MidSLParser.Sample_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#sample_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSample_declaration(MidSLParser.Sample_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#texture_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTexture_declaration(MidSLParser.Texture_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#texture_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTexture_declaration(MidSLParser.Texture_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(MidSLParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(MidSLParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#cbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCbuffer_declaration(MidSLParser.Cbuffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#cbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCbuffer_declaration(MidSLParser.Cbuffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#inbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInbuffer_declaration(MidSLParser.Inbuffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#inbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInbuffer_declaration(MidSLParser.Inbuffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#outbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutbuffer_declaration(MidSLParser.Outbuffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#outbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutbuffer_declaration(MidSLParser.Outbuffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#inoutbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInoutbuffer_declaration(MidSLParser.Inoutbuffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#inoutbuffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInoutbuffer_declaration(MidSLParser.Inoutbuffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MidSLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MidSLParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(MidSLParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(MidSLParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_statement(MidSLParser.Function_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#function_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_statement(MidSLParser.Function_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(MidSLParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(MidSLParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_rest_statement(MidSLParser.Selection_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_rest_statement(MidSLParser.Selection_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(MidSLParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(MidSLParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(MidSLParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(MidSLParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(MidSLParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(MidSLParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(MidSLParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(MidSLParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond_statement(MidSLParser.For_cond_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#for_cond_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond_statement(MidSLParser.For_cond_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_rest_statement(MidSLParser.For_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_rest_statement(MidSLParser.For_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(MidSLParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(MidSLParser.Jump_statementContext ctx);
}