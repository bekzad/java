
public class Help2 {
    public static void main(String args[])
        throws java.io.IOException {
            char ignore, choice;

            outer: 
            for( ; ; ) {
                do{
                    System.out.println("Help on:");
                    System.out.println("\t1. If");
                    System.out.println("\t2. Switch");
                    System.out.println("\t3. Break");
                    System.out.println("\t4. Continue\n");
                    System.out.println("Choose one (q to quit):");
        
                    choice = (char) System.in.read();

                    if (choice == 'q') {
                        break outer;
                    }

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');

                } while (choice < '1' || choice > '4');

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
                    case '3':
                        System.out.println("The break:\n");
                        System.out.println("break; or break label;");
                        break;
                    case '4':
                        System.out.println("The continue:\n");
                        System.out.println("continue; or continue label;");
                        break;
                }
                System.out.println("\n");
            }
        }   
}