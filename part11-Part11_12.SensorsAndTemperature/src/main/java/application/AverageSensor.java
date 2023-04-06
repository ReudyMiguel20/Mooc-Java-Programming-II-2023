package application;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readingsOfValues;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readingsOfValues = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readingsOfValues;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                s.setOn();
            }
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            if (s.isOn() == true) {
                s.setOff();
            }
        }
    }

    @Override
    public int read() {
        int result = 0;

        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                throw new IllegalStateException();
            }
            result += s.read();
        }

        int average = result / this.sensors.size();

        this.readingsOfValues.add(average);

        return average;
    }

}
