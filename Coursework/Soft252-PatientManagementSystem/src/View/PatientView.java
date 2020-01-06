/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Enums.Genders;
import Model.Observables.PatientObservable;
import Model.Users.Patient;
import Model.Users.Secretary;
import Model.Users.SecretaryObserver;

/**
 *
 * @author jonat
 */
public class PatientView {
    public static void patientHome(Patient patient)
    {

    }

    public static void appointment()
    {

    }

    public static void createAccount()
    {
        Patient patient = new Patient("approvedPatient","approvedPassword","add",23, Genders.Female);
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
