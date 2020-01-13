package Controller.Prescriptions.PrescriptionsCommand;

import Model.Medicines.Medicine;
import Model.Prescriptions.Prescription;

/**
 * Command pattern for adding medicine to prescription
 * @author jonat
 */
public class AddMedicine implements ICommand{

    private Prescription prescription;
    private Medicine medicine;
    private int quantity;
    private String dosage;

    /**
     * Constructor to add all fields related to medicine
     * @param prescription
     * @param medicine
     * @param quantity
     * @param dosage 
     */
    public AddMedicine(Prescription prescription, Medicine medicine, int quantity, String dosage) {
        this.prescription = prescription;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    /**
     * Execute command for adding medicine to prescription
     */
    @Override
    public void execute() {
        prescription.setMedicine(medicine);
        prescription.setQuantity(quantity);
        prescription.setDosage(dosage);
    }

    /**
     * Undo command for removing medicine from prescription
     */
    @Override
    public void undo() {
        prescription.setMedicine(null);
        prescription.setQuantity(0);
        prescription.setDosage(null);
    }
}
