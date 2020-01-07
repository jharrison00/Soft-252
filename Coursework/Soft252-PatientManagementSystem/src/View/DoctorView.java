/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Appointments.Appointment;
import Model.Users.Doctor;
import Model.Users.Patient;

import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class DoctorView
{
    public static void doctorHome(Doctor doctor)
    {
        appointments(doctor);
    }

    public static void appointments(Doctor doctor)
    {
        if (doctor.getAppointments() != null) {
            ArrayList<Appointment> appointments = doctor.getAppointments();
            for (Appointment appointment : appointments) {
                System.out.println(appointment.getAppointmentID());
            }
        }
        else{
            System.out.println("No appointments");
        }
    }

    public static void addNotes()
    {

    }

    public static void patientHistory()
    {

    }

    public static void createAppointment()
    {

    }

    public static void giveMedicine()
    {

    }

    public static void createMedicine()
    {

    }
}
