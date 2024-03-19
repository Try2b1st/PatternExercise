package org.example.mediator;

public class User extends ChatUser{
    public User(String username) {
        super(username);
    }

    @Override
    public void receiveMessage(String sender, String message) {
        String s = sender + " : " + message;
        System.out.println(s);
        this.list.add(s);
    }
}
