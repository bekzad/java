/*
    Demonstration of DataInputStream and DataOutputStream
    You can read and write other types of data such as ints and doubles
 */

package byte_streams;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int integer = 12;
        boolean booleanValue = true;
        double doubleValue = 12.5;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("sample.txt"))) {

            System.out.println("Writing an integer: ");
            dataOut.writeInt(integer);

            System.out.println("Writing a boolean: ");
            dataOut.writeBoolean(booleanValue);

            System.out.println("Writing a double: ");
            dataOut.writeDouble(doubleValue);

            System.out.println("Writing another double: ");
            dataOut.writeDouble(doubleValue * 4.5);

        } catch (IOException e) {
            System.out.println(e);
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("sample.txt"))) {

            System.out.println("Reading an integer: ");
            System.out.println(dataIn.readInt());

            System.out.println("Reading a boolean: ");
            System.out.println(dataIn.readBoolean());

            System.out.println("Reading a double: ");
            System.out.println(dataIn.readDouble());

            System.out.println("Reading another double: ");
            System.out.println(dataIn.readDouble());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
