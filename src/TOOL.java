import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by gzlongyue on 2015/8/7.
 */
public class TOOL {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(System.in);

        String str = null;
        StringBuffer sb = new StringBuffer();
        while(scanner.hasNext()){
            str = scanner.nextLine();
            sb.append("    |    ").append(str).append('\n');
            //System.out.println(str.toUpperCase());
        }
        System.out.print(sb.toString());
    }
}
