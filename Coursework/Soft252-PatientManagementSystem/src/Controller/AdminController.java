/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.Administrator;
import Model.Users.HospitalPeople;
import View.AdminView;

import java.io.IOException;

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

    public static void createAccount(HospitalPeople person){
        try {
            LogInController.createUser(person);
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
