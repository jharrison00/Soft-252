package Model.Observables;

import Model.Medicines.Medicine;
import Model.Users.Patient;
import Model.Users.Secretary;

public interface MedicineObservable {
    void registerObservers();
    void removeObserver(Secretary secretary);
    void notifyObserverMedicine(Medicine medicine);
}
