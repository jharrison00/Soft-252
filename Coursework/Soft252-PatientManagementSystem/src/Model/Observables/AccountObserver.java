package Model.Observables;

import Model.Appointments.Appointment;
import Model.Users.HospitalPeople;

/**
 *
 * @author jonat
 */
public interface AccountObserver {
    void updateCreate(HospitalPeople person);
    void updateRemove(HospitalPeople person);
    void updateRequestAppointment(Appointment appointment);
}
