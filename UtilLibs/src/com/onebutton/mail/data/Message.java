/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.data;

import java.util.List;

/**
 *
 * @author lolka
 */
public interface Message {

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";

    public List<Attachment> getAttache();

    public void setAttache(List<Attachment> attache);

    public String getBody();

    public void setBody(String body);

    public HeaderParameter getHeaderParam();

    public void setHeaderParam(HeaderParameter headerParam);

    public String getSubject();

    public void setSubject(String subject);
}
