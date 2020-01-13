/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Appointments;

import Model.Users.Doctor;
import Model.Users.Patient;
import java.util.Date;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getAppointmentID method, of class Appointment.
     */
    @Test
    public void testGetAppointmentID() {
        System.out.println("getAppointmentID");
        Appointment instance = new Appointment();
        int expResult = 0;
        int result = instance.getAppointmentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointmentID method, of class Appointment.
     */
    @Test
    public void testSetAppointmentID() {
        System.out.println("setAppointmentID");
        int appointmentID = 0;
        Appointment instance = new Appointment();
        instance.setAppointmentID(appointmentID);
        assertEquals(0, instance.appointmentID);
    }

    /**
     * Test of getAppointmentPatient method, of class Appointment.
     */
    @Test
    public void testGetAppointmentPatient() {
        System.out.println("getAppointmentPatient");
        Appointment instance = new Appointment();
        Patient expResult = null;
        Patient result = instance.getAppointmentPatient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointmentPatient method, of class Appointment.
     */
    @Test
    public void testSetAppointmentPatient() {
        System.out.println("setAppointmentPatient");
        Patient patient = null;
        Appointment instance = new Appointment();
        instance.setAppointmentPatient(patient);
        assertEquals(null,instance.patient);
    }

    /**
     * Test of getDoctor method, of class Appointment.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Appointment instance = new Appointment();
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDoctor method, of class Appointment.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Appointment instance = new Appointment();
        instance.setDoctor(doctor);
        assertEquals(null,instance.doctor);
    }

    /**
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = new Appointment();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Appointment instance = new Appointment();
        instance.setDate(date);
        assertEquals(null,instance.date);
    }
}
