package lambda6;

// We can't modify the instance variables from the inside of lambda function
public class VarCapture {
    public static void main(String[] args) {
        // This variable needs to be effectively final
        // for lambda to be able to use it
        int num = 10;

        MyFunc myLambda = (n) -> {
            // We can use num
            int v = num + n;
            // But we can't change it
//            num++;
            return v;
        };

        System.out.println(myLambda.func(8));

        // we can't modify our num even here because
        // it won't become effectively final then
//        num++;

    }
}