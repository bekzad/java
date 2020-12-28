package generics7;

public class RawType {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(55);
        Gen<String> strOb = new Gen<>("example");
        Gen raw = new Gen(55.2);

        Double d = (Double) raw.getOb();
        System.out.println(d);

        // This is gonna give a runtime error because raw type has a double inside
        int i = (Integer) raw.getOb();

        // You can assign raw type to any generic object reference
        iOb = raw;
        // However because the type inside raw type is different this will have a runtime error
        i = iOb.getOb();

        // You can also assign any generic object into a raw type
        raw = strOb;
        // But this will give a runtime error because raw now has string in it not double
        d = (Double) raw.getOb();

        System.out.println(d);


    }
}

