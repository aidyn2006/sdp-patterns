package org.example.chainResponsibilitySdp;

public class SpamHandler extends EmailHandler {
    @Override
    public void handleEmail(Email email) {
        if (email.getBody().toLowerCase().contains("spam") || email.getSubject().toLowerCase().contains("spam")) {
            email.setSpam(true);
            System.out.println("Email marked as spam: " + email.getSubject());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}
