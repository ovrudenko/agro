/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.service;

import com.onebutton.crypto.PasswordHash;
import com.onebutton.db.dao.RefSmtpAddressDAO;
import com.onebutton.db.hibernate.RefSmtpAddress;
import com.onebutton.db.queries.RefSmtpAddressQueries;
import com.onebutton.mail.data.Message;
import com.onebutton.mail.data.SystemMailParameter;
import com.onebutton.mail.letter.Letter;
import com.onebutton.mail.letter.ProfileActivationLetter;
import com.onebutton.mail.send.MailSender;
import com.onebutton.mail.send.MailSenderImpl;
import com.onebutton.user.data.User;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/**
 *
 * @author lolka
 */
public class AuthUserService {

    private User newUser;
    private static final String BASE_URL = "http://localhost:8080/Agromir";

    public AuthUserService(String login, String password, String name, String surname, String eMail) {
        newUser = new User(login, password, name, surname, eMail);
    }
    
    public void sendConfirmLetter() throws NoSuchAlgorithmException, InvalidKeySpecException{
        String smtpDomain = getSmtpDomain();
        Letter letter = new ProfileActivationLetter();
        SystemMailParameter param = new SystemMailParameter("agromir_robot@lenta.ru", newUser.geteMail(), smtpDomain);
        String url = getGeneratedAuthUrl();
        String[] params = new String[]{newUser.getName() + " " + newUser.getSurname(), newUser.getLogin(), url };
        Message message = letter.constructLetter(params);
        MailSender sender = new MailSenderImpl(message, param);
    }
    
    private String getSmtpDomain(){
        RefSmtpAddressDAO dao = new RefSmtpAddressQueries();
        List<RefSmtpAddress> smtpAddress = dao.getSmtpServerNameByDomainName(getSmtpDomain(newUser));
        return smtpAddress.get(0).getSmtpServerName();
    }

    private String getSmtpDomain(User user) {
        return user.getDomainName();
    }
    
    private String getGeneratedAuthUrl() throws NoSuchAlgorithmException, InvalidKeySpecException{
        StringBuilder url = new StringBuilder();
        String urlHash = PasswordHash.createHash(newUser.getLogin());
        return url.append(BASE_URL).append("/").append(urlHash).toString();
    }
}
