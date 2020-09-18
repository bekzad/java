class KbIn {
    public static void main(String args[])
        throws java.io.IOException {
            char ch;
            System.out.print("Press a key and Enter: ");
            int i = System.in.read();
            ch = (char) i;
            System.out.println("Your character is: " + ch);
            System.out.println("Your character in interger is: " + i);
    }
}