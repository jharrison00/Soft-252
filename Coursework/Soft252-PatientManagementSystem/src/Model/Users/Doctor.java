
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Controller.UsersController;
import Model.Appointments.Appointment;
import Model.Observables.AppointmentObserver;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Doctor extends HospitalPeople implements AppointmentObserver
{
    protected ArrayList<Appointment> appointments;
    public Doctor(String username, String firstName, String lastName, String password, String address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
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
