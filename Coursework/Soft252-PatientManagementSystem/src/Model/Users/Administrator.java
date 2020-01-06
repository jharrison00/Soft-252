/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

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
    

    
}
