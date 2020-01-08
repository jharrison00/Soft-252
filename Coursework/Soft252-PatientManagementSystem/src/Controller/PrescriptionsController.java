package Controller;

import Model.Prescriptions.Prescription;
import Model.Prescriptions.PrescriptionList;

import java.io.*;
import java.util.ArrayList;

public abstract class PrescriptionsController {

    public static void createPrescription(Prescription prescription)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        PrescriptionList prescriptionList = new PrescriptionList();
        ArrayList<Prescription> newPrescriptionList = new ArrayList<Prescription>();
        try
        {
            final FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Prescriptions.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            prescriptionList = (PrescriptionList) ois.readObject();
            ois.close();
            fis.close();
            newPrescriptionList = prescriptionList.getAllPrescriptions();
            newPrescriptionList.add(prescription);
        }
        catch (EOFException e) {
            newPrescriptionList.add(prescription);
        }
        prescriptionList.setAllPrescriptions(newPrescriptionList);

        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Prescriptions.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(prescriptionList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    public static PrescriptionList getAllPrescriptions() throws IOException, ClassNotFoundException {
        PrescriptionList prescriptionList = new PrescriptionList();
        FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Prescriptions.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            prescriptionList = (PrescriptionList) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        ois.close();
        fis.close();

        ArrayList<Prescription> allPrescriptions = prescriptionList.getAllPrescriptions();
        prescriptionList.setAllPrescriptions(allPrescriptions);
        allPrescriptions.forEach((user) -> {
            System.out.println(user.getNote());
        });
        return prescriptionList;
    }
}
