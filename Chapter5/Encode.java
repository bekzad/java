
public class Encode {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 78;

        System.out.println("Message: " + msg);

        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.println("Encoded message: " + encmsg);

        for (int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }

        System.out.print("Decoded message: " + decmsg);
    }
}