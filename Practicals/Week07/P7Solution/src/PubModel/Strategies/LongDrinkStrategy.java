/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.SpecialDrink;
/**
 * A concrete class for the template class. 
 * 
 * @author sthill and a.rahat
 */
public class LongDrinkStrategy extends SpecialDrink {

    /**
     * The constructor here sets the information string for notification once
     * the drink has been prepared. 
     */
    public LongDrinkStrategy(){
        String inf = "Here is your longdrink.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the adding alcohol step in long drinks 
     * context. 
     */
    @Override
    protected void addAlcohol() {
        System.out.println("Adding Gin...");
    }

    /**
     * A concrete implementation of the adding garnish step in long drinks 
     * context. 
     */
    @Override
    protected void addGarnish() {
        System.out.println("Adding lemon ice...");
    }
    
}
