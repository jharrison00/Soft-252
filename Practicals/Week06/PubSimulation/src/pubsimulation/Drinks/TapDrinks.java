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
public class TapDrinks extends ColdDrinks{

    @Override
    protected void getDrink() {
        System.out.println("Putting glass under tap");
    }
    
}
