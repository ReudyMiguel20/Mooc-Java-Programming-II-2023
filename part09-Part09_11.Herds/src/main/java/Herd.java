
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    public String toString() {
        String value = "";
        for (Movable values : this.herdList) {
            value += values.toString();
            value += "\n";
        }
        return value;

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable values : this.herdList){
            values.move(dx, dy);
        }
    }

}
