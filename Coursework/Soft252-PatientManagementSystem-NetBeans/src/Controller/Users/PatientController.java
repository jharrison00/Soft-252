/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Model.Appointments.Appointment;
import Model.Users.Doctor;
import Model.Users.HospitalPeople;
import Model.Users.Patient;
import Model.Users.UserList;
import View.PatientView;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public abstract class PatientController {
    public static void setView(Patient patient)
    {
        PatientView.patientHome(patient);
    }

    public static void createAccount(Patient patient) throws IOException, ClassNotFoundException {
        patient.registerObservers();
        patient.notifyObserverCreate(patient);
    }

    public static void terminateAccount(Patient patient) throws IOException, ClassNotFoundException {
        patient.registerObservers();
        patient.notifyObserverRemove(patient);
    }

    public static ArrayList<Doctor> getAllDoc() {
        UserList userList = null;
        ArrayList<Doctor> allDoc = new ArrayList<Doctor>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "D".charAt(0)) {
                allDoc.add((Doctor) user);
            }
        }
        return allDoc;
    }

    public static void requestAppointment(Appointment requestAppointment) {
        requestAppointment.getAppointmentPatient().registerObservers();
        requestAppointment.getAppointmentPatient().notifyObserverAppointment(requestAppointment);
    }

    public static ArrayList<Patient> getAllPatients() {
        UserList userList = null;
        ArrayList<Patient> allPatients = new ArrayList<Patient>();
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().toUpperCase().charAt(0) == "P".charAt(0)) {
                allPatients.add((Patient) user);
            }
        }
        return allPatients;
    }
    
    public static String generateUsername() {
          String username = "P";
        ArrayList<Patient> allPatients = getAllPatients();
        int id = 0;
        for (Patient patient : allPatients) {
            String stringId = patient.getUsername().substring(patient.getUsername().length() - 4); 
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
