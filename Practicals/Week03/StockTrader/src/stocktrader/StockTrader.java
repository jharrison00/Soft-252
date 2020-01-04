/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader;

import stocktrader.stockdatamodel.PhysicalStockItem;
import stocktrader.stockdatamodel.ServiceStockItem;
/**
 *
 * @author jharrison12
 */
public class StockTrader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Physical Stock Item object
        PhysicalStockItem physicalItem = new PhysicalStockItem("Book2", 100);
        //Create a Service Stock Item object
        ServiceStockItem virtualItem = new ServiceStockItem("eBook2");
        
        //Test behaviour of physical object
        String strMessage = physicalItem.getName() 
                + ", Is in stock = " + physicalItem.isInStock()
                + ", Quantity in stock : " + physicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        //Test behaviour of service object
        strMessage = virtualItem.getName() 
                + ", Is in stock = " + virtualItem.isInStock()
                + ", Quantity in stock : " + virtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
    
}
