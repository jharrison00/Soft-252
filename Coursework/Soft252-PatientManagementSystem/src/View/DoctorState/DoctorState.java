package View.DoctorState;

import Model.Appointments.Appointment;
import Model.Users.Doctor;

public class DoctorState {

    private IState state;
    private Doctor doctor;
    private Appointment appointment;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public DoctorState (Doctor doctor, IState state){
        this.state = state;
        this.doctor = doctor;
    }

    public void setState(IState state){
        this.state = state;
    }

    public void enterAppointment(){
        state.enterAppointment(doctor,this);
    }

    public void exitAppointment(){
        state.exitAppointment(doctor,this);
    }

}
