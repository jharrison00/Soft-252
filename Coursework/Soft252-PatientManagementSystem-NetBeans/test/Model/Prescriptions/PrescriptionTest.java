/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prescriptions;

import Model.Medicines.Medicine;
import Model.Users.Doctor;
import Model.Users.Patient;
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
public class PrescriptionTest {
    
    public PrescriptionTest() {
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
     * Test of getDoctor method, of class Prescription.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Prescription instance = null;
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDoctor method, of class Prescription.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Prescription instance = null;
        instance.setDoctor(doctor);
        assertEquals(null, instance.doctor);
    }

    /**
     * Test of getPatient method, of class Prescription.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Prescription instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatient method, of class Prescription.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Prescription instance = null;
        instance.setPatient(patient);
        assertEquals(null, instance.patient);
    }

    /**
     * Test of getNote method, of class Prescription.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Prescription instance = null;
        String expResult = "";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Prescription.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "note";
        Prescription instance = null;
        instance.setNote(note);
        assertEquals("note", instance.note);
    }

    /**
     * Test of getMedicine method, of class Prescription.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Prescription instance = null;
        Medicine expResult = null;
        Medicine result = instance.getMedicine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMedicine method, of class Prescription.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        Medicine medicine = null;
        Prescription instance = null;
        instance.setMedicine(medicine);
        assertEquals(null, instance.medicine);
    }

    /**
     * Test of getQuantity method, of class Prescription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Prescription instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Prescription.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Prescription instance = null;
        instance.setQuantity(quantity);
        assertEquals(null, instance.quantity);
    }

    /**
     * Test of getDosage method, of class Prescription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Prescription instance = null;
        String expResult = "";
        String result = instance.getDosage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDosage method, of class Prescription.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        String dosage = "dosage";
        Prescription instance = null;
        instance.setDosage(dosage);
        assertEquals("dosage", instance.Dosage);
    }

}
