package org.example.mediator;

public class Client {
    public static void main(String[] args) {
        ChatRoomMediator chatRoomMediator = new ChatRoom();

        ChatUser pgone = new User("pgone");
        ChatUser gai = new User("gai");
        ChatUser jonyj = new User("jonyj");
        pgone.setChatRoomMediator(chatRoomMediator);
        gai.setChatRoomMediator(chatRoomMediator);
        jonyj.setChatRoomMediator(chatRoomMediator);

        chatRoomMediator.addUser(pgone);
        chatRoomMediator.addUser(jonyj);
        chatRoomMediator.addUser(gai);

        pgone.send("好吃不过饺子");
        gai.send("勒是雾都");

    }
}
