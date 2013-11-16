/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.send;

import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;

/**
 *
 * @author lolka
 */
public abstract class MailSender {

    public static final String MAIL_SMTP_HOST = "mail.smtp.host";
    public static final String MAIL_SMTP_PORT = "mail.smtp.port";
    public static final String MAIL_STORE_PROTOCOL = "mail.store.protocol";
    public static final String MAIL_TRANSPORT_PROTOCOL = "mail.transport.protocol";
    public static final String MAIL_SMTP_AUTH = "mail.smtp.auth";
    public static final String MAIL_DEBUG = "mail.debug";

    public abstract Properties addProperties();

    public abstract void addPassport() throws AddressException, MessagingException ;

    public abstract BodyPart addBody()throws MessagingException;

    public abstract void addAttachments();

}
