package Model.Prescriptions;

import Model.Medicines.Medicine;
import Model.Observables.PrescriptionObservable;
import Model.Observables.PrescriptionObserver;
import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.Serializable;
import java.util.ArrayList;

public class Prescription implements Serializable, PrescriptionObservable {

    protected ArrayList<PrescriptionObserver> prescriptionObservers = new ArrayList<PrescriptionObserver>();
    protected Doctor doctor;
    protected Patient patient;
    protected String note = "No note";
    protected Medicine medicine;
    protected int quantity;
    protected String Dosage;

    public Prescription(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    @Override
    public void registerPrescriptionObservers() {
        prescriptionObservers.add(this.patient);
    }

    @Override
    public void removePrescriptionObserver(Prescription prescription) {
        for (PrescriptionObserver observer : prescriptionObservers){
            observer.removePrescription(prescription);
        }
    }

    @Override
    public void notifyPrescription(Prescription prescription) {
        for (PrescriptionObserver observer: prescriptionObservers){
            observer.updatePrescription(prescription);
        }
    }
}


