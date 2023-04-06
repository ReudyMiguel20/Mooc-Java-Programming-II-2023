
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<String> numbers;
    private Random randomLotteryNumbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<String> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random randomLotteryNumber = new Random();
        int randomNumber = 0;

        // Implement the random number generation here
        // the method containsNumber is probably useful
        for (int i = 0; i <= 5; i++) {
            randomNumber = randomLotteryNumber.nextInt(38) + 1;
            String formattedNumber = String.valueOf(randomNumber);

            if (randomNumber < 10) {
                String formatted = String.format("%02d", randomNumber);
                this.numbers.add(formatted);
                continue;
            }

            if (!(this.numbers.contains(formattedNumber))) {
                this.numbers.add(formattedNumber);
                
            } else if (this.numbers.contains(formattedNumber)) {
                i -= 1;
                continue;
            }
      
        }
        
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (Integer x : this.numbers) {
            if (x == number) {
                return true;
            }
        }
        return false;
    }
}
