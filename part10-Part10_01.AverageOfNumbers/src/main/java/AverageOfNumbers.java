
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        String input = "";
        List<String> numbers = new ArrayList<>();
        
        System.out.println("Input numbers, type ''end'' to stop.");
        
        while (true){
            
            input = scanner.nextLine();
            
            if (input.equals("end") || input.equals("")){
                break;
            }
            
            numbers.add(input);
        }
        
        double averageOfNumbers = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + averageOfNumbers);

    }
}
