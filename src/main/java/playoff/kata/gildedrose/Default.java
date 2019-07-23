package playoff.kata.gildedrose;

class Default extends Item {

	private static final int BAD_SELL_IN = 0;
	
	Default(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateItem() {
    	this.reduceSellIn();
    	this.reduceQuality();
    	if (sellIn < BAD_SELL_IN) {
    		this.reduceQuality();
    	}
    }
}