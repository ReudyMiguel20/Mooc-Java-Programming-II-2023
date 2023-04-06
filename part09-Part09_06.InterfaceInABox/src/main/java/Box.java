
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> itemsPackable;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemsPackable = new ArrayList<>();
    }

    public void add(Packable item) {

        if (weight() + item.weight() > this.maxCapacity) {
            return;
        } else {
            this.itemsPackable.add(item);
        }
    }

    @Override
    public double weight() {
        double weightItems = 0;

        for (Packable x : this.itemsPackable) {
            weightItems += x.weight();
        }

        return weightItems;

    }

    @Override
    public String toString() {
        return "Box: " + this.itemsPackable.size() + " items, total weight " + weight() + " kg";
    }

}
