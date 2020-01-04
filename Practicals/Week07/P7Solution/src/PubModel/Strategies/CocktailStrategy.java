/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

import PubModel.TemplateMethods.SpecialDrink;

/**
 * A concrete implementation of the template class. 
 * 
 * @author sthill and a.rahat
 */
public class CocktailStrategy extends SpecialDrink {

    /**
     * The constructor here sets the information string in the instance variable.
     */
    public CocktailStrategy(){
        String inf = "Here is your cocktail.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the add alcohol step in cocktail context. 
     */
    @Override
    protected void addAlcohol() {
        System.out.println("Adding Tequila and Gin...");
    }

    /**
     * A concrete implementation of the garnish adding step in cocktail context.
     */
    @Override
    protected void addGarnish() {
        System.out.println("Adding fruits, straws, and little umbrellas...");
    }
    
}
