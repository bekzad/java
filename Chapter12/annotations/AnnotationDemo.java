package annotations;

@Deprecated
class MyClass {
    String msg;

    MyClass(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}

public class AnnotationDemo {

    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        MyClass object = new MyClass("Something");
        System.out.println(object.getMsg());
    }

    public static void main(String[] args) {
        myMeth();
    }
}
