/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author admin
 */
@ManagedBean(name="profile")
@ViewScoped
public class ProfileBean implements Serializable {


    @ManagedProperty(value = "#{registrationUserBean}")
    private RegistrationUserBean registrationUserBean;
    public void setRegistrationUserBean(RegistrationUserBean newValue) {
        registrationUserBean = newValue;
    }

    //public Cas

    private boolean edit;

    public ProfileBean() {}

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public void openEdit() {
        edit = true;
    }

    public void closeEdit() {
        edit = false;
    }

}
