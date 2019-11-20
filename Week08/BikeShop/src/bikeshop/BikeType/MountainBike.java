/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.BikeType;

/**
 *
 * @author jharrison12
 */
public class MountainBike extends Bike{
    private boolean available;
    private final String description;
    private double cost = 10;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public MountainBike() {
        this.description = "Mountain Bike";
        this.available = true;
    }     

    @Override
    public double cost() {
       return cost;
    }
        
    
}
