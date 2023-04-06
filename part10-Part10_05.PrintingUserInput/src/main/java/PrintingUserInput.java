
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        String input = "";

        while (true) {
            input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            stringList.add(input);
        }

        String userInput = stringList.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(userInput);

    }
}
