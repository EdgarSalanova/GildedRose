package playoff.kata.gildedrose;

public class itemUpdaterFactory {

    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final static String BRIE = "Aged Brie";
    public final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final static String DEFAULT = "Default";

    public itemUpdater itemUpdater(Item item) {
    	
    	if(Item.name.equals(SULFURAS)) {
    		return new Sulfuras(item);
    	}
    	
    	if(Item.name.equals(BRIE)) {
//    		System.out.println("222222222222222222 factory BRIE case");
    		return new AgedBrie(item);
    	}
    	
    	if(Item.name.equals(BACKSTAGE)) {
    		return new Backstage(item);
    	}
    	
    	if(Item.name.equals(DEFAULT)) {
    		System.out.println("222222222222222222 factory DEFAULT case");
    		return new Default(item);
    	}
    	
    	return null;
    }
    
}
