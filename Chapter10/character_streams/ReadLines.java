package character_streams;/*
    To read Strings use br.readline()
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write string");
        System.out.println("Enter stop to stop: ");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
