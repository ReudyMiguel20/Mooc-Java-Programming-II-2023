
public class Organism implements Movable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    @Override
    public void move(int dx, int dy) {
        if (dx < 0) {
            this.x = dx + this.x;
        } else if (dx == 0) {
            this.x = this.x;
        } else if (dx > 0) {
            this.x += dx;
        }

        if (dy < 0) {
            this.y = dy + this.y;
        } else if (dy == 0) {
            this.y = this.y;
        } else if (dy > 0) {
            this.y += dy;
        }
    }

}
