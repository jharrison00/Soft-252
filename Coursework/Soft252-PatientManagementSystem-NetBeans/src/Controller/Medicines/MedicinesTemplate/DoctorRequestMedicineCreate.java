package Controller.Medicines.MedicinesTemplate;

import Controller.Medicines.MedicinesController;
import Controller.Users.UsersController;
import Model.Medicines.Medicine;
import Model.Users.Secretary;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Used in template pattern when secretary chooses to add quantity to a doctor requested medicine
 * @author jonat
 */
public class DoctorRequestMedicineCreate extends MedicinesController {

    /**
     * Edits medicine quantity and removes medicine from secretary requests
     * @param secretary
     * @param medicine 
     */
    @Override
    protected void secretaryApproval(Secretary secretary, Medicine medicine) {
        ArrayList<Medicine> requestMedicines = secretary.getRequestMedicines();
        String medicineName = medicine.getName();
        System.out.println(medicineName);
        String reqMedName;
        for (Medicine reqMed : requestMedicines) {
            reqMedName = reqMed.getName();
            System.out.println(reqMedName);
        }
        requestMedicines.remove(medicine);
        if (requestMedicines.isEmpty()){
            requestMedicines = null;
        }
        secretary.setRequestMedicines(requestMedicines);
        try {
            UsersController.editUser(secretary);
            System.out.println("Doctor request removed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
