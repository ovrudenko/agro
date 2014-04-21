/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.dao;

import com.onebutton.db.hibernate.RefProduct;
import java.util.List;

/**
 *
 * @author lolka
 */
public interface RefProductDAO {

    public int insert(RefProduct refProduct);

    public void update(RefProduct refProduct);

    public void delete(RefProduct refProduct);

    public RefProduct getRefProductById(int idRefProduct);
    
    public List<RefProduct> getRefProducts();
}
