/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.bean;

import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.service.AdvertService;
import com.onebutton.service.RefAdvertTypeService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author lolka
 */
@ManagedBean
@SessionScoped
public class MainPageBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private List<Advert> advs = new ArrayList<Advert>();
    public List<RefAdvertType> refAdvertType = new ArrayList<RefAdvertType>();
    

    public List<Advert> getAdvs() {
        if (advs != null) System.out.println("SIZE " + advs.size());
        return advs;
    }

    public void setAdvs(List<Advert> advs) {
        this.advs = advs;
    }
    
    public String getAdvertText(){
        if (getLastAddedAdverts().size() > 0){
            Advert adv = getLastAddedAdverts().get(0);
            return adv.getText();
        }else{
            return "";
        }
        
    }  
    public  List<Advert> getLastAddedAdverts(){
        AdvertService as = new AdvertService();
        advs = as.getLastAddedAdverts();
        return advs;
    }
    
    public List<RefAdvertType> getGropedTypes(){
        RefAdvertTypeService selector= new RefAdvertTypeService();
        refAdvertType = selector.getGropedAdvertTypes();
        return refAdvertType;
    }

    public void setRefAdvertType(List<RefAdvertType> refAdvertType) {
        this.refAdvertType = refAdvertType;
    }
    
    
}
