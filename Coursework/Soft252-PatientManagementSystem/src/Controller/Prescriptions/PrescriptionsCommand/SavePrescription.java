package Controller.Prescriptions.PrescriptionsCommand;

import Controller.Prescriptions.PrescriptionsController;
import Model.Prescriptions.Prescription;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SavePrescription implements ICommand{
    private Prescription prescription;

    public SavePrescription(Prescription prescription){
        this.prescription = prescription;
    }

    @Override
    public void execute() {
        try {
            PrescriptionsController.createPrescription(prescription);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
        try {
            PrescriptionsController.deletePrescription(prescription);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
