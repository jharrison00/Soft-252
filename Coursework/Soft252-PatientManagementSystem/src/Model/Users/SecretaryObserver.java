package Model.Users;

public interface SecretaryObserver {
    void updateCreate(HospitalPeople person);
    void updateRemove(HospitalPeople person);
}
