/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.CaffeinatedDrink;
/**
 * A strategy class for coffee. It extends CaffeinatedDrinks template class.
 * 
 * @author sthill and a.rahat
 */
public class CoffeeStrategy extends CaffeinatedDrink{

    /**
     * The constructor for CoffeeStrategy -- it sets the information string 
     * from the template class for the clients. 
     */
    public CoffeeStrategy(){
        String inf = "Here is your coffee.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of brewing drinks. 
     */
    @Override
    protected void brewDrink() {
        System.out.println("Brewing the coffee");
    }

    /**
     * A concrete implementation of adding condiments. 
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
    
}