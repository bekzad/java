package generics4;

public class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }


}

class A {

}

class B extends A {

}

class C extends A {

}
// Does not extend A
class D {

}
