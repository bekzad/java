package help;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpfile;

    Help (String fname) {
        helpfile = fname;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;

        try (BufferedReader br = new BufferedReader(new FileReader(helpfile))){
            do {
                ch = br.read();
                if (ch == '#') {
                    topic = br.readLine();
                    if (topic.compareTo(what) == 0) {
                        do {
                            info = br.readLine();
                            if (info != null) System.out.println(info);
                            else { break; }
                        } while (!info.equals(""));

                        return true;
                    }
                }
            } while (ch != -1);
        }
        catch (IOException e) {
            System.out.println(e);
            return false;
        }

        return false;
    }

    String getSelection() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String topic = "";

        try {
            topic = br.readLine();
            return topic;
        } catch (IOException e) {
            System.out.println(e);
        }
        return topic;
    }
}
