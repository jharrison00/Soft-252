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
public class AlcoholicDrinks implements DrinkStrategy {

    @Override
    public void makeDrink(String drink) {
        System.out.println("Adding ice to glass");
        if ("longDrink".equals(drink)) {
            System.out.println("Adding spirit to glass");
            System.out.println("Adding a mixer to glass");
            System.out.println("Adding a simple garnish");
        }
        else if ("cocktail".equals(drink)) {
            System.out.println("Adding two spirits to glass");
            System.out.println("Adding a mixer to glass");
            System.out.println("Adding a fancy garnish");
        }

    }
    
}
