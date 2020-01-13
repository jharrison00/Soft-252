/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Appointments;

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
public class AppointmentListTest {
    
    public AppointmentListTest() {
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
     * Test of getAllAppointmentsList method, of class AppointmentList.
     */
    @Test
    public void testGetAllAppointmentsList() {
        System.out.println("getAllAppointmentsList");
        AppointmentList instance = new AppointmentList();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAllAppointmentsList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAllAppointmentsList method, of class AppointmentList.
     */
    @Test
    public void testSetAllAppointmentsList() {
        System.out.println("setAllAppointmentsList");
        ArrayList<Appointment> allAppointments = null;
        AppointmentList instance = new AppointmentList();
        instance.setAllAppointmentsList(allAppointments);
        assertEquals(null,instance.getAllAppointmentsList());
    }
    
}
