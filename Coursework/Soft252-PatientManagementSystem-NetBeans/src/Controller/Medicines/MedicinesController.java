package Controller.Medicines;

import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Users.Secretary;
import java.io.*;
import java.util.ArrayList;


/**
 * Adds,edits medicines to file with template pattern
 * @author jonat
 */
public abstract class MedicinesController {

    /**
     * Template pattern used to add quantity to medicines
     * @param secretary
     * @param medicine
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public final void addQuantity(Secretary secretary, Medicine medicine)
            throws IOException, ClassNotFoundException
    {
        secretaryApproval(secretary,medicine);
        editMedicine(medicine);
    }

    /**
     * Creates and adds medicine to file
     * @param medicine
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Gets all medicines from file
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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
        return medicineList;
    }

    /**
     * Abstract function used in template pattern if secretary chooses to approve medicine
     * @param secretary
     * @param medicine 
     */
    protected abstract void secretaryApproval(Secretary secretary,Medicine medicine);

    /**
     * Edits medicine in file
     * @param medicine
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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
