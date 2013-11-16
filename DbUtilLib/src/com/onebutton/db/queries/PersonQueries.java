/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.dao.PersonDAO;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author admin
 */
public class PersonQueries implements PersonDAO {

    Session session = null;
    SessionFactory factory = null;

    public PersonQueries() {
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
    public int insert(Person person) {
        getSession().beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        sessionClose();
        return person.getIdPerson();
    }

    @Override
    public void update(Person person) {
        getSession().beginTransaction();
        session.update(person);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void delete(Person person) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person getPersonById(int idPerson) {
        Criteria criteria = getSession().createCriteria(Person.class);
        Criterion idRest = Restrictions.eq("idPerson", idPerson);
        criteria.add(idRest);
        Person person = (Person) criteria.uniqueResult();
        sessionClose();
        return person;
    }
}
