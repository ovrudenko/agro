/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.queries;

import com.onebutton.db.hibernate.Customer;
import com.onebutton.db.hibernate.Person;
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
public class CustomerCRUDTest {

    String name = "Иван";
    String surname = "Иванов";
    String eMail = "ya@ya.ru";
    String login = "fermer";
    String hashPassword = "testHashPassword";

    public CustomerCRUDTest() {
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

    @Test
    public void insert() {
        Customer customer = new Customer();
        customer.setEmail(eMail);
        customer.setLogin(login);
        customer.setPassword(hashPassword);
        CustomerCRUD customerQuery = new CustomerCRUD();
        int customerId =  customerQuery.insert(customer);
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setCustomer(customer);        
        PersonQueries personQuery = new PersonQueries();
        personQuery.insert(person);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
