package View.DoctorState;

import Model.Users.Doctor;

public interface IState {
    void enterAppointment(Doctor doctor, DoctorState doctorState);
    void exitAppointment(Doctor doctor, DoctorState doctorState);
}
