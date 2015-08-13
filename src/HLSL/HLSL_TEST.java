package HLSL;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import HLSL.gen.*;
/**
 * Created by gzlongyue on 2015/8/6.
 */
public class HLSL_TEST {
    public static void main(String[] args) throws Exception{
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);

        HLSLLexer lexer = new HLSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HLSLParser parser = new HLSLParser(tokens);
        ParseTree tree = parser.prog(); // parse

        System.out.println(tree.toStringTree());

       /* TestVisitor visitor = new TestVisitor();
        visitor.visit(tree);/**/
    }
}
