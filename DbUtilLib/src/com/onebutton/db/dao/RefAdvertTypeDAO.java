/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.dao;

import java.util.List;
import com.onebutton.db.entities.RefAdvertTypeEntity;
import com.onebutton.db.hibernate.RefAdvertType;

/**
 *
 * @author admin
 */
public interface RefAdvertTypeDAO {
    public List<RefAdvertType> getRefAdvertTypeList();
    public List<RefAdvertType> getRefAdvertTypesById(int idAdvType);
}
