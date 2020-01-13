package Model.Prescriptions;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * ArrayList for all prescriptions
 * @author jonat
 */
public class PrescriptionList implements Serializable {

    private ArrayList<Prescription> allPrescriptions;

    /**
     * Getter for all prescriptions
     * @return ArrayList of all prescriptions
     */
    public ArrayList<Prescription> getAllPrescriptions() {
        return allPrescriptions;
    }

    /**
     * Setter for all prescriptions
     * @param allPrescriptions 
     */
    public void setAllPrescriptions(ArrayList<Prescription> allPrescriptions) {
        this.allPrescriptions = allPrescriptions;
    }
}
