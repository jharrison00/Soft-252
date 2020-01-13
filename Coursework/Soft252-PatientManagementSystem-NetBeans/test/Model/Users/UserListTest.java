/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import java.util.ArrayList;
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
public class UserListTest {
    
    public UserListTest() {
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
     * Test of getAllUsersList method, of class UserList.
     */
    @Test
    public void testGetAllUsersList() {
        System.out.println("getAllUsersList");
        UserList instance = new UserList();
        ArrayList<HospitalPeople> expResult = null;
        ArrayList<HospitalPeople> result = instance.getAllUsersList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAllUsersList method, of class UserList.
     */
    @Test
    public void testSetAllUsersList() {
        System.out.println("setAllUsersList");
        ArrayList<HospitalPeople> allUsersList = null;
        UserList instance = new UserList();
        instance.setAllUsersList(allUsersList);
        assertEquals(null, instance.getAllUsersList());
    }
    
}
