package org.example.chainResponsibilitySdp;

public class PriorityHandler extends EmailHandler {
    @Override
    public void handleEmail(Email email) {
        if (email.getSubject().toLowerCase().contains("urgent")) {
            email.setPriority(1);
            System.out.println("Email marked as high priority: " + email.getSubject());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        } else {
            System.out.println("Email not marked as high priority: " + email.getSubject());
        }
    }
}
