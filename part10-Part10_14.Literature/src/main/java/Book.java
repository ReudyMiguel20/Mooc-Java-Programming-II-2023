
public class Book{
    
    private String bookName;
    private int recommendedAge;
    
    public Book(String bookName, int recommendedAge){
        this.bookName = bookName;
        this.recommendedAge = recommendedAge;
    }
    
    public int getRecommendedAge(){
        return this.recommendedAge;
    }
    
    public String getBookName(){
        return this.bookName;
    }
    
    public String toString(){
        return this.bookName+" (recommended for "+this.recommendedAge+" year-olds or older)";
    }
}
