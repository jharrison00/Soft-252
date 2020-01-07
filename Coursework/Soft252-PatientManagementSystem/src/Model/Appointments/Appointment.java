package Model.Appointments;

import Model.Users.Doctor;
import Model.Users.Patient;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jonat
 */
public class Appointment implements Serializable {
    protected int appointmentID;
    protected Patient patient;
    protected Doctor doctor;
    protected Date date;

    public Appointment(int appointmentID, Patient patient, Doctor doctor, Date date) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Patient getAppointmentPatient() {
        return patient;
    }

    public void setAppointmentPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
