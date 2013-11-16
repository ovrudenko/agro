package com.onebutton.db.hibernate;
// Generated 13.10.2013 16:11:27 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * RefRole generated by hbm2java
 */
public class RefRole  implements java.io.Serializable {


     private int idRole;
     private String name;
     private Set customers = new HashSet(0);

    public RefRole() {
    }

	
    public RefRole(int idRole) {
        this.idRole = idRole;
    }
    public RefRole(int idRole, String name, Set customers) {
       this.idRole = idRole;
       this.name = name;
       this.customers = customers;
    }
   
    public int getIdRole() {
        return this.idRole;
    }
    
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set customers) {
        this.customers = customers;
    }




}


