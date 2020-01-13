/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



/**
 * Main method for application
 * @author jonat
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate the login view
        new View.GuiView.LogInView().setVisible(true);
    }
}
