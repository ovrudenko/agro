/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.data;

/**
 *
 * @author lolka
 */
public class SystemMailParameter {
    
    public static final String DEFAUL_PORT = "25";
    private boolean auth;
    private String userFrom = "";
    private String userTo = "";
    private String passwordUserFrom = "";
    private String host = "";
    private String port = "";      
    
    public SystemMailParameter(String userFrom, String userTo, String host){
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public String getPasswordUserFrom() {
        return passwordUserFrom;
    }

    public void setPasswordUserFrom(String passwordUserFrom) {
        this.passwordUserFrom = passwordUserFrom;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public String getUserTo() {
        return userTo;
    }

    public void setUserTo(String userTo) {
        this.userTo = userTo;
    }
    
    
}
