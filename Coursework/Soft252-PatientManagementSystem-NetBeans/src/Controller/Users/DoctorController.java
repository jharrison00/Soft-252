/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Controller.Medicines.MedicinesController;
import Model.Medicines.Medicine;
import Model.Users.Doctor;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Doctor controller used for all doctor functionalities relating to file
 * @author jonat
 */
public abstract class DoctorController{
    /**
     * Allows doctor to create medicine + updates all secretaries of new medicine
     * @param medicine 
     */
    public static void createMedicine(Medicine medicine) {
        try {
            MedicinesController.createMedicine(medicine);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        updateObservers(medicine);
    }

    /**
     * Updates observers of new medicine
     * @param medicine 
     */
    public static void updateObservers(Medicine medicine) {
        medicine.registerObservers();
        medicine.notifyObserverMedicine(medicine);
    }

    /**
     * Generates new unique doctor username/userID to add to file 
     * @return String for username
     */
    public static String generateUsername() {
        String username = "D";
        ArrayList<Doctor> allDoctors = PatientController.getAllDoc();
        int id = 0;
        for (Doctor doctor : allDoctors) {
            String stringId = doctor.getUsername().substring(doctor.getUsername().length() - 4); 
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
