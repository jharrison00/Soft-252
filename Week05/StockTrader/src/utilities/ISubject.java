package utilities;

public interface ISubject {
    Boolean registerObserver(IObserver o);
    Boolean removeObserver(IObserver o);
    void notifyObservers();
}
