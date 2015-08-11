// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLSLParser}.
 */
public interface GLSLListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link GLSLParser#vertion_preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterVertion_preprocessor(GLSLParser.Vertion_preprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#vertion_preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitVertion_preprocessor(GLSLParser.Vertion_preprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GLSLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GLSLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(GLSLParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(GLSLParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#vectorType}.
	 * @param ctx the parse tree
	 */
	void enterVectorType(GLSLParser.VectorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#vectorType}.
	 * @param ctx the parse tree
	 */
	void exitVectorType(GLSLParser.VectorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#matrixType}.
	 * @param ctx the parse tree
	 */
	void enterMatrixType(GLSLParser.MatrixTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#matrixType}.
	 * @param ctx the parse tree
	 */
	void exitMatrixType(GLSLParser.MatrixTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#vectorName}.
	 * @param ctx the parse tree
	 */
	void enterVectorName(GLSLParser.VectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#vectorName}.
	 * @param ctx the parse tree
	 */
	void exitVectorName(GLSLParser.VectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#matrixName}.
	 * @param ctx the parse tree
	 */
	void enterMatrixName(GLSLParser.MatrixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#matrixName}.
	 * @param ctx the parse tree
	 */
	void exitMatrixName(GLSLParser.MatrixNameContext ctx);
}