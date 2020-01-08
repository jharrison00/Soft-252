package View.State;

import Model.Users.Doctor;

public class DoctorState {

    private IState state;
    private Doctor doctor;

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

    public void saveAppointment(){
        state.saveAppointment(doctor,this);
    }

}
