package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public interface ChatRoomMediator {
    void addUser(ChatUser chatUser);

    void sendMessage(String username, String message);

}
