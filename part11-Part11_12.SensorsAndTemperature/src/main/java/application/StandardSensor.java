package application;

public class StandardSensor implements Sensor {

    private int time;

    public StandardSensor(int i) {
        this.time = i;

    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.time;
    }

}
