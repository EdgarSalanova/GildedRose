package playoff.kata.gildedrose;

class Backstage extends Item {

	private static final int GOOD_SELL_IN = 11;
	private static final int AVERAGE_SELL_IN = 6;
	private static final int BAD_SELL_IN = 0;

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateItem() {
        this.addQuality();
    	if (sellIn < GOOD_SELL_IN) {
    		this.addQuality();
   	 	}
    	if (sellIn < AVERAGE_SELL_IN) {
    		this.addQuality();
   	 	}
    	this.reduceSellIn();
    	if (sellIn < BAD_SELL_IN) {
    		this.resetQuality();
        }
    }
}