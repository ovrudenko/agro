/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.dao.RefSmtpAddressDAO;
import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.hibernate.RefSmtpAddress;
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
public class RefSmtpAddressQueries implements RefSmtpAddressDAO {

    Session session = null;
    SessionFactory factory = null;

    public RefSmtpAddressQueries() {
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
    public void insert(com.onebutton.db.hibernate.RefSmtpAddress address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(com.onebutton.db.hibernate.RefSmtpAddress address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(com.onebutton.db.hibernate.RefSmtpAddress address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<RefSmtpAddress> getSmtpServerNameByDomainName(String dominName) {
        Criteria criteria = getSession().createCriteria(RefSmtpAddress.class);
        RefSmtpAddress smtpAddress = new RefSmtpAddress();
        smtpAddress.setDomainName(dominName);
        Criterion smtpserverName = Restrictions.eq("domainName",
                smtpAddress.getDomainName());
        criteria.add(smtpserverName);
        sessionClose();
        return criteria.list();
    }
}
