/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.*;

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
public abstract class UsersController {

    
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
            final FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Users.txt");
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

        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

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
        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Users.txt");
        final FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutput outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(userList);
            System.out.println("Stored in file : " + file.getName());
            outputStream.close();
            fos.close();
        }
    }

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
        final File file = new File("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Users.txt");
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

        public static UserList getAllUsers() throws IOException, ClassNotFoundException {
        UserList userList = new UserList();
        FileInputStream fis = new FileInputStream("C:\\Users\\Johnny\\IdeaProjects\\Soft252-PatientManagementSystem\\src\\Users.txt");
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

    public static boolean validateUser(String username, String password) throws ClassNotFoundException, IOException
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
            AdminController.setView((Administrator) validUser);
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "D".charAt(0)){
            DoctorController.setView((Doctor) validUser);
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "P".charAt(0)){
            PatientController.setView((Patient) validUser);
        }
        else if(validUser.getUsername().toUpperCase().charAt(0) == "S".charAt(0)){
            SecretaryController.setView((Secretary) validUser);
        }
        return true;
    }
}