package playoff.kata.gildedrose;

public class AgedBrie extends Item implements itemUpdater  {

	private static final int BAD_SELL_IN = 0;
	
	public AgedBrie(Item item) {
    	super(name, sellIn, quality);
        this.itemUpdate();
    }

//    AgedBrie(String name, int sellIn, int quality) {
//        super(name, sellIn, quality);
//        this.itemUpdate();
//        System.out.println("ccccccccccccccc4>"+quality);
//    }

	
	@Override
	public void itemUpdate() {
		
//		System.out.println("ccccccccccccccc1>"+quality);
    	this.addQuality();
//    	System.out.println("ccccccccccccccc2>"+quality);
        this.reduceSellIn();
    	if (sellIn < BAD_SELL_IN) {
    		this.addQuality();
   	 	}
//    	System.out.println("ccccccccccccccc3>"+quality);
    }
    
}