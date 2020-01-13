package Model.Observables;

import Model.Appointments.Appointment;

/**
 * Interface for making appointment an observable in observer pattern
 * @author jonat
 */
public interface AppointmentObservable {
    void registerAppointmentObservers();
    void removeAppointmentObserver();
    void notifyAppointment(Appointment appointment);
}
