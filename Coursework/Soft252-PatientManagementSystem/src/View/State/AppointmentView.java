package View.State;

import Model.Users.Doctor;

public class AppointmentView implements IState{

    @Override
    public void enterAppointment(Doctor doctor, DoctorState doctorState) {
        System.out.println("Already in appointment view");
        doctorState.setState(this);
    }

    @Override
    public void saveAppointment(Doctor doctor, DoctorState doctorState) {
        System.out.println("Saving appointment. Going back to Doctor view");
        doctorState.setState(new DoctorView());
    }
}
