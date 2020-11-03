package multInheritance;

public interface Alpha {
    default void reset() {
        System.out.println("Reset in Alpha");
    }
}

