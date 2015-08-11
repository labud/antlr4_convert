// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL;
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
	 * Visit a parse tree produced by {@link GLSLParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(GLSLParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#vertion_preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertion_preprocessor(GLSLParser.Vertion_preprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GLSLParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(GLSLParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#vectorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorType(GLSLParser.VectorTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#matrixType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixType(GLSLParser.MatrixTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#vectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorName(GLSLParser.VectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#matrixName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixName(GLSLParser.MatrixNameContext ctx);
}