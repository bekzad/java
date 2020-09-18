
public class Phone {
    public static void main(String args[]) { 
        String numbers[][] = {
            {"Tom", "555"},
            {"Mary", "666"},
            {"Begish", "777"}
        };
        int i;

        if (args.length != 1) {
            System.out.println("Usage: java Phone name");
        }
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(args[0] + " phone number is " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Name not found");
            }
        }
    }
}