package org.example.mediatorPattern;

public class ConcreteUser extends User {

    public ConcreteUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + ": Sending Message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + ": Received Message = " + message);
    }
}
