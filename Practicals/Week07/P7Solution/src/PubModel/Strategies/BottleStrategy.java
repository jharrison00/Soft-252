/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.SimpleDrink;

/**
 * A strategy class for bottled drinks. It extends SimpleDrinks template class. 
 * 
 * @author sthill and a.rahat
 */
public class BottleStrategy extends SimpleDrink {

    /**
     * The constructor for BottleStrategy -- it sets the information property 
     * in the template class for clients. 
     */
    public BottleStrategy(){
        String inf = "Here is your bottle.";
        super.setInfo(inf);
    }

    /**
     * This method provides a concrete implementation of the abstract method 
     * in the template class. 
     */
    @Override
    protected void prepareDrink() {
        System.out.println("Opening the bottle...");
    }
    
}
