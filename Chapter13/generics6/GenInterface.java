package generics6;

// Any class that implements a generic interface must itself be generic
class MyClass<T> implements Containment<T> {

    T[] arrayRef;

    MyClass(T[] array) {
        arrayRef = array;
    }

    @Override
    public boolean contains(T obj) {
        for (T x : arrayRef) {
            if (x.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}

public class GenInterface {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};

        MyClass<Integer> myClass = new MyClass<>(intArray);

        if (myClass.contains(2)) {
            System.out.println("MyClass contains 2");
        } else {
            System.out.println("MyClass doesn't contain 2");
        }

        // This won't work because MyClass can't take double as a parameter
        // Its type parameter is Integer
//        if (myClass.contains(5.5)) {
//            System.out.println("MyClass contains 5.5");
//        } else {
//            System.out.println("MyClass doesn't contain 5.5");
//        }

    }
}


