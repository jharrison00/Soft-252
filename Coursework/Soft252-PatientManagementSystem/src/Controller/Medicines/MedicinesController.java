package Controller.Medicines;

import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Prescriptions.Prescription;
import Model.Prescriptions.PrescriptionList;

import java.io.*;
import java.util.ArrayList;

public abstract class MedicinesController {

    public static void createMedicine(Medicine medicine)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        MedicineList medicineList = new MedicineList();
        ArrayList<Medicine> newMedicineList = new ArrayList<Medicine>();
        try
        {
            final FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Medicines.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            medicineList = (MedicineList) ois.readObject();
            ois.close();
            fis.close();
            newMedicineList = medicineList.getAllMedicines();
            newMedicineList.add(medicine);
        }
        catch (EOFException e) {
            newMedicineList.add(medicine);
        }
        medicineList.setAllMedicines(newMedicineList);

        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Medicines.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(medicineList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    public static MedicineList getAllMedicines() throws IOException, ClassNotFoundException {
        MedicineList medicineList = new  MedicineList();
        FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Medicines.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            medicineList =  (MedicineList) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        ois.close();
        fis.close();

        ArrayList<Medicine> allMedicines = medicineList.getAllMedicines();
        medicineList.setAllMedicines(allMedicines);
        allMedicines.forEach((medicine) -> {
            System.out.println(medicine.getName());
        });
        return medicineList;
    }
}
