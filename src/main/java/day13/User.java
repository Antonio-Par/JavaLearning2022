package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    // fields
    private String userName;
    private List<User> subscriptions;

    // constructor
    public User(String userName) {
        this.userName = userName;
        subscriptions = new ArrayList<>(); // initializing by empty list
    }

    // getters
    public String getUserName() {
        return userName;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }

    // other methods
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return userName;
    }
}
