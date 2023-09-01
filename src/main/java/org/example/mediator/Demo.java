package org.example.mediator;

public class Demo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Walter");
        User user2 = new ChatUser(chatRoom, "Jessy");
        User user3 = new ChatUser(chatRoom, "Hank");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Say my name");
        user2.send("HEIZENBERG");
    }
}