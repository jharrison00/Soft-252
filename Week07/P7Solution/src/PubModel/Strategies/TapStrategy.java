/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.SimpleDrink;

/**
 * A concrete class implementing the SimpleDrink template class. 
 * 
 * @author sthill and a.rahat
 */
public class TapStrategy extends SimpleDrink{

    /**
     * The constructor here sets the information string for notification. 
     */
    public TapStrategy(){
        String inf = "Here is your pint.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the preparing dirnk step in Tap drink 
     * context. 
     */
    @Override
    protected void prepareDrink() {
        System.out.println("Putting pint glass under tap...");
    }
    
}
