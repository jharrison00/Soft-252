package Controller.Medicines.MedicinesTemplate;

import Controller.Medicines.MedicinesController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Users.Secretary;

/**
 * Used when secretary chooses to add stock to a non requested medicine 
 * @author jonat
 */
public class SecretaryMedicineCreate extends MedicinesController {

    @Override
    protected void secretaryApproval(Secretary secretary, Medicine medicine) {

    }
}
