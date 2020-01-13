/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medicines;

import Model.Users.Secretary;
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
public class MedicineTest {
    
    public MedicineTest() {
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
     * Test of getName method, of class Medicine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Medicine.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name";
        Medicine instance = new Medicine();
        instance.setName(name);
        assertEquals("name", instance.name);
    }

    /**
     * Test of getQuantity method, of class Medicine.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Medicine instance = new Medicine();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Medicine.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Medicine instance = new Medicine();
        instance.setQuantity(quantity);
        assertEquals(0, instance.quantity);
    }
}
