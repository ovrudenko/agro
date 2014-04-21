/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.dao.RefProductDAO;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.RefProduct;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author lolka
 */
public class RefProductCRUD implements RefProductDAO {

    Session session = null;
    SessionFactory factory = null;

    public RefProductCRUD() {
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
    public int insert(RefProduct refProduct) {
        getSession().beginTransaction();
        session.save(refProduct);
        System.out.println(refProduct.getIdProduct());
        session.getTransaction().commit();
        sessionClose();
        return refProduct.getIdProduct();
    }

    @Override
    public void update(RefProduct refProduct) {
        getSession().beginTransaction();
        session.update(refProduct);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void delete(RefProduct refProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RefProduct getRefProductById(int idRefProduct) {
        Criteria criteria = getSession().createCriteria(RefProduct.class);
        Criterion idRest = Restrictions.eq("idProduct", idRefProduct);
        criteria.add(idRest);
        RefProduct customer = (RefProduct) criteria.uniqueResult();
        sessionClose();
        return customer;
    }

    @Override
    public List<RefProduct> getRefProducts() {
        Criteria criteria = getSession().createCriteria(RefProduct.class);
        List<RefProduct> rf = criteria.list();
        sessionClose();
        return rf;
    }

}
