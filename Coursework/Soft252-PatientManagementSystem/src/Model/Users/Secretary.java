/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.LogInController;
import Controller.SecretaryController;
import View.SecretaryView;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Secretary extends HospitalPeople implements SecretaryObserver{
    public Secretary(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;    
    }

    public static ArrayList<SecretaryObserver> getAllSecretaries() {
        ArrayList<SecretaryObserver>  secretaries = new ArrayList<SecretaryObserver>();
        UserList userList = null;
        try {
            userList = LogInController.readUserFile();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().toUpperCase().charAt(0) == "S".charAt(0)){
                secretaries.add((Secretary) user);
            }
        }
        return secretaries;
    }

    @Override
    public void update(HospitalPeople person) {
        SecretaryController.approveAccount(person);
    }
}
