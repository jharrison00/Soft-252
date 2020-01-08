/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Users.PatientController;
import Model.Appointments.Appointment;
import Model.Prescriptions.Prescription;
import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class PatientView {
    public static void patientHome(Patient patient)
    {
        //requestAppointment(patient);
        //terminateAccount(patient);
        //appointments(patient);
        prescriptions(patient);
    }

    public static void requestAppointment(Patient patient)
    {
        ArrayList<Doctor> allDocs = PatientController.getAllDoc();
        Appointment requestAppointment = new Appointment();
        String date = "08/01/2020";

        System.out.println("Choose doctor: ");
        System.out.println("Choose date: ");
        Doctor doctor = allDocs.get(0);
        requestAppointment.setDoctor(doctor);
        requestAppointment.setAppointmentPatient(patient);
        try {
            requestAppointment.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        PatientController.requestAppointment(requestAppointment);

    }

    public static void appointments(Patient patient)
    {
        if (patient.getAppointments() != null) {
            ArrayList<Appointment> appointments = patient.getAppointments();
            for (Appointment appointment : appointments) {
                System.out.println(appointment.getAppointmentID());
            }
        }
        else{
            System.out.println("No appointments");
        }
    }

    public static void prescriptions(Patient patient)
    {
        if (patient.getPrescriptions() != null) {
            ArrayList<Prescription> prescriptions = patient.getPrescriptions();
            for (Prescription prescription : prescriptions) {
                System.out.println(prescription.getNote());
            }
        }
        else{
            System.out.println("No prescriptions");
        }
    }

    public static void doctors()
    {

    }


    public static void terminateAccount(Patient patient)
    {
        try {
            PatientController.terminateAccount(patient);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Request for termination has been stored, waiting for approval from a secretary");
    }
}
