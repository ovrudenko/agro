/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.dao;

import com.onebutton.db.hibernate.Customer;

/**
 *
 * @author admin
 */
public interface CustomerDAO {
    public int insert(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
    public Customer getCustomerById(int id);
    public Customer getCustomerByLogin(String login);
    public Customer getCustomerByEMail(String eMail);
}
