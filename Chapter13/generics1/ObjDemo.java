package generics1;

public class ObjDemo {
    public static void main(String[] args) {
        Obj iOb = new Obj(88);

        iOb.showType();

        // You have to explicitly cast into an integer here.
        // It can create errors where there could be a cast mismatch
        int i = (Integer) iOb.getOb();
        System.out.println("Value of iOb is: " + i);

        Obj strOb = new Obj("This is a test string");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value in strOb is: " + str);

    }
}
