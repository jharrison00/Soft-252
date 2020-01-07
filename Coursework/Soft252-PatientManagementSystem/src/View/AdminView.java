/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsersController;
import Model.Users.Administrator;
import Model.Users.Doctor;

import java.io.IOException;

/**
 *
 * @author jonat
 */
public class AdminView {
    public static void adminHome(Administrator admin)
    {
        //createAccount();
        try {
            UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createAccount(){
        Doctor doctor = new Doctor("doctor1","password","address");
        try {
            UsersController.createUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void viewRatings()
    {

    }

    public static void removeAccount()
    {

    }

    public static void feedback()
    {

    }

}
