/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import PubModel.Strategies.IDrinksStrategy;

/**
 *A class that holds the factory pattern for the drink strategy
 * 
 * @author jharrison12
 */
public class LandlordFactory extends AbstractLandlord {
    
    /**
     * A factory method for creating strategies. 
     * 
     * @param drinkType The type of drink from the user.
     * @return Selected strategy.
     */
    public static IDrinksStrategy selectStrategy(String drinkType){
        IDrinksStrategy strategy;
        switch (drinkType) {
            case "Pint":
                strategy = new PubModel.Strategies.TapStrategy();
                break;
            case "Bottle":
                strategy = new PubModel.Strategies.BottleStrategy();
                break;
            case "Tea":
                strategy = new PubModel.Strategies.TeaStrategy();
                break;
            case "Coffee":
                strategy = new PubModel.Strategies.CoffeeStrategy();
                break;
            case "Long Drink":
                strategy = new PubModel.Strategies.LongDrinkStrategy();
                break;
            case "Cocktail":
                strategy = new PubModel.Strategies.CocktailStrategy();
                break;
            default:
                strategy = new PubModel.Strategies.DefaultStrategy();
                break;
        }
        return strategy;
    }
}
