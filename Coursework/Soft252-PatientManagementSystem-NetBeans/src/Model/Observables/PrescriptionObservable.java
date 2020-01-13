package Model.Observables;

import Model.Prescriptions.Prescription;

/**
 * Interface to make prescription as observable for observer pattern
 * @author jonat
 */
public interface PrescriptionObservable {
    void registerPrescriptionObservers();
    void removePrescriptionObserver(Prescription prescription);
    void notifyObserverPrescription(Prescription prescription);
}
