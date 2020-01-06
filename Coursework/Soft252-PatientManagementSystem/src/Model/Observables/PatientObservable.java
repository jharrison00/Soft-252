package Model.Observables;

import Model.Users.Patient;
import Model.Users.Secretary;

public interface PatientObservable {
    public void registerObservers();
    public void removeObserver(Secretary secretary);
    public void notifyObserver(Patient patient);

}
