package Model.Prescriptions;

import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.Serializable;

public class Prescription implements Serializable {
    protected Doctor doctor;
    protected Patient patient;
    protected String note = "No note";

    public Prescription(Doctor doctor, Patient patient, String note) {
        this.doctor = doctor;
        this.patient = patient;
        this.note = note;
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

}


