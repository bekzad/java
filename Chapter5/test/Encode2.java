
public class Encode2 {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "12345678";
        int j = 0;

        System.out.println("Message: " + msg);

        for (int i = 0; i < msg.length(); i++) {
            if (j >= 8) {
                j = 0;
            }
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
        }

        System.out.println("Encoded message: " + encmsg);

        j = 0;
        for (int i = 0; i < encmsg.length(); i++) {
            if (j >= 8) {
                j = 0;
            }
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
        }

        System.out.println("Decoded message: " + decmsg);
    }
}