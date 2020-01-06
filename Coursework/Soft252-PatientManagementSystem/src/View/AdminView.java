/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AdminController;
import Model.Users.Administrator;
import Model.Users.Doctor;

/**
 *
 * @author jonat
 */
public class AdminView {
    public static void adminHome(Administrator admin)
    {

    }

    public static void createAccount()
    {
        Doctor doctor = new Doctor("doctor1","password","address");
        AdminController.createAccount(doctor);
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
