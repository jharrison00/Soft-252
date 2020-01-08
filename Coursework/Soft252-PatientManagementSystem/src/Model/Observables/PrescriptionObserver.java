package Model.Observables;

import Model.Prescriptions.Prescription;

public interface PrescriptionObserver {
    void updatePrescription(Prescription prescription);
    void removePrescription(Prescription prescription);
}
