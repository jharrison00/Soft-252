/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.Users.UsersController;
import Enums.Genders;
import Model.Appointments.Appointment;
import Model.Observers.AppointmentObserver;
import Model.Observables.PatientObservable;
import Model.Observers.SecretaryObserver;
import Model.Observers.PrescriptionObserver;
import Model.Prescriptions.Prescription;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Patient Data model with override for gender and age
 * @author jonat
 */
public class Patient extends HospitalPeople implements PatientObservable, AppointmentObserver, PrescriptionObserver
{
    private ArrayList<SecretaryObserver> secretaries;

    protected int age;
    protected Genders gender;
    protected ArrayList<Appointment> appointments;
    protected ArrayList<Prescription> prescriptions;

    /**
     * Constructor for patient
     * @param username
     * @param firstName
     * @param lastName
     * @param password
     * @param address
     * @param age
     * @param gender 
     */
    public Patient(String username, String firstName, String lastName, String password, String address,int age, Genders gender) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;    
        this.age = age;
        this.gender = gender;
    }

    public Patient() {
     
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

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    /**
     * Registers all observers of this object/observable
     */
    @Override
    public void registerObservers() {
        secretaries = Secretary.getAllSecretaries();
    }

    /**
     * Remove observers of this object/observable
     * @param secretary 
     */
    @Override
    public void removeObserver(Secretary secretary) {
        secretaries.remove(secretary);
    }

    /**
     * Notify observers that this is a patient create request 
     * @param patient 
     */
    @Override
    public void notifyObserverCreate(Patient patient) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateCreate(patient);
        }
    }

    /**
     * Notify observers that this is a patient remove request
     * @param patient 
     */
    @Override
    public void notifyObserverRemove(Patient patient) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateRemove(patient);
        }
    }

    /**
     * Notify observers of appointment request observable
     * @param appointment 
     */
    @Override
    public void notifyObserverAppointment(Appointment appointment) {
        for (SecretaryObserver secretary: secretaries){
            secretary.updateRequestAppointment(appointment);
        }
    }

    /**
     * Updates observers of appointment request
     * @param appointment 
     */
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

    /**
     * Update object/observer on new prescription/observable
     * @param prescription 
     */
    @Override
    public void updatePrescription(Prescription prescription) {
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
                if (this.prescriptions == null)
                {
                    this.prescriptions = new ArrayList<Prescription>();
                }
                this.prescriptions.add(prescription);
            }
        }
        userList.setAllUsersList(allUsers);
        try {
            UsersController.editUser(this);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Removes prescription/observable from object/observer
     * @param prescription 
     */
    @Override
    public void removePrescription(Prescription prescription) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Removing prescription from "+this.getUsername());
                if (this.prescriptions != null)
                {
                    this.prescriptions = null;
                }
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
