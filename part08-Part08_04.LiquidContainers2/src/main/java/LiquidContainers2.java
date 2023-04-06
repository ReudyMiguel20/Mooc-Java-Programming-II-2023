
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int amount = 0;

        while (true) {

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] part = input.split(" ");
            input = part[0];

            if (input.equals("quit")) {
                break;
            } else if (input.equals("add")) {
                amount = Integer.valueOf(part[1]);
                if (amount < 0) {
                    continue;
                } else if (amount > 0) {
                    firstContainer += amount;
                }
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            } else if (input.equals("move")) {
                amount = Integer.valueOf(part[1]);

                if (amount < 0) {
                    continue;
                } else if (firstContainer > 0) {
                    if (amount > firstContainer) {
                        secondContainer += firstContainer;
                        firstContainer -= amount;
                    } else if (firstContainer >= amount) {
                        firstContainer -= amount;
                        secondContainer += amount;
                    }
                    if (firstContainer < 0) {
                        firstContainer = 0;
                    }
                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                }
            } else if (input.equals("remove")) {
                amount = Integer.valueOf(part[1]);

                secondContainer -= amount;

                if (secondContainer < 0) {
                    secondContainer = 0;
                }

            }

        }
    }

}
