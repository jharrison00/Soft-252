/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.LogInController;
import Enums.Genders;
import Model.Observables.PatientObservable;
import java.util.ArrayList;

/**
 * Patient Data model with override for gender and age
 * @author jonat
 */
public class Patient extends HospitalPeople implements PatientObservable
{
    private ArrayList<SecretaryObserver> secretaries;

    public Patient(String username, String password, String address,int age, Genders gender) {
        this.username = username;
        this.password = password;
        this.address = address;    
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void registerObservers() {
        secretaries = Secretary.getAllSecretaries();
    }

    @Override
    public void removeObserver(Secretary secretary) {
        secretaries.remove(secretary);
    }

    @Override
    public void notifyObserver(Patient patient) {
        for (SecretaryObserver secretary: secretaries){
            secretary.update(patient);
        }
    }
}
