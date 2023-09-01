package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
  private final List<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String message, User user) {
    for (User u : users) {
      if (u != user) {
        u.receiveMessage(message);
      }
    }
  }

  public void addUser(User user) {
    users.add(user);
  }
}