package playoff.kata.gildedrose;

class Default extends Item implements itemUpdater{

	private static final int BAD_SELL_IN = 0;

    public Default(Item item) {
    	super(name, sellIn, quality);
    	this.itemUpdate();
	}

    @Override
	public void itemUpdate() {
    	this.reduceSellIn();
    	this.reduceQuality();
    	if (sellIn < BAD_SELL_IN) {
    		this.reduceQuality();
    	}
    }
}