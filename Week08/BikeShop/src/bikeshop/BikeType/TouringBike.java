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
public class TouringBike extends Bike{
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

    public TouringBike() {
        this.description = "Touring Bike";
        this.available = true;
    }     

    @Override
    public double cost() {
       return cost;
    }
        
}
