package playoff.kata.gildedrose;

public class Item {

	private static final int GOOD_QUALITY = 50;
	private static final int BAD_QUALITY = 0;

    public static String name;
    public static int sellIn;
    public static int quality;

    public Item(String name, int sellIn, int quality) {
        Item.name = name;
        Item.sellIn = sellIn;
        Item.quality = quality;
    }

    @Override
    public String toString() {
        return Item.name + ", " + Item.sellIn + ", " + Item.quality;
    }
    
    
    public void addQuality() {
    	if (quality < GOOD_QUALITY) {
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
