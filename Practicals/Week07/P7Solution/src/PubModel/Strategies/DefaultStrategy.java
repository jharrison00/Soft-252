/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

/**
 * A straightforward strategy to ensure that if a specific strategy has not
 * been selected the user is notified appropriately. 
 * 
 * @author sthill and a.rahat
 */
public class DefaultStrategy implements IDrinksStrategy{
    private static final String info = "We don't have that drink, sorry!"; 
    
    /**
     * A concrete implementation of the strategy interface method. 
     * 
     * @return An information string for notification. 
     */
    @Override
    public final String serveDrink() {
        return info;
    }
}
