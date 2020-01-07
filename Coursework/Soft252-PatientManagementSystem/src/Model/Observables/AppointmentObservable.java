package Model.Observables;

import Model.Users.HospitalPeople;

/**
 *
 * @author jonat
 */
public interface AppointmentObservable {
    public void registerObservers();
    public void removeObserver();
    public void notifyObserver(HospitalPeople person);
}
