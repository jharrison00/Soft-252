package Controller.Medicines;

import Controller.Users.UsersController;
import Model.Appointments.Appointment;
import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Prescriptions.Prescription;
import Model.Prescriptions.PrescriptionList;
import Model.Users.HospitalPeople;
import Model.Users.Secretary;
import Model.Users.UserList;

import java.io.*;
import java.util.ArrayList;

public abstract class MedicinesController {

    public final void addQuantity(Secretary secretary, Medicine medicine)
            throws IOException, ClassNotFoundException
    {
        secretaryApproval(secretary,medicine);
        editMedicine(medicine);
    }


    public static void createMedicine(Medicine medicine)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        MedicineList medicineList = new MedicineList();
        ArrayList<Medicine> newMedicineList = new ArrayList<Medicine>();
        try
        {
            final FileInputStream fis = new FileInputStream("src\\files\\Medicines.txt");
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

        final File file = new File("src\\files\\Medicines.txt");
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
        FileInputStream fis = new FileInputStream("src\\files\\Medicines.txt");
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

    protected abstract void secretaryApproval(Secretary secretary,Medicine medicine);

    public static void editMedicine(Medicine medicine)
            throws IOException, ClassNotFoundException
    {
        int index = 0;
        MedicineList medicineList = null;
        try {
            medicineList = getAllMedicines();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Medicine> allMedicines = medicineList.getAllMedicines();
        for (Medicine fileMedicine : allMedicines){
            if (fileMedicine.getName().equals(medicine.getName())) {
                System.out.println("Updating "+medicine.getName());
                allMedicines.set(index,medicine);
            }
            index++;
        }
        medicineList.setAllMedicines(allMedicines);
        final File file = new File("src\\files\\Medicines.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(medicineList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }
}
