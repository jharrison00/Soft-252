package Controller.Appointments.AppointmentsTemplate;

import Controller.Appointments.AppointmentsController;
import Model.Appointments.Appointment;
import Model.Users.Secretary;

/**
 * Used when a doctor chooses to create an appointment in template pattern
 * @author jonat
 */
public class DoctorAppointmentCreate extends AppointmentsController {

    @Override
    protected void secretaryApproval(Secretary secretary, Appointment appointment) {

    }
}
