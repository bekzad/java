/*
    Using PrintWriter for international programs with auto flush on
 */

package character_streams;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out, true);
        double d = 1.1;
        int i = 2;
        boolean b = false;

        pr.println("Using printWriter: ");
        pr.println(i);

        pr.println(i + " + " + d + " = " + (i+d));
    }
}
