/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.HospitalPeople;
import Model.Users.Patient;
import View.PatientView;

import java.io.IOException;

/**
 *
 * @author jonat
 */
public class PatientController {
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
}
