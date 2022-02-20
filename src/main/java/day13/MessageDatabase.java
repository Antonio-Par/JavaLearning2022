package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    // static field
    private static List<Message> messages = new ArrayList<>();

    // methods
    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message messages : messages) {
            if ((u1.equals(messages.getSender()) || u1.equals(messages.getReceiver())) && (u2.equals(messages.getSender()) || u2.equals(messages.getReceiver()))) {
                System.out.println(messages.getSender() + ": " + messages.getText());
            }
        }
    }
}
