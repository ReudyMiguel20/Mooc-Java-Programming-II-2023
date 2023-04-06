
public class CD implements Packable {

    private String artist;
    private String nameCD;
    private int publicationYear;
    private double weight;

    public CD(String artist, String nameCD, int publicationYear) {
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.nameCD + " " + "(" + this.publicationYear + ")"; 
    }
}
