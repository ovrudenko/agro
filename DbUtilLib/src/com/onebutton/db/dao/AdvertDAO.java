/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.dao;

import com.onebutton.db.entities.RefAdvertTypeEntity;
import java.util.List;
import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.hibernate.RefProduct;
import com.onebutton.db.params.AdvertParams;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public interface AdvertDAO {
    public void insert(Advert advert);
    public void update(Advert advert);
    public void delete(Advert advert);
    public Advert getAdvertById(int idAdvert);
    public List<Advert> getAdvertListByParams(AdvertParams params);
    public List<Advert> getAdvertListOrderByDate(AdvertParams limit);
    public List<RefAdvertType> getGroupedAdvertsByProductType(Connection connect) throws SQLException;
}
