/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.HospitalPeople;
import Model.Users.Secretary;
import Model.Users.UserList;
import View.SecretaryView;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class SecretaryController {
    public static void setView(Secretary secretary)
    {
        SecretaryView.secretaryHome(secretary);
    }

    public static void approveAccount(HospitalPeople person)
    {
        if (SecretaryView.approveAccount(person) == true)
        {
            try {
                LogInController.createUser(person);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
