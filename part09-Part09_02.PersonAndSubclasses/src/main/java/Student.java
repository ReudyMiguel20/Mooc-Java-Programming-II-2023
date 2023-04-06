
public class Student extends Person {

    private int credits = 0;

    public Student(String name, String address) {
        super(name, address);
        this.credits = credits;
    }

    public void study() {
        this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }

    public String toString() {
        return super.toString() + "\n" + "  " + "Study credits " + this.credits();
    }
}
