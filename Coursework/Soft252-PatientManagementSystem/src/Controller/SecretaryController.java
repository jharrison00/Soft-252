/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.HospitalPeople;
import Model.Users.Secretary;
import View.SecretaryView;

import java.io.IOException;

/**
 *
 * @author jonat
 */
public class SecretaryController {
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


}
