/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader.stockdatamodel;

/**
 *
 * @author jharrison12
 */
public class ServiceStockItem extends StockItem {

    public ServiceStockItem(String name)
    {
        this.name = name;
    }
    
    public ServiceStockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }

    @Override
    public Boolean isInStock() {
        return true;
    }
    
    
}
