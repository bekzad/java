package character_streams;

import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double d, sum = 0;

        System.out.print("How many numbers: ");
        if(input.hasNextInt()) {
            n = input.nextInt();
        } else {
            n = 0;
        }
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Please enter a value: ");
            if(input.hasNextDouble()) {
                d = input.nextDouble();
                sum += d;
            }
        }

        System.out.println("\nAverage: " + sum / n);

    }
}
