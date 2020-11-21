/*
     If no open options are specified in the Files.newOutputStream(Path, options),
     and the file does not exist, a new file is created. If the file exists, it is truncated.

     The following example opens a log file. If the file does not exist,
     it is created. If the file exists, it is opened for appending.
 */

package nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;

public class NewOutputStreamDemo {

    public static void main(String[] args) {

        String s = "Hello, world";
        byte byteData[] = s.getBytes();
        Path p = Paths.get("./nio/logfile.txt");

        try (BufferedOutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))){
            out.write(byteData, 0, byteData.length);
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}
