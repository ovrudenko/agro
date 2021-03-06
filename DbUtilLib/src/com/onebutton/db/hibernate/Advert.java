package com.onebutton.db.hibernate;
// Generated 13.10.2013 16:11:27 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Advert generated by hbm2java
 */
public class Advert  implements java.io.Serializable {

    private int count;
     private int idAdvert;
     private Organization organization;
     private RefProduct refProduct;
     private RefArea refArea;
     private RefAdvertType refAdvertType;
     private Customer customer;
     private String text;
     private Date dateCreate;
     private Boolean isDelete;
     private Set statAdvertStories = new HashSet(0);
     private Set statAdvertActualities = new HashSet(0);

    public Advert() {
    }

	
    public Advert(int idAdvert) {
        this.idAdvert = idAdvert;
    }
    public Advert(int idAdvert, Organization organization, RefProduct refProduct, RefArea refArea, RefAdvertType refAdvertType, Customer customer, String text, Date dateCreate, Boolean isDelete, Set statAdvertStories, Set statAdvertActualities) {
       this.idAdvert = idAdvert;
       this.organization = organization;
       this.refProduct = refProduct;
       this.refArea = refArea;
       this.refAdvertType = refAdvertType;
       this.customer = customer;
       this.text = text;
       this.dateCreate = dateCreate;
       this.isDelete = isDelete;
       this.statAdvertStories = statAdvertStories;
       this.statAdvertActualities = statAdvertActualities;
    }
   
    public int getIdAdvert() {
        return this.idAdvert;
    }
    
    public void setIdAdvert(int idAdvert) {
        this.idAdvert = idAdvert;
    }
    public Organization getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    public RefProduct getRefProduct() {
        return this.refProduct;
    }
    
    public void setRefProduct(RefProduct refProduct) {
        this.refProduct = refProduct;
    }
    public RefArea getRefArea() {
        return this.refArea;
    }
    
    public void setRefArea(RefArea refArea) {
        this.refArea = refArea;
    }
    public RefAdvertType getRefAdvertType() {
        return this.refAdvertType;
    }
    
    public void setRefAdvertType(RefAdvertType refAdvertType) {
        this.refAdvertType = refAdvertType;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public Date getDateCreate() {
        return this.dateCreate;
    }
    
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
    public Boolean getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
    public Set getStatAdvertStories() {
        return this.statAdvertStories;
    }
    
    public void setStatAdvertStories(Set statAdvertStories) {
        this.statAdvertStories = statAdvertStories;
    }
    public Set getStatAdvertActualities() {
        return this.statAdvertActualities;
    }
    
    public void setStatAdvertActualities(Set statAdvertActualities) {
        this.statAdvertActualities = statAdvertActualities;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




}


