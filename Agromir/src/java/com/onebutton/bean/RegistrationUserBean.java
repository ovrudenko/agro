/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.bean;

import com.onebutton.crypto.PasswordHash;
import com.onebutton.db.hibernate.Customer;
import com.onebutton.db.hibernate.Person;
import com.onebutton.db.queries.CustomerCRUD;
import com.onebutton.db.queries.PersonQueries;
import com.onebutton.mail.data.Message;
import com.onebutton.mail.data.SystemMailParameter;
import com.onebutton.mail.letter.Letter;
import com.onebutton.mail.letter.ProfileActivationLetter;
import com.onebutton.mail.send.MailSender;
import com.onebutton.mail.send.MailSenderImpl;
import com.onebutton.service.AuthUserService;
import com.onebutton.user.data.User;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author lolka
 */
@ManagedBean
@SessionScoped
public class RegistrationUserBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String eMail;
    private String confirmPassword;
    private boolean openRegistrForm;

    public boolean isOpenRegistrForm() {
        return openRegistrForm;
    }

    public void doOpenRegistrForm() {
        openRegistrForm = true;
    }

    public void doCloseRegistrForm() {
        openRegistrForm = false;
    }

    public void setOpenRegistrForm(boolean openRegistrForm) {
        this.openRegistrForm = openRegistrForm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void registration() {
        if (password.equals(confirmPassword)) {
            try {
                String hashPassword = PasswordHash.createHash(password);
                Customer customer = new Customer();
                customer.setEmail(eMail);
                customer.setLogin(login);
                customer.setPassword(hashPassword);
                CustomerCRUD customerQuery = new CustomerCRUD();
                customerQuery.insert(customer);
                Person person = new Person();
                person.setName(name);
                person.setSurname(surname);
                person.setCustomer(customer);
                PersonQueries personQuery = new PersonQueries();
                personQuery.insert(person);
                AuthUserService us = new AuthUserService(login, password, name, surname, eMail);
                us.sendConfirmLetter();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(RegistrationUserBean.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(RegistrationUserBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Пароли совпали!");
        } else {
            System.out.println("Пароли не совпадают");
        }

    }

}
