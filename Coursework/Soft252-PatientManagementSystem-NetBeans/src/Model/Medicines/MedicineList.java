package Model.Medicines;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Model class for ArrayList of al medicines
 * @author jonat
 */
public class MedicineList implements Serializable {

    private ArrayList<Medicine> allMedicines;

    /**
     * Getter for all medicines
     * @return ArrayList of all medicines
     */
    public ArrayList<Medicine> getAllMedicines() {
        return allMedicines;
    }

    /**
     * Setter for all medicines
     * @param allMedicines 
     */
    public void setAllMedicines(ArrayList<Medicine> allMedicines) {
        this.allMedicines = allMedicines;
    }
}
