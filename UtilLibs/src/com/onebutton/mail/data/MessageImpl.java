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
public class MessageImpl implements Message{
    
    private HeaderParameter headerParam;
    private String subject;
    private String body;
    private List<Attachment> attache;

    public MessageImpl(String subject, String body){
        this.subject = subject;
        this.body = body;
    }

    public MessageImpl(HeaderParameter headerParam, String subject, String body, List<Attachment> attache) {
        this.headerParam = headerParam;
        this.subject = subject;
        this.body = body;
        this.attache = attache;
    }

    public MessageImpl(String subject, String body, List<Attachment> attache) {
        this.subject = subject;
        this.body = body;
        this.attache = attache;
    }        

    public MessageImpl() {
    }
    
    
    @Override
    public List<Attachment> getAttache() {
        return attache;
    }

    @Override
    public void setAttache(List<Attachment> attache) {
        this.attache = attache;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public HeaderParameter getHeaderParam() {
        return headerParam;
    }

    @Override
    public void setHeaderParam(HeaderParameter headerParam) {
        this.headerParam = headerParam;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }        
    
}
