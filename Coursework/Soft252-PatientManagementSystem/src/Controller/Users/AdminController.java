/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Model.Users.Administrator;
import Model.Users.HospitalPeople;
import Model.Users.UserList;
import View.AdminView;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public abstract class AdminController {

    public AdminController() {
    }

    public static void setView(Administrator admin)
    {
        AdminView.adminHome(admin);
    }

    public static ArrayList<HospitalPeople> getAllDocSec() {
        UserList userList = null;
        ArrayList<HospitalPeople> allDocSec = new ArrayList<HospitalPeople>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "D".charAt(0) || user.getUsername().toUpperCase().charAt(0) == "S".charAt(0) ) {
                allDocSec.add(user);
            }
        }
        return allDocSec;
    }
}
