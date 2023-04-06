
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        //Prints all the keys in the hashmap given as a parameter.
        System.out.println(hashmap.keySet());
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        /*Prints the keys in the hashmap given as a parameter, which contain the 
        string given as a parameter.*/
        for (String value : hashmap.keySet()){
            if (value.contains(text)){
                System.out.println(value);
            }
        }
        
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        /*prints the values in the given hashmap whichs keys contain the given string */
        for (String value : hashmap.keySet()){
            if (value.contains(text)){
                System.out.println(hashmap.get(value));
            }
        }
    }

}
