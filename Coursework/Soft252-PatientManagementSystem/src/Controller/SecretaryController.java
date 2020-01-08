/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Template.AppointmentsController;
import Model.Users.HospitalPeople;
import Model.Users.Patient;
import Model.Users.Secretary;
import Model.Users.UserList;
import View.SecretaryView;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public abstract class SecretaryController extends AppointmentsController {
    public static void setView(Secretary secretary)
    {
        SecretaryView.secretaryHome(secretary);
    }

    public static void approveAccount(Secretary secretary, HospitalPeople person)
    {
        try {
            UsersController.createUser(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        secretary.setApprovalUser(null);
        try {
            UsersController.editUser(secretary);
            System.out.println("Secretary approval user removed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void terminateAccount(Secretary secretary, HospitalPeople person)
    {
        try {
            UsersController.deleteUser(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
        secretary.setRemovalUser(null);
        try {
            UsersController.editUser(secretary);
            System.out.println("Secretary approval user removed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Patient> getAllPatients() {
        UserList userList = null;
        ArrayList<Patient> allPatients = new ArrayList<Patient>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "P".charAt(0)) {
                allPatients.add((Patient) user);
                System.out.println(user.getUsername());
            }
        }
        return allPatients;
    }
}
