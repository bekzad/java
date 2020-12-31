package methodref3;

public class ConstructorRefDemo {
    public static void main(String[] args) {

        // Because func in MyClass takes an argument new
        // refers to parametrized constructor
        MyFunc mf = MyClass::new;

        MyClass mc = mf.func("Testing");
        System.out.println("String in mc is " + mc.getS());
    }
}
