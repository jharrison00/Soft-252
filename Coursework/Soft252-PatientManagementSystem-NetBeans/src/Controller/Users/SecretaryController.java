/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Controller.Appointments.AppointmentsController;
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
        ArrayList<HospitalPeople> approvalUsers = secretary.getApprovalUsers();
        approvalUsers.remove(person);
        secretary.setApprovalUsers(approvalUsers);
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
        ArrayList<HospitalPeople> removalUsers = secretary.getRemovalUsers();
        removalUsers.remove(person);
        secretary.setApprovalUsers(removalUsers);
        try {
            UsersController.editUser(secretary);
            System.out.println("Secretary approval: user removed");
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

  public static ArrayList<Secretary> getAllSecretaries() {
        UserList userList = null;
        ArrayList<Secretary> allSecretaries = new ArrayList<Secretary>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "S".charAt(0)) {
                allSecretaries.add((Secretary) user);
            }
        }
        return allSecretaries;
    }
    
    public static String generateUsername() {
       String username = "A";
        ArrayList<Secretary> allSecretaries = getAllSecretaries();
        int id = 0;
        for (Secretary secretary : allSecretaries) {
            String stringId = secretary.getUsername().substring(secretary.getUsername().length() - 4); 
            int thisId = Integer.parseInt(stringId);
            if (thisId >= id ) {
                id = thisId;          
            }    
        }
        id++;
        if (id >= 100 && id <= 999) {
            username = (username+"0"+Integer.toString(id));
        }
        else if (id >= 10 && id <= 99) {
            username = (username+"00"+Integer.toString(id));
        }
        else if (id >= 1 && id <= 9) {
            username = (username+"000"+Integer.toString(id));
        }
        return username;
    }
}
