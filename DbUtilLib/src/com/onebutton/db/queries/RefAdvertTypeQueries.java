/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import java.util.List;
import com.onebutton.db.dao.RefAdvertTypeDAO;
import com.onebutton.db.entities.RefAdvertTypeEntity;
import com.onebutton.db.hibernate.HibernateUtil;
import com.onebutton.db.hibernate.RefAdvertType;
import java.sql.PreparedStatement;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.classic.GroupByParser;
import org.hibernate.transform.Transformers;

/**
 *
 * @author admin
 */
public class RefAdvertTypeQueries implements RefAdvertTypeDAO {

    Session session = null;
    SessionFactory factory = null;

    public RefAdvertTypeQueries() {
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
    public List<RefAdvertType> getRefAdvertTypeList() {
        Criteria criteria = getSession().createCriteria(RefAdvertType.class);
//        ProjectionList proList = Projections.projectionList();
//        proList.add(Projections.property("idAdvType"), "idAdvType");
//        proList.add(Projections.property("name"), "name");
//        criteria.setProjection(proList);
//        //sessionClose();
//        return criteria.setResultTransformer(Transformers.aliasToBean(RefAdvertTypeEntity.class)).list();
        sessionClose();
        return criteria.list();
    }

    @Override
    public List<RefAdvertType> getRefAdvertTypesById(int idAdvType) {
        Criteria criteria = getSession().createCriteria(RefAdvertType.class);
        Criterion criterion = Restrictions.eq("refAdvertType", 
                new RefAdvertType(idAdvType));
        criteria.add(criterion);
        sessionClose();
        return criteria.list();
    }
}

