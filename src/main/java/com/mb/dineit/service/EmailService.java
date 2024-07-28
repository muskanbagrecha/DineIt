package com.mb.dineit.service;

import com.mb.dineit.models.EmailRecipient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {

    @Value("${spring.mail.host}")
    private String mailHost;

    @Value("${spring.mail.port}")
    private String mailPort;

    @Value("${spring.mail.email}")
    private String from;

    @Value("${spring.mail.password}")
    private String password;

    private Session getSessionObject() throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", mailHost);
        properties.put("mail.smtp.port", mailPort);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        return Session.getInstance(properties);
    }

    public void composeEmail(EmailRecipient recipient, String subject, String message) throws MessagingException {
        try{
            Session session = getSessionObject();
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(from);
            if(subject!=null){
                mimeMessage.setSubject(subject);
            }
            mimeMessage.setRecipient(recipient.getRecipientType(), new InternetAddress(recipient.getAddress()));
            mimeMessage.setText(message);
            Transport.send(mimeMessage, from, password);
        }
        catch (MessagingException ex){
            System.out.println("Failed to send email: " + ex.getMessage());
        }
    }

    public void sendEmail(EmailRecipient recipient, String subject, String message) throws MessagingException {
        composeEmail(recipient, subject, message);
    }

}
