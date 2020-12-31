package lambda5;

public class LambdaArgumentDemo {

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Lambda expression that reverses the string
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("String reversed: " + outStr);

        // Lambda expression that replaces the spaces to dashes
        outStr = changeStr((str) -> str.replace(" ", "-"), inStr);
        System.out.println("Space replaced with hyphen " + outStr);

        // Lambda expression that reverses the case of letters
        outStr = changeStr((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                } else {
                    result += Character.toUpperCase(ch);
                }
            }
            return result;
        }, inStr);

        System.out.println("Change the case of letters " + outStr);

        // A lambda expression that removes all spaces from a string
        outStr = changeStr((str) -> str.replace(" ", ""), inStr);
        System.out.println(outStr);
    }
}
