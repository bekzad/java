package lambda4;

public class LamdaDemo {
    public static void main(String[] args) {

        NumericTest<String> strTest = (str1, str2) -> str1.indexOf(str2) >= 0;
        boolean b = strTest.test("hello world", "hello");
        System.out.println(b);

        NumericTest<Integer> isFactor = (n, m) -> n % m == 0;
        b = isFactor.test(20, 4);
        System.out.println(b);
    }
}
