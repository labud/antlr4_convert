import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by gzlongyue on 2015/8/7.
 */
public class TOOL {
    static String exitSub(String name, String prefix){
        if(name != null && !name.isEmpty()){
            int index = prefix.lastIndexOf('.');
            if(name.equals(prefix.substring(index + 1))){
                if(index == -1) prefix = "";
                else            prefix = prefix.substring(0, index);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
       /* InputStream in = System.in;
        Scanner scanner = new Scanner(System.in);

        String str = null;
        StringBuffer sb = new StringBuffer();
        while(scanner.hasNext()){
            str = scanner.nextLine();
            sb.append("    |    ").append(str).append('\n');
            //System.out.println(str.toUpperCase());
        }
        System.out.print(sb.toString());*/

        System.out.println(exitSub("hello", "hello"));
        System.out.println(exitSub("hello", "nihao.hello"));
        System.out.println(exitSub("hello", "nihao.nihao"));
        System.out.println(exitSub("hello", "nihao"));

    }
}
