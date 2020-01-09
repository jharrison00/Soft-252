package Model.Prescriptions;

import java.io.Serializable;
import java.util.ArrayList;

public class PrescriptionList implements Serializable {

    private ArrayList<Prescription> allPrescriptions;

    public ArrayList<Prescription> getAllPrescriptions() {
        return allPrescriptions;
    }

    public void setAllPrescriptions(ArrayList<Prescription> allPrescriptions) {
        this.allPrescriptions = allPrescriptions;
    }
}
