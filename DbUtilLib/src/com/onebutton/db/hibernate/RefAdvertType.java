package com.onebutton.db.hibernate;
// Generated 17.11.2013 14:13:39 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * RefAdvertType generated by hbm2java
 */
public class RefAdvertType  implements java.io.Serializable {


     private int idAdvType;
     private String name;
     private Set<Advert> adverts = new HashSet<Advert>(0);
     private int count;

    public RefAdvertType() {
    }

	
    public RefAdvertType(int idAdvType) {
        this.idAdvType = idAdvType;
    }
    public RefAdvertType(int idAdvType, String name, Set<Advert> adverts) {
       this.idAdvType = idAdvType;
       this.name = name;
       this.adverts = adverts;
    }
   
    public int getIdAdvType() {
        return this.idAdvType;
    }
    
    public void setIdAdvType(int idAdvType) {
        this.idAdvType = idAdvType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<Advert> getAdverts() {
        return this.adverts;
    }
    
    public void setAdverts(Set<Advert> adverts) {
        this.adverts = adverts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}


