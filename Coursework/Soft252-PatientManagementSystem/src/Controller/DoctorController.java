/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.Doctor;
import View.State.DoctorState;
import View.State.DoctorView;
import View.State.IState;

/**
 *
 * @author jonat
 */
public abstract class DoctorController{

    public static void setView(Doctor doctor)
    {
        IState start = new DoctorView();
        DoctorState doctorState = new DoctorState(doctor, start);
        doctorState.enterAppointment();
    }

}
