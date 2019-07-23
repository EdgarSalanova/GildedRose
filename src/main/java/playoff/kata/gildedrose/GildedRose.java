package playoff.kata.gildedrose;

class GildedRose {
	
	private static final String BRIE = "Aged Brie";
	private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final int GOOD_QUALITY = 50;
	private static final int BAD_QUALITY = 0;
	private static final int GOOD_SELL_IN = 11;
	private static final int AVERAGE_SELL_IN = 6;
	private static final int BAD_SELL_IN = 0;
	
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
        	
        	item.updateItem();
//        	if (!item.name.equals(BRIE) && !item.name.equals(BACKSTAGE) && !item.name.equals(SULFURAS)) {
//        		reduceSellIn(item);
//        		reduceQuality(item);
//        		if (item.sellIn < BAD_SELL_IN) {
//        			reduceQuality(item);
//                }
//        	}
//        	
//        	if (item.name.equals(BRIE)) {
//        		addQuality(item);
//        		reduceSellIn(item);
//        		 if (item.sellIn < BAD_SELL_IN) {
//        			 addQuality(item);
//        		 }
//        	}
//        	
//        	if (item.name.equals(BACKSTAGE)) {
//        		addQuality(item);
//                if (item.sellIn < GOOD_SELL_IN) {
//                	addQuality(item);
//                }
//                if (item.sellIn < AVERAGE_SELL_IN) {
//                	addQuality(item);
//                }
//                reduceSellIn(item);
//                if (item.sellIn < BAD_SELL_IN) {
//                	resetQuality(item);
//                }
//            }
        } //end for
    }
    
//    public void addQuality(Item item) {
//    	if (item.quality < GOOD_QUALITY) {
//    		item.quality += 1;
//    	}
//    }
//    
//    public void reduceQuality(Item item) {
//    	if (item.quality > BAD_QUALITY) {
//    		item.quality -= 1;
//    	}
//    }
//    
//    public void reduceSellIn(Item item) {
//    	item.sellIn -= 1;
//    }
//    
//    public void resetQuality(Item item) {
//    	item.quality = 0;
//    }
    
}
