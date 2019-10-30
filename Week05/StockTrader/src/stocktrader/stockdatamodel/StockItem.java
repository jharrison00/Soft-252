package stocktrader.stockdatamodel;

public abstract class StockItem {
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
}

