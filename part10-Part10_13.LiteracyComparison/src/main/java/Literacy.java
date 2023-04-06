
import java.util.ArrayList;
import java.util.List;

public class Literacy implements Comparable<Literacy>{
//    private ArrayList<Literacy> hi;
    private String country;
    private int year;
    private String gender;
    public double percentage;
    
    public Literacy(String country, int year, String gender, double percentage){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }
    
    public double getPercentage(){
        return this.percentage;
    }
    
    @Override
    public String toString(){
        return this.country+" ("+this.year+") ,"+this.gender+", "+this.percentage; 
    }

    @Override
    public int compareTo(Literacy o) {
        return (int) (this.percentage - o.percentage);
    }
}
