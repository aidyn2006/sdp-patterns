package org.example.mediatorPattern;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
