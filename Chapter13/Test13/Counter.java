package Test13;

public class Counter<T> {
    T ob;
    Counter(T ob) {
        this.ob = ob;
    }
}

class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
    }
}
