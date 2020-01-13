package Model.Observables;

import Model.Medicines.Medicine;
import Model.Users.Secretary;

/**
 * Interface to add medicine as an observable for observer pattern
 * @author jonat
 */
public interface MedicineObservable {
    void registerObservers();
    void removeObserver(Secretary secretary);
    void notifyObserverMedicine(Medicine medicine);
}
