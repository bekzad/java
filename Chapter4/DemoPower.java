
class Pwr {

    // Instance variables
    double b;
    int e;
    double result;

    // Constructor
    Pwr(double b, int e) {
        this.b = b; // This.b is an instance variable while b is methods parameter
        this.e = e;
        result = 1;
        if (e == 0) return;
        for ( ; e > 0; e--) {
            result *= b;
        }
    }

    // Method
    double get_pwr() {
        return this.result;
    }
}

public class DemoPower {
    public static void main(String args[]) {
        Pwr x = new Pwr(2, 5);
        Pwr y = new Pwr(2.5, 4);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power equals " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power equals " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power equals " + z.get_pwr());
    }
}