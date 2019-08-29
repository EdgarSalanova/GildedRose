package playoff.kata.gildedrose;

public class AgedBrie extends Item implements itemUpdater  {

	private static final int BAD_SELL_IN = 0;
	
	public AgedBrie(Item item) {
    	super(name, sellIn, quality);
        this.itemUpdate();
    }

	@Override
	public void itemUpdate() {
    	this.addQuality();
        this.reduceSellIn();
    	if (sellIn < BAD_SELL_IN) {
    		this.addQuality();
   	 	}
    }
}