package org.example.chainResponsibilitySdp;

public class Main {
    public static void main(String[] args) {
        SpamHandler spamHandler = new SpamHandler();
        SenderHandler senderHandler = new SenderHandler();
        PriorityHandler priorityHandler = new PriorityHandler();

        spamHandler.setNextHandler(senderHandler);
        senderHandler.setNextHandler(priorityHandler);

        Email email1 = new Email("Normal Message", "user@example.com", "This is a regular email.");
        Email email2 = new Email("Urgent Request", "verified@example.com", "This is urgent.");
        Email email3 = new Email("Spam Offer", "spam@example.com", "Get rich quick! This is a spam email.");

        Email[] emails = { email1, email2, email3 };
        for (Email email : emails) {
            System.out.println("Processing email: " + email.getSubject());
            spamHandler.handleEmail(email);
        }
    }
}
