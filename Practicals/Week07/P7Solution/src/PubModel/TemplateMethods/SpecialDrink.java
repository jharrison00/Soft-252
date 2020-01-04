/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.TemplateMethods;

import PubModel.Strategies.IDrinksStrategy;



/**
 * An abstract template class for special drinks, e.g. long drinks and cocktails.
 * @author sthill and a.rahat
 */
public abstract class SpecialDrink implements IDrinksStrategy {
    private String info;
    
    /**
     * An accessor method for setting the information string for clients. 
     * 
     * @param inf an information string.
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * An accessor method for getting the information string in the instance
     * variable. 
     * @return notification string.
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * The template method capturing the algorithm required for serving 
 SpecialDrink. 
     * 
     * @return An information string for notification once drink has been 
     * prepared. 
     */
    @Override
    public final String serveDrink() {
        addIce();
        addAlcohol();
        addMixer();
        addGarnish();
        return info;
    }
    
    /**
     * A concrete implementation of adding ice step. 
     */
    protected void addIce() {
        System.out.println("Adding ice...");
    }
    
    /**
     * A concrete implementation of adding mixture step. 
     */
    protected void addMixer() {
        System.out.println("Adding mixer...");
    }
    
    /**
     * An abstract method for adding alcohol.
     */
    protected abstract void addAlcohol();

    /**
     * An absatract method for adding garnish. 
     */
    protected abstract void addGarnish();
}
