
public class Dog extends Animal implements NoiseCapable {

    public Dog(String dogName) {
        super(dogName);

    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

}
