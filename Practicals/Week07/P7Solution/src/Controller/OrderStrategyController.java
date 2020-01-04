/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GuiView.PubSimulator;
import PubModel.ConcreteLandlord;
import PubModel.LandlordFactory;
import PubModel.Observable;

/**
 * A concrete implementation of thje button handler strategy. Here the 
 * ActionListener works as a strategy interface. The controller also implements 
 * an Observer interface. 
 * @author arahat
 */
public class OrderStrategyController implements ActionListener, Observer {
    // ActionListener is like a Strategy interface here
    private PubSimulator view = null;
    //private LandlordFactory model = null;
    private Observable model = null;
    private String greetings = "";
    private String info = "";
    
    /**
     * Setting the view reference. 
     * @param view The view.
     */
    public void setView(PubSimulator view){
        this.view = view;
    }
    
    /**
     * Setting the model reference. 
     * @param model The model as an observable.
     */
    public void setModel(Observable model){
        this.model = model;
        model.registerObserver(this);
    }
    
    /**
     * Setting the greetings on the view.
     */
    public void setGreetings(){
        view.setGreetings(greetings);
    }
    
    @Override // this is the startegy method that we override
    public void actionPerformed(ActionEvent e) {
        String drinkType = view.getChoice();
        System.out.println(info);
        model.serveDrink(drinkType);
        view.setResponse(info + "\n The preparatory a steps\n from landlord is shown in the Command\n Line output. ");
        System.out.println(info);
    }

    /**
     * Update the controller's instance variables. These will be used to update 
     * the view, and thus it should help us achieve separation between the view 
     * and the model. 
     * @param greetings Greetings text. 
     * @param info Information text.
     */
    @Override
    public void update(String greetings, String info) {
        this.greetings = greetings;
        this.info = info; 
    }
}
