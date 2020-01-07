/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Enums.Genders;
import Model.Appointments.Appointment;
import Model.Observables.PatientObservable;
import java.util.ArrayList;

/**
 * Patient Data model with override for gender and age
 * @author jonat
 */
public class Patient extends HospitalPeople implements PatientObservable, AppointmentObserver
{
    private ArrayList<SecretaryObserver> secretaries;
    protected int age;
    protected Genders gender;

    public Patient(String username, String firstName, String lastName, String password, String address,int age, Genders gender) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;    
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
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
    public void notifyObserverCreate(Patient patient) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateCreate(patient);
        }
    }

    @Override
    public void notifyObserverRemove(Patient patient) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateRemove(patient);
        }
    }

    @Override
    public void notifyObserverAppointment(Appointment appointment) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateAppointment(appointment);
        }
    }

    @Override
    public void update(HospitalPeople observer) {

    }
}
