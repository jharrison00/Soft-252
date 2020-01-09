package View.DoctorState;

import Model.Appointments.Appointment;
import Model.Users.Doctor;

public interface IState {
    void enterAppointment(Doctor doctor, DoctorState doctorState, Appointment appointment);
    void exitAppointment(Doctor doctor, DoctorState doctorState, Appointment appointment);
}
