import java.util.Random;

public class Jar {

    private String itemName;
    private int numItems;
    private int maxNumItems;

    public void fill() {
        Random random = new Random();
        numItems = random.nextInt(maxNumItems) + 1;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public int getMaxNumItems() {
        return maxNumItems;
    }

    public void setMaxNumItems(int maxNumItems) {
        this.maxNumItems = maxNumItems;
    }
}
