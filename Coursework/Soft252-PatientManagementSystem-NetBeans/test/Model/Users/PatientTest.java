/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Enums.Genders;
import Model.Appointments.Appointment;
import Model.Prescriptions.Prescription;
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
public class PatientTest {
    
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
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Patient.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 5;
        Patient instance = new Patient();
        int expResult = 5;
        instance.setAge(age);
        assertEquals(expResult,instance.age);
    }

    /**
     * Test of getGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Patient instance = new Patient();
        Genders expResult = null;
        Genders result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        Genders gender = Genders.Female;
        Patient instance = new Patient();
        instance.setGender(gender);
        assertEquals(Genders.Female,instance.gender);
    }

    /**
     * Test of getAppointments method, of class Patient.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Patient instance = new Patient();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointments method, of class Patient.
     */
    @Test
    public void testSetAppointments() {
        System.out.println("setAppointments");
        ArrayList<Appointment> appointments = null;
        Patient instance = new Patient();
        instance.setAppointments(appointments);
        assertEquals(null,instance.appointments);
    }

    /**
     * Test of getPrescriptions method, of class Patient.
     */
    @Test
    public void testGetPrescriptions() {
        System.out.println("getPrescriptions");
        Patient instance = new Patient();
        ArrayList<Prescription> expResult = null;
        ArrayList<Prescription> result = instance.getPrescriptions();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrescriptions method, of class Patient.
     */
    @Test
    public void testSetPrescriptions() {
        System.out.println("setPrescriptions");
        ArrayList<Prescription> prescriptions = null;
        Patient instance = new Patient();
        instance.setPrescriptions(prescriptions);
        assertEquals(null,instance.prescriptions);
    }
}
