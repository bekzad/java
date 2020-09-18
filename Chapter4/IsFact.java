
class Factor {
    boolean isFactor (int a, int b ) {
        if (b % a == 0) return true;
        return false;
    }
}

public class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();

        if(x.isFactor(10, 20)) System.out.println("10 is a factor of 20");
        if(x.isFactor(2, 20)) System.out.println("2 is a factor of 20");
    }
}