package multInheritance;

public interface Beta {
    default void reset() {
        System.out.println("Reset in Beta");
    }
}
