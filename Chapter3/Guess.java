
public class Guess {
    public static void main(String args[]) 
        throws java.io.IOException {
            char ch, answer = 'K', ignore;

            do {

                System.out.println("I am thinking of a letter between A and Z");
                System.out.print("Can you guess what it is? ");

                ch = (char) System.in.read();

                // Ignores the values in the buffer 
                do {
                    ignore = (char) System.in.read();
                } 
                while (ignore != '\n');

                if (ch == answer) System.out.println("You guessed it right");
                else {
                    System.out.print("Sorry you're ");
                    if (ch < answer) {
                        System.out.println("too low");
                    } else {
                        System.out.println("too high"); 
                    }
                    System.out.println("Try again!\n");
                }
            }
            while (ch != answer);
        }
}