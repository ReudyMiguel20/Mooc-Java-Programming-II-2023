
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox taquitos = new TripleTacoBox();

        System.out.println(taquitos.tacosRemaining());
        taquitos.eat();
        taquitos.eat();
        taquitos.eat();
        taquitos.eat();
        taquitos.eat();
        System.out.println(taquitos.tacosRemaining());
        System.out.println();

        CustomTacoBox muchosTacos = new CustomTacoBox(23);

        System.out.println(muchosTacos.tacosRemaining());
        muchosTacos.eat();
        System.out.println(muchosTacos.tacosRemaining());
    }
}
