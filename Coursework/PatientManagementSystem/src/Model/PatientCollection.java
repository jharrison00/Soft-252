/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class PatientCollection implements Serializable {
    private static final long serialVersionUID = 1L;

    private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatients() {
        return patientList;
    }

    public void setPatients(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
}
