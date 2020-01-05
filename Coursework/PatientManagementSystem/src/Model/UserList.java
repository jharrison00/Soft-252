/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class UserList implements Serializable {
    private static final long serialVersionUID = 1L;

    private ArrayList<HospitalPeople> allUsersList;

    public ArrayList<HospitalPeople> getAllUsersList() {
        return allUsersList;
    }

    public void setAllUsersList(ArrayList<HospitalPeople> allUsersList) {
        this.allUsersList = allUsersList;
    }

}
