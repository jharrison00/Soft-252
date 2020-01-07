package Model.Users;

import Model.Appointments.Appointment;

/**
 *
 * @author jonat
 */
public interface SecretaryObserver {
    void updateCreate(HospitalPeople person);
    void updateRemove(HospitalPeople person);
    void updateRequestAppointment(Appointment appointment);
}
