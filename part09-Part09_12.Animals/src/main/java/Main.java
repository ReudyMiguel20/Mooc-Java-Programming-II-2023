
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
        garfield.makeNoise();
        
//        List<String> inputs = new ArrayList<>();
//        
//        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble()
    }

}
