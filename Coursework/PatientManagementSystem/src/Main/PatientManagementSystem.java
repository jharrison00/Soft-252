/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.LogInController;
import View.LogIn;

/**
 *
 * @author jonathan Harrison
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // instancetiate the view
        LogIn view = new LogIn();
        // instantiate the controller
        LogInController controller = new LogInController();
        // set controller attributes
        controller.setView(view);    
    }
}
