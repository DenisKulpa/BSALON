package com.salonschedule.email;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.activation.*;

public class EmailController {

    private static final String HOST = "smtp.gmail.com";
    private static final String to = "viktor.voytko@gmail.com";
    private static final String from = "wishtanuki@gmail.com";

    public void send(String userName, String password) {

        Properties props = new Properties();
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.gmail.com");
        // props.put("mail.debug", "false");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props, new Authenticator() {
            // Set the account information session，transport will send mail
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("wishtanuki@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("victor.voytko@gmail.com"));
            message.setSubject("Testing Subject");
            message.setText("Dear Master," +
                    "\n\n Check youre BSALON account, please! You have a client");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
