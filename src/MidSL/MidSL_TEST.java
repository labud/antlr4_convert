package MidSL;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import MidSL.gen.*;
/**
 * Created by gzlongyue on 2015/8/6.
 */

enum resultType{GLSL, HLSL;};

public class MidSL_TEST {
    static final int offset = 3;
    public static void main(String[] args) throws Exception{
        /*System.out.println(args.length);
        for(String t : args)
            System.out.println(t);*/
        if( args.length < offset + 2 ||
            args.length > offset + 3 ||
            !(args[offset+1].equals("-h") || args[offset+1].equals("-g"))
            ){
            System.out.print("Error: invalid arguments:");
            System.out.print("inFileName (-g | -h) [outFileName]");
            return ;
        }

        String inputFile = args[offset];
        File file =  new File(inputFile);
        if(!file.exists()){
            System.out.println("Error : can not find input file!");
            return ;
        }
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        resultType type = resultType.GLSL;
        if(args[offset+1].equals("-h"))
            type = resultType.HLSL;

        String outfile = inputFile + (type == resultType.GLSL ? ".g" : ".h");
        if(args.length > offset + 2)
            outfile = args[offset + 2];


        ANTLRInputStream input = new ANTLRInputStream(is);

        MidSLLexer lexer = new MidSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MidSLParser parser = new MidSLParser(tokens);
        ParseTree tree = parser.prog(); // parse

        //System.out.println(tree.getText());

        switch (type){
            case GLSL:
                GLSLVisitor gv = new GLSLVisitor();
                gv.run(tree);
                gv.getFile(outfile);
                break;
            case HLSL:
                HLSLVisitor hv = new HLSLVisitor();
                hv.run(tree);
                hv.getFile(outfile);
                break;
        }
    }
}
