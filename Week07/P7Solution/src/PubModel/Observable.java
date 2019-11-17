/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import Controller.Observer;

/**
 * The Observable interface. 
 * @author arahat
 */
public interface Observable {

    /**
     * Register observer.
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * Remove observer.
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * notify observer. 
     */
    public void notifyObserver();

    /**
     * Specific method that needs to be performed by observable at the request 
     * of an observer.
     * @param drinkType
     */
    public void serveDrink(String drinkType);
}
