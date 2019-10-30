/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader;

import stocktrader.stockdatamodel.PhysicalStockItem;
import stocktrader.stockdatamodel.ServiceStockItem;
import stocktrader.stockdatamodel.StockItem;
import stocktrader.stockdatamodel.StockType;
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
        
        //Test constructor chaining
        StockItem TestItem1 = new PhysicalStockItem("Startcraft Manual");
        StockItem TestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem TestItem3 = new ServiceStockItem("Delivery");
        
        //Test getItemType() method
        if (TestItem1.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 1 is a physical stock item");
        }else{
            System.out.println("Item 1 is a service stock item");
        }
        
        if (TestItem2.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 2 is a physical stock item");
        }else{
            System.out.println("Item 2 is a service stock item");
        }
        
        if (TestItem3.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 3 is a physical stock item");
        }else{
            System.out.println("Item 3 is a service stock item");
        }
    }
    
}
