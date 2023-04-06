
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double maxNumber = 0.0;

        if (this.history.isEmpty()) {
            return 0;
        } else {
            for (double number : this.history) {
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
        }
        return maxNumber;
    }

    public double minValue() {

        if (this.history.isEmpty()) {
            return 0;
        }

        double minNumber = this.history.get(0);

        for (double number : this.history) {
            if (minNumber > number) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        int numbersOnList = this.history.size();
        int sumNumbers = 0;
        
        for (double x : this.history){
            sumNumbers += x;
        }
        
        double average = 1.0 * sumNumbers / numbersOnList;
        return average;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
