package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class SaveableDictionary {

    //Instance Variables
    private Map<String, String> dictionary;
    private Scanner scanner;
    private String file;

    //Constructors
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;

    }

    //Methods
    public void add(String words, String translation) {
        if (!(this.dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        String valueToReturn = null;

        for (String x : this.dictionary.keySet()) {
            if (x.equals(word)) {
                valueToReturn = this.dictionary.get(x);
                return valueToReturn;
            }
        }

        for (String x : this.dictionary.keySet()) {
            if (this.dictionary.get(x).contains(word)) {
                valueToReturn = x;
                return valueToReturn;
            }
        }

        return valueToReturn;
    }

    public void delete(String word) {
        this.dictionary.remove(word);

        String key = null;

        for (String x : this.dictionary.keySet()) {
            if (this.dictionary.get(x).contains(word)) {
                key = x;
            }
        }

        this.dictionary.remove(key, word);
    }

    public boolean load() {
        try {
            this.scanner = new Scanner(Paths.get(this.file));

            while (this.scanner.hasNextLine()) {
                String line = this.scanner.nextLine();
                String[] parts = line.split(":");

                this.dictionary.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return true;
    }

    public boolean save() {
        String key = "";
        String value = "";

        try {
            PrintWriter writer = new PrintWriter(this.file);

            for (String x : this.dictionary.keySet()) {
                key = x;
                value = this.dictionary.get(x);
                writer.println(key + ":" + value);
            }
            writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

}
