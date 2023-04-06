package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private Random value;
    private boolean stateTemp;

    public TemperatureSensor() {
        this.value = new Random();
        this.stateTemp = false;
    }

    @Override
    public boolean isOn() {
        if (this.stateTemp == true) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.stateTemp = true;
    }

    @Override
    public void setOff() {
        this.stateTemp = false;
    }

    @Override
    public int read() {
        int x = 0;
        if (this.stateTemp == true) {
            x = this.value.nextInt(30 + 30) - 30;
            return x;
        }
        throw new IllegalStateException();

    }

}
