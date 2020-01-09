package Model.Observables;

import Model.Appointments.Appointment;
import Model.Users.HospitalPeople;

/**
 *
 * @author jonat
 */
public interface AppointmentObservable {
    void registerAppointmentObservers();
    void removeAppointmentObserver();
    void notifyAppointment(Appointment appointment);
}
