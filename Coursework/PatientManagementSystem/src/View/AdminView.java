/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Administrator;
import Model.Doctor;

/**
 *
 * @author jonat
 */
public class AdminView {
    public static void adminHome(Administrator admin){
        Doctor doctor = new Doctor("doctor1","password","address");
        admin.createAccount(doctor);
    }
}
