package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1, u2, u3;
        u1 = new User("Louis");
        u2 = new User("Donna");
        u3 = new User("Tara");

        u1.sendMessage(u2, "Hello, my little fella!");
        u2.sendMessage(u1, "Hey my big bro!");
        u1.sendMessage(u1, "How you doing?");
        u2.sendMessage(u1, "I'm doing pretty well, thanks )))");
        u2.sendMessage(u1, "What about you, how have you been?");

        u3.sendMessage(u1, "Hello sweetheart!");
        u1.sendMessage(u3, "Hey darling, what can I do for you?");
        u3.sendMessage(u1, "I'd like to ask you...");
        u1.sendMessage(u3, "Sure, fire away!");
        u3.sendMessage(u1, "What are we having for dinner tonight?");
        u1.sendMessage(u3, "I haven't thought of it... but... consider it's done!");

        u3.sendMessage(u1, "You are the best person I've ever met! Love you!");


        MessageDatabase.showDialog(u1, u3);
    }
}
