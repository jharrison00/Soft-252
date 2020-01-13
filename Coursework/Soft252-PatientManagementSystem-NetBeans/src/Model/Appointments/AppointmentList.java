package Model.Appointments;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Model class for ArrayList of all appointments 
 * @author jonat
 */
public class AppointmentList implements Serializable {

    private ArrayList<Appointment> allAppointments;

    /**
     * Getter for ArrayList of all appointments
     * @return 
     */
    public ArrayList<Appointment> getAllAppointmentsList() {
        return allAppointments;
    }

    /**
     * Setter for ArrayList of all appointments
     * @param allAppointments 
     */
    public void setAllAppointmentsList(ArrayList<Appointment> allAppointments) {
        this.allAppointments = allAppointments;
    }
}
