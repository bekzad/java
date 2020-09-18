
public class StringOperations {
    public static void main(String args[]) {
        String str1 = "Something";
        String str2 = new String(str1);
        String str3 = new String("Something else");

        System.out.println("Length of str1 is: " + str1.length());

        for (i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if(str1.equals(str2)) {
            System.out.println("Str1 equals str2");
        }

        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("Str1 equals str3");
        } 
        else if (result > 0) {
            System.out.println("Str1 is greater that str3");
        }
        else {
            System.out.println("Str1 is less that str3");
        }

        str2 = "One TwoOne Three";

        System.out.println("Index of first occurence of One: " + str2.indexOf("One"));

        System.out.println("Index of last occurence of One: " + str2.lastIndexOf("One"));
    }
}