package Example9;

import java.io.*;
import java.util.*;

public class Main {
    static DataOutputStream os;
    public static void main(String[] args) {
        try {
            os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("log.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            while (true) {
                byte[] b = new byte[256];
                String size = "";

                int intCount = System.in.read(b);
                size = new String(b, 0, intCount);

                StringTokenizer st;
                st = new StringTokenizer(size, "\r\n");

                size = new String((String)st.nextElement());

                Integer intVal = new Integer(size);
                int i;
                i = intVal.intValue();

                if(i == 777) break;

                i = 100 / i;

                os.writeBytes(i + " ");
                System.out.println(i + " ");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                System.out.println("close");
                os.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
