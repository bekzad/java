package Test;

class Test {
    int a;
    Test(int i) {
        a = i;
    }
    void swap(Test ob) {
        int temp;
        temp = this.a;
        this.a = ob.a;
        ob.a = temp;
    }
}
public class SwapDemo {
    public static void main(String args[]) {
        Test ob1 = new Test(4);
        Test ob2 = new Test(6);

        System.out.println("Before the swap: ");
        System.out.println("ob1.a: " + ob1.a + " ob2.a: " + ob2.a);

        // Swap
        ob1.swap(ob2);

        System.out.println("\nAfter the swap: ");
        System.out.print("ob1.a: " + ob1.a + " ob2.a: " + ob2.a);

    }
}
