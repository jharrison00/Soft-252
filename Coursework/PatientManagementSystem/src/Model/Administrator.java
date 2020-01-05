/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.LogInController;
import java.io.IOException;

/**
 *
 * @author jonat
 */

public class Administrator extends HospitalPeople {
    public Administrator(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;    
    }
    
    public void createAccount(HospitalPeople person){
        try {
            LogInController.createUser(person);
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
}
