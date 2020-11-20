package help;

public class HelpDemo {
    public static void main(String[] args) {
        Help helpObject = new Help("help/helpfile.txt");
        String topic;

        System.out.println("Enter stop to end");
        do {
            topic = helpObject.getSelection();
            if (!helpObject.helpOn(topic)){
                System.out.println("Topic not found.\n");
            }

        } while (!topic.equals("stop"));

    }
}
