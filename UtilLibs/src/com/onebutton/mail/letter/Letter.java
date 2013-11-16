/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.letter;
import com.onebutton.mail.data.Attachment;
import com.onebutton.mail.data.HeaderParameter;
import com.onebutton.mail.data.Message;
import com.onebutton.mail.data.MessageImpl;
import java.util.List;

/**
 *
 * @author lolka
 */
public abstract class Letter {    
    
    /** В этом методе комбинируем вызовы нижеописанных методов */
    public  Message constructLetter(){
        return new MessageImpl(constructHeaders(), constructSubject(), constructBody(), constructAttachments());
    }
    
    public abstract HeaderParameter constructHeaders();
    
    /** Собираем заголовок письма согласно сути сообщения */
    public abstract String constructSubject();
    
    /** Составляем тело сообщения в зависимости о ситуации */
    public abstract String constructBody();
    
    /** Собираем вложения в список. В списке может быть и только 1 вложение */
    public abstract List<Attachment> constructAttachments();
}
