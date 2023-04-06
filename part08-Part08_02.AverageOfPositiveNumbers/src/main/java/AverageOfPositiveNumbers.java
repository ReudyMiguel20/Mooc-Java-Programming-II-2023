
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double average = 0;
        int sumOfNumbers = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int number = Integer.valueOf(input);

            if (number < 0) {
                continue;
            } else if (number > 0) {
                sumOfNumbers += number;
                counter++;
            }

        }

        if (sumOfNumbers <= 0 || counter <= 0) {
            System.out.println("Cannot calculate the average");
        } else if (sumOfNumbers > 0 && counter > 0) {
            average = 1.0 * sumOfNumbers / counter;
            System.out.println(average);
        }

    }
}
