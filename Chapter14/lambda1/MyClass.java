package lambda1;

public class MyClass {
    public static void main(String[] args) {

        // My val and myVal2 do the same thing
        // Here when lambda expression is assigned to myVal a class instance
        // is constructed and implements the method getValue()
        MyValue myVal = () -> 98.6;
        System.out.println(myVal.getValue());

        // Must be compatible with the return type of getValue()
//        MyValue myVal = () -> "example";

        MyValue myVal2 = new NotLambda();
        System.out.println(myVal2.getValue());

        MyParamValue myPVal = (n) -> 1 / n;
        System.out.println("The reciprocal of 5 is: " + myPVal.getValue(5.0));
    }
}
