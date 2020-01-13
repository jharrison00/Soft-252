/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Observers.SecretaryObserver;
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
public class SecretaryTest {
    
    public SecretaryTest() {
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
     * Test of getAllSecretaries method, of class Secretary.
     */
    @Test
    public void testGetAllSecretaries() {
        System.out.println("getAllSecretaries");
        ArrayList<SecretaryObserver> result = Secretary.getAllSecretaries();
        assertNotNull(result);
    }

    /**
     * Test of getApprovalUsers method, of class Secretary.
     */
    @Test
    public void testGetApprovalUsers() {
        System.out.println("getApprovalUsers");
        Secretary instance = new Secretary();
        ArrayList<HospitalPeople> expResult = null;
        ArrayList<HospitalPeople> result = instance.getApprovalUsers();
        assertEquals(expResult, result);     
    }

    /**
     * Test of setApprovalUsers method, of class Secretary.
     */
    @Test
    public void testSetApprovalUsers() {
        System.out.println("setApprovalUsers");
        ArrayList<HospitalPeople> approvalUsers = null;
        Secretary instance = new Secretary();
        instance.setApprovalUsers(approvalUsers);
        assertEquals(null,approvalUsers);
    }

    /**
     * Test of getRemovalUsers method, of class Secretary.
     */
    @Test
    public void testGetRemovalUsers() {
        System.out.println("getRemovalUsers");
        Secretary instance = new Secretary();
        ArrayList<HospitalPeople> expResult = null;
        ArrayList<HospitalPeople> result = instance.getRemovalUsers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRemovalUsers method, of class Secretary.
     */
    @Test
    public void testSetRemovalUsers() {
        System.out.println("setRemovalUsers");
        ArrayList<HospitalPeople> removalUsers = null;
        Secretary instance = new Secretary();
        instance.setRemovalUsers(removalUsers);
        assertEquals(null, instance.removalUsers);
    }

    /**
     * Test of getRequestAppointments method, of class Secretary.
     */
    @Test
    public void testGetRequestAppointments() {
        System.out.println("getRequestAppointments");
        Secretary instance = new Secretary();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getRequestAppointments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRequestAppointments method, of class Secretary.
     */
    @Test
    public void testSetRequestAppointments() {
        System.out.println("setRequestAppointments");
        ArrayList<Appointment> requestAppointments = null;
        Secretary instance = new Secretary();
        instance.setRequestAppointments(requestAppointments);
        assertEquals(null, instance.requestAppointments);
    }

    /**
     * Test of getRequestMedicines method, of class Secretary.
     */
    @Test
    public void testGetRequestMedicines() {
        System.out.println("getRequestMedicines");
        Secretary instance = new Secretary();
        ArrayList<Medicine> expResult = null;
        ArrayList<Medicine> result = instance.getRequestMedicines();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRequestMedicines method, of class Secretary.
     */
    @Test
    public void testSetRequestMedicines() {
        System.out.println("setRequestMedicines");
        ArrayList<Medicine> requestMedicines = null;
        Secretary instance = new Secretary();
        instance.setRequestMedicines(requestMedicines);
        assertEquals(null,instance.requestMedicines);
    }
}
