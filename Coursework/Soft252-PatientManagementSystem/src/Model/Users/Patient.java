/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;


import Enums.Genders;

/**
 * Patient Data model with override for gender and age
 * @author jonat
 */
public class Patient extends HospitalPeople
{  
    public Patient(String username, String password, String address,int age, Genders gender) {
        this.username = username;
        this.password = password;
        this.address = address;    
        this.age = age;
        this.gender = gender;
    }   
}
