package Controller.Prescriptions.PrescriptionsCommand;

import Controller.Prescriptions.PrescriptionsController;
import Model.Prescriptions.Prescription;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Command to save prescription to file and remove prescription from file 
 * @author jonat
 */
public class SavePrescription implements ICommand{
    private Prescription prescription;

    /**
     * Constructor to get prescription for command
     * @param prescription 
     */
    public SavePrescription(Prescription prescription){
        this.prescription = prescription;
    }

    /**
     * Execute command saves prescription to file
     */
    @Override
    public void execute() {
        try {
            PrescriptionsController.updateObservers(prescription);
            PrescriptionsController.createPrescription(prescription);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Undo command removes prescription from file
     */
    @Override
    public void undo() {
        try {
            PrescriptionsController.removeObservers(prescription);
            PrescriptionsController.deletePrescription(prescription);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
