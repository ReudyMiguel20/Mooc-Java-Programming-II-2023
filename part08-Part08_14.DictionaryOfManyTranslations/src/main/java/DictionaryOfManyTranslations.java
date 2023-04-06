
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> word;

    public DictionaryOfManyTranslations() {
        this.word = new HashMap();

    }

    public void add(String word, String translation) {
        /* adds the translation for the word and preserves the old translations. */
        if (!(this.word.keySet().contains(word))) {
            this.word.put(word, new ArrayList<>());
        }

        if (this.word.keySet().contains(word)) {
            this.word.get(word).add(translation);
        }

    }

    public ArrayList<String> translate(String word) {
        /* returns a list of the translations added for the word. If the word 
        has no translations, the method should return an empty list*/
        if (!(this.word.containsKey(word))) {
            System.out.println(this.word.put(word, new ArrayList<>()));
        }

        ArrayList<String> translationWords = new ArrayList<>();
        
        for (int i = 0; i < this.word.get(word).size(); i++) {
            String wordInArray = this.word.get(word).get(i);
            if (!(translationWords.contains(wordInArray))) {
                translationWords.add(wordInArray);
            }
        }
        return translationWords;
    }

    public void remove(String word) {
        //removes the word and all its translations from the dictionary.
        this.word.remove(word);
    }

}
