/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SecretaryController;
import Controller.UsersController;
import Model.Users.HospitalPeople;
import Model.Users.Patient;
import Model.Users.Secretary;
import Model.Users.UserList;

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
        removePatient();
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
        UserList userList = null;
        ArrayList<Patient> allPatients = new ArrayList<Patient>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers)
        {
         if (user.getUsername().toUpperCase().charAt(0) == "P".charAt(0))
         {
             allPatients.add((Patient) user);
             System.out.println(user.getUsername());
         }
        }
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

    public static void giveMedicine()
    {

    }

    public static void createAppointment()
    {

    }


}    

