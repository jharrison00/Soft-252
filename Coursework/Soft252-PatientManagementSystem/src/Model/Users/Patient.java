/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.Users.UsersController;
import Enums.Genders;
import Model.Appointments.Appointment;
import Model.Observables.AppointmentObserver;
import Model.Observables.PatientObservable;
import Model.Observables.SecretaryObserver;

import java.io.IOException;
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
    protected ArrayList<Appointment> appointments;

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

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
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
            secretary.updateRequestAppointment(appointment);
        }
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Updating "+this.getUsername());
                if (this.appointments == null)
                {
                    this.appointments = new ArrayList<Appointment>();
                }
                this.appointments.add(appointment);
            }
        }
        userList.setAllUsersList(allUsers);
        try {
            UsersController.editUser(this);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
