package generics3;

// Here the V must be either the same type as T or subclass of it
public class Pair<T, V extends T> {
    T first;
    V second;

    Pair(T a, V b) {
        first = a;
        second = b;
    }
}
