/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import PubModel.AbstractLandlord;
import PubModel.LandlordFactory;
import java.util.Scanner;
/**
 * This is a simple command line pub simulator. This is the view/controller 
 * part of the code, and the model is completely isolated from the view. 
 * @author sthill and a.rahat
 */
public class PubSimulator {
    /**
     * The 'main' method.
     * 
     * @param args the command line arguments -- none 
     */
    public static void main(String[] args) {
        // create a new landlord
        AbstractLandlord Mary = new LandlordFactory();
        
        // try to serve without customer input
        System.out.println(Mary.serveDrink());
        
        // simulate in a loop
        for (int i=0; i<10; i++){
            SimulateCustomer(Mary);
        }
        
    }
    
    /**
     * A method to simulate a customer asking for a drink. In this method, 
     * a landlord is used to query a customer for his/her order and present 
     * a range of options, followed by serving the desired drink. 
     * 
     * @param landlord A AbstractLandlord object.
     */
    public static void SimulateCustomer(AbstractLandlord landlord){
        System.out.println(landlord.askCustomer());
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals("quit")){
            System.exit(0);
        }
        String info;
        landlord.setStrategy(LandlordFactory.selectStrategy(answer));
        info = landlord.serveDrink();
        System.out.println(info);
    }
    
}
