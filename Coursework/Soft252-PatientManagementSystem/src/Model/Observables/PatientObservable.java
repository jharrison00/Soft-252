package Model.Observables;

import Model.Appointments.Appointment;
import Model.Users.Patient;
import Model.Users.Secretary;

/**
 *
 * @author jonat
 */
public interface PatientObservable {
    void registerObservers();
    void removeObserver(Secretary secretary);
    void notifyObserverCreate(Patient patient);
    void notifyObserverRemove(Patient patient);
    void notifyObserverAppointment(Appointment appointment);
}
