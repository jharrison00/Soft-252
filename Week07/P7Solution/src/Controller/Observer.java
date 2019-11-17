/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 * This is the Observer interface for the controller. A controller implements both
 * an observer interface and a strategy interface.
 * @author arahat
 */
public interface Observer {

    /**
     * The method that should be implemented by any implementing class. It 
     * essentially sets the greetings and info strings that is updated from the
     * observable. 
     * @param greetings Greetings text that should be shown to the user. 
     * @param info Information string that should be shown to the user.
     */
    public void update(String greetings, String info);
}
