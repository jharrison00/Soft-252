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
        //approveCreateAccount(secretary);
        approveRemoveAccount(secretary);
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

    public static void approveCreateAccount(Secretary secretary)
    {
        if (secretary.getApprovalUser() != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to approve: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.approveAccount(secretary, secretary.getApprovalUser());
                System.out.println("Patient approved");
            } else {
                System.out.println("Not approved");
            }
        }
    }

    public static void approveRemoveAccount(Secretary secretary)
    {
        if (secretary.getRemovalUser() != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Would you like to approve termination: ");
            String approve = in.nextLine();
            if (approve.equals("yes")) {
                SecretaryController.terminateAccount(secretary, secretary.getRemovalUser());
                System.out.println("Patient removed");
            } else {
                System.out.println("Not approved");
            }
        }
    }
}    

