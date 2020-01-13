package Model.Observers;

import Model.Prescriptions.Prescription;

/**
 * Interface for all prescription observers
 * @author jonat
 */
public interface PrescriptionObserver {
    void updatePrescription(Prescription prescription);
    void removePrescription(Prescription prescription);
}
