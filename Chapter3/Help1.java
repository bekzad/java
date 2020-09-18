
public class Help1 {
    public static void main(String args[])
        throws java.io.IOException {
            char ignore, choice;
            do{
                System.out.println("Help on:");
                System.out.println("\t1. If");
                System.out.println("\t2. Switch");
                System.out.println("Choose one:");
    
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' || choice > '2');

            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (condition) statement");
                    System.out.println("else statement");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch (expression) {");
                    System.out.println("\tcase constant:");
                    System.out.println("\t\tstatement sequence");
                    System.out.println("\t\tbreak;");
                    System.out.println("\t// ...");
                    System.out.println("}");
                    break;
            }
        }
}