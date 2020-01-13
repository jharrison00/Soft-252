package Model.Medicines;

import Model.Observables.MedicineObservable;
import Model.Observers.SecretaryObserver;
import Model.Users.Secretary;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Medicine model class that contains all properties of a medicine
 * @author jonat
 */
public class Medicine implements Serializable, MedicineObservable {

    private ArrayList<SecretaryObserver> medicineObservers = new ArrayList<SecretaryObserver>();
    protected String name;
    protected int quantity;

    /**
     * Constructor containing all medicine properties
     * @param name
     * @param quantity 
     */
    public Medicine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Constructor for blank medicine
     */
    public Medicine() {
    }

    /**
     * Getter for name of medicine
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name of medicine
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for quantity of medicine
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for quantity of medicine
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Registers observers of medicine object
     */
    @Override
    public void registerObservers() {
        medicineObservers = Secretary.getAllSecretaries();
    }

    /**
     * Removes observer of medicine object
     * @param secretary 
     */
    @Override
    public void removeObserver(Secretary secretary) {
        medicineObservers.remove(secretary);
    }

    /**
     * Adds medicine object to observer
     * @param medicine 
     */
    @Override
    public void notifyObserverMedicine(Medicine medicine) {
        for (SecretaryObserver secretary: medicineObservers){
            secretary.updateRequestMedicine(medicine);
        }
    }
}


