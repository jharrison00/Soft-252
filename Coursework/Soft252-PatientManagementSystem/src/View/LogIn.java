/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AdminController;
import Controller.DoctorController;
import Controller.LogInController;
import Controller.PatientController;
import Controller.SecretaryController;
import Enums.Genders;
import Model.Users.Administrator;
import Model.Users.Doctor;
import Model.Users.HospitalPeople;
import Model.Users.Patient;
import Model.Users.Secretary;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class LogIn {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //getUserDetails();
        //addUsers();
        logInUser();
        //Patient patient = new Patient("approvedPatient","password","address",12,Genders.Male);
        //PatientController.createAccount(patient);
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
            valid = LogInController.checkUserExists(username,password);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        if (valid == false)
        {
            System.out.println("Incorrect User");
            logInUser();
        }

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
        LogInController.createUser(patient);
        LogInController.createUser(doctor);
        LogInController.createUser(admin);
        LogInController.createUser(secretary);
        LogInController.readUserFile();
    }        
}
