package generics1;

public class Gen<T> {

    T ob; // declare an instance variable of type that was instantiated in demo

    // Passing the constructor the reference to an object of type t
    Gen(T ob) {
        this.ob = ob;
    }

    // Return an object of type T
    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}
