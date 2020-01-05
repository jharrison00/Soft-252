/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HospitalPeople;
import Model.UserList;
import View.LogIn;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class LogInController {
    
    /**
     * Creates a user
     * 
     * @param person
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void createUser(HospitalPeople person)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {      
        UserList userList = new UserList();
        ArrayList<HospitalPeople> newUserList = new ArrayList<HospitalPeople>();
        try 
        {       
            final FileInputStream fis = new FileInputStream("Users.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            userList = (UserList) ois.readObject();
            ois.close();
            newUserList = userList.getAllUsersList();
            newUserList.add(person);
        }
        catch (EOFException e) {
            newUserList.add(person);
        }   
        userList.setAllUsersList(newUserList);

        final File file = new File("Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
        }
    }

    public static UserList readUserFile() throws IOException, ClassNotFoundException {
        UserList userList = new UserList();
        try 
        {       
            final FileInputStream fis = new FileInputStream("Users.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);

            userList = (UserList) ois.readObject();
            ois.close();
        }
        catch (EOFException e) {
            System.out.println(e.toString());
        }   
        
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        userList.setAllUsersList(allUsers);
        allUsers.forEach((user) -> {
            System.out.println(user.getUsername());
        });
        return userList;
    }   
    
    public static boolean checkUserExists(String username,String password)
    {
        UserList userList = new UserList();
        try {
            userList = readUserFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList(); 
        for (HospitalPeople user : allUsers){ 
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                return true;
            }  
        }
        return false;
    }
}