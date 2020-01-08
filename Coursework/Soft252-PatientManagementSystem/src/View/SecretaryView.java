/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SecretaryController;
import Controller.Template.AppointmentsController;
import Controller.Template.SecretaryAppointmentCreate;
import Controller.UsersController;
import Model.Users.Patient;
import Model.Users.Secretary;

import java.io.FileNotFoundException;
import java.io.IOException;
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

    }

    public static void approveCreateAccount(Secretary secretary)
    {
        if (secretary.getApprovalUser() != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to approve: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.approveAccount(secretary, secretary.getApprovalUser());
                System.out.println("Patient approved");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void approveRemoveAccount(Secretary secretary)
    {
        if (secretary.getRemovalUser() != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to approve termination: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.terminateAccount(secretary, secretary.getRemovalUser());
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
        if (secretary.getRequestAppointment() != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to approve appointment: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                AppointmentsController secretaryAppointment = new SecretaryAppointmentCreate();
                try {
                    secretaryAppointment.createAppointment(secretary,secretary.getRequestAppointment());
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

    }

}    

