package Model.Prescriptions;

import Model.Medicines.Medicine;
import Model.Observables.PrescriptionObservable;
import Model.Observers.PrescriptionObserver;
import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Model class for prescription object
 * @author jonat
 */
public class Prescription implements Serializable, PrescriptionObservable {

    protected ArrayList<PrescriptionObserver> prescriptionObservers = new ArrayList<PrescriptionObserver>();
    protected Doctor doctor;
    protected Patient patient;
    protected String note = "No note";
    protected Medicine medicine;
    protected int quantity;
    protected String Dosage;

    /**
     * Constructor that sets doctor and patient of prescription
     * @param doctor
     * @param patient 
     */
    public Prescription(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    /**
     * Getter for doctor
     * @return Doctor object
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Setter for doctor
     * @param doctor 
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Getter for patient
     * @return Patient object
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Setter for patient
     * @param patient 
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Getter for note
     * @return String note
     */
    public String getNote() {
        return note;
    }

    /**
     * Setter for note
     * @param note 
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Getter for medicine
     * @return medicine object
     */
    public Medicine getMedicine() {
        return medicine;
    }

    /**
     * Setter for medicine
     * @param medicine 
     */
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    /**
     * Getter for quantity
     * @return int quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for quantity
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for dosage
     * @return String dosage
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     * Setter for dosage
     * @param dosage 
     */
    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    /**
     * Adds observers to this object
     */
    @Override
    public void registerPrescriptionObservers() {
        prescriptionObservers.add(this.patient);
    }

    /**
     * Removes observers to this object
     * @param prescription 
     */
    @Override
    public void removePrescriptionObserver(Prescription prescription) {
        for (PrescriptionObserver observer : prescriptionObservers){
            observer.removePrescription(prescription);
        }
    }

    /**
     * Adds prescription to observers objects
     * @param prescription 
     */
    @Override
    public void notifyObserverPrescription(Prescription prescription) {
        for (PrescriptionObserver observer: prescriptionObservers){
            observer.updatePrescription(prescription);
        }
    }
}


