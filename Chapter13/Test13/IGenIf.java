package Test13;

public interface IGenIf<T, V extends T> {
}

class MyClass<T, V extends T> implements IGenIf<T, V> {

}
