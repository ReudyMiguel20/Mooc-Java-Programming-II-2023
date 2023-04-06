
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbersTest = new ArrayList<>();
        String input = "";

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int inputNumber = Integer.valueOf(input);

            numbersTest.add(inputNumber);
        }

        positive(numbersTest);

    }

    public static List<Integer> positive(List<Integer> numbers) {

        ArrayList<Integer> positiveNumbers = numbers.stream()
                .filter(S -> S > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return positiveNumbers;
    }

}
