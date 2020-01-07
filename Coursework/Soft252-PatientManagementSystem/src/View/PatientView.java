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
        terminateAccount(patient);
    }

    public static void appointment()
    {

    }

    public static void doctors()
    {

    }

    public static void prescription()
    {

    }

    public static void terminateAccount(Patient patient)
    {
        try {
            PatientController.terminateAccount(patient);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Request for termination has been stored, waiting for approval from a secretary");
    }
}
