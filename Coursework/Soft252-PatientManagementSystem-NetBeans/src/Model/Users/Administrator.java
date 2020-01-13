/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

/**
 * Model class for administrator that extends hospitalPeople superclass
 * @author jonat
 */
public class Administrator extends HospitalPeople {
    public Administrator(String username, String firstName, String lastName, String password, String address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;    
    }

    public Administrator() {
    }
    

    
}
