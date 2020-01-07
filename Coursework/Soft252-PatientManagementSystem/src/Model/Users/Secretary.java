/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.UsersController;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Secretary extends HospitalPeople implements SecretaryObserver{
    protected HospitalPeople approvalUser;
    protected HospitalPeople removalUser;
    public Secretary(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public static ArrayList<SecretaryObserver> getAllSecretaries() {
        ArrayList<SecretaryObserver>  secretaries = new ArrayList<SecretaryObserver>();
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
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

    public void setApprovalUser(HospitalPeople approvalUser) {
        this.approvalUser = approvalUser;
    }

    public Patient getApprovalUser(){
        return (Patient) this.approvalUser;
    }


    public void setRemovalUser(HospitalPeople removalUser) {
        this.removalUser = removalUser;
    }

    public Patient getRemovalUser(){
        return (Patient) this.removalUser;
    }

    @Override
    public void updateCreate(HospitalPeople person) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Updating "+this.getUsername());
                this.approvalUser = person;
            }
        }
        userList.setAllUsersList(allUsers);
        try {
            UsersController.editUser(this);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateRemove(HospitalPeople person) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Updating "+this.getUsername());
                this.removalUser = person;
            }
        }
        userList.setAllUsersList(allUsers);
        try {
            UsersController.editUser(this);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}