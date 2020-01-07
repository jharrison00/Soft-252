package Model.Appointments;

import Model.Observables.AppointmentObservable;
import Model.Users.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jonat
 */
public class Appointment implements Serializable, AppointmentObservable {

    private ArrayList<AppointmentObserver> appointmentObservers = new ArrayList<AppointmentObserver>();
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

    public Appointment() {

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

    @Override
    public void registerAppointmentObservers() {
        appointmentObservers.add(this.doctor);
        appointmentObservers.add(this.patient);
    }

    @Override
    public void removeAppointmentObserver() {

    }

    @Override
    public void notifyAppointment(Appointment appointment) {
        for (AppointmentObserver observer: appointmentObservers){
            observer.updateAppointment(appointment);
        }
    }
}
