package generics4;

public class BoundWildcard {

    static void test(Gen<? extends A> o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<>(a);
        Gen<B> w1 = new Gen<>(b);
        Gen<C> w2 = new Gen<>(c);

        // You can create any kind of variable of type Gen
        Gen<D> w3 = new Gen<>(d);

        // But however you cannot use the test method because it's argument has bounds to max A
        test(w);
        test(w1);
        test(w2);

//        test(w3);
    }
}
