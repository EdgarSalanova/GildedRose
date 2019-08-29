package playoff.kata.gildedrose;

public class itemUpdaterFactory {

    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final static String BRIE = "Aged Brie";
    public final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final static String DEFAULT = "whatever";

    public itemUpdater itemUpdater(Item item) {
    	
    	if(Item.name.equals(SULFURAS)) {
    		return new Sulfuras(item);
    	}
    	
    	if(Item.name.equals(BRIE)) {
    		return new AgedBrie(item);
    	}
    	
    	if(Item.name.equals(BACKSTAGE)) {
    		return new Backstage(item);
    	}
    	
    	if(Item.name.equals(DEFAULT)) {
    		return new Default(item);
    	}
    	
    	return null;
    }
    
}
