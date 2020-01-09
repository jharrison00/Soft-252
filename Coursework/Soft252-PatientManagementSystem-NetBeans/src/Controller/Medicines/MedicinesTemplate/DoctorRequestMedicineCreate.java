package Controller.Medicines.MedicinesTemplate;

import Controller.Appointments.AppointmentsController;
import Controller.Medicines.MedicinesController;
import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Users.Secretary;

import java.io.IOException;
import java.util.ArrayList;

public class DoctorRequestMedicineCreate extends MedicinesController {

    @Override
    protected void secretaryApproval(Secretary secretary, Medicine medicine) {
        ArrayList<Medicine> requestMedicines = secretary.getRequestMedicines();
        requestMedicines.remove(medicine);
        secretary.setRequestMedicines(requestMedicines);
        try {
            UsersController.editUser(secretary);
            System.out.println("Doctor request removed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
