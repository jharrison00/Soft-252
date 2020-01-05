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
import java.util.ArrayList;

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
            fis.close();
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
            outputStream.close();
            fos.close();
        }
    }

    public static UserList readUserFile() throws IOException, ClassNotFoundException {
        UserList userList = new UserList();
        FileInputStream fis = new FileInputStream("Users.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            userList = (UserList) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e.toString());
        }
        ois.close();
        fis.close();

        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        userList.setAllUsersList(allUsers);
        allUsers.forEach((user) -> {
            System.out.println(user.getUsername());
        });
        return userList;
    }   
    
    public static HospitalPeople checkUserExists(String username,String password) throws ClassNotFoundException, IOException
    {
        UserList userList;
        userList = readUserFile();

        
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList(); 
        for (HospitalPeople user : allUsers){ 
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                return user;
            }  
        }
        return null;
    }
}