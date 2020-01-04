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
public abstract class HotDrinks implements IDrink{

    @Override
    public void makeDrink() {
        boilWater();
        specialiseDrink();
        pourDrink();
        additions();
    }
    
    protected void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected abstract void specialiseDrink();
    
    protected void pourDrink() {
        System.out.println("Pouring drink into cup");
    }
    
    protected abstract void additions();

}