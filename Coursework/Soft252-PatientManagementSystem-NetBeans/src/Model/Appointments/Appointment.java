package Model.Appointments;

import Model.Observables.AppointmentObservable;
import Model.Observers.AppointmentObserver;
import Model.Users.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Model for appointment
 * @author jonat
 */
public class Appointment implements Serializable, AppointmentObservable {

    private ArrayList<AppointmentObserver> appointmentObservers = new ArrayList<AppointmentObserver>();
    protected int appointmentID;
    protected Patient patient;
    protected Doctor doctor;
    protected Date date;

    /**
     * Constructor adding all properties to object
     * @param appointmentID
     * @param patient
     * @param doctor
     * @param date 
     */
    public Appointment(int appointmentID, Patient patient, Doctor doctor, Date date) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    /**
     * Empty constructor for adding blank appointment 
     */
    public Appointment() {

    }

    /**
     * Getter for appointmentID
     * @return 
     */
    public int getAppointmentID() {
        return appointmentID;
    }

    /**
     * Setter for appointmentID
     * @param appointmentID 
     */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**
     * Getter for appointment patient
     * @return 
     */
    public Patient getAppointmentPatient() {
        return patient;
    }

    /**
     * Setter for appointment patient
     * @param patient 
     */
    public void setAppointmentPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Getter for appointment doctor
     * @return 
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Setter for appointment doctor
     * @param doctor 
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Getter for date
     * @return 
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for date
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets this patient and doctor as observer of appointment 
     */
    @Override
    public void registerAppointmentObservers() {
        appointmentObservers.add(this.doctor);
        appointmentObservers.add(this.patient);
    }

    
    @Override
    public void removeAppointmentObserver() {

    }

    /**
     * Adds appointment to observers
     * @param appointment 
     */
    @Override
    public void notifyAppointment(Appointment appointment) {
        for (AppointmentObserver observer: appointmentObservers){
            observer.updateAppointment(appointment);
        }
    }
}
