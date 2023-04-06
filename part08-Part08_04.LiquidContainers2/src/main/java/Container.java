
public class Container {

    private int firstContainer;
//    private int secondContainer;

    public Container() {
        this.firstContainer = firstContainer;
//        this.secondContainer = secondContainer;
    }
    
    public int contains(){
        return this.firstContainer;
    }
    
    public void add(int amount){
        if (amount <= 0){
            firstContainer = firstContainer;
        } else if (amount > 0){
            firstContainer += amount;
        }
        
        if (firstContainer > 100){
            firstContainer = 100;
        }
    }
    
    public void remove(int amount){
        firstContainer -= amount;
        if (firstContainer < 0){
            firstContainer = 0;
        }
    }
    
    public String toString(){
        return firstContainer + "/100";
    }
}
