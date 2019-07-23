package playoff.kata.gildedrose;

public class AgedBrie extends Item implements AgedBrieUpdater  {

	private static final int BAD_SELL_IN = 0;

    AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

//    @Override
//    void updateItem() {
//        this.addQuality();
//        this.reduceSellIn();
//    	if (sellIn < BAD_SELL_IN) {
//    		this.addQuality();
//   	 	}
//    }
    
    @Override
	public void updaterItem() {
    	this.addQuality();
        this.reduceSellIn();
    	if (sellIn < BAD_SELL_IN) {
    		this.addQuality();
   	 	}
    }
}