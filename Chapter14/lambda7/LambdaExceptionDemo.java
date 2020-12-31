package lambda7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LambdaExceptionDemo {
    public static void main(String[] args) {

        // This block could throw IOException thus IOException
        // must be specified in a throws clause of an Interface
        MyIOAction myIO = (rdr) -> {
            String str = rdr.readLine();
            System.out.println(str);
            return true;
        };

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lambda expression throws IOException, you need to catch it here
        try {
            myIO.ioAction(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
