package playoff.kata.gildedrose;

public class AgedBrie extends Item implements itemUpdater  {

	private static final int BAD_SELL_IN = 0;
	
//	private final Item item;
//
//    public AgedBrie(Item item) {
//        this.item = item;
//    }
// sense extendre de item llavors les funicons de calcul han d'anar aqui.

    AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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