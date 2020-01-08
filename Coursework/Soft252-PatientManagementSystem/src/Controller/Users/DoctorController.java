/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Controller.Medicines.MedicinesController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Users.Doctor;
import View.DoctorState.DoctorState;
import View.DoctorState.DoctorView;
import View.DoctorState.IState;

import java.io.IOException;

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
        doctorState.exitAppointment();
    }

    public static void createMedicine(Medicine medicine) {
        try {
            MedicinesController.createMedicine(medicine);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        updateObservers(medicine);
    }

    public static void updateObservers(Medicine medicine) {
        medicine.registerObservers();
        medicine.notifyObserverMedicine(medicine);
    }
}
