/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Controller.OrderStrategyController;
import GuiView.PubSimulator;
import PubModel.ConcreteLandlord;
import PubModel.LandlordFactory;
/**
 *
 * @author arahat
 */
public class GUISimulator {

    /**
     * This is GUI demonstration of the program. Right click and then run file to 
     * run the demonstration program.
     * @param args No arguments required.
     */
    public static void main(String[] args) {
        // instantiate the model
        LandlordFactory Mary = new ConcreteLandlord();
        // instancetiate the view
        PubSimulator view = new PubSimulator();
        // instantiate the controller
        OrderStrategyController controller = new OrderStrategyController();
        // set controller attributes
        controller.setView(view);
        controller.setModel(Mary);
        controller.setGreetings();
        // add listener to the view button
        view.addButtonHandlerStrategy(controller);
        // start listenning
        view.setVisible(true);
    }
}
