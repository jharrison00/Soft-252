package stocktrader.stockdatamodel;

public class PhysicalStockItem extends StockItem {

    public PhysicalStockItem()
    {
        super();
    }
            
    public PhysicalStockItem(String name)
    {
        super(name);
    }
    
    public PhysicalStockItem(String name, Integer qty)
    {
        super(name, qty);
    }
    
    @Override
    public StockType getItemType() 
    {
        return StockType.PHYSICALITEM;
    }
}
