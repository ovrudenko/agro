package com.onebutton.db.hibernate;
// Generated 13.10.2013 16:11:27 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * RefVolumeType generated by hbm2java
 */
public class RefVolumeType  implements java.io.Serializable {


     private int idVolumeType;
     private String shortName;
     private String fullName;
     private Set statAdvertStories = new HashSet(0);

    public RefVolumeType() {
    }

	
    public RefVolumeType(int idVolumeType) {
        this.idVolumeType = idVolumeType;
    }
    public RefVolumeType(int idVolumeType, String shortName, String fullName, Set statAdvertStories) {
       this.idVolumeType = idVolumeType;
       this.shortName = shortName;
       this.fullName = fullName;
       this.statAdvertStories = statAdvertStories;
    }
   
    public int getIdVolumeType() {
        return this.idVolumeType;
    }
    
    public void setIdVolumeType(int idVolumeType) {
        this.idVolumeType = idVolumeType;
    }
    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Set getStatAdvertStories() {
        return this.statAdvertStories;
    }
    
    public void setStatAdvertStories(Set statAdvertStories) {
        this.statAdvertStories = statAdvertStories;
    }




}


