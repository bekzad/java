
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class PassObRef {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        Test ob2 = new Test(15, 20);

        System.out.println("Before change: ");
        System.out.println("ob.a " + ob.a + " ob.b " + ob.b);

        ob.change(ob);
        System.out.println("After change: ");
        System.out.println("ob.a " + ob.a + " ob.b " + ob.b);
    }
}