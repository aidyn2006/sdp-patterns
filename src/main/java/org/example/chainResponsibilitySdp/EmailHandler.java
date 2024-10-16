package org.example.chainResponsibilitySdp;

public abstract class EmailHandler {
    protected EmailHandler nextHandler;

    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleEmail(Email email);
}
