/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.letter;

import com.onebutton.mail.data.Attachment;
import com.onebutton.mail.data.HeaderParameter;
import com.onebutton.mail.data.Message;
import com.onebutton.user.data.User;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lolka
 */
public class ProfileActivationLetter extends Letter {

    private User user;
    private HeaderParameter header;

    public ProfileActivationLetter(User user) {
        this.user = user;
    }

    @Override
    public HeaderParameter constructHeaders() {
        header = new HeaderParameter();
        header.setParameter(Message.CONTENT_TYPE, "text/plain");
        header.setParameter(Message.CONTENT_DISPOSITION, "inline");
        header.setParameter(Message.CONTENT_TRANSFER_ENCODING, "base64");
        return header;
    }

    @Override
    public String constructSubject() {
        return "Agromir.org: Создание нового профиля";
    }

    @Override
    public String constructBody() {
        return "Уважаемый(ая), " + user.getName() + "!\n "
                + "Поздравляем Вас с успешной регистрацией на электронной торговой площадке Арго!\n "
                + "Ваш логин: " + user.getLogin() + "\n "
                + "Ваш пароль: " + user.getPassword() + "\n "
                + "Желаем Вам успешной торговли! \n "
                + "С уважением,\n "
                + "Администрация agromir.org";
    }

    @Override
    public List<Attachment> constructAttachments() {
        return new ArrayList<Attachment>();
    }
}
