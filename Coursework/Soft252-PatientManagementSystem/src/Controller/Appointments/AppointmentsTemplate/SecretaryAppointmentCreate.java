package Controller.Appointments.AppointmentsTemplate;

import Controller.Appointments.AppointmentsController;
import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Users.HospitalPeople;
import Model.Users.Secretary;

import java.io.IOException;
import java.util.ArrayList;

public class SecretaryAppointmentCreate extends AppointmentsController {

    @Override
    protected void secretaryApproval(Secretary secretary,Appointment appointment) {
        ArrayList<Appointment> requestAppointments = secretary.getRequestAppointments();
        requestAppointments.remove(appointment);
        if (requestAppointments.isEmpty()){
            requestAppointments = null;
        }
        secretary.setRequestAppointments(requestAppointments);
        try {
            UsersController.editUser(secretary);
            System.out.println("Appointment approved");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
