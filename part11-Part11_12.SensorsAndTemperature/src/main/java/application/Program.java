package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        Sensor edificioA = new TemperatureSensor();
        edificioA.setOn();
        System.out.println("temperature in edificio A " + edificioA.read() + " degrees Celsius");
        Sensor edificioB = new TemperatureSensor();
        edificioB.setOn();
        System.out.println("temperature in edificio B " + edificioA.read() + " degrees Celsius");
        Sensor edificioC = new TemperatureSensor();
        edificioC.setOn();
        System.out.println("temperature in edificio C " + edificioA.read() + " degrees Celsius");

        AverageSensor utesa = new AverageSensor();

        edificioA.setOff();
        edificioB.setOff();
        edificioC.setOff();

        utesa.addSensor(edificioA);
        utesa.addSensor(edificioB);
        utesa.addSensor(edificioC);

        System.out.println(utesa.isOn());

        utesa.setOn();

        System.out.println(utesa.isOn());

        System.out.println("temperature en utesa " + utesa.read() + " degrees Celsius");
        System.out.println("temperature en utesa " + utesa.read() + " degrees Celsius");
        System.out.println("temperature en utesa " + utesa.read() + " degrees Celsius");

        System.out.println("readings: " + utesa.readings());
    }

}
