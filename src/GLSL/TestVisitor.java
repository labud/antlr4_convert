package GLSL;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import GLSL.gen.*;

/**
 * Created by gzlongyue on 2015/8/6.
 */
public class TestVisitor extends GLSLBaseVisitor<Integer> {
    @Override
    public Integer visitVector_type(GLSLParser.Vector_typeContext ctx) {
        if(ctx.VECTOR() != null){
            System.out.print(ctx.VECTOR().getText());
            int num = ctx.VECTOR().getChildCount();
            for(int i = 0; i < num; ++i){
                System.out.println(ctx.VECTOR().getChild(i).getText());
            }

        }
        return 1;
    }

}
