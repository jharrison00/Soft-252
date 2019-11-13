/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.CaffeinatedDrink;

/**
 * A concrete class implementing the CaffeinatedDrink template class. 
 * 
 * @author sthill and a.rahat
 */
public class TeaStrategy extends CaffeinatedDrink implements IDrinksStrategy {

    /** 
     * The constructor here sets the information string for the clients once
     * the drink has been prepared. 
     */
    public TeaStrategy(){
        String inf = "Here is your tea.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete method for brewing tea -- different from brewing coffee. 
     */
    @Override
    protected void brewDrink() {
        System.out.println("Steeping teabag...");
    }

    /**
     * A concrete implementation of adding condiments step. 
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
    
}
