import java.util.Scanner;

class Factorial {

    int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int result = n * fact(n - 1);
        return result;
    }
}

class Recursion {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Factorial f = new Factorial();

        System.out.println(f.fact(number));
    }
}
