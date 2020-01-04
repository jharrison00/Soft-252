/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.TemplateMethods;

import PubModel.Strategies.IDrinksStrategy;

/**
 * An abstract template class for caffeinated drinks, e.g. tea and coffee. 
 * 
 * @author sthill and a.rahat
 */
public abstract class CaffeinatedDrink implements IDrinksStrategy {
    private String info;
    
    /**
     * A method for setting the information string for the clients.
     * 
     * @param inf a String for informing the client.
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * A method for setting the information string for the clients.
     * @return information 
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * The template method. It describes the algorithm for making a 
     * caffeinated drink.
     * 
     * @return information 
     */
    @Override
    public final String serveDrink() {
        boilWater();
        brewDrink();
        pourDrink();
        addCondiments();
        return info;
    }
    
    /**
     * A concrete implementation for common method: boiling water.
     */
    protected void boilWater() {
        System.out.println("Boiling some water...");
        
    }
    
    /**
     * A concrete implementation for common method: pouring drinks.
     */
    protected void pourDrink() {
        System.out.println("Pouring your beverage into a cup...");
    }
    
    /**
     * An abstract method for brewing drink: this is where the child algorithms
     * differ from each other.
     */
    protected abstract void brewDrink();
    
    /**
     * An abstract method for adding condiments: this is where the child algorithms
     * differ from each other.
     */
    protected abstract void addCondiments();
    
}
