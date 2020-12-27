package generics1;

public class Obj {
    private Object ob;

    Obj(Object ob) {
        this.ob = ob;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
