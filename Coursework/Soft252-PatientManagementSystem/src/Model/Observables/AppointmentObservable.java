package Model.Observables;

import Model.Appointments.Appointment;
import Model.Users.HospitalPeople;

/**
 *
 * @author jonat
 */
public interface AppointmentObservable {
    public void registerAppointmentObservers();
    public void removeAppointmentObserver();
    public void notifyAppointment(Appointment appointment);
}
