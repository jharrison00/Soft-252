package Model.Medicines;

import java.io.Serializable;
import java.util.ArrayList;

public class MedicineList implements Serializable {

    private ArrayList<Medicine> allMedicines;

    public ArrayList<Medicine> getAllMedicines() {
        return allMedicines;
    }

    public void setAllMedicines(ArrayList<Medicine> allMedicines) {
        this.allMedicines = allMedicines;
    }
}
