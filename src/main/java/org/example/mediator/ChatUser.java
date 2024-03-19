package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatUser {
    private String username;

    private ChatRoomMediator chatRoomMediator;

    protected List<String> list = new ArrayList<>();

    public ChatUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ChatRoomMediator getChatRoomMediator() {
        return chatRoomMediator;
    }

    public void setChatRoomMediator(ChatRoomMediator chatRoomMediator) {
        this.chatRoomMediator = chatRoomMediator;
    }

    public void send(String message){
        System.out.println("Me : " + message);
        chatRoomMediator.sendMessage(username,message);
    };

    public abstract void receiveMessage(String sender, String message);

}
