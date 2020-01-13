package Model.Observers;

import Model.Appointments.Appointment;

/**
 * Interface for all appointment observers 
 * @author jonat
 */
public interface AppointmentObserver {
    void updateAppointment(Appointment appointment);
}
