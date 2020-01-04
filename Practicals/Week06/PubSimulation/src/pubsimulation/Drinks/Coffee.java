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
public class Coffee extends HotDrinks{

    @Override
    protected void specialiseDrink() {
        System.out.println("Brewing coffee in boiled water");
    }

    @Override
    protected void additions() {
        System.out.println("Adding milk");
    }
    
}
