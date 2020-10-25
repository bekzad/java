// Shows some ambiguities that can happen when using varargs

public class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println(v.length);
    }

    static void vaTest(boolean ... v) {
        System.out.println(v.length);
    }

    static void vaTest(int n, int ... v){
        System.out.println(v.length);
    } // This one is ambiguous method in itself because compiler cannot choose which method to call

    public static void main(String args[]) {
//        vaTest(1); // Ambiguous method call
        vaTest(true, false); // Ok
//        vaTest(); // Ambiguous method call because the compiler doesn't know which method to choose
    }
}
