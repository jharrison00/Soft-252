package View.State;

import Model.Appointments.Appointment;
import Model.Users.Doctor;

public class AppointmentView implements IState{

    public static void addNotes(Doctor doctor,Appointment appointment)
    {

    }

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
