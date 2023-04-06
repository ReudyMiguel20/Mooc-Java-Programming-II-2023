package dictionary;

public class Main {

    public static void main(String[] args) throws Exception {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }
        
        dictionary.add("computer", "computadora");
        dictionary.add("hello", "hola");
        dictionary.add("how are you", "como estas");
        
        dictionary.save();
        
    }
}
