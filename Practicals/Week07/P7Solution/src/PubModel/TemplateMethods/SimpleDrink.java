/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.TemplateMethods;

import PubModel.Strategies.IDrinksStrategy;

/**
 * An abstract tempalte class for simple drinks, i.e. bottled and tap drinks. 
 * 
 * @author sthill and a.rahat
 */
public abstract class SimpleDrink implements IDrinksStrategy{
    private String info;
    
    /**
     * A method for setting the information String for the clients. 
     * 
     * @param inf an information String. 
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * A method to return the information string. 
     * 
     * @return information string. 
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * A template method. It shows the steps required to serve a simple drink. 
     * 
     * @return information string.
     */
    @Override
    public final String serveDrink() {
        prepareDrink();
        pourDrink();
        return info;
    }
    
    /**
     * A concrete method for pouring drinks that is common across the subclasses. 
     */
    protected void pourDrink() {
        System.out.println("Pouring the drink...");
    }
    
    /**
     * An abstract method for preparing drinks: each subclass must implement this. 
     */
    protected abstract void prepareDrink();
    
    
}
