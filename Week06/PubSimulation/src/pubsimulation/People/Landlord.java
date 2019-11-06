/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation.People;

import java.util.Scanner;
import pubsimulation.Drinks.BottledDrinks;
import pubsimulation.Drinks.Cocktails;
import pubsimulation.Drinks.Coffee;
import pubsimulation.Drinks.IDrink;
import pubsimulation.Drinks.LongDrinks;
import pubsimulation.Drinks.TapDrinks;
import pubsimulation.Drinks.Tea;

/**
 *
 * @author jharrison12
 */
public class Landlord {
    
    public void askDrink() {
        System.out.println("What drink would you like");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        serveDrink(choice);
    }
    
    public void serveDrink(String choice) {
        IDrink drink = null;
        if (null != choice) switch (choice) {            
            case "Bottled":
                drink = new BottledDrinks();
            case "Tap":
                drink = new TapDrinks();
            case "Coffee":
                drink = new Coffee();
            case "Tea":
                drink = new Tea();
            case "Long":
                drink = new LongDrinks();
            case "Cocktail":
                drink = new Cocktails();
            case "Quit":
                break;
            default:
                break;
        }
        
        if (drink != null)
            drink.makeDrink();
    }
}
