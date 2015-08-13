package GLSL;

import GLSL.gen.GLSLBaseVisitor;
import GLSL.gen.GLSLParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Created by gzlongyue on 2015/8/13.
 */


public class ConvetVisitor extends GLSLBaseVisitor<String> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    final String linebreak = "\r\n";

    int indentNum;  //缩进次数
    String prefix;   //名称前缀

    Cbuffer cb;         //Cbuffer结构
    StructVariable inb;  //GLSL中的in 变量
    StructVariable outb; //GLSL中的out 变量

    List<StructVariable> structList; //GLSL中的struct变量

    Map<String, TypeClass> I2T; //变量与类型对应关系表
    Map<String, String> Semantics;  //变量与语义对应关系表


    //构造函数
    public ConvetVisitor(){
        indentNum = 0;
        prefix = "";

        cb = new Cbuffer();
        inb = new StructVariable();
        outb = new StructVariable();

        I2T = new HashMap<String, TypeClass>();
        Semantics = new HashMap<String, String>();

        structList = new ArrayList<StructVariable>();
    }

    //返回前导缩进
    String getIndent(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < indentNum; ++i)
            sb.append('\t');
        return sb.toString();
    };

    //把名称前缀粘贴上去
    String AppendPrefix(String tail){
        String tmp = prefix.isEmpty()? tail : prefix + "." + tail;
        return tmp;
    }

    //进入内层结构
    void enterSub(){
        indentNum ++;
    };

    void enterSub(String name){
        if(name != null && !name.isEmpty())
            prefix = AppendPrefix(name);
        indentNum ++;
    };

    //离开内层结构
    void exitSub(){
        indentNum --;
    };

    void exitSub(String name){
        if(name != null && !name.isEmpty()){
            int index = prefix.lastIndexOf('.');
            if(name.equals(prefix.substring(index + 1))){
                if(index == -1) prefix = "";
                else            prefix = prefix.substring(0, index);
            }
        }
        indentNum--;
    }

    class TypeClass{
        public String Type;
    };

    //基本的聚合类型
    class BasicStruc{
        public  String Name = "";
        public  String Type = "struc";
        public Set<String> Variable = new HashSet<String>();

        public String toString(){
            StringBuilder sb = new StringBuilder();

            sb.append(getIndent() + Type + " " + Name + '{' + linebreak);

            enterSub(Name);
            for(String name : Variable){
                String fullname = AppendPrefix(name);
                if(I2T.containsKey(fullname)){
                    sb.append(getIndent());
                    sb.append(I2T.get(fullname));
                    sb.append(" " + name);

                    if(Semantics.containsKey(fullname)){
                        sb.append( " : " + Semantics.get(fullname));
                    }

                    sb.append(";" + linebreak);
                }
            }
            exitSub(Name);

            sb.append(getIndent() + '}' + linebreak);

            return sb.toString();
        };
    };

    class Cbuffer extends BasicStruc{
        Cbuffer(){ Type = "Cbuffer"; }
    };

    class StructVariable extends  BasicStruc{};



    public boolean setSemantics(String name, String semantics){
        if(Semantics.containsKey(name))
            return false;
        Semantics.put(name, semantics);
        return true;
    }

    @Override public String visitProg(GLSLParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(GLSLParser.PreprocessorContext prectx : ctx.preprocessor())
            sb.append( visit(prectx));

        for(StructVariable st : structList){
            sb.append(linebreak + st.toString());
        }

        sb.append(linebreak + cb.toString());
        sb.append(linebreak + inb.toString());
        sb.append(linebreak + outb.toString());

        visit(ctx.statement_list());
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPreprocessor(GLSLParser.PreprocessorContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVersion_pre(GLSLParser.Version_preContext ctx) { return ""; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_qualifier(GLSLParser.Type_qualifierContext ctx) {
        String str = new String();
        for( GLSLParser.Storage_qualifierContext sq : ctx.storage_qualifier()){
            if( ! str.isEmpty())    str += " | ";
            str += sq.getText();
        }
        return str;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLayout_qualifier(GLSLParser.Layout_qualifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStorage_qualifier(GLSLParser.Storage_qualifierContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInvariant_qualifier(GLSLParser.Invariant_qualifierContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrecise_qualifier(GLSLParser.Precise_qualifierContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInteger(GLSLParser.IntegerContext ctx) {
        //整数替换
        String str = ctx.getText();
        if(ctx.DECIMAL() !=  null){

        }
        else if(ctx.OCTAL() != null){
            str = '\\' + str;
        }
        else if(ctx.HEX() != null){
            str.replaceFirst("0", "\\");
        }
        return str;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFloat_num(GLSLParser.Float_numContext ctx){
        //浮点数替换
        String str = "";

        return str;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBool_num(GLSLParser.Bool_numContext ctx) { return ctx.getText(); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_specifier(GLSLParser.Type_specifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_specifier_nonarray(GLSLParser.Type_specifier_nonarrayContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_specifier(GLSLParser.Array_specifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_specifier(GLSLParser.Struct_specifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBasic_type(GLSLParser.Basic_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVoid_type(GLSLParser.Void_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitScala_type(GLSLParser.Scala_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVector_type(GLSLParser.Vector_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMatrix_type(GLSLParser.Matrix_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOpaque_type(GLSLParser.Opaque_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFloat_opaque_type(GLSLParser.Float_opaque_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInt_opaque_type(GLSLParser.Int_opaque_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitU_int_opaque_type(GLSLParser.U_int_opaque_typeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression(GLSLParser.ExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrimary_expression(GLSLParser.Primary_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConstant_expression(GLSLParser.Constant_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLeft_value(GLSLParser.Left_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_struct_selection(GLSLParser.Array_struct_selectionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignment_expression(GLSLParser.Assignment_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArithmetic_assignment_expression(GLSLParser.Arithmetic_assignment_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_definition(GLSLParser.Function_definitionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_declaration(GLSLParser.Function_declarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_call(GLSLParser.Function_callContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitReturn_Type(GLSLParser.Return_TypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_name(GLSLParser.Function_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunc_decl_member(GLSLParser.Func_decl_memberContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement_list(GLSLParser.Statement_listContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement(GLSLParser.StatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_statement(GLSLParser.Simple_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCompoud_statement(GLSLParser.Compoud_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBasic_statement(GLSLParser.Basic_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaration_statement(GLSLParser.Declaration_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_declaration(GLSLParser.Simple_declarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_declarator(GLSLParser.Simple_declaratorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_declaration(GLSLParser.Struct_declarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_definition_statement(GLSLParser.Function_definition_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignment_statement(GLSLParser.Assignment_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_statement(GLSLParser.Expression_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelection_statement(GLSLParser.Selection_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelection_rest_statement(GLSLParser.Selection_rest_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSwitch_statement(GLSLParser.Switch_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCase_label(GLSLParser.Case_labelContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIteration_statement(GLSLParser.Iteration_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_init_statement(GLSLParser.For_init_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_cond_statement(GLSLParser.For_cond_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_rest_statement(GLSLParser.For_rest_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitJump_statement(GLSLParser.Jump_statementContext ctx) { return visitChildren(ctx); }
}
