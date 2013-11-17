/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.send;

import com.onebutton.mail.data.Message;
import com.onebutton.mail.data.SystemMailParameter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author lolka
 */
public final class MailSenderImpl extends MailSender {

    private MimeBodyPart messageBodyPart;
    private Multipart multipart;
    private Message message;
    private SystemMailParameter sysMailParameter;
    private Properties props;
    private javax.mail.Message msg;
    private Session session;

    public MailSenderImpl(Message message, SystemMailParameter sysMailParameter) {
        try {
            this.message = message;
            this.sysMailParameter = sysMailParameter;
            props = new Properties();
            messageBodyPart = new MimeBodyPart();
            multipart = new MimeMultipart();
            session = Session.getInstance(addProperties(), new Authenticator());
            msg = new MimeMessage(session);
            addPassport();
            multipart.addBodyPart(addBody());
            msg.setSentDate(new Date());
            msg.setContent(multipart);
            Transport.send(msg);
        } catch (MessagingException ex) {
            ex.printStackTrace();
            Logger.getLogger(MailSenderImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Properties addProperties() {
        //  props.setProperty("mail.smtp.starttls","true"); 
        props.setProperty(MAIL_SMTP_HOST, sysMailParameter.getHost());
        props.setProperty(MAIL_SMTP_PORT, sysMailParameter.DEFAUL_PORT);
        props.setProperty("mail.smtp.starttls.enable", "true");
//        props.setProperty("mail.smtp.starttls.required", "true"); // added this line 
//                props.setProperty("mail.smtp.socketFactory.port", sysMailParameter.DEFAUL_PORT); // added this line 
//                props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // added this line 
//                props.setProperty("mail.smtp.socketFactory.fallback", "false"); // added this line 
        //props.setProperty(MAIL_STORE_PROTOCOL, "pop3");
        //props.setProperty(MAIL_TRANSPORT_PROTOCOL, "smtp");
        props.setProperty(MAIL_SMTP_AUTH, "true");
        props.setProperty(MAIL_DEBUG, "true");
        return props;
    }

    @Override
    public void addPassport() throws AddressException, MessagingException {
        try {
            InternetAddress[] fromAddr;
            try {
                fromAddr = InternetAddress.parse(sysMailParameter.getUserFrom(), false);
                System.out.println(sysMailParameter.getUserTo());
            } catch (AddressException ex) {
                throw new AddressException("Нет отправителя письма");
            }

            msg.setFrom(fromAddr[0]);
            msg.setRecipients(javax.mail.Message.RecipientType.TO,
                    InternetAddress.parse(sysMailParameter.getUserTo(), false));
            msg.setSubject(message.getSubject());
        } catch (MessagingException ex) {
            throw new MessagingException("Не возможно создать сообщение");
        }
    }

    @Override
    public BodyPart addBody() throws MessagingException {
        try {
                messageBodyPart.setText(message.getBody(), "KOI8-R");
            messageBodyPart.setHeader(Message.CONTENT_TYPE, message.getHeaderParam().getParameterByKey(Message.CONTENT_TYPE));
//            messageBodyPart.setHeader(Message.CONTENT_DISPOSITION, message.getHeaderParam().getParameterByKey(Message.CONTENT_DISPOSITION));
//            messageBodyPart.setHeader(Message.CONTENT_TRANSFER_ENCODING, message.getHeaderParam().getParameterByKey(Message.CONTENT_TRANSFER_ENCODING));
            return messageBodyPart;
        } catch (MessagingException ex) {
            throw new MessagingException("");
        }
    }

    @Override
    public void addAttachments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private class Authenticator extends javax.mail.Authenticator {

        private PasswordAuthentication authentication;

        public Authenticator() {

            String username = "agromir_robot@mail.ru";

            String password = "Hot_leto200&";

            authentication = new PasswordAuthentication(username, password);

        }

        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }
    }
}
