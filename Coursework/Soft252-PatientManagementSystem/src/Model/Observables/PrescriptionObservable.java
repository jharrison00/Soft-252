package Model.Observables;

import Model.Prescriptions.Prescription;

public interface PrescriptionObservable {
    void registerPrescriptionObservers();
    void removePrescriptionObserver(Prescription prescription);
    void notifyPrescription(Prescription prescription);
}
