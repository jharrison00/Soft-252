/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Model.Users.*;
import View.GuiView.AdminView.AdminView;
import View.GuiView.DoctorView.DoctorView;
import View.GuiView.LogInView;
import View.GuiView.PatientView.PatientView;
import View.GuiView.SecretaryView.SecretaryView;

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
 * Controller for user functionality
 * @author jonat
 */
public abstract class UsersController {
    
    /**
     * Creates a user and adds to file
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
            final FileInputStream fis = new FileInputStream("src\\files\\Users.txt");
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

        final File file = new File("src\\files\\Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    /**
     * Edits a user to user file
     * @param person
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void editUser(HospitalPeople person)
            throws IOException, ClassNotFoundException
    {
        int index = 0;
        UserList userList = null;
        try {
            userList = UsersController.getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers){
            if (user.getUsername().equals(person.getUsername())&&user.getPassword().equals(person.getPassword())) {
                System.out.println("Updating "+person.getUsername());
                allUsers.set(index,person);
            }
            index++;
        }
        userList.setAllUsersList(allUsers);
        final File file = new File("src\\files\\Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

    /**
     * Deletes user from file
     * @param person
     * @throws FileNotFoundException 
     */
    public static void deleteUser(HospitalPeople person) throws FileNotFoundException {
        UserList userList = null;
        try {
            userList = getAllUsers();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList();
        for (HospitalPeople user : allUsers) {
            if (user.getUsername().equals(person.getUsername()) && user.getPassword().equals(person.getPassword())) {
                System.out.println("Removing" + person.getUsername());
                allUsers.remove(user);
                break;
            }
        }
        userList.setAllUsersList(allUsers);
        final File file = new File("src\\files\\Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets all users from file
     * @return ArrayList of all users
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static UserList getAllUsers() throws IOException, ClassNotFoundException {
        UserList userList = new UserList();
        FileInputStream fis = new FileInputStream("src\\files\\Users.txt");
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
        return userList;
    }   

    /**
     * Checks if user exists with username and password
     * @param username
     * @param password
     * @param view
     * @return true or false if user exists in file
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    public static boolean validateUser(String username, String password,LogInView view) throws ClassNotFoundException, IOException
    {
        UserList userList;
        userList = getAllUsers();
        HospitalPeople validUser = null;
        ArrayList<HospitalPeople> allUsers = userList.getAllUsersList(); 
        for (HospitalPeople user : allUsers){ 
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                validUser = user;
            }
        }
        if (validUser == null) {
            return false;
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "A".charAt(0)){
        view.setVisible(false);
        new AdminView().setVisible(true);
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "D".charAt(0)){
            view.setVisible(false);
            new DoctorView((Doctor) validUser).setVisible(true);          
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "P".charAt(0)){
        view.setVisible(false);
        new PatientView((Patient) validUser).setVisible(true);
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "S".charAt(0)){
            view.setVisible(false);
            new SecretaryView((Secretary) validUser).setVisible(true);
        }
        return true;
    }

}