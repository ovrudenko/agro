/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.dao;

import com.onebutton.db.hibernate.Person;

/**
 *
 * @author admin
 */
public interface PersonDAO {
    public int insert(Person person);
    public void update(Person person);
    public void delete(Person person);
    public Person getPersonById(int idPerson);
}
