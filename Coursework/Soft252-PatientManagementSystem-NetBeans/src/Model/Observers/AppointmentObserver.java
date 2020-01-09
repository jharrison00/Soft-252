package Model.Observers;

import Model.Appointments.Appointment;

/**
 *
 * @author jonat
 */
public interface AppointmentObserver {
    void updateAppointment(Appointment appointment);
}
