/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.send;

import com.onebutton.mail.data.Message;
import com.onebutton.mail.data.SystemMailParameter;
import com.onebutton.mail.letter.Letter;
import com.onebutton.mail.letter.ProfileActivationLetter;
import com.onebutton.user.data.User;

/**
 *
 * @author админ
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("marina", "password", "Марина Михайловна", "Рыбина", "tote.sadom@gmail.com");
        Letter letter = new ProfileActivationLetter(user);
        SystemMailParameter param = new SystemMailParameter("agromir_robot@mail.ru", user.geteMail(), "smtp.mail.ru");
        Message message = letter.constructLetter();
        MailSender sender = new MailSenderImpl(message, param);
    }
}
