package org.example.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom implements ChatRoomMediator {
    private Map<String, ChatUser> map = new HashMap<>();

    @Override
    public void addUser(ChatUser chatUser) {
        map.put(chatUser.getUsername(), chatUser);
    }

    @Override
    public void sendMessage(String username ,String message) {
        for (ChatUser user : map.values()) {
            if (!user.getUsername().equals(username)) {
                user.receiveMessage(username, message);
            }
        }
    }
}
