
public class ASCII {
    public static void main(String args[]) 
    throws java.io.IOException {
        char choice, ignore;
        int totalChanges = 0;
        do {

            System.out.println("Press . to quit");
            choice = (char) System.in.read();
            if (choice >= 'A' && choice <= 'Z') {
                choice += 32;
                totalChanges++;
            } else if (choice >= 'a' && choice <= 'z') {
                choice -= 32;
                totalChanges++;
            }
            
            System.out.println(choice);
            do {
                ignore = (char) System.in.read();;
            } while (ignore != '\n');

        } while (choice != '.');
        System.out.println(totalChanges);
    }
}