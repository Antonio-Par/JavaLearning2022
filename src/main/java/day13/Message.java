package day13;

import java.util.Date;

public class Message {

    // fields
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    // constructor
    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    // getters
    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }

    // toString()
    public String toString() {
        return "FROM: " + sender.getUserName() + "\n" +
                "TO: " + receiver.getUserName() + "\n" +
                "ON: " + date + "\n" +
                text;
    }
}
