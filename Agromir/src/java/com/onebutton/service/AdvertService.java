/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.service;

import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.params.AdvertParams;
import com.onebutton.db.queries.AdvertQueries;
import java.util.List;

/**
 *
 * @author lolka
 */
public class AdvertService {
    
    public List<Advert> getLastAddedAdverts(){
        AdvertQueries aq = new AdvertQueries();
        AdvertParams ap = new AdvertParams();
        ap.setIdAdvertType(10);
        return aq.getAdvertListOrderByDate(ap);
    }
    
    
}
