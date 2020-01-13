/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Observers.SecretaryObserver;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Model class for secretary that implements secretary observer
 * @author jonat
 */
public class Secretary extends HospitalPeople implements SecretaryObserver {

    protected ArrayList<HospitalPeople> approvalUsers;
    protected ArrayList<HospitalPeople> removalUsers;
    protected ArrayList<Appointment> requestAppointments;
    protected ArrayList<Medicine> requestMedicines;

    /**
     * Constructor for secretary object
     * @param username
     * @param firstName
     * @param lastName
     * @param password
     * @param address 
     */
    public Secretary(String username, String firstName, String lastName, String password, String address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
    }

    /**
     * Getter for ArrayList of all secretary observers
     * @return ArrayList of all secretary observers
     */
    public static ArrayList<SecretaryObserver> getAllSecretaries() {
        ArrayList<SecretaryObserver>  secretaries = new ArrayList<SecretaryObserver>();
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().toUpperCase().charAt(0) == "S".charAt(0)){
                secretaries.add((Secretary) user);
            }
        }
        return secretaries;
    }

    public Secretary() {
    }

    
    public ArrayList<HospitalPeople> getApprovalUsers() {
        return approvalUsers;
    }

    public void setApprovalUsers(ArrayList<HospitalPeople> approvalUsers) {
        this.approvalUsers = approvalUsers;
    }

    public ArrayList<HospitalPeople> getRemovalUsers() {
        return removalUsers;
    }

    public void setRemovalUsers(ArrayList<HospitalPeople> removalUsers) {
        this.removalUsers = removalUsers;
    }

    public ArrayList<Appointment> getRequestAppointments() {
        return requestAppointments;
    }

    public void setRequestAppointments(ArrayList<Appointment> requestAppointments) {
        this.requestAppointments = requestAppointments;
    }

    public ArrayList<Medicine> getRequestMedicines() {
        return requestMedicines;
    }

    public void setRequestMedicines(ArrayList<Medicine> requestMedicines) {
        this.requestMedicines = requestMedicines;
    }

    public void editUser(){
        try {
            UsersController.editUser(this);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates object/observer of request for creation of user/observable
     * @param person 
     */
    @Override
    public void updateCreate(HospitalPeople person) {
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
                if (this.approvalUsers == null){
                    this.approvalUsers = new ArrayList<HospitalPeople>();
                }
                this.approvalUsers.add(person);
            }
        }
        userList.setAllUsersList(allUsers);
        editUser();
    }

    /**
     * Updates object/observer of request for termination of user/observable
     * @param person 
     */
    @Override
    public void updateRemove(HospitalPeople person) {
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
                if (this.removalUsers == null){
                    this.removalUsers = new ArrayList<HospitalPeople>();
                }
                this.removalUsers.add(person);
            }
        }
        userList.setAllUsersList(allUsers);
        editUser();
    }

    /**
     * Updates object/observer of request for appointment/observable
     * @param appointment 
     */
    @Override
    public void updateRequestAppointment(Appointment appointment) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Sending appointment to "+this.getUsername());
                if (this.requestAppointments == null){
                    this.requestAppointments = new ArrayList<Appointment>();
                }
                this.requestAppointments.add(appointment);
            }
        }
        userList.setAllUsersList(allUsers);
        editUser();
    }

    /**
     * Updates object/observer of request medicine/observable
     * @param medicine 
     */
    @Override
    public void updateRequestMedicine(Medicine medicine) {
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(this.getUsername())&&user.getPassword().equals(this.getPassword())) {
                System.out.println("Sending medicine to "+this.getUsername());
                if (this.requestMedicines == null){
                    this.requestMedicines = new ArrayList<Medicine>();
                }
                this.requestMedicines.add(medicine);
            }
        }
        userList.setAllUsersList(allUsers);
        editUser();
    }
}
