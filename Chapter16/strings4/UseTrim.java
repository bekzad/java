package strings4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'stop' to quit");
        System.out.println("Enter state");
        String str;

        do {
            str = br.readLine().trim();

            if(str.equals("Illinois"))
                System.out.println("Capital is Springfield.");
            else if(str.equals("Missouri"))
                System.out.println("Capital is Jefferson City.");
            else if(str.equals("California"))
                System.out.println("Capital is Sacramento.");
            else if(str.equals("Washington"))
                System.out.println("Capital is Olympia.");

        } while (!str.equals("stop"));
    }
}
