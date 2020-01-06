/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.Patient;
import View.PatientView;

/**
 *
 * @author jonat
 */
public class PatientController {
        public static void setView(Patient patient)
    {
        PatientView.patientHome(patient);
    }
}
