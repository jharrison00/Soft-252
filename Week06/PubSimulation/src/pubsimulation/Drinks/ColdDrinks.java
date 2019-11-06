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
public class ColdDrinks implements DrinkStrategy{

    @Override
    public void makeDrink(String drink) {
        if ("tap".equals(drink)) {
            System.out.println("Putting glass under tap");          
        }
        else if ("bottle".equals(drink)) {
            System.out.println("Opening bottle");
        }
        System.out.println("Pouring drink into glass");
    }

}

