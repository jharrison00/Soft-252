/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Users;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Model class containing object for all users in file
 * @author jonat
 */
public class UserList implements Serializable {

    private ArrayList<HospitalPeople> allUsersList;

    public ArrayList<HospitalPeople> getAllUsersList() {
        return allUsersList;
    }

    public void setAllUsersList(ArrayList<HospitalPeople> allUsersList) {
        this.allUsersList = allUsersList;
    }

}
