package Model.Users;

import Model.Appointments.Appointment;

/**
 *
 * @author jonat
 */
public interface AppointmentObserver {
    void updateAppointment(Appointment appointment);
}
