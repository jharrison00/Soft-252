/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.State;


import Controller.Template.AppointmentsController;
import Controller.Template.DoctorAppointmentCreate;
import Enums.Genders;
import Model.Appointments.Appointment;
import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class DoctorView implements IState
{
    public static void doctorHome(Doctor doctor)
    {
        //appointments(doctor);
        //createAppointment(doctor);
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

    public static void patientHistory()
    {

    }

    public static void createAppointment(Doctor doctor)
    {
        Patient patient = new Patient("P0002","appointmentPatient","patient","password","address", 20, Genders.Male);
        Appointment appointment = new Appointment(3,patient,doctor, new Date(9/1/2020));
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to approve appointment: ");
        String approve = in.nextLine();
        if (approve.equals("yes")) {
            AppointmentsController doctorAppointment = new DoctorAppointmentCreate();
            try {
                doctorAppointment.createAppointment(null,appointment);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Appointment approved");
        } else {
            System.out.println("Not approved");
        }
    }

    public static void createMedicine()
    {

    }

    @Override
    public void enterAppointment(Doctor doctor, DoctorState doctorState) {
        appointments(doctor);
        System.out.println("Entering appointment view");
        doctorState.setState(new AppointmentView());
    }

    @Override
    public void saveAppointment(Doctor doctor, DoctorState doctorState) {
        System.out.println("Not in appointment view, cant save appointment details");
        doctorState.setState(this);
    }
}
