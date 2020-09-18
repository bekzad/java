
public class Period {
    public static void main(String args[]) 
    throws java.io.IOException {
        char choice, ignore;
        int space = 0;
        do {
            System.out.println("Press .");
            choice = (char) System.in.read();
            if (choice == ' ') space++;
            do {
                ignore = (char) System.in.read();;
            } while (ignore != '\n');
        } while (choice != '.');
        System.out.println(space + " spaces");
    }
}