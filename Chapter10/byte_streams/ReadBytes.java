package byte_streams;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        /* Simple read of a byte from console by using Byte Stream
            and converting it to a character
        */
        int unicode;
        char character;

        System.out.println("Enter a characters: ");

        do {
            // Read an array of bytes from the keyboard
            unicode = System.in.read();
            character = (char) unicode;
            System.out.println(character);
        } while (character != '.');


        System.out.println("You entered unicode: " + unicode +
                " which is in ASCII: " + character);

    }
}
