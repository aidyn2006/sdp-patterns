package org.example.chainResponsibilitySdp;

public class SenderHandler extends EmailHandler {
    @Override
    public void handleEmail(Email email) {
        String[] verifiedSenders = {"verified@example.com", "trusted@example.com"};

        boolean isVerified = false;
        for (String sender : verifiedSenders) {
            if (email.getSender().equals(sender)) {
                isVerified = true;
                break;
            }
        }

        if (!isVerified) {
            System.out.println("Email from unverified sender: " + email.getSender());
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}
