package Controller.AppointmentsTemplate;

import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Users.Secretary;

import java.io.IOException;

public class SecretaryAppointmentCreate extends AppointmentsController {

    @Override
    protected void secretaryApproval(Secretary secretary,Appointment appointment) {
        secretary.setRequestAppointment(null);
        try {
            UsersController.editUser(secretary);
            System.out.println("Appointment approved");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
