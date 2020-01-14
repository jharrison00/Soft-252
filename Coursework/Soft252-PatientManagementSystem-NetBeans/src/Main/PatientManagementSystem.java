/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Medicines.MedicinesController;
import Controller.Users.UsersController;
import Enums.Genders;
import Model.Medicines.Medicine;
import Model.Users.Administrator;
import Model.Users.Doctor;
import Model.Users.Patient;
import Model.Users.Secretary;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Main method for application
 * @author jonat
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate the login view
        new View.GuiView.LogInView().setVisible(true);
        //addUsers();
        //addMedicine();
    }
    
    public static void addUsers() {
        try {
            Patient patient = new Patient("P0001","Jonathan","Harrison","password","address",19,Genders.Male);
            Administrator admin = new Administrator("A0001","Admin","Number1","password","address");
            Doctor doctor = new Doctor("D0001","Doctor","Number1","password","address");
            Secretary secretary = new Secretary("S0001","Secretary","Number1","password","address");
            UsersController.createUser(patient);
            UsersController.createUser(admin);
            UsersController.createUser(doctor);
            UsersController.createUser(secretary);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PatientManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addMedicine() {
        try {
            Medicine medicine1 = new Medicine("Penicillin",500);
            Medicine medicine2 = new Medicine("Cephalexin",500);
            Medicine medicine3 = new Medicine("Erythromycin",500);
            Medicine medicine4 = new Medicine("Ibuprofen",500);
            Medicine medicine5 = new Medicine("Adderall",500);
            Medicine medicine6 = new Medicine("Codeine",500);
            Medicine medicine7 = new Medicine("Oxycodone",500);
            Medicine medicine8 = new Medicine("Doxycycline",500);
            Medicine medicine9 = new Medicine("Hydrochlorothiazide",500);
            Medicine medicine10 = new Medicine("Ativan",500);
            MedicinesController.createMedicine(medicine1);
            MedicinesController.createMedicine(medicine2);
            MedicinesController.createMedicine(medicine3);
            MedicinesController.createMedicine(medicine4);
            MedicinesController.createMedicine(medicine5);
            MedicinesController.createMedicine(medicine6);
            MedicinesController.createMedicine(medicine7);
            MedicinesController.createMedicine(medicine8);
            MedicinesController.createMedicine(medicine9);
            MedicinesController.createMedicine(medicine10);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PatientManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
