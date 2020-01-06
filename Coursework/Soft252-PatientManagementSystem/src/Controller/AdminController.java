/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.Administrator;
import Model.Users.Patient;
import View.AdminView;


/**
 *
 * @author jonat
 */
public class AdminController {

    public AdminController() {
    }

    public static void setView(Administrator admin)
    {
        AdminView.adminHome(admin);
    }

    public static void terminateAccount(Patient patient) {

    }
}
