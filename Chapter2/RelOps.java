
public class RelOps {
    public static void main(String args[]) {
        boolean b1 = true, b2 = false;

        if (b1 & b2) System.out.println("This won't execute");
        if (!(b1 & b2)) System.out.println("This is not and operation");
        if (b1 | b2) System.out.println("This will execute");
        if (b1 ^ b2) System.out.println("This is Xor");
    }
}