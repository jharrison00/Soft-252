/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.Extras;

/**
 *
 * @author jharrison12
 */
public abstract class Extras {
    protected String desc = "Unknown extras";
    
    public String getDescription() {
        return desc;
    }
    public abstract double cost();
}
