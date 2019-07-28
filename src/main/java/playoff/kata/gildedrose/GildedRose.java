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
//        	itemUpdater(item).itemUpdate();
        	item.itemUpdate();
        }
    }

	private itemUpdater itemUpdater(Item item) {
		// TODO Auto-generated method stub
//		return null;
		return itemUpdater(item);
//		return new itemUpdaterFactory(item).itemUpdater(item);
	}
}
