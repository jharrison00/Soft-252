/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prescriptions;

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
public class PrescriptionListTest {
    
    public PrescriptionListTest() {
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
     * Test of getAllPrescriptions method, of class PrescriptionList.
     */
    @Test
    public void testGetAllPrescriptions() {
        System.out.println("getAllPrescriptions");
        PrescriptionList instance = new PrescriptionList();
        ArrayList<Prescription> expResult = null;
        ArrayList<Prescription> result = instance.getAllPrescriptions();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAllPrescriptions method, of class PrescriptionList.
     */
    @Test
    public void testSetAllPrescriptions() {
        System.out.println("setAllPrescriptions");
        ArrayList<Prescription> allPrescriptions = null;
        PrescriptionList instance = new PrescriptionList();
        instance.setAllPrescriptions(allPrescriptions);
        assertEquals(null, instance.getAllPrescriptions());
    }
    
}
