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
public abstract class ColdDrinks implements IDrink{

    @Override
    public void makeDrink() {
        getDrink();
        pourDrink();
    }
    
    protected abstract void getDrink();

    protected void pourDrink() {
        System.out.println("Pouring drink into glass");
    }
    
}

