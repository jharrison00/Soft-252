package View.DoctorState;

import Controller.Appointments.AppointmentsController;
import Controller.Medicines.MedicinesController;
import Controller.Prescriptions.PrescriptionsCommand.AddMedicine;
import Controller.Prescriptions.PrescriptionsCommand.AddNote;
import Controller.Prescriptions.PrescriptionsCommand.ICommand;
import Controller.Prescriptions.PrescriptionsCommand.SavePrescription;
import Model.Appointments.Appointment;
import Model.Appointments.AppointmentInvoker;
import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Prescriptions.Prescription;
import Model.Users.Doctor;

import java.io.IOException;
import java.util.ArrayList;

public class AppointmentView implements IState{

    public static void appointmentHome(Doctor doctor,Appointment appointment)
    {
        Prescription prescription = new Prescription(doctor,appointment.getAppointmentPatient());
        AppointmentInvoker invoker = new AppointmentInvoker();
        addNotes(prescription, invoker);
        addMedicine(prescription, invoker);
        patientHistory(prescription);
        savePrescription(prescription,invoker);

    }

    public static void addNotes(Prescription prescription, AppointmentInvoker invoker)
    {
        ICommand addNote = new AddNote(prescription,"Antibiotics needed");
        invoker.setCommand(addNote);
        invoker.executeCommand();
        System.out.println(prescription.getNote());
        //invoker.undoCommand();
        //System.out.println(prescription.getNote());
    }

    public static void addMedicine(Prescription prescription, AppointmentInvoker invoker){
        MedicineList medicineList = new MedicineList();
        try {
            medicineList = MedicinesController.getAllMedicines();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Medicine> allMedicines = medicineList.getAllMedicines();

        ICommand addMedicine = new AddMedicine(prescription,allMedicines.get(0),4,"Dosage:30");
        invoker.setCommand(addMedicine);
        invoker.executeCommand();
        System.out.println(prescription.getMedicine().getName());
        //invoker.undoCommand();
        //System.out.println("No medicine selected");
    }

    public static void savePrescription(Prescription prescription,AppointmentInvoker invoker){
        ICommand savePrescription = new SavePrescription(prescription);
        invoker.setCommand(savePrescription);
        System.out.println("Executing save");
        invoker.executeCommand();
        //System.out.println("Undoing save");
        //invoker.undoCommand();
    }

    public static void patientHistory(Prescription prescription){
        if (prescription.getPatient().getPrescriptions()!= null) {
            ArrayList<Prescription> prescriptions = prescription.getPatient().getPrescriptions();
            for (Prescription patientPrescription : prescriptions) {
                System.out.println(patientPrescription.getNote());
            }
        }
        else{
            System.out.println("No prescription history");
        }
    }

    @Override
    public void enterAppointment(Doctor doctor, DoctorState doctorState,Appointment appointment) {
        System.out.println("Already in appointment view");
        doctorState.setState(this);
    }

    @Override
    public void exitAppointment(Doctor doctor, DoctorState doctorState,Appointment appointment) {
        AppointmentsController.removeAppointmentObserver(doctor,appointment);
        System.out.println("Finishing appointment. Going back to Doctor view");
        doctorState.setState(new DoctorView());
    }
}
