/*
    Using PrintWriter for international programs with auto flush off
 */

package character_streams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {
    public static void main(String[] args) {
        int integer = 5;
        double decimal = 4.5;

        // We can close PrintWriter so that we don't have to flush it manually
        PrintWriter prOff = new PrintWriter(System.out);
        prOff.println(integer);
        prOff.println(decimal);

        prOff.flush();
        prOff.close();

    }
}
