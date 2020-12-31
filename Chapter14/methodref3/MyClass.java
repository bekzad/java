package methodref3;

public class MyClass {
    private String s;

    MyClass(String s) {
        this.s = s;
    }

    MyClass() {
        s = "";
    }

    public String getS() {
        return s;
    }
}
