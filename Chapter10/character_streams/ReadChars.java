package character_streams;/*
    To read individual characters use br.read()
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
