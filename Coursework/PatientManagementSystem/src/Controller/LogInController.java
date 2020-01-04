/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;
import Model.PatientCollection;
import View.LogIn;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class LogInController {

    private LogIn view;
    private Patient patient;
    /**
     * Setting the view reference. 
     * @param view The view.
     */
    public void setView(final LogIn view){
        this.view = view;
    }
    
    /**
     * Setting the model reference.
     * 
     * @param patient
     * @throws java.io.IOException
     * @throws ClassNotFoundException
     */
    public void setPatient(final Patient patient) throws IOException, ClassNotFoundException {
        this.patient = patient;
        createPatient(patient);
    }
    
    /**
     * Creates a user
     * 
     * @param patient
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void createPatient(final Patient patient)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {      
        PatientCollection patientCollection = new PatientCollection();
        ArrayList<Patient> newPatientList = new ArrayList<Patient>();
        try 
        {       
            final FileInputStream fis = new FileInputStream("Users.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            PatientCollection patientList=null;
            patientList = (PatientCollection) ois.readObject();
            ois.close();
            newPatientList = patientList.getPatients();
            newPatientList.add(patient);
        }
        catch (EOFException e) {
            newPatientList.add(patient);
        }   
        patientCollection.setPatients(newPatientList);

        final File file = new File("Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        final ObjectOutput outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(patientCollection);
        System.out.println("Stored in file : " + file.getName());
        outputStream.close();
    }

    public static void ReadPatientList() throws IOException, ClassNotFoundException {
        PatientCollection patientList=null;
        try 
        {       
            final FileInputStream fis = new FileInputStream("Users.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);

            patientList = (PatientCollection) ois.readObject();
            ois.close();
        }
        catch (EOFException e) {
        }   
        ArrayList<Patient> patients = patientList.getPatients();
        for (Patient patient : patients) {
            System.out.println(patient.getUsername());
        }
    }   
}