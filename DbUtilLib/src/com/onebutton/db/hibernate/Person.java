package com.onebutton.db.hibernate;
// Generated 17.11.2013 14:13:39 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int idPerson;
     private Organization organization;
     private Customer customer;
     private String name;
     private String surname;
     private String patrenemic;
     private Set<Customer> customers = new HashSet<Customer>(0);
     private Set<Telephone> telephones = new HashSet<Telephone>(0);

    public Person() {
    }

	
    public Person(int idPerson) {
        this.idPerson = idPerson;
    }
    public Person(int idPerson, Organization organization, Customer customer, String name, String surname, String patrenemic, Set<Customer> customers, Set<Telephone> telephones) {
       this.idPerson = idPerson;
       this.organization = organization;
       this.customer = customer;
       this.name = name;
       this.surname = surname;
       this.patrenemic = patrenemic;
       this.customers = customers;
       this.telephones = telephones;
    }
   
    public int getIdPerson() {
        return this.idPerson;
    }
    
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
    public Organization getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPatrenemic() {
        return this.patrenemic;
    }
    
    public void setPatrenemic(String patrenemic) {
        this.patrenemic = patrenemic;
    }
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
    public Set<Telephone> getTelephones() {
        return this.telephones;
    }
    
    public void setTelephones(Set<Telephone> telephones) {
        this.telephones = telephones;
    }




}

