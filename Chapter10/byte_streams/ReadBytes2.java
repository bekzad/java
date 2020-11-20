/* Simple read of bytes from console
   and putting them inside a byte array by using ByteStreams
*/
package byte_streams;

import java.io.IOException;

public class ReadBytes2 {
    public static void main(String[] args) throws IOException {

        byte data[] = new byte[4];

        // Number of bytes read into data byte array
        int numRead;

        System.out.println("Enter some characters: ");

        // Read from console and put into data byte array
        // Starts putting at data[2] for two positions
        numRead = System.in.read(data, 2, 2);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Byte: " + data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print("Character: " + (char) data[i] + " ");
        }

        System.out.print("\nNumber of bytes read: ");
        System.out.println(numRead);
    }
}
