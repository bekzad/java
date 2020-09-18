
class Help {

    void helpOn(int what){
        switch(what) {
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
        System.out.println();
    }

    void showMenu() {
        System.out.println("Help on:");
        System.out.println("\t1. If");
        System.out.println("\t2. Switch");
        System.out.println("\t3. Break");
        System.out.println("\t4. Continue\n");
        System.out.println("Choose one (q to quit):");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        return true;
    }
}

public class HelpClassDemo {
    public static void main(String args[]) 
    throws java.io.IOException {

        Help helper = new Help();

        char choice, ignore;

        for( ; ; ) {
            do {
                helper.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!helper.isValid(choice));

            if (choice == 'q') {
                break;
            }

            System.out.println("\n");

            helper.helpOn(choice);
        }
    
    }
}


           
