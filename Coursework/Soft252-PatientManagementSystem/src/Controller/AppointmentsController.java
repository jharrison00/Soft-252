package Controller;

import Model.Appointments.Appointment;
import Model.Appointments.AppointmentList;
import Model.Users.HospitalPeople;
import Model.Users.UserList;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public abstract class AppointmentsController {
    public static AppointmentList getAllAppointments() throws IOException, ClassNotFoundException {
        AppointmentList appointmentList = new AppointmentList();
        FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Appointments.txt");

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

    public static void createAppointment(Appointment appointment)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        AppointmentList appointmentList = new AppointmentList();
        ArrayList<Appointment> newAppointmentList = new ArrayList<Appointment>();
        try
        {
            final FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Appointments.txt");
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

        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Appointments.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(appointmentList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }
}
