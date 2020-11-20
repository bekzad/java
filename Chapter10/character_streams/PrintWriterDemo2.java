/*
    Using PrintWriter for international programs with auto flush off
 */

package character_streams;

import java.io.PrintWriter;

public class PrintWriterDemo2 {
    public static void main(String[] args) {
        int integer = 5;
        double decimal = 4.5;
        PrintWriter prOff = new PrintWriter(System.out);
        prOff.println(integer);
        prOff.flush();
        prOff.println(decimal);
        prOff.flush();
    }
}
