/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PatientController;
import Controller.UsersController;
import Enums.Genders;
import Model.Users.*;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class LogIn {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //getUserDetails();
        addUsers();
        //logInUser();
        //Patient patient = new Patient("PatientApproved","password","address",12,Genders.Male);
        //PatientController.createAccount(patient);
        UserList userList  = UsersController.getAllUsers();
        //createAccount();
    }
    
    public static void logInUser()
    {
        boolean valid = false;
        Scanner in = new Scanner(System.in);        
        System.out.println("Input username: ");
        String username = in.nextLine();
        System.out.println("Input password: ");
        String password = in.nextLine();
        HospitalPeople validUser = null;
        try {
            valid = UsersController.validateUser(username,password);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        if (valid == false)
        {
            System.out.println("Incorrect User");
            logInUser();
        }
    }

    public static void createAccount()
    {
        System.out.println("Would you like to create an account");
        Patient patient = new Patient("approvedPatient","approvedPassword","add",23, Genders.Female);
        try {
            PatientController.createAccount(patient);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Request has been stored, waiting for approval from a secretary");
    }
    
    public static void addUsers() throws IOException, ClassNotFoundException {
        //Scanner in = new Scanner(System.in);        
        //System.out.println("Input username: ");
        //String username = in.nextLine();
        //System.out.println("Input password: ");
        //String password = in.nextLine();
        //System.out.println("Input address: ");
        //String address = in.nextLine();    
        Patient patient = new Patient("patient","password","address",12,Genders.Male);
        Doctor doctor = new Doctor("doctor","password","address");
        Administrator admin = new Administrator("admin","password","address");
        Secretary secretary = new Secretary("secretary","password","address"); 
        //in.close();
        UsersController.createUser(patient);
        UsersController.createUser(doctor);
        UsersController.createUser(admin);
        UsersController.createUser(secretary);
        UsersController.getAllUsers();
    }


}
