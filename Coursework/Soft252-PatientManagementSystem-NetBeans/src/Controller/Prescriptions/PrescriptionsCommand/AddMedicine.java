package Controller.Prescriptions.PrescriptionsCommand;

import Model.Medicines.Medicine;
import Model.Prescriptions.Prescription;

public class AddMedicine implements ICommand{

    private Prescription prescription;
    private Medicine medicine;
    private int quantity;
    private String dosage;

    public AddMedicine(Prescription prescription, Medicine medicine, int quantity, String dosage) {
        this.prescription = prescription;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    @Override
    public void execute() {
        prescription.setMedicine(medicine);
        prescription.setQuantity(quantity);
        prescription.setDosage(dosage);
    }

    @Override
    public void undo() {
        prescription.setMedicine(null);
        prescription.setQuantity(0);
        prescription.setDosage(null);
    }
}
