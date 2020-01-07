/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PatientController;
import Enums.Genders;
import Model.Observables.PatientObservable;
import Model.Users.Patient;
import Model.Users.Secretary;
import Model.Users.SecretaryObserver;

import java.io.IOException;

/**
 *
 * @author jonat
 */
public class PatientView {
    public static void patientHome(Patient patient)
    {
        createAccount();
    }

    public static void appointment()
    {

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
        System.out.println("Request has been stored, waiting approval from a secretary");
    }

    public static void doctors()
    {

    }

    public static void prescription()
    {

    }

    public static void terminateAccount()
    {

    }
}
