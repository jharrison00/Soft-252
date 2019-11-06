/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation.Drinks;

/**
 *
 * @author jharrison12
 */
public abstract class AlcoholicDrinks implements DrinkStrategy {

    @Override
    public void makeDrink(String drink) {
        addIce();
        addSpirits();
        addMixer();
        addGarnish();
    }
    
    public void addIce() {
        System.out.println("Adding ice to glass");
    }
    
    public abstract void addSpirits();
    
    public void addMixer() {
        System.out.println("Adding mixer to glass");
    }
    
    public abstract void addGarnish();
}
