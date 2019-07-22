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
	
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals(BRIE) && !item.name.equals(BACKSTAGE)) {
                if (!item.name.equals(SULFURAS)) {
                	reduceQuality(item);
                }
            } else {
            	//need to increase backstage 3 times
            	addQuality(item);
                if (item.name.equals(BACKSTAGE)) {
                    if (item.sellIn < GOOD_SELL_IN) {
                    	addQuality(item);
                    }
                    if (item.sellIn < AVERAGE_SELL_IN) {
                    	addQuality(item);
                    }
                }
            }

            if (!item.name.equals(SULFURAS)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals(BRIE)) {
                    if (!item.name.equals(BACKSTAGE)) {
                        if (item.quality > 0) {
                            if (!item.name.equals(SULFURAS)) {
                            	reduceQuality(item);
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                	addQuality(item);
                }
            }
        } //end for
    } // end updateQ
    
    public void addQuality(Item item) {
    	if (item.quality < GOOD_QUALITY) {
    		item.quality += 1;
    	}
    }
    
    public void reduceQuality(Item item) {
    	if (item.quality > BAD_QUALITY) {
    		item.quality -= 1;
    	}
    }
    
}
