/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Users.PatientController;
import Controller.Users.SecretaryController;
import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Prescriptions.Prescription;
import Model.Users.Doctor;
import Model.Users.Patient;
import Model.Users.Secretary;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jonat
 */
public class PatientView {
    public static void patientHome(Patient patient)
    {
        //requestAppointment(patient);
        //terminateAccount(patient);
        appointments(patient);
        prescriptions(patient);
        doctorRatings();
    }

    public static void requestAppointment(Patient patient)
    {
        ArrayList<Doctor> allDocs = PatientController.getAllDoc();
        Appointment requestAppointment = new Appointment();

        System.out.println("Choose doctor: ");
        System.out.println("Choose date: ");
        Doctor doctor = allDocs.get(0);
        requestAppointment.setDoctor(doctor);
        requestAppointment.setAppointmentPatient(patient);
        requestAppointment.setDate(new Date(9/1/2020));

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

    public static void doctorRatings()
    {
        ArrayList<Doctor> allDoctors = PatientController.getAllDoc();
        for (Doctor doctor : allDoctors){
            System.out.println(doctor.getFirstName());
            System.out.println(doctor.getRatingAverage());
        }
    }

    public static void giveRating(Doctor doctor){
        ArrayList<Integer> ratings = doctor.getRatings();
        int rating = 4;
        if (ratings == null) {
            ratings = new ArrayList<Integer>();
        }
        ratings.add(rating);
        doctor.setRatings(ratings);
        doctor.setRatingAverage(ratings);
        try {
            UsersController.editUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void giveFeedback(Doctor doctor){
        ArrayList<String> feedback = doctor.getFeedback();
        String note = "Good doctor";
        if (feedback == null) {
            feedback = new ArrayList<String>();
        }
        feedback.add(note);
        doctor.setFeedback(feedback);
        try {
            UsersController.editUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
