/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.queries;

import com.onebutton.db.dao.OrganizationDAO;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.Organization;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author admin
 */
public class OrganizationQueries implements OrganizationDAO {
    
    Session session = null;
    SessionFactory factory = null;

    public OrganizationQueries() {
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
    public void insert(Organization organization) {
        getSession().beginTransaction();
        session.save(organization);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void update(Organization organization) {
        getSession().beginTransaction();
        session.update(organization);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void delete(Organization organization) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Organization getOrganizationById(int idOrganization) {
        Criteria criteria = getSession().createCriteria(Organization.class);
        Criterion idRest = Restrictions.eq("idOrganization", idOrganization);
        criteria.add(idRest);
        Organization organization = (Organization) criteria.uniqueResult();
        sessionClose();
        return organization;
    }

}
