package MidSL;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import MidSL.gen.*;
/**
 * Created by gzlongyue on 2015/8/6.
 */
public class MidSL_TEST {
    public static void main(String[] args) throws Exception{
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        inputFile = "in\\MidSL_vs.txt";
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);

        MidSLLexer lexer = new MidSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MidSLParser parser = new MidSLParser(tokens);
        ParseTree tree = parser.prog(); // parse

        //System.out.println(tree.getText());

        HLSLVisitor hv = new HLSLVisitor();
        GLSLVisitor gv = new GLSLVisitor();

        hv.run(tree);
        gv.run(tree);

        String hlfilename = "HLSL.txt";
        String glfilename = "GLSL.txt";
        hv.getFile(hlfilename);
        gv.getFile(glfilename);

        //System.out.println(hv.getString());
        //System.out.println(gv.getString());
    }
}
