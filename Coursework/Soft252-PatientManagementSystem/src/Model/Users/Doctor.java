
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import Model.Appointments.IAppointment;

/**
 *
 * @author jonat
 */
public class Doctor extends HospitalPeople implements AppointmentObserver
{
    public Doctor(String username, String firstName, String lastName, String password, String address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
    }

    @Override
    public void update(HospitalPeople observer) {

    }

}
