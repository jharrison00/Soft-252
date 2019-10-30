package stocktrader.stockdatamodel;

import java.util.ArrayList;
import utilities.IObserver;
import utilities.ISubject;

public abstract class StockItem implements ISubject {
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000000.00;
    protected Double costPrice = 1000000.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock >= 0 && quantityInStock != null)
            this.quantityInStock = quantityInStock;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice >= 0 && sellingPrice != null && sellingPrice >= this.costPrice)
            this.sellingPrice = sellingPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if (costPrice >= 0 && costPrice != null)
            this.costPrice = costPrice;
    }
    
    public Boolean isInStock()
    {
        Boolean inStock = false;
        if(this.quantityInStock > 0)
            inStock = true;
        return inStock;
    }
    
    public StockItem(){}
    
    public StockItem(String name)
    {
        this.name = name;
    }
    
    public StockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
    
    public abstract StockType getItemType();
    
    private ArrayList<IObserver> observers = null;
    
    @Override
    public Boolean registerObserver(IObserver o)
    {
        Boolean added = false;
        //Validate that observer exists
        if (o != null) {
            //If observer list not initialised - create it
            if (this.observers == null) {
                this.observers = new ArrayList<>();
            }
            //Add observer to list of registered observers
            added = this.observers.add(o);
        }
        //Return the result
        return added;
    }
    
    @Override
    public Boolean removeObserver(IObserver o)
    {
        Boolean removed = false;
        //Validate that observer exits
        if (o != null){
            //Remove observer from array list
            removed = this.observers.remove(o);
        }
        //Return the result
        return removed;
    }
    
    @Override
    public void notifyObservers()
    {
    }
}

