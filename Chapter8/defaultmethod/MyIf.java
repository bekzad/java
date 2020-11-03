package defaultmethod;

public interface MyIf {
    int getUserId();

    // Default method is like a non-abstract method in an abstract class
    default int getAdminId() {
        return 1;
    }

    // Static method
    static int getUniversalId() {
        return 0;
    }
}

// Here no implementation of default method
class MyIfImp implements MyIf {
    @Override
    public int getUserId() {
        return 124;
    }
}

class MyIfImp2 implements MyIf {
    @Override
    public int getUserId() {
        return 124;
    }

    @Override
    public int getAdminId() {
        return 14;
    }
}
