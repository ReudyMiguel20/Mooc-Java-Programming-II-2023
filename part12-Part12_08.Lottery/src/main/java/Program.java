
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<String> lotteryNumbers = row.numbers();

        lotteryNumbers.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        
        System.out.println("");
    }
}

