/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Medicines.MedicinesController;
import Controller.Medicines.MedicinesTemplate.DoctorRequestMedicineCreate;
import Controller.Medicines.MedicinesTemplate.SecretaryMedicineCreate;
import Controller.Users.SecretaryController;
import Controller.Appointments.AppointmentsController;
import Controller.Appointments.AppointmentsTemplate.SecretaryAppointmentCreate;
import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Users.HospitalPeople;
import Model.Users.Patient;
import Model.Users.Secretary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class SecretaryView {
    public static void secretaryHome(Secretary secretary){
        //approveCreateAccount(secretary);
        //approveRemoveAccount(secretary);
        //removePatient();
        approveAppointment(secretary);
        //addRequestMedicine(secretary);
        //addMedicine(secretary);
        //giveMedicine();
    }

    public static void approveCreateAccount(Secretary secretary)
    {
        if (secretary.getApprovalUsers() != null) {
            Scanner in = new Scanner(System.in);
            ArrayList<HospitalPeople> approvalUsers =  secretary.getApprovalUsers();

            System.out.println("Would you like to approve: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.approveAccount(secretary,approvalUsers.get(0));
                System.out.println("Patient approved");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void approveRemoveAccount(Secretary secretary)
    {
        if (secretary.getRemovalUsers() != null) {
            Scanner in = new Scanner(System.in);
            ArrayList<HospitalPeople> removalUsers =  secretary.getRemovalUsers();

            System.out.println("Would you like to approve termination: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.terminateAccount(secretary, removalUsers.get(0));
                System.out.println("Patient removed");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void removePatient()
    {
        ArrayList<Patient> allPatients = SecretaryController.getAllPatients();
        if (allPatients != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to remove a patient: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                try {
                    UsersController.deleteUser(allPatients.get(0));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("Patient removed");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void approveAppointment(Secretary secretary)
    {
        if (secretary.getRequestAppointments() != null) {
            Scanner in = new Scanner(System.in);
            ArrayList<Appointment> requestAppointments =  secretary.getRequestAppointments();

            System.out.println("Would you like to approve appointment: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                AppointmentsController secretaryAppointment = new SecretaryAppointmentCreate();
                try {
                    secretaryAppointment.createAppointment(secretary,requestAppointments.get(0));
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("Appointment approved");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void giveMedicine()
    {
        Scanner in = new Scanner(System.in);
        MedicineList medicineList = null;
        ArrayList<Medicine>  allMedicines = null;
        try {
            medicineList = MedicinesController.getAllMedicines();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (medicineList != null) {
            allMedicines = medicineList.getAllMedicines();
        }
        System.out.println("How much medicine would you like to give: ");
        int quantity = in.nextInt();
        Medicine medicine = allMedicines.get(0);
        int stock = medicine.getQuantity();
        medicine.setQuantity(stock - quantity);
        try {
            MedicinesController.editMedicine(medicine);
            System.out.println("Medicine given, stock reduced.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addRequestMedicine(Secretary secretary){
        if (!secretary.getRequestMedicines().isEmpty()) {
            Scanner in = new Scanner(System.in);
            ArrayList<Medicine> requestMedicines =  secretary.getRequestMedicines();

            System.out.println("Would you like to buy this medicine: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                System.out.println("Order quantity: ");
                int quantity = in.nextInt();
                Medicine medicine = requestMedicines.get(0);
                int stock = medicine.getQuantity();
                medicine.setQuantity(stock + quantity);
                MedicinesController doctorRequestMedicine = new DoctorRequestMedicineCreate();
                try {
                    doctorRequestMedicine.addQuantity(secretary,medicine);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void addMedicine(Secretary secretary){
        Scanner in = new Scanner(System.in);
        MedicineList medicineList = null;
        ArrayList<Medicine>  allMedicines = null;

        try {
            medicineList = MedicinesController.getAllMedicines();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (medicineList != null) {
            allMedicines = medicineList.getAllMedicines();
            System.out.println("Order quantity: ");
            int quantity = in.nextInt();
            Medicine medicine = allMedicines.get(1);
            int stock = medicine.getQuantity();
            medicine.setQuantity(stock + quantity);
            MedicinesController secretaryMedicine = new SecretaryMedicineCreate();
            try {
                secretaryMedicine.addQuantity(secretary,medicine);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}    

