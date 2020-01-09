/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Users.AdminController;
import Controller.Users.PatientController;
import Controller.Users.UsersController;
import Model.Users.Administrator;
import Model.Users.Doctor;
import Model.Users.HospitalPeople;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class AdminView {
    public static void adminHome(Administrator admin)
    {
        createAccount();
        removeAccount();
    }

    public static void createAccount(){
        Doctor doctor = new Doctor("D0002","doctor","doctor",
                "password","address");

        try {
            UsersController.createUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void removeAccount()
    {
        ArrayList<HospitalPeople> allDocSec = AdminController.getAllDocSec();
        if (allDocSec != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to remove a doctor/secretary: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                try {
                    UsersController.deleteUser(allDocSec.get(0));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("User removed");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void viewFeedback(Doctor doctor)
    {
        ArrayList<String> allFeedback = doctor.getFeedback();
        if (allFeedback != null) {
            for (String feedback : allFeedback) {
                System.out.println(feedback);
            }
        }
    }

    public static void giveFeedback(Doctor doctor){
        ArrayList<String> feedback = doctor.getFeedback();
        String admin = "ADMIN: ";
        String note = "Work harder";
        if (feedback == null) {
            feedback = new ArrayList<String>();
        }
        feedback.add(admin + note);
        doctor.setFeedback(feedback);
        try {
            UsersController.editUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void viewRatings()
    {
        ArrayList<Doctor> allDoctors = PatientController.getAllDoc();
        if (allDoctors != null) {
            for (Doctor doctor : allDoctors) {
                System.out.println(doctor.getFirstName());
                System.out.println(doctor.getRatingAverage());
            }
        }
    }

}