package multInheritance;
/*
    If you inherit from both alpha and beta then you
    must override method reset()
 */
class MyClass implements Alpha, Beta {
    public void reset() {
        Alpha.super.reset();
        System.out.println("Inside a class");
    }
}

public class MultipleDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        ob.reset();
    }
}
