package View.State;

import Model.Appointments.Appointment;
import Model.Users.Doctor;

public interface IState {
    void enterAppointment(Doctor doctor, DoctorState doctorState);
    void saveAppointment(Doctor doctor, DoctorState doctorState);
}
