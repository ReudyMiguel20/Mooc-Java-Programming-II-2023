
public class TripleTacoBox implements TacoBox {

    private int tacos = 3;

    public TripleTacoBox() {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos <= 0) {
            this.tacos = 0;
        } else if (this.tacos > 0) {
            this.tacos -= 1;
        }
    }

}
