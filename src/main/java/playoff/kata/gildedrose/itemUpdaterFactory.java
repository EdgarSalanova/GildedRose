package playoff.kata.gildedrose;

public class itemUpdaterFactory {

    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final static String BRIE = "Aged Brie";
    public final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final static String DEFAULT = "Default";

    public itemUpdater itemUpdater(Item item) {
    	
    	if(item.name.equals(SULFURAS)) {
    		return new Sulfuras(item.name, item.sellIn, item.quality);
    	}
    	
    	if(item.name.equals(BRIE)) {
    		return new AgedBrie(item.name, item.sellIn, item.quality);
    	}
    	
    	if(item.name.equals(BACKSTAGE)) {
    		return new Backstage(item.name, item.sellIn, item.quality);
    	}
    	
    	if(item.name.equals(DEFAULT)) {
    		return new Default(item.name, item.sellIn, item.quality);
    	}
    	
    	return null;
    }
    
}
