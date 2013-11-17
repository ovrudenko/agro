/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.hibernate.RefSmtpAddress;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author lolka
 */
public class RefSmtpAddressQueriesTest {
    
    public RefSmtpAddressQueriesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class RefSmtpAddressQueries.
     */
    @Test
    @Ignore
    public void testInsert() {
        System.out.println("insert");
        RefSmtpAddress address = null;
        RefSmtpAddressQueries instance = new RefSmtpAddressQueries();
        instance.insert(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RefSmtpAddressQueries.
     */
    @Test
    @Ignore
    public void testUpdate() {
        System.out.println("update");
        RefSmtpAddress address = null;
        RefSmtpAddressQueries instance = new RefSmtpAddressQueries();
        instance.update(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RefSmtpAddressQueries.
     */
    @Test
    @Ignore
    public void testDelete() {
        System.out.println("delete");
        RefSmtpAddress address = null;
        RefSmtpAddressQueries instance = new RefSmtpAddressQueries();
        instance.delete(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSmtpServerNameByDomainName method, of class RefSmtpAddressQueries.
     */
    @Test
    public void testGetSmtpServerNameByDomainName() {
        System.out.println("getSmtpServerNameByDomainName");
        String dominName = "mail.ru";
        RefSmtpAddressQueries instance = new RefSmtpAddressQueries();
        String expResult = "smtp.mail.ru";
        List<RefSmtpAddress> result = instance.getSmtpServerNameByDomainName(dominName);
        assertEquals(1, result.size());
        assertEquals(expResult, result.get(0).getSmtpServerName());
        // TODO review the generated test code and remove the default call to fail.
    }
}
