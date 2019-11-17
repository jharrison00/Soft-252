/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import Controller.Observer;
import PubModel.Strategies.IDrinksStrategy;
import java.util.ArrayList;
/**
 * A class for the landlords. 
 * 
 * @author sthill and a.rahat
 */
public abstract class LandlordFactory implements Observable{
    // instance variables
    private IDrinksStrategy strategy;
    private String info = "";
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    private String greetings = "Hello!" +"\n"+
                                "What can I get you?";
    private String offerings = "We have: Pint, Bottle, Tea, "+
                                "Coffee, Long Drink, and Cocktail.";
    private String nullStrategyInfo = "You did not tell us what you would like! ";

    /**
     * The constructor for Landlord class. It sets the initial strategy to null. 
     */
    public LandlordFactory() {
        this.strategy = null;
    }
    
    /**
     * An accessor method for the strategy property. 
     * @param strategy An IDrinksStrategy object
     */
    public void setStrategy(IDrinksStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * An accessor method for setting the greetings property.
     * 
     * @param s A string containing greetings from a LandlordFactory. 
     */
    public void setGreetings(String s){
        greetings = s;
    }
    
    /**
     * An accessor method for getting the greetings property. 
     * @return greetings string. 
     */
    public String getGreetings(){
        return greetings;
    }

    /**
     * An accessor method for setting the offerings at the establishment. 
     * 
     * @param s a string containing the offerings at the establishment. 
     */
    public void setOfferings(String s){
        offerings = s;
    }
    
    /**
     * An accessor method to extract the offerings string in the instance 
     * variable. 
     * 
     * @return offerings string.
     */
    public String getOfferings(){
        return offerings;
    }
    
    /**
     * An accessor method facilitating the notification that no strategy (not 
     * even the default strategy) has been set. 
     * @return information string for null strategy.
     */
    public String getNullStrategyInfo(){
        return nullStrategyInfo;
    }

    /**
     * An accessor method for setting the information string for the null 
     * strategy. 
     * 
     * @param s information string for null strategy.
     */
    public void setNullStrategyInfo(String s){
        nullStrategyInfo = s;
    }
      
    /**
     * An accessor method to get the information string.
     * @return information string.
     */
    public String getInfo(){
        return info;
    }

    /**
     * A method to ask the customer -- includes both greetings and offerings
     * in the instance variables. 
     * 
     * @return a string to pass on to the customer. 
     */
    public String askCustomer() {
        return getGreetings() + "\n" + getOfferings();
    }
    
    /**
     * A method that calls upon the strategy instance for serving drinks. 
     * 
     * @param drinkType The type of drink required.
     */
    @Override
    public void serveDrink(String drinkType) {
        this.setStrategy(selectStrategy(drinkType));
        info = this.strategy.serveDrink();
        notifyObserver();
    }
    
    /**
     * Abstract method for selecting strategy which will be implemented by the 
     * inheriting concrete class -- facilitating Factory pattern.
     * @param drinkType The required drink type.
     * @return Specific drink serving strategy.
     */
    public abstract IDrinksStrategy selectStrategy(String drinkType);

    /**
     * Registering obervers. 
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observer.update(greetings, info);
        observers.add(observer);
    }

    /**
     * Removing observers. 
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);
        if (idx > 0) observers.remove(idx);
    }

    /**
     * Notifying observers following an action.
     */
    @Override
    public void notifyObserver() {
        observers.forEach((observer) -> {
            observer.update(greetings, info);
        });
    }
}
