import java.util.List;
import java.util.ArrayList;

public class Pipe <T> {
    
    private List<T> list;
    
    public Pipe(){
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.list.add(value);
    }
    
    public T takeFromPipe(){
        T thingToReturn;
        
        if (this.list.isEmpty()){
            return null;
        }
        
        thingToReturn = this.list.get(0);
        this.list.remove(thingToReturn);
        return thingToReturn;
    }
    
    public boolean isInPipe(){
        return !this.list.isEmpty();
    }
}
