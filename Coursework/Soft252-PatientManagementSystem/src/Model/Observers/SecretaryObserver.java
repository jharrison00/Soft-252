package Model.Observers;

import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Users.HospitalPeople;

/**
 *
 * @author jonat
 */
public interface SecretaryObserver {
    void updateCreate(HospitalPeople person);
    void updateRemove(HospitalPeople person);
    void updateRequestAppointment(Appointment appointment);
    void updateRequestMedicine(Medicine medicine);
}
