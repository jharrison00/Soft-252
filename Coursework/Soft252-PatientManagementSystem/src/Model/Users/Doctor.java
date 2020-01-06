
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

/**
 *
 * @author jonat
 */
public class Doctor extends HospitalPeople
{    
    public Doctor(String username, String password, String address) {
    this.username = username;
    this.password = password;
    this.address = address;    
    } 
}
