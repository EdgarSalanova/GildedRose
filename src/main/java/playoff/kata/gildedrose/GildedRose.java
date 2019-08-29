package playoff.kata.gildedrose;

class GildedRose {
	
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
        	itemUpdater(item);
        }
    }

	private itemUpdater itemUpdater(Item item) {
		return new itemUpdaterFactory().itemUpdater(item);
	}
}
