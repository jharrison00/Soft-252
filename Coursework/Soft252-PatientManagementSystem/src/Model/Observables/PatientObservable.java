package Model.Observables;

import Model.Appointments.Appointment;
import Model.Users.Patient;
import Model.Users.Secretary;

/**
 *
 * @author jonat
 */
public interface PatientObservable {
    public void registerObservers();
    public void removeObserver(Secretary secretary);
    public void notifyObserverCreate(Patient patient);
    public void notifyObserverRemove(Patient patient);
    public void notifyObserverAppointment(Appointment appointment);
}
