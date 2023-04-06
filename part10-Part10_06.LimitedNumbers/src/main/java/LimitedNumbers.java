
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int numberInput = 0;

        while (true) {
            numberInput = Integer.valueOf(scanner.nextLine());

            if (numberInput < 0) {
                break;
            }

            numbers.add(numberInput);
        }

        List<Integer> numbersAsked = numbers.stream()
                .filter(value -> value > 0 && value <= 5)
                .collect(Collectors.toCollection(ArrayList::new));

        numbersAsked.stream()
                .forEach(value -> System.out.println(value));

    }
}
