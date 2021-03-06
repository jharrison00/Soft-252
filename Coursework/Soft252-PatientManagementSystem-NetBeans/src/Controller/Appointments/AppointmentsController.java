package Controller.Appointments;

import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Appointments.AppointmentList;
import Model.Users.Doctor;
import Model.Users.Secretary;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author jonat
 * Controller to append,edit and delete appointments from appointment file
 */
public abstract class AppointmentsController {

    /**
     * Create appointment template pattern
     * @param secretary
     * @param appointment
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public final void createAppointment(Secretary secretary,Appointment appointment)
            throws IOException, ClassNotFoundException
    {
        secretaryApproval(secretary,appointment);
        updateObservers(appointment);
        addToFile(appointment);
    }

    /**
     * Gets all appointments from file
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static AppointmentList getAllAppointments() throws IOException, ClassNotFoundException {
        AppointmentList appointmentList = new AppointmentList();
        FileInputStream fis = new FileInputStream("src\\files\\Appointments.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            appointmentList = (AppointmentList) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e.toString());
        }
        ois.close();
        fis.close();

        ArrayList<Appointment> allAppointments = appointmentList.getAllAppointmentsList();
        appointmentList.setAllAppointmentsList(allAppointments);
        allAppointments.forEach((appointment) -> {
            System.out.println(appointment.getAppointmentID());
        });
        return appointmentList;
    }

    /**
     * Abstract function used if the appointment being created is being approved by a secretary 
     * Used in template pattern
     * @param secretary
     * @param appointment 
     */
    protected abstract void secretaryApproval(Secretary secretary,Appointment appointment);

    /**
     * Updates observers about appointment 
     * @param appointment 
     */
    public static void updateObservers(Appointment appointment)
    {
        appointment.registerAppointmentObservers();
        appointment.notifyAppointment(appointment);
    }

    /**
     * Adds data of appointment to file
     * @param appointment
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void addToFile(Appointment appointment)
            throws IOException, ClassNotFoundException
    {
        AppointmentList appointmentList = new AppointmentList();
        ArrayList<Appointment> newAppointmentList = new ArrayList<Appointment>();
        try
        {
            final FileInputStream fis = new FileInputStream("src\\files\\Appointments.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            appointmentList = (AppointmentList) ois.readObject();
            ois.close();
            fis.close();
            newAppointmentList = appointmentList.getAllAppointmentsList();
            newAppointmentList.add(appointment);
        }
        catch (EOFException e) {
            newAppointmentList.add(appointment);
        }
        appointmentList.setAllAppointmentsList(newAppointmentList);
        final File file = new File("src\\files\\Appointments.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(appointmentList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    /**
     * Removes doctor observer if appointment is done
     * @param doctor
     * @param appointment 
     */
    public static void removeAppointmentObserver(Doctor doctor,Appointment appointment){
        ArrayList<Appointment> appointments = doctor.getAppointments();
       appointments.remove(appointment);
       if (appointments.isEmpty()){
           appointments = null;
       }
       doctor.setAppointments(appointments);
        try {
            UsersController.editUser(doctor);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Generates unique appointment ID
     * @return unique appointment ID
     */
    public static int generateId() {
        int finalId;
        AppointmentList appointmentList = null;
        ArrayList<Appointment> allAppointments = null;
        try {
            appointmentList = getAllAppointments();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AppointmentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (appointmentList != null) {
            allAppointments = appointmentList.getAllAppointmentsList();
            int id = 0;
            for (Appointment appointment : allAppointments) {
                int appointmentId = appointment.getAppointmentID();
                if (appointmentId >= id ) {
                    id = appointmentId;          
                }    
            }
            finalId = id+1;
        }
        else {
            finalId = 1;
        }
        return finalId;
    }
}
