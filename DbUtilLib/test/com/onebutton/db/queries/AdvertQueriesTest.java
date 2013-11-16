/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.params.AdvertParams;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lolka
 */
public class AdvertQueriesTest {
    
    AdvertQueries aq;
    
    public AdvertQueriesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        aq = new AdvertQueries();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class AdvertQueries.
     */
 /*   @Test
    public void testInsert() {
        System.out.println("insert");
        Advert advert = null;
        AdvertQueries instance = new AdvertQueries();
        instance.insert(advert);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AdvertQueries.
     */
  /*  @Test
    public void testUpdate() {
        System.out.println("update");
        Advert advert = new Advert();
        AdvertQueries instance = new AdvertQueries();
        instance.update(advert);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AdvertQueries.
     */
 /*   @Test
    public void testDelete() {
        System.out.println("delete");
        Advert advert = null;
        AdvertQueries instance = new AdvertQueries();
        instance.delete(advert);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAdvertById method, of class AdvertQueries.
     */
   /* @Test
    public void testGetAdvertById() {
        System.out.println("getAdvertById");
        int idAdvert = 1;
        AdvertQueries instance = new AdvertQueries();
        Advert expResult = null;
        Advert result = instance.getAdvertById(idAdvert);
        System.out.println(result.getText());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAdvertListByParams method, of class AdvertQueries.
     */
    /*@Test
    public void testGetAdvertListByParams() {
        System.out.println("getAdvertListByParams");
        AdvertParams params = null;
        AdvertQueries instance = new AdvertQueries();
        List expResult = null;
        List result = instance.getAdvertListByParams(params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    //@Test
    public void testGroupedAdvertsByProdeuctType(){

        
    }
    
    @Test
    public void testgetAdvertListOrderByDate(){
        AdvertParams p = new AdvertParams();
        p.setLimit(10);
        List<Advert> adv = aq.getAdvertListOrderByDate(p);
        for (int i = 0; i < adv.size(); i++) {
             System.out.println(adv.get(i));
        }
    }
}
