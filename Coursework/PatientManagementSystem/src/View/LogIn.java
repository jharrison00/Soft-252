/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LogInController;
import Enums.Genders;
import Model.Patient;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class LogIn {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getUserDetails();
    }
    
    public static void getUserDetails() throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);        
        System.out.println("Input username: ");
        String username = in.nextLine();
        System.out.println("Input password: ");
        String password = in.nextLine();
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.println("Input gender: ");
        //String gender = in.nextLine();
        Patient patient = new Patient();
        patient.setAge(age);
        patient.setGender(Genders.Other);
        patient.setPassword(password);
        patient.setUsername(username);
        in.close();
        LogInController.createPatient(patient);
        LogInController.ReadPatientList();
    }
}
