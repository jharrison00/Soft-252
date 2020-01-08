package View.State;

import Model.Users.Doctor;

public interface IState {
    void enterAppointment(Doctor doctor, DoctorState doctorState);
    void saveAppointment(Doctor doctor, DoctorState doctorState);
}
