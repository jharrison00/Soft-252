package View.State;

import Controller.PrescriptionsController;
import Model.Appointments.Appointment;
import Model.Prescriptions.Prescription;
import Model.Users.Doctor;

import java.io.IOException;
import java.util.Scanner;

public class AppointmentView implements IState{

    public static void addNotes(Doctor doctor,Appointment appointment)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Add note: ");
        String note = in.nextLine();
        Prescription prescription = new Prescription(doctor,appointment.getAppointmentPatient(),note);
        try {
            PrescriptionsController.createPrescription(prescription);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
