package playoff.kata.gildedrose;

class Default extends Item implements itemUpdater{

	private static final int BAD_SELL_IN = 0;

	Default(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void itemUpdate() {
    	this.reduceSellIn();
    	this.reduceQuality();
    	if (sellIn < BAD_SELL_IN) {
    		this.reduceQuality();
    	}
    }
}