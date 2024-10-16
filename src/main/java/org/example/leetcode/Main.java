package org.example.leetcode;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Main {

    public static void sendEmail(String toEmail, String subject, String body    ) {
        String host = "smtp.mail.ru";
        final String fromEmail = "nurlan.aydin06nnn@mail.ru"; // Ваш email на Mail.ru
        final String password = "KuG3RHjfsAxpsfj4iWyz"; // Ваш пароль

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String toEmail = "nurlan.aydin06@gmail.com";
        String subject = "Ваш код подтверждения";
        Random random = new Random();
        int generatedCode = random.nextInt(89999) + 10000;

        sendEmail(toEmail, subject, "Ваш код подтверждения: " + generatedCode);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите код подтверждения: ");
        int enteredCode = scanner.nextInt();

        if (enteredCode == generatedCode) {
            System.out.println("LOGGED IN");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
