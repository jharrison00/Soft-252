package Controller.Prescriptions;

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
            final FileInputStream fis = new FileInputStream("src\\files\\Prescriptions.txt");
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

        final File file = new File("src\\files\\Prescriptions.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(prescriptionList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    public static void deletePrescription(Prescription prescription) throws FileNotFoundException {
        PrescriptionList prescriptionList = null;
        try {
            prescriptionList = getAllPrescriptions();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Prescription> allPrescriptions = prescriptionList.getAllPrescriptions();
        for (Prescription filePrescription : allPrescriptions) {
            if (prescription.getDoctor().getUsername().equals(filePrescription.getDoctor().getUsername())
                    && prescription.getPatient().getUsername().equals(filePrescription.getPatient().getUsername())
                    && prescription.getNote().equals(filePrescription.getNote())) {
                System.out.println("Removing prescription");
                allPrescriptions.remove(filePrescription);
                break;
            }
        }
        prescriptionList.setAllPrescriptions(allPrescriptions);
        final File file = new File("src\\files\\Prescriptions.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(prescriptionList);
            outputStream.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
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
        allPrescriptions.forEach((prescription) -> {
            System.out.println(prescription.getNote());
        });
        return prescriptionList;
    }

    public static void updateObservers(Prescription prescription)
    {
       prescription.registerPrescriptionObservers();
       prescription.notifyObserverPrescription(prescription);
    }

    public static void removeObservers(Prescription prescription){
        prescription.removePrescriptionObserver(prescription);
    }
}
