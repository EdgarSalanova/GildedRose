package playoff.kata.gildedrose;

public class Item {

	private static final int GOOD_QUALITY = 50;
	private static final int BAD_QUALITY = 0;

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
    

    //------------------------------------------- 
    
    public void itemUpdate() {
		// TODO Auto-generated method stub
	}
    
    //-------------------------------------------
    
    public void addQuality() {
    	if (quality < GOOD_QUALITY) {
    		System.out.println("ddddddddddd");
            quality += 1;
        }
    }
    
    public void reduceQuality() {
    	if (quality > BAD_QUALITY) {
            quality -= 1;
        }
    }
    
    public void reduceSellIn() {
    	sellIn -= 1;
    }
    
    public void resetQuality() {
    	quality = 0;
    }
    
    String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    int getQuality() {
        return quality;
    }
}
