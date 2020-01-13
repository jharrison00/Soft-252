/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Model.Appointments.Appointment;
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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of getAppointments method, of class Doctor.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Doctor instance = new Doctor();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointments method, of class Doctor.
     */
    @Test
    public void testSetAppointments() {
        System.out.println("setAppointments");
        ArrayList<Appointment> appointments = null;
        Doctor instance = new Doctor();
        instance.setAppointments(appointments);
        assertEquals(null, instance.appointments);
    }

    /**
     * Test of getFeedback method, of class Doctor.
     */
    @Test
    public void testGetFeedback() {
        System.out.println("getFeedback");
        Doctor instance = new Doctor();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getFeedback();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFeedback method, of class Doctor.
     */
    @Test
    public void testSetFeedback() {
        System.out.println("setFeedback");
        ArrayList<String> feedback = null;
        Doctor instance = new Doctor();
        instance.setFeedback(feedback);
        assertEquals(null, instance.feedback);
    }

    /**
     * Test of getRatings method, of class Doctor.
     */
    @Test
    public void testGetRatings() {
        System.out.println("getRatings");
        Doctor instance = new Doctor();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.getRatings();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRatings method, of class Doctor.
     */
    @Test
    public void testSetRatings() {
        System.out.println("setRatings");
        ArrayList<Integer> ratings = null;
        Doctor instance = new Doctor();
        instance.setRatings(ratings);
        assertEquals(null, instance.ratings);
    }

    /**
     * Test of getRatingAverage method, of class Doctor.
     */
    @Test
    public void testGetRatingAverage() {
        System.out.println("getRatingAverage");
        Doctor instance = new Doctor();
        double expResult = 0.0;
        double result = instance.getRatingAverage();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setRatingAverage method, of class Doctor.
     */
    @Test
    public void testSetRatingAverage() {
        System.out.println("setRatingAverage");
        ArrayList<Integer> ratings = new ArrayList<>();
        Doctor instance = new Doctor();
        instance.setRatingAverage(ratings);
        assertEquals(0.0,instance.ratingAverage);        
    }
    
}
