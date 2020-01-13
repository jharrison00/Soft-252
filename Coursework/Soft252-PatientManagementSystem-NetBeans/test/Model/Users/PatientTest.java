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
public class PatientTest {
    private Patient patient;     // Empty instance of patient
    
    public PatientTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        patient.setAge(5);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("Testing getAge");
        Patient instance = new Patient();
        instance.setAge(5);
        int expResult = 5;
        int result = instance.getAge();
        assertEquals(expResult,result);      
    } 
}
