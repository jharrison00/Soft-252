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
public abstract class ExtrasDecorator extends Extras {
    Extras extras;
    
    public ExtrasDecorator(Extras extras) {
        this.extras = extras;
    }
}
