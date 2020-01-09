/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Model.Users.Administrator;
import Model.Users.HospitalPeople;
import Model.Users.UserList;
import View.GuiView.AdminView;
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
        new AdminView().setVisible(true);
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
    
    public static ArrayList<Administrator> getAllAdmins() {
        UserList userList = null;
        ArrayList<Administrator> allAdmins = new ArrayList<Administrator>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "A".charAt(0)) {
                allAdmins.add((Administrator) user);
            }
        }
        return allAdmins;
    }
    
    public static String generateUsername() {
        String username = "A";
        ArrayList<Administrator> allAdmins = getAllAdmins();
        int id = 0;
        for (Administrator admin : allAdmins) {
            String stringId = admin.getUsername().substring(admin.getUsername().length() - 4); 
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
