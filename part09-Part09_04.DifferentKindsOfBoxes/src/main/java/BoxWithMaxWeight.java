
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;

    }

    @Override
    public void add(Item item) {
        int weightOnItemList = 0;
        for (Item itemsOnList : this.items) {
            weightOnItemList += itemsOnList.getWeight();
        }

        if (item.getWeight() == 0) {
            this.items.add(item);
        }
        if (weightOnItemList < this.capacity) {
            this.items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemsOnList : this.items) {
            if (itemsOnList.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
