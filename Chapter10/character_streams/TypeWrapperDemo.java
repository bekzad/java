package character_streams;//This program averages the list of numbers provided by user

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeWrapperDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0, t;
        double average;

        do {
            System.out.println("How many numbers: ");
            str = br.readLine();
            System.out.println(str);
            try {
                n = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println(e);
                n = 0;
            }
        } while (n == 0);

        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println(e);
                t = 0.0;
            }
            sum = sum + t;
        }
        average = sum / n;
        System.out.println(average);
    }
}
