/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;
import View.LogIn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

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
    public void setView(LogIn view){
        this.view = view;
    }
    
    /**
     * Setting the model reference. 
     * @param patient
     * @throws java.io.IOException
     */
    public void setPatient(Patient patient) throws IOException{
        this.patient = patient;
        createPatient(patient);
    }
    
    /**
     * Creates a user
     * @param patient
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void createPatient(Patient patient) throws FileNotFoundException, IOException, IOException{      
        
        File file = new File("Users.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        
        ObjectOutput outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(patient);
        System.out.println("Stored in file : " + file.getName());  
    }
    
        public static void ReadUser() throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream ("Users.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        try 
        {     
            Patient patient = (Patient) inputStream.readObject();
            System.out.println(patient.getPassword());
        }
        catch(IOException | ClassNotFoundException e ) {
            System.out.println(e.toString());
        }
    }
}
