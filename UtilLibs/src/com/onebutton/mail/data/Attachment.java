/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.data;

/**
 *
 * @author lolka
 */
public class Attachment {

    private byte[] data;
    private String contentType;
    private String fileName;
    private int size;
    private String charset;
    private static final String DEFAULT_CONTENT_TYPE = "base64";
    
    public Attachment(byte[] data, String contentType, String fileName){
        this.data = data;
        this.contentType = contentType;
        this.fileName = fileName;
    }
    
    public Attachment(){
        
    }
    
    public Attachment(byte[] data, String fileName){
        this.data = data;
        this.fileName = fileName;
        this.contentType = DEFAULT_CONTENT_TYPE;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
