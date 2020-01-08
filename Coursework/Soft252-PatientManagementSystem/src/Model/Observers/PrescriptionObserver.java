package Model.Observers;

import Model.Prescriptions.Prescription;

public interface PrescriptionObserver {
    void updatePrescription(Prescription prescription);
    void removePrescription(Prescription prescription);
}
