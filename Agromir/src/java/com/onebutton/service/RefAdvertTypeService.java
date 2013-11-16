/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.service;

import com.onebutton.db.connection.PgsqlConnection;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.queries.AdvertQueries;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lolka
 */
public class RefAdvertTypeService {

    public List<RefAdvertType> getGropedAdvertTypes() {
        AdvertQueries aq = new AdvertQueries();
        List<RefAdvertType> types = null;
        PgsqlConnection pgsql = new PgsqlConnection();
        try {
            types = aq.getGroupedAdvertsByProductType(pgsql.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(RefAdvertTypeService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                pgsql.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(RefAdvertTypeService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return types;
    }
}
