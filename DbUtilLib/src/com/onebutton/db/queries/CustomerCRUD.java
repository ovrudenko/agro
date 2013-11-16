/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.dao.CustomerDAO;
import com.onebutton.db.hibernate.Customer;
import com.onebutton.db.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author admin
 */
public class CustomerCRUD implements CustomerDAO {
    
    Session session = null;
    SessionFactory factory = null;

    public CustomerCRUD() {
        factory = HibernateUtil.getSessionFactory();
        session = factory.openSession();
    }
    
    private Session getSession() {
        if (session == null || !session.isOpen()) {
            session = factory.openSession();
        }
        return session;
    }

    private void sessionClose() {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    @Override
    public int insert(Customer customer) {
        getSession().beginTransaction();
        session.save(customer);
        System.out.println(customer.getIdCustomer());
        session.getTransaction().commit();
        sessionClose();
        return customer.getIdCustomer();
    }

    @Override
    public void update(Customer customer) {
        getSession().beginTransaction();
        session.update(customer);
        session.getTransaction().commit();
        sessionClose();
    }
    
    @Override
    public Customer getCustomerById(int idCustomer) {
        Criteria criteria = getSession().createCriteria(Customer.class);
        Criterion idRest = Restrictions.eq("idCustomer", idCustomer);
        criteria.add(idRest);
        Customer customer = (Customer) criteria.uniqueResult();
        sessionClose();
        return customer;
    }

    @Override
    public void delete(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
