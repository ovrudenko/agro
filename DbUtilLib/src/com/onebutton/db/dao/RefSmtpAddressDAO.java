/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.dao;

import com.onebutton.db.hibernate.RefSmtpAddress;
import java.util.List;

/**
 *
 * @author lolka
 */
public interface RefSmtpAddressDAO {
    
    public void insert(RefSmtpAddress address);

    public void update(RefSmtpAddress address);

    public void delete(RefSmtpAddress address);

    public List<RefSmtpAddress> getSmtpServerNameByDomainName(String dominName);
}
