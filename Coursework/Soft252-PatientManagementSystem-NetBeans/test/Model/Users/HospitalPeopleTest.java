/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jonat
 */
public class HospitalPeopleTest {
    
    public HospitalPeopleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class HospitalPeople.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        HospitalPeople instance = new HospitalPeopleImpl();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class HospitalPeople.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "username";
        HospitalPeople instance = new HospitalPeopleImpl();
        instance.setUsername(username);
        assertEquals("username", instance.username);
    }

    /**
     * Test of getPassword method, of class HospitalPeople.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        HospitalPeople instance = new HospitalPeopleImpl();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class HospitalPeople.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password";
        HospitalPeople instance = new HospitalPeopleImpl();
        instance.setPassword(password);
        assertEquals("password", instance.password);
    }

    /**
     * Test of getFirstName method, of class HospitalPeople.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        HospitalPeople instance = new HospitalPeopleImpl();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class HospitalPeople.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "firstname";
        HospitalPeople instance = new HospitalPeopleImpl();
        instance.setFirstName(firstName);
        assertEquals("firstname", instance.firstName);
    }

    /**
     * Test of getLastName method, of class HospitalPeople.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        HospitalPeople instance = new HospitalPeopleImpl();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLastName method, of class HospitalPeople.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "lastname";
        HospitalPeople instance = new HospitalPeopleImpl();
        instance.setLastName(lastName);
        assertEquals("lastname", instance.lastName);
    }

    /**
     * Test of getAddress method, of class HospitalPeople.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        HospitalPeople instance = new HospitalPeopleImpl();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAddress method, of class HospitalPeople.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "address";
        HospitalPeople instance = new HospitalPeopleImpl();
        instance.setAddress(address);
        assertEquals("address", instance.address);
    }

    public class HospitalPeopleImpl extends HospitalPeople {
    }
    
}
