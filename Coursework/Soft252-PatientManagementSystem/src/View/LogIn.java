/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Appointments.AppointmentsController;
import Controller.Medicines.MedicinesController;
import Controller.Prescriptions.PrescriptionsController;
import Controller.Users.PatientController;
import Controller.Users.UsersController;
import Enums.Genders;
import Model.Appointments.AppointmentList;
import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Prescriptions.PrescriptionList;
import Model.Users.*;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class LogIn {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //getUserDetails();
        //addUsers();
        logInUser();
        //createAccount();
        UserList userList  = UsersController.getAllUsers();
        AppointmentList appointmentList = AppointmentsController.getAllAppointments();
        PrescriptionList prescriptionList = PrescriptionsController.getAllPrescriptions();
        MedicineList medicineList = MedicinesController.getAllMedicines();
    }
    
    public static void logInUser()
    {
        boolean valid = false;
        Scanner in = new Scanner(System.in);        
        System.out.println("Input username: ");
        String username = in.nextLine();
        System.out.println("Input password: ");
        String password = in.nextLine();
        HospitalPeople validUser = null;
        try {
            valid = UsersController.validateUser(username,password);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        if (valid == false)
        {
            System.out.println("Incorrect User");
            logInUser();
        }
    }

    public static void createAccount()
    {
        System.out.println("Would you like to create an account");
        Patient patient = new Patient("P0002","Test","Patient",
                "password","address",22,Genders.Female);
        try {
            PatientController.createAccount(patient);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Request has been stored, waiting for approval from a secretary");
    }
    
    public static void addUsers() throws IOException, ClassNotFoundException {
        //Scanner in = new Scanner(System.in);        
        //System.out.println("Input username: ");
        //String username = in.nextLine();
        //System.out.println("Input password: ");
        //String password = in.nextLine();
        //System.out.println("Input address: ");
        //String address = in.nextLine();    
        Patient patient = new Patient("P0001","patient","patient",
                "password","address",22,Genders.Female);

        Doctor doctor = new Doctor("D0001","doctor","doctor",
                "password","address");

        Administrator admin = new Administrator("A0001","admin","admin",
                "password","address");
        Secretary secretary = new Secretary("S0001","secretary","secretary",
                "password","address");
        //in.close();
        UsersController.createUser(patient);
        UsersController.createUser(doctor);
        UsersController.createUser(admin);
        UsersController.createUser(secretary);
        UsersController.getAllUsers();
        //Appointment appointment = new Appointment(1,patient,doctor, new Date(8/1/2020));
        //AppointmentsController.createAppointment(appointment);
        //AppointmentsController.getAllAppointments();
        Medicine medicine = new Medicine("Drug1",1000);
        MedicinesController.createMedicine(medicine);
        //Prescription prescription = new Prescription(doctor,patient,"Death",medicine,3,"2 Times a day");
        //PrescriptionsController.createPrescription(prescription);
    }


}
