/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.dao;

import com.onebutton.db.hibernate.Organization;

/**
 *
 * @author admin
 */
public interface OrganizationDAO {
    public void insert(Organization organization);
    public void update(Organization organization);
    public void delete(Organization organization);
    public Organization getOrganizationById(int idOrganization);
}
