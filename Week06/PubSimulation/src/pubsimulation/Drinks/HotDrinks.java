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
public class HotDrinks implements DrinkStrategy{

    @Override
    public void makeDrink(String drink) {
        System.out.println("Boiling water");
        if ("coffee".equals(drink)) {
            System.out.println("Brewing coffee in boiled water");
            System.out.println("Pouring coffee into cup");
            System.out.println("Adding milk");
        }
        else if ("tea".equals(drink)) {
            System.out.println("Steeping tea in water");
            System.out.println("Pouring tea into cup");
            System.out.println("Adding lemon");
        }


    }
    
}
