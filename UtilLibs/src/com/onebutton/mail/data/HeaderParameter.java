/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.mail.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lolka
 */
public class HeaderParameter {

    private Map<String, String> parameters;
    
    public HeaderParameter(){
        parameters = new HashMap<String, String>();
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameter(String key, String parameter) {
        parameters.put(key, parameter);
    }
    
    public String getParameterByKey(String key){
        return parameters.get(key);
    }
}
