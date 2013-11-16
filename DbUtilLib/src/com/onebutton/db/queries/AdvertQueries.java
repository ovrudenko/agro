/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.connection.PgsqlConnection;
import java.util.List;
import com.onebutton.db.dao.AdvertDAO;
import com.onebutton.db.entities.RefAdvertTypeEntity;
import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.params.AdvertParams;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

/**
 *
 * @author admin
 */
public class AdvertQueries implements AdvertDAO {

    Session session = null;
    SessionFactory factory = null;

    public AdvertQueries() {
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
    public void insert(Advert advert) {
        getSession().beginTransaction();
        session.save(advert);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void update(Advert advert) {
        getSession().beginTransaction();
        session.update(advert);
        session.getTransaction().commit();
        sessionClose();
    }

    @Override
    public void delete(Advert advert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Advert getAdvertById(int idAdvert) {
        Criteria criteria = getSession().createCriteria(Advert.class);
        Criterion idRest = Restrictions.eq("idAdvert", idAdvert);
        criteria.add(idRest);
        Advert advert = (Advert) criteria.uniqueResult();
        sessionClose();
        return advert;
    }

    @Override
    public List<Advert> getAdvertListByParams(AdvertParams params) {
        Criteria criteria = getSession().createCriteria(Advert.class);
        Criterion idAdvertType = Restrictions.eq("refAdvertType",
                new RefAdvertType(params.getIdAdvertType()));
        criteria.add(idAdvertType);
        return (List<Advert>) criteria.list();
    }

    @Override
    public List<Advert> getAdvertListOrderByDate(AdvertParams limit) {
        Criteria criteria = getSession().createCriteria(Advert.class);
        criteria.addOrder(Order.desc("dateCreate"));
        return criteria.list();
    }

    @Override
    public List<RefAdvertType> getGroupedAdvertsByProductType(Connection connect) throws SQLException {
        List<RefAdvertType> advTypes = new ArrayList<RefAdvertType>();
            PreparedStatement ps = connect.prepareStatement("SELECT p.name,  count(p.name) as cnt "
                    + "from ref_product as p inner join  advert  as a on p.id_product=a.id_product "
                    + "group by p.id_product order by (cnt) desc;");
            ResultSet rs = ps.executeQuery();            
            if (rs != null) {

                RefAdvertType advType = null;
                while (rs.next()) {
                    advType = new RefAdvertType();
                    advType.setName(rs.getString("name"));
                    advType.setCount(rs.getInt("cnt"));
                    advTypes.add(advType);
                }
            }
        return advTypes;
    }

}
