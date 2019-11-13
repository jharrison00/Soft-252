/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel.Strategies;

/**
 * An interface describing what a particular implementing strategy should 
 * perform. 
 * 
 * @author sthill and a.rahat
 */
public interface IDrinksStrategy {

    /**
     * An abstract method for serving drinks. 
     * 
     * @return an information string.
     */
    String serveDrink();
    
}
