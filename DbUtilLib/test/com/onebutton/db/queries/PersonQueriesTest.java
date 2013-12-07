/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onebutton.db.queries;

import com.onebutton.db.hibernate.Person;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class PersonQueriesTest {

    public PersonQueriesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of insert method, of class PersonQueries.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Person person = new Person();
        PersonQueries instance = new PersonQueries();
        int result = instance.insert(person);
        assertTrue(result > 0);
    }

    /**
     * Test of update method, of class PersonQueries.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Person person = null;
        PersonQueries instance = new PersonQueries();
        instance.update(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersonQueries.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Person person = null;
        PersonQueries instance = new PersonQueries();
        instance.delete(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonQueries.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int idPerson = 0;
        PersonQueries instance = new PersonQueries();
        Person expResult = null;
        Person result = instance.getPersonById(idPerson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}