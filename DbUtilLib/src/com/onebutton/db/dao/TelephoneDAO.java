/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.dao;

import java.util.List;
import com.onebutton.db.entities.TelephoneEntity;
import com.onebutton.db.hibernate.Telephone;

/**
 *
 * @author admin
 */
public interface TelephoneDAO {
    public void insert(Telephone telephone);
    public void update(Telephone telephone);
    public void delete(Telephone telephone);
    public Telephone getTelephoneById(int idTelephone);
    public List<TelephoneEntity> getTelephoneListByIdPerson();
}
