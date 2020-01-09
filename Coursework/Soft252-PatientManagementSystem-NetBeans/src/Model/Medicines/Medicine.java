package Model.Medicines;

import Model.Observables.MedicineObservable;
import Model.Observers.AppointmentObserver;
import Model.Observers.SecretaryObserver;
import Model.Users.Secretary;

import java.io.Serializable;
import java.util.ArrayList;

public class Medicine implements Serializable, MedicineObservable {

    private ArrayList<SecretaryObserver> medicineObservers = new ArrayList<SecretaryObserver>();
    protected String name;
    protected int quantity;

    public Medicine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Medicine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void registerObservers() {
        medicineObservers = Secretary.getAllSecretaries();
    }

    @Override
    public void removeObserver(Secretary secretary) {
        medicineObservers.remove(secretary);
    }

    @Override
    public void notifyObserverMedicine(Medicine medicine) {
        for (SecretaryObserver secretary: medicineObservers){
            secretary.updateRequestMedicine(medicine);
        }
    }
}


