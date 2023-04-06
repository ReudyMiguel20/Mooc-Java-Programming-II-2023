import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        int number = Integer.valueOf(strings.get(0));
        System.out.println(number);
    }
}
