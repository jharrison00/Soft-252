/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SecretaryController;
import Model.Users.HospitalPeople;
import Model.Users.Secretary;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class SecretaryView {
    public static void secretaryHome(Secretary secretary){
    }

    public static void removePatient()
    {

    }

    public static void giveMedicine()
    {

    }

    public static void createAppointment()
    {

    }

    public static boolean approveAccount(HospitalPeople person)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to approve: "+person.getUsername());
        String approve = in.nextLine();
        if (approve.equals("yes"))
        {
            return true;
        }
        else
        {
            System.out.println("Not approved");
            return false;
        }
    }
}    

