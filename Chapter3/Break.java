
public class Break {
    public static void main(String args[]) 
        throws java.io.IOException {
            char ch, ignore;
            for (; ;) {
                System.out.print("Press q to quit: ");
                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (ch == 'q') break;
            }
            System.out.println("You pressed q!");
    }
}