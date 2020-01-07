package Model.Appointments;

import Model.Users.HospitalPeople;

import java.io.Serializable;
import java.util.ArrayList;

public class AppointmentList implements Serializable {

    private ArrayList<Appointment> allAppointments;

    public ArrayList<Appointment> getAllAppointmentsList() {
        return allAppointments;
    }

    public void setAllAppointmentsList(ArrayList<Appointment> allAppointments) {
        this.allAppointments = allAppointments;
    }
}
