
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // execute your program here
        String input = "";
        List<String> numbers = new ArrayList<>();
        List<String> positiveNumbers = new ArrayList<>();
        List<String> negativeNumbers = new ArrayList<>();

        System.out.println("Input numbers, type ''end'' to stop.");

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end") || input.equals("")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();

        if (input.equals("n")) {
            double negativeAverage = numbers.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers : " + negativeAverage);
            
        } else if (input.equals("p")){
            double positiveAverage = numbers.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers " + positiveAverage);
        }

    }
}
